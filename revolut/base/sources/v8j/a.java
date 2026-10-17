package v8j;

import akg.n;
import fn2.c;
import kotlin.jvm.internal.Intrinsics;
import rd0.e;
import w7j.b;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f286772a;

    public a(c cryptoDetailsAboutInteractor) {
        Intrinsics.checkNotNullParameter(cryptoDetailsAboutInteractor, "cryptoDetailsAboutInteractor");
        this.f286772a = cryptoDetailsAboutInteractor;
    }

    @Override // w7j.b
    public final n a(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return nim.a.v(e.b(this.f286772a.q(currency)), new v80.a(4));
    }
}
