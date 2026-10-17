package xsl;

import com.google.common.collect.ImmutableSet;
import com.revolut.trading.orders.ui.invest.placement.account.selector.screen.InvestAccountSelectorScreenContract$InputData;
import java.util.Set;
import xf6.t1;
import z0h.s1;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1 f308578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InvestAccountSelectorScreenContract$InputData f308579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f308580c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f308581g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f308582h;

    public b(p pVar, InvestAccountSelectorScreenContract$InputData investAccountSelectorScreenContract$InputData, s1 s1Var) {
        this.f308580c = pVar;
        this.f308578a = s1Var;
        this.f308579b = investAccountSelectorScreenContract$InputData;
        this.d = e4m.b.b(new t1(pVar, this, 0, 22));
        this.e = e4m.b.b(new t1(pVar, this, 3, 22));
        this.f = e4m.b.b(new t1(pVar, this, 2, 22));
        this.f308581g = e4m.b.b(new t1(pVar, this, 4, 22));
        this.f308582h = e4m.b.b(new t1(pVar, this, 1, 22));
    }

    @Override // xki.e
    public final Set f() {
        aah.h hVar = (aah.h) this.d.get();
        a0k.b.n(hVar);
        return ImmutableSet.of(hVar);
    }

    @Override // xki.e
    public final Set g() {
        aah.i iVarD = ((u8h.b) this.f308580c.f308703r).d();
        vc.s.j(iVarD);
        return ImmutableSet.of(a0k.b.l(iVarD, this.f308578a, (aah.h) this.d.get()));
    }
}
