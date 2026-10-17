package m1i;

import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g1i.b f201583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ypi.i f201584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k3l.b f201585c;
    public final m d;

    public u(g1i.b state, ypi.i nextButtonView, k3l.b statusView, m router) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(nextButtonView, "nextButtonView");
        Intrinsics.checkNotNullParameter(statusView, "statusView");
        Intrinsics.checkNotNullParameter(router, "router");
        this.f201583a = state;
        this.f201584b = nextButtonView;
        this.f201585c = statusView;
        this.d = router;
    }

    public final pfm.n a(StatusViewConfiguration.Success success) {
        pfm.n nVar = new pfm.n(new t(this, success, 1), 1);
        Intrinsics.checkNotNullExpressionValue(nVar, "fromCallable(...)");
        return nVar;
    }
}
