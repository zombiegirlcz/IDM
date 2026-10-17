package elk;

import eif.j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pfk.x;
import sf0.h;
import vkm.q;
import vkm.z1;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x f127520l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final clk.c f127521m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h f127522n;
    public final g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final bgk.a f127523p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z1 f127524q;

    public f(x planCancelRepository, clk.c planCancellationFlowInteractor, h serverErrorParser, g planCancelActionDialogProvider, bgk.a planTermsWorkflowControllerExtension) {
        Intrinsics.checkNotNullParameter(planCancelRepository, "planCancelRepository");
        Intrinsics.checkNotNullParameter(planCancellationFlowInteractor, "planCancellationFlowInteractor");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(planCancelActionDialogProvider, "planCancelActionDialogProvider");
        Intrinsics.checkNotNullParameter(planTermsWorkflowControllerExtension, "planTermsWorkflowControllerExtension");
        this.f127520l = planCancelRepository;
        this.f127521m = planCancellationFlowInteractor;
        this.f127522n = serverErrorParser;
        this.o = planCancelActionDialogProvider;
        this.f127523p = planTermsWorkflowControllerExtension;
        this.f127524q = q.b(1, 5, null);
    }

    @Override // elk.a
    public final void Z2(blk.a action) {
        Intrinsics.checkNotNullParameter(action, "action");
        T2(new j(this, action, null, 12), new eed.j(this, action, 21));
    }

    @Override // elk.a
    public final z1 b3() {
        return this.f127524q;
    }
}
