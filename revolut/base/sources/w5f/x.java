package w5f;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.PortfolioRevealScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class x implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d1h.j f295248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PortfolioRevealScreenContract$InputData f295249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f295250c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public x(m mVar, u uVar, PortfolioRevealScreenContract$InputData portfolioRevealScreenContract$InputData, d1h.j jVar) {
        this.f295250c = mVar;
        this.f295248a = jVar;
        this.f295249b = portfolioRevealScreenContract$InputData;
        int i = 12;
        this.d = e4m.b.b(new vzc.j(mVar, this, 0, i));
        this.e = e4m.b.b(new vzc.j(mVar, this, 2, i));
        this.f = e4m.b.b(new vzc.j(mVar, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of(dw3.l.m((d1h.e) this.d.get()));
    }

    @Override // xki.e
    public final Set g() {
        gah.f fVarA = ((u8h.b) this.f295250c.f295191c).a();
        vc.s.j(fVarA);
        return ImmutableSet.of(dw3.l.l(fVarA, this.f295248a, (d1h.e) this.d.get()));
    }
}
