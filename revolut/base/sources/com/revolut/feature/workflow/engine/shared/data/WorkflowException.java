package com.revolut.feature.workflow.engine.shared.data;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/workflow/engine/shared/data/WorkflowException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WorkflowException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f96607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f96608b;

    public WorkflowException(String str, Throwable th10) {
        super(str, th10);
        this.f96607a = str;
        this.f96608b = th10;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f96608b;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f96607a;
    }
}
