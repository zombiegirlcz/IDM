package prk;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.screens.sentiment.IndexMarketSentimentControllerContract$InputData;
import java.util.Set;
import z0h.s1;

/* JADX INFO: loaded from: classes12.dex */
public final class w implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1 f239306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IndexMarketSentimentControllerContract$InputData f239307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0 f239308c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public w(g0 g0Var, x xVar, IndexMarketSentimentControllerContract$InputData indexMarketSentimentControllerContract$InputData, s1 s1Var) {
        this.f239308c = g0Var;
        this.f239306a = s1Var;
        this.f239307b = indexMarketSentimentControllerContract$InputData;
        int i = 25;
        this.d = e4m.b.b(new ppd.i0(g0Var, this, 0, i));
        this.e = e4m.b.b(new ppd.i0(g0Var, this, 2, i));
        this.f = e4m.b.b(new ppd.i0(g0Var, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        aah.h hVar = (aah.h) this.d.get();
        a0k.b.n(hVar);
        return ImmutableSet.of(hVar);
    }

    @Override // xki.e
    public final Set g() {
        aah.i iVarD = ((u8h.b) this.f239308c.d).d();
        vc.s.j(iVarD);
        return ImmutableSet.of(a0k.b.l(iVarD, this.f239306a, (aah.h) this.d.get()));
    }
}
