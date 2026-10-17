package com.fourthline.orca.internal;

import com.fourthline.orca.workflow.WorkflowError;

/* JADX INFO: loaded from: classes23.dex */
public abstract class hh0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowError.ModuleError b(er erVar) {
        return new WorkflowError.ModuleError("IdentityVerification." + erVar.getAlias());
    }
}
