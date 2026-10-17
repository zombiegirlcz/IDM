package prk;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.StatsScreen;
import com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.StatsSection;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.detailed_stats.DetailedStatsControllerContract$InputData;
import java.util.Map;
import java.util.Set;
import z0h.s1;
import zhm.y0;

/* JADX INFO: loaded from: classes12.dex */
public final class l implements evk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1 f239226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DetailedStatsControllerContract$InputData f239227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final srk.a f239228c;
    public final g0 d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f239229g;

    public l(g0 g0Var, srk.a aVar, DetailedStatsControllerContract$InputData detailedStatsControllerContract$InputData, s1 s1Var) {
        this.d = g0Var;
        this.f239226a = s1Var;
        this.f239227b = detailedStatsControllerContract$InputData;
        this.f239228c = aVar;
        this.e = e4m.b.b(new ppd.i0(g0Var, this, 0, 21));
        this.f = e4m.b.b(new ppd.i0(g0Var, this, 2, 21));
        this.f239229g = e4m.b.b(new ppd.i0(g0Var, this, 1, 21));
    }

    public final o7.d b() {
        return new o7.d(new x3h.a());
    }

    public final Map c() {
        ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(9);
        srk.a aVar = this.f239228c;
        builderBuilderWithExpectedSize.put(StatsScreen.FundData.class, sg8.j.A(aVar));
        builderBuilderWithExpectedSize.put(StatsScreen.EeaFundData.class, sg8.j.z(aVar));
        builderBuilderWithExpectedSize.put(StatsScreen.PerShareData.class, sg8.j.B(aVar));
        builderBuilderWithExpectedSize.put(StatsScreen.PriceAndVolume.class, sg8.j.C(aVar));
        builderBuilderWithExpectedSize.put(StatsScreen.EeaPriceAndVolume.class, sg8.j.y(aVar));
        builderBuilderWithExpectedSize.put(StatsScreen.BondPriceAndVolume.class, sg8.j.l(aVar));
        builderBuilderWithExpectedSize.put(StatsScreen.Ratios.class, sg8.j.D(aVar));
        builderBuilderWithExpectedSize.put(StatsScreen.Yield.class, sg8.j.m(aVar));
        Set setB = y0.b(StatsSection.Risk.f103776b);
        vc.s.k(setB);
        builderBuilderWithExpectedSize.put(StatsScreen.Risk.class, setB);
        return builderBuilderWithExpectedSize.build();
    }

    @Override // xki.e
    public final Set f() {
        aah.h hVar = (aah.h) this.e.get();
        a0k.b.n(hVar);
        return ImmutableSet.of(hVar);
    }

    @Override // xki.e
    public final Set g() {
        aah.i iVarD = ((u8h.b) this.d.d).d();
        vc.s.j(iVarD);
        return ImmutableSet.of(a0k.b.l(iVarD, this.f239226a, (aah.h) this.e.get()));
    }
}
