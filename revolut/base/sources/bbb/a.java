package bbb;

import eli.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends l {
    public final pri.f o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(sri.m navigator, h presentationModel, a61.a twoFaProgressView, f9b.f errorView, ujg.a twoFaRepository, pri.f authorizedPresenterDelegate, p twoFaSmsRetriever) {
        super(navigator, presentationModel, twoFaProgressView, errorView, twoFaRepository, twoFaSmsRetriever);
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(twoFaProgressView, "twoFaProgressView");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(twoFaRepository, "twoFaRepository");
        Intrinsics.checkNotNullParameter(authorizedPresenterDelegate, "authorizedPresenterDelegate");
        Intrinsics.checkNotNullParameter(twoFaSmsRetriever, "twoFaSmsRetriever");
        this.o = authorizedPresenterDelegate;
    }

    @Override // bbb.l, pri.b, pri.e
    /* JADX INFO: renamed from: N */
    public final void h(e view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.o.C(view)) {
            super.h(view);
        }
    }

    @Override // pri.b, pri.e
    public final void l() {
        this.o.I();
        super.l();
    }
}
