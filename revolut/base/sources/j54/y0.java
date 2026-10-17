package j54;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class y0 extends yji.n implements s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final til.m f171588l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i0 f171589m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final v f171590n;
    public final xq3.j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f171591p;

    public y0(til.m workflowFlowProvider, i0 creditPluginsApplicationModelExtension, v creditApplicationLifecycleExtension, xq3.j creditApplicationLifecycleInteractor, f cancellationExtension) {
        Intrinsics.checkNotNullParameter(workflowFlowProvider, "workflowFlowProvider");
        Intrinsics.checkNotNullParameter(creditPluginsApplicationModelExtension, "creditPluginsApplicationModelExtension");
        Intrinsics.checkNotNullParameter(creditApplicationLifecycleExtension, "creditApplicationLifecycleExtension");
        Intrinsics.checkNotNullParameter(creditApplicationLifecycleInteractor, "creditApplicationLifecycleInteractor");
        Intrinsics.checkNotNullParameter(cancellationExtension, "cancellationExtension");
        this.f171588l = workflowFlowProvider;
        this.f171589m = creditPluginsApplicationModelExtension;
        this.f171590n = creditApplicationLifecycleExtension;
        this.o = creditApplicationLifecycleInteractor;
        this.f171591p = cancellationExtension;
    }
}
