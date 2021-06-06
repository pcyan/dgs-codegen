package com.github.pcyan.dgscodegen.services

import com.github.pcyan.dgscodegen.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
