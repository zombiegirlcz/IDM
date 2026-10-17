package com.fourthline.orca.internal;

import com.fourthline.orca.Orca;
import com.fourthline.orca.core.OnProductCompleted;
import com.fourthline.orca.workflow.WorkflowConfig;
import com.fourthline.orca.workflow.WorkflowCustomizationConfig;
import com.fourthline.orca.workflow.WorkflowDataDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class wx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f34808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WorkflowConfig f34809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WorkflowDataDelegate f34810c;
    private final OnProductCompleted d;
    private final ey e;

    public wx(String validationCode, WorkflowConfig workflowConfig, WorkflowDataDelegate workflowDataDelegate, OnProductCompleted completionBlock, WorkflowCustomizationConfig customizationConfig) {
        Intrinsics.checkNotNullParameter(validationCode, "validationCode");
        Intrinsics.checkNotNullParameter(workflowConfig, "workflowConfig");
        Intrinsics.checkNotNullParameter(completionBlock, "completionBlock");
        Intrinsics.checkNotNullParameter(customizationConfig, "customizationConfig");
        this.f34808a = validationCode;
        this.f34809b = workflowConfig;
        this.f34810c = workflowDataDelegate;
        this.d = completionBlock;
        this.e = new ey(workflowConfig, workflowDataDelegate, customizationConfig.getFlavor());
    }

    public final Orca.a a() {
        return Orca.a.f26561b;
    }

    public final r70 b() {
        return this.e;
    }

    public final mb.d c() {
        return this.f34809b.getNetworkEnvironment();
    }

    public final zq0 d() {
        return new gy(this.d);
    }

    public final sy e() {
        return new sy("NavigationDestination.Workflow::class.java");
    }

    public final gf1 f() {
        return new gf1(this.f34808a, null, null, 6, null);
    }
}
