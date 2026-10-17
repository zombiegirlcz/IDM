package ypk;

import efm.r;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import ypd.i;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f61.a f315938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ppk.f f315939b;

    public c(f61.a plotInteractor, ppk.f ratesInteractor) {
        Intrinsics.checkNotNullParameter(plotInteractor, "plotInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        this.f315938a = plotInteractor;
        this.f315939b = ratesInteractor;
    }

    public final r a(xi0.b currencyFrom, xi0.b currencyTo) {
        Intrinsics.checkNotNullParameter(currencyFrom, "currencyFrom");
        Intrinsics.checkNotNullParameter(currencyTo, "currencyTo");
        return nim.a.w(this.f315939b.e(v1.c.w(currencyFrom, currencyTo), n9l.b.SEC_1), new i(4));
    }

    public final r b(qta.f plotDuration, xi0.b currencyFrom, xi0.b currencyTo) {
        Intrinsics.checkNotNullParameter(currencyFrom, "currencyFrom");
        Intrinsics.checkNotNullParameter(currencyTo, "currencyTo");
        Intrinsics.checkNotNullParameter(plotDuration, "plotDuration");
        return nim.a.w(f61.a.H(this.f315938a, new Pair(currencyFrom, currencyTo), plotDuration, 12), new i(3));
    }
}
