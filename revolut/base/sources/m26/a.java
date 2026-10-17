package m26;

import akg.n;
import kotlin.jvm.internal.Intrinsics;
import w4l.h;
import w7j.b;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g26.b f201720a;

    public a(g26.b assetDetailsInteractor) {
        Intrinsics.checkNotNullParameter(assetDetailsInteractor, "assetDetailsInteractor");
        this.f201720a = assetDetailsInteractor;
    }

    @Override // w7j.b
    public final n a(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return nim.a.v(this.f201720a.a(currency.f306286a, h.f294642c), new m18.n(this));
    }
}
