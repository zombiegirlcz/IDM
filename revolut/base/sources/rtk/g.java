package rtk;

import ael.k;
import akg.n;
import cli.y;
import com.revolut.shared.feature.wealth.domain.api.interactors.InstrumentTickerInteractor$Companion;
import cq9.m;
import eel.i;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import tsk.j;
import vkm.q;
import vrl.i0;
import yji.l;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends h implements dli.b {
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ttk.d f257305p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final utk.f f257306q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ttk.d f257307r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f61.a f257308s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f257309t;

    public g(m mapper, d input, ttk.d gaugeWidgetProvider, utk.f priceTargetsWidgetProvider, ttk.d ratingDistributionWidgetProvider, f61.a disclaimersProvider) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(gaugeWidgetProvider, "gaugeWidgetProvider");
        Intrinsics.checkNotNullParameter(priceTargetsWidgetProvider, "priceTargetsWidgetProvider");
        Intrinsics.checkNotNullParameter(ratingDistributionWidgetProvider, "ratingDistributionWidgetProvider");
        Intrinsics.checkNotNullParameter(disclaimersProvider, "disclaimersProvider");
        this.o = input;
        this.f257305p = gaugeWidgetProvider;
        this.f257306q = priceTargetsWidgetProvider;
        this.f257307r = ratingDistributionWidgetProvider;
        this.f257308s = disclaimersProvider;
        this.f257309t = mra.d.b(this, new c(null, null, null, null), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        d dVar = this.o;
        String ref2 = dVar.f257302a;
        ttk.d dVar2 = this.f257305p;
        dVar2.getClass();
        Intrinsics.checkNotNullParameter(ref2, "ref");
        qrk.c cVar = dVar2.f274437a;
        w4l.h hVar = w4l.h.f294642c;
        n nVarV = nim.a.v(cVar.a(ref2, hVar), new j(7));
        h0 h0Var = h0.f322473a;
        l.b1(this, rd0.e.n(nVarV, h0Var), null, new f(this, null, 1), 3);
        String ref3 = dVar.f257302a;
        utk.f fVar = this.f257306q;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(ref3, "ref");
        vkm.d dVarA = ((qrk.c) fVar.f283122b).a(ref3, hVar);
        ybl.b bVar = (ybl.b) fVar.f283121a;
        ybl.b.Companion.getClass();
        l.b1(this, rd0.e.n(nim.a.v(u0.i(dVarA, q.q(nim.a.v(((k) bVar).p(ref3, hVar, InstrumentTickerInteractor$Companion.f105074b.a()), new urd.y(18))), nim.a.v(((zhl.k) fVar.f283123c).e(new go.g(eel.c.ONE_YEAR, 2), new go.g(i.PRICE, 2), ref3, vgl.b.TICKER_PERIODICALLY), new urd.y(19))), new urd.y(20)), h0Var), null, new f(this, null, 2), 3);
        ttk.d dVar3 = this.f257307r;
        dVar3.getClass();
        Intrinsics.checkNotNullParameter(ref3, "ref");
        l.b1(this, rd0.e.n(nim.a.v(dVar3.f274437a.a(ref3, hVar), new i0(11)), h0Var), null, new f(this, null, 3), 3);
        l.b1(this, this.f257308s.G(iuk.a.ANALYST_RATINGS), null, new f(this, null, 0), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f257309t;
    }
}
