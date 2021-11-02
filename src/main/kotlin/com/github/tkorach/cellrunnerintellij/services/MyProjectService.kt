package com.github.tkorach.cellrunnerintellij.services

import com.intellij.openapi.project.Project
import com.github.tkorach.cellrunnerintellij.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
