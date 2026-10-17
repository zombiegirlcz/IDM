package tzh;

import com.revolut.feature_crypto_order_flow.impl.order_summary.OrderSummaryScreen;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f275974c;
    public final a d;

    public i(b view, a model) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f275974c = view;
        this.d = model;
    }

    @Override // yji.d
    public final void M() {
        OrderSummaryScreen orderSummaryScreen = (OrderSummaryScreen) this.f275974c;
        yji.d.H(this, new rv6.e(new g(rd0.e.b(orderSummaryScreen.P.d), 0), 16), new tz6.e(this, (Continuation) null, 3), 3);
        yji.d.H(this, new rv6.e(new g(rd0.e.b(orderSummaryScreen.O.d), 1), 17), new tk5.c(this, null, 29), 3);
    }
}
