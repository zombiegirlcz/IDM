package prk;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.insights.InsightsScreenContract$InputData;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import z0h.s1;

/* JADX INFO: loaded from: classes12.dex */
public final class y implements qvk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n2h.g f239312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n2h.e f239313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b1h.f f239314c;
    public final s1 d;
    public final InsightsScreenContract$InputData e;
    public final g0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f239315g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f239316h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f239317j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f239318l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f239319m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f239320n;

    public y(g0 g0Var, x xVar, InsightsScreenContract$InputData insightsScreenContract$InputData, n2h.g gVar, n2h.e eVar, b1h.f fVar, s1 s1Var) {
        this.f = g0Var;
        this.f239312a = gVar;
        this.f239313b = eVar;
        this.f239314c = fVar;
        this.d = s1Var;
        this.e = insightsScreenContract$InputData;
        this.f239315g = e4m.b.b(new ppd.i0(g0Var, this, 2, 26));
        this.f239316h = e4m.b.b(new ppd.i0(g0Var, this, 1, 26));
        this.i = e4m.b.b(new ppd.i0(g0Var, this, 0, 26));
        this.f239317j = e4m.b.b(new ppd.i0(g0Var, this, 4, 26));
        this.k = e4m.b.b(new ppd.i0(g0Var, this, 3, 26));
        this.f239318l = e4m.b.b(new ppd.i0(g0Var, this, 5, 26));
        this.f239319m = e4m.b.b(new ppd.i0(g0Var, this, 7, 26));
        this.f239320n = e4m.b.b(new ppd.i0(g0Var, this, 6, 26));
    }

    public static pvk.j0 b() {
        ytk.c percentageClauseMapper = new ytk.c();
        ytk.b numberClauseMapper = new ytk.b();
        Intrinsics.checkNotNullParameter(percentageClauseMapper, "percentageClauseMapper");
        Intrinsics.checkNotNullParameter(numberClauseMapper, "numberClauseMapper");
        return new pvk.j0();
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(5);
        gdh.a aVar = (gdh.a) this.f239315g.get();
        f9f.b.f(aVar);
        builderBuilderWithExpectedSize.add(aVar);
        builderBuilderWithExpectedSize.addAll((Iterable) f9f.b.k((gdh.a) this.f239315g.get()));
        aah.h hVar = (aah.h) this.f239318l.get();
        a0k.b.n(hVar);
        builderBuilderWithExpectedSize.add(hVar);
        builderBuilderWithExpectedSize.add(this.f239316h.get());
        return j6.a.g(this.f239317j, builderBuilderWithExpectedSize);
    }

    @Override // xki.e
    public final Set g() {
        yji.d dVar = (yji.d) this.i.get();
        yji.d dVar2 = (yji.d) this.k.get();
        aah.i iVarD = ((u8h.b) this.f.d).d();
        vc.s.j(iVarD);
        return ImmutableSet.of((aah.g) dVar, (aah.g) dVar2, a0k.b.l(iVarD, this.d, (aah.h) this.f239318l.get()));
    }
}
