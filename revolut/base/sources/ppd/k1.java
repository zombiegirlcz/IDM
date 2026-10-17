package ppd;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.TotalWealthContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class k1 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f238460a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TotalWealthContract$InputData f238461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f238462c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f238463g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f238464h;
    public final e4m.e i;

    public k1(n nVar, l lVar, TotalWealthContract$InputData totalWealthContract$InputData) {
        this.f238462c = nVar;
        this.f238461b = totalWealthContract$InputData;
        int i = 10;
        this.d = e4m.b.b(new i0(nVar, this, 2, i));
        this.e = e4m.b.b(new i0(nVar, this, 1, i));
        this.f = e4m.b.b(new i0(nVar, this, 0, i));
        this.f238463g = e4m.b.b(new i0(nVar, this, 3, i));
        this.f238464h = e4m.b.b(new i0(nVar, this, 5, i));
        this.i = e4m.b.b(new i0(nVar, this, 4, i));
    }

    public final twg.c b() {
        switch (this.f238460a) {
            case 0:
                n nVar = this.f238462c;
                wsg.n nVarB = nVar.f.b();
                g6e.d dVarB = nVar.F.b();
                vc.s.j(dVarB);
                gr6.m mVarB = nVar.f238483a0.b();
                vc.s.j(mVarB);
                return new twg.c(nVarB, dVarB, mVarB, nVar.f238488e0.i());
            default:
                n nVar2 = this.f238462c;
                wsg.n nVarB2 = nVar2.f.b();
                g6e.d dVarB2 = nVar2.F.b();
                vc.s.j(dVarB2);
                gr6.m mVarB2 = nVar2.f238483a0.b();
                vc.s.j(mVarB2);
                return new twg.c(nVarB2, dVarB2, mVarB2, nVar2.f238488e0.i());
        }
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f238460a) {
        }
        return ImmutableSet.of((yji.n) this.f238463g.get());
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f238460a) {
        }
        return ImmutableSet.of((yji.d) this.f.get());
    }

    public k1(n nVar, u0 u0Var, TotalWealthContract$InputData totalWealthContract$InputData) {
        this.f238462c = nVar;
        this.f238461b = totalWealthContract$InputData;
        int i = 9;
        this.d = e4m.b.b(new i0(nVar, this, 2, i));
        this.e = e4m.b.b(new i0(nVar, this, 1, i));
        this.f = e4m.b.b(new i0(nVar, this, 0, i));
        this.f238463g = e4m.b.b(new i0(nVar, this, 3, i));
        this.f238464h = e4m.b.b(new i0(nVar, this, 5, i));
        this.i = e4m.b.b(new i0(nVar, this, 4, i));
    }
}
