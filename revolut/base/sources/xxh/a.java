package xxh;

import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.feature_crypto_order_details.impl.ui.details.CryptoOrderDetailsController;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import uxh.j;
import uxh.l;
import uxh.m;
import uxh.n;
import xv4.o;
import yxh.i;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f309526c;
    public final m d;
    public final /* synthetic */ int e;
    public final n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f309527g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(h view, f model) {
        this((n) view, (l) model);
        this.e = 0;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f = view;
        this.f309527g = model;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // yji.d
    public final void M() {
        switch (this.e) {
            case 0:
                yji.d.H(this, rd0.e.b(((CellDetailsActionDelegate) ((CryptoOrderDetailsController) this.f309526c).V.getValue()).d), new j(this, null), 3);
                yji.d.H(this, rd0.e.b(((ActionsDelegate) ((CryptoOrderDetailsController) ((h) this.f)).T.getValue()).f51611c.f121375b), new o(this, (Continuation) null, 5), 3);
                break;
            default:
                Continuation continuation = null;
                yji.d.H(this, rd0.e.b(((CellDetailsActionDelegate) ((CryptoOrderDetailsController) this.f309526c).V.getValue()).d), new j(this, null), 3);
                CryptoOrderDetailsController cryptoOrderDetailsController = (CryptoOrderDetailsController) ((i) this.f);
                yji.d.H(this, rd0.e.b(((FixedTabsDelegate) cryptoOrderDetailsController.U.getValue()).f52339c.f121375b), new yxh.a(this, continuation, 0), 3);
                yji.d.H(this, rd0.e.b(((ActionsDelegate) cryptoOrderDetailsController.T.getValue()).f51611c.f121375b), new yxh.a(this, continuation, 1), 3);
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(i view, yxh.f model) {
        this((n) view, (l) model);
        this.e = 1;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f = view;
        this.f309527g = model;
    }

    public a(n view, l model) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f309526c = view;
        this.d = model;
    }
}
