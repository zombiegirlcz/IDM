package prk;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.feed.StockDetailsFeedControllerContract$InputData;
import java.util.Set;
import z0h.s1;

/* JADX INFO: loaded from: classes12.dex */
public final class d0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1 f239077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a18.g f239078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StockDetailsFeedControllerContract$InputData f239079c;
    public final g0 d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f239080g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f239081h;
    public final e4m.e i;

    public d0(g0 g0Var, e0 e0Var, StockDetailsFeedControllerContract$InputData stockDetailsFeedControllerContract$InputData, a18.g gVar, s1 s1Var) {
        this.d = g0Var;
        this.f239077a = s1Var;
        this.f239078b = gVar;
        this.f239079c = stockDetailsFeedControllerContract$InputData;
        int i = 5;
        this.e = e4m.b.b(new ppd.j(g0Var, e0Var, this, 0, i));
        this.f = e4m.b.b(new ppd.j(g0Var, e0Var, this, 2, i));
        this.f239080g = e4m.b.b(new ppd.j(g0Var, e0Var, this, 1, i));
        this.f239081h = e4m.b.b(new ppd.j(g0Var, e0Var, this, 4, i));
        this.i = e4m.b.b(new ppd.j(g0Var, e0Var, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        aah.h hVar = (aah.h) this.e.get();
        a0k.b.n(hVar);
        return ImmutableSet.of((yji.n) hVar, (yji.n) this.f.get());
    }

    @Override // xki.e
    public final Set g() {
        aah.i iVarD = ((u8h.b) this.d.d).d();
        vc.s.j(iVarD);
        return ImmutableSet.of((yji.d) a0k.b.l(iVarD, this.f239077a, (aah.h) this.e.get()), (yji.d) this.f239080g.get());
    }
}
