package ohk;

import ffk.w;
import kotlin.jvm.internal.Intrinsics;
import til.m;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f225383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f225384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f225385c;

    public a(m workflowFlowProvider, w planWorkflowsInteractor, k errorParser) {
        Intrinsics.checkNotNullParameter(workflowFlowProvider, "workflowFlowProvider");
        Intrinsics.checkNotNullParameter(planWorkflowsInteractor, "planWorkflowsInteractor");
        Intrinsics.checkNotNullParameter(errorParser, "errorParser");
        this.f225383a = workflowFlowProvider;
        this.f225384b = planWorkflowsInteractor;
        this.f225385c = errorParser;
    }

    public final g a() {
        return new g(this.f225383a, this.f225384b, this.f225385c);
    }
}
