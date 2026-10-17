package com.fourthline.orca.internal;

import com.fourthline.orca.Orca;
import com.fourthline.orca.workflow.WorkflowConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class p31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WorkflowConfig f31820b;

    public p31(String validationCode, WorkflowConfig workflowConfig) {
        Intrinsics.checkNotNullParameter(validationCode, "validationCode");
        Intrinsics.checkNotNullParameter(workflowConfig, "workflowConfig");
        this.f31819a = validationCode;
        this.f31820b = workflowConfig;
    }

    public final WorkflowConfig a() {
        return this.f31820b;
    }

    public final Orca.a b() {
        return Orca.a.f26562c;
    }

    public final mb.d c() {
        return this.f31820b.getNetworkEnvironment();
    }

    public final gf1 d() {
        return new gf1(this.f31819a, null, null, 6, null);
    }
}
