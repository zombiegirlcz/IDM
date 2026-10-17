package com.fourthline.orca.internal;

import com.fourthline.orca.workflow.WorkflowConfig;

/* JADX INFO: loaded from: classes23.dex */
public final class q31 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p31 f32187a;

    private q31(p31 p31Var) {
        this.f32187a = p31Var;
    }

    public static WorkflowConfig b(p31 p31Var) {
        WorkflowConfig workflowConfigA = p31Var.a();
        vc.s.k(workflowConfigA);
        return workflowConfigA;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public WorkflowConfig get() {
        return b(this.f32187a);
    }

    public static q31 a(p31 p31Var) {
        return new q31(p31Var);
    }
}
