package s26;

import g26.b;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import ryd.i;
import w4l.h;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements c8j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f259254a;

    public a(b assetDetailsInteractor) {
        Intrinsics.checkNotNullParameter(assetDetailsInteractor, "assetDetailsInteractor");
        this.f259254a = assetDetailsInteractor;
    }

    @Override // c8j.a
    public final Flow a(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return nim.a.v(this.f259254a.a(currency.f306286a, h.f294642c), new i(this, 10));
    }
}
