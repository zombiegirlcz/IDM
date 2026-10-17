package jkh;

import cli.n;
import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.feature.wealth.ui.api.currencychanger.CurrencyChangerContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vy5.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class l extends oki.h implements kih.e {
    public final CurrencyChangerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x8h.k f175181p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ybl.l f175182q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f175183r;

    public l(n stateMapper, CurrencyChangerContract$InputData inputData, x8h.k displayCurrencyInteractor, ybl.l tradingConfigInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(displayCurrencyInteractor, "displayCurrencyInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        this.o = inputData;
        this.f175181p = displayCurrencyInteractor;
        this.f175182q = tradingConfigInteractor;
        this.f175183r = mra.d.b(this, new kih.c(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, rd0.e.n(ybl.l.d(this.f175182q), h0.f322473a), null, null, new f(this, continuation, 1), 3);
        if (this.o.f95899b) {
            yji.l.b1(this, new d0(t1.E(this.f175181p.f303355b.f123680a.C0("TOOLTIP_SWITCH_CURRENCY_DISMISSED_KEY", e8h.e.f123679c)), 17), null, new g(this, continuation, 0), 3);
        } else {
            H2(this.f175183r, new jj3.a(19));
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        if (this.o.f95898a != null) {
            H2(this.f175183r, new jeg.g(this, 29));
        } else {
            yji.l.b1(this, rd0.e.n(this.f175181p.c(), h0.f322473a), null, new f(this, null, 0), 3);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f175183r;
    }
}
