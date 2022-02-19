job('NodeJS example') {
    scm {
        git('git://github.com/pratiiik/myonly.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('pratiiik')
            node / gitConfigEmail('pratiiikyadav@gmail.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('Nodejs') // this is the name of the NodeJS installation in 
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        shell("npm install")
    }
}

