package ukh;

import kotlin.jvm.internal.Intrinsics;
import uj6.v;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends jki.g implements j {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final tzg.m f280762p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ybl.l f280763q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d1h.e f280764r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c f280765s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(jki.p stateMapper, tzg.m wealthAccountsInteractor, ybl.l tradingConfigInteractor, d1h.e disclaimersExtension) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(disclaimersExtension, "disclaimersExtension");
        this.f280762p = wealthAccountsInteractor;
        this.f280763q = tradingConfigInteractor;
        this.f280764r = disclaimersExtension;
        this.f280765s = new c(0);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, ybl.l.d(this.f280763q), null, null, new l(this, null, 1), 3);
        yji.l.a1(this, nim.a.v(tzg.m.c(this.f280762p, null, cfl.k.f23744a, 1), new v(8)), null, null, new l(this, null, 2), 3);
        yji.l.a1(this, ((gah.e) this.f280764r).Z2(u.c(rdh.b.INVEST_DOCUMENTS_DISCLAIMER)), null, null, new l(this, null, 0), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f280765s;
    }
}
