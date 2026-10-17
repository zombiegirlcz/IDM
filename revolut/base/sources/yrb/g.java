package yrb;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qd0.b f316213c;
    public final t d;
    public final v e;

    public g(qd0.b languageProvider, t delegatesProvider, s controllerModel) {
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(delegatesProvider, "delegatesProvider");
        Intrinsics.checkNotNullParameter(controllerModel, "controllerModel");
        this.f316213c = languageProvider;
        this.d = delegatesProvider;
        this.e = controllerModel;
    }

    @Override // yji.d
    public final void M() {
        t tVar = this.d;
        yji.d.H(this, rd0.e.b(tVar.f316243a.f52339c.f121375b), new a(this, null, 0), 3);
        yji.d.H(this, rd0.e.b(tVar.f316243a.e.f121375b), new a(this, null, 1), 3);
        CenteredAmountDelegate centeredAmountDelegate = tVar.f316244b;
        yji.d.H(this, rd0.e.b(centeredAmountDelegate.f51965h.f121375b), new b(this, null), 3);
        yji.d.H(this, rd0.e.b(centeredAmountDelegate.f.f121375b), new c(this, null), 3);
        yji.d.H(this, rd0.e.b(tVar.f316245c.f52559c), new d(this, null), 3);
        yji.d.H(this, rd0.e.b(tVar.d.d.f121375b), new e(this, null), 3);
        yji.d.H(this, rd0.e.b(tVar.e.f53530c), new f(this, null), 3);
    }

    @Override // yji.d
    public final void onCreate() {
        this.d.f316244b.f51963c = new yi3.d(this, 14);
    }
}
