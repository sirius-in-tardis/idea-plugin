package com.github.siriusintardis.ideaplugin.services

import com.github.siriusintardis.ideaplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
