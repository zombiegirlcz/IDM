package com.revolut.feature.workflow.engine.shared.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/workflow/engine/shared/data/WorkflowFormException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WorkflowFormException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f96609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f96610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f96611c;
    public final String d;
    public final String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkflowFormException(String str, String stepId, String formId, Throwable th10) {
        super("Failed to prefetch form", th10);
        Intrinsics.checkNotNullParameter(stepId, "stepId");
        Intrinsics.checkNotNullParameter(formId, "formId");
        this.f96609a = "Failed to prefetch form";
        this.f96610b = th10;
        this.f96611c = str;
        this.d = stepId;
        this.e = formId;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f96610b;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f96609a;
    }
}
