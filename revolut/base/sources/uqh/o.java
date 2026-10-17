package uqh;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class o extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f282168c;
    public final l0 d;

    public o(r delegates, l0 controllerModelExtension) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f282168c = delegates;
        this.d = controllerModelExtension;
    }

    @Override // yji.d
    public final void M() {
        r rVar = this.f282168c;
        NavBarWithToolbar navBarWithToolbar = rVar.f282169a;
        Continuation continuation = null;
        yji.d.H(this, vkm.q.q(t1.e(rd0.e.b(navBarWithToolbar.f59409p.f57337m), new upc.b(17))), new m(this, continuation, 0), 3);
        yji.d.H(this, rd0.e.b(navBarWithToolbar.u0()), new k(this, continuation, 2), 3);
        yji.d.H(this, new tzh.g(rd0.e.b(rVar.f282171c.f53218h), 23), new m(this, continuation, 1), 3);
        yji.d.H(this, rd0.e.b(rVar.d.f52371h.f121375b), new n(this, null), 3);
        yji.d.H(this, new tzh.g(rd0.e.b(rVar.f282170b.f52707c), 24), new k(this, continuation, 3), 3);
        SmallActionButtonDelegate smallActionButtonDelegate = rVar.e;
        yji.d.H(this, new tzh.g(rd0.e.b(smallActionButtonDelegate.f53336c.f121375b), 25), new k(this, continuation, 0), 3);
        yji.d.H(this, new tzh.g(rd0.e.b(smallActionButtonDelegate.f53336c.f121375b), 26), new k(this, continuation, 1), 3);
        yji.d.H(this, rd0.e.b(rVar.f.f51611c.f121375b), new l(this, null), 3);
    }
}
