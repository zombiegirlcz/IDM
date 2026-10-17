package uxh;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature_crypto_order_details.impl.ui.details.CryptoOrderDetailsController;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f284008c;
    public final h d;

    public e(i view, h model) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f284008c = view;
        this.d = model;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // yji.d
    public final void M() {
        CryptoOrderDetailsController cryptoOrderDetailsController = (CryptoOrderDetailsController) this.f284008c;
        yji.d.H(this, new urd.n(rd0.e.b(((TextDelegate) cryptoOrderDetailsController.P.getValue()).d), 17), new uxe.l(this, null, 1), 3);
        yji.d.H(this, new urd.n(rd0.e.b(((CellDetailsChevronDelegate) cryptoOrderDetailsController.Q.getValue()).f51821c), 18), new d(this, null), 3);
    }
}
