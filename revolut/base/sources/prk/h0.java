package prk;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.financials.StockFinancialsControllerContract$InputData;
import java.util.Set;
import z0h.s1;

/* JADX INFO: loaded from: classes12.dex */
public final class h0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1 f239159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StockFinancialsControllerContract$InputData f239160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0 f239161c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public h0(g0 g0Var, e0 e0Var, StockFinancialsControllerContract$InputData stockFinancialsControllerContract$InputData, s1 s1Var) {
        this.f239161c = g0Var;
        this.f239159a = s1Var;
        this.f239160b = stockFinancialsControllerContract$InputData;
        int i = 29;
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
        aah.i iVarD = ((u8h.b) this.f239161c.d).d();
        vc.s.j(iVarD);
        return ImmutableSet.of(a0k.b.l(iVarD, this.f239159a, (aah.h) this.d.get()));
    }
}
