package prk;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.analyst_details_screen.AnalystDetailsScreenContract$InputData;
import java.util.Set;
import z0h.s1;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseScreen f239082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalystDetailsScreenContract$InputData f239083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0 f239084c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f239085g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f239086h;

    public e(g0 g0Var, BaseScreen baseScreen, AnalystDetailsScreenContract$InputData analystDetailsScreenContract$InputData) {
        this.f239084c = g0Var;
        this.f239082a = baseScreen;
        this.f239083b = analystDetailsScreenContract$InputData;
        int i = 16;
        this.d = e4m.b.b(new ppd.i0(g0Var, this, 0, i));
        this.e = e4m.b.b(new ppd.i0(g0Var, this, 1, i));
        this.f = e4m.b.b(new ppd.i0(g0Var, this, 4, i));
        this.f239085g = e4m.b.b(new ppd.i0(g0Var, this, 3, i));
        this.f239086h = e4m.b.b(new ppd.i0(g0Var, this, 2, i));
    }

    @Override // sji.b
    public final Set f() {
        aah.h hVar = (aah.h) this.e.get();
        a0k.b.m(hVar);
        return ImmutableSet.of(hVar);
    }

    @Override // sji.b
    public final Set g() {
        aah.i iVarD = ((u8h.b) this.f239084c.d).d();
        vc.s.j(iVarD);
        return ImmutableSet.of(a0k.b.k(iVarD, (s1) this.d.get(), (aah.h) this.e.get()));
    }
}
