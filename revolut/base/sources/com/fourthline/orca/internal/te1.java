package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class te1 extends ib.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f33757b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te1(String environment, String workflowId, String businessPartner) {
        super(ib.b.Workflow);
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        Intrinsics.checkNotNullParameter(businessPartner, "businessPartner");
        this.f33756a = ib.b.Workflow;
        this.f33757b = "iglu:com.fourthline.sdk/workflow/jsonschema/1-0-0";
        set("environment", environment);
        set("workflow_id", workflowId);
        set("business_partner", businessPartner);
    }

    @Override // ib.b
    public String getIdentifier() {
        return this.f33756a;
    }

    @Override // ib.b
    public String getSchema() {
        return this.f33757b;
    }
}
