package w5f;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.allocation.ManagedPortfolioDetailsAllocationContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class c0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d1h.j f295122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j6f.d f295123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ManagedPortfolioDetailsAllocationContract$InputData f295124c;
    public final m d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f295125g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f295126h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f295127j;
    public final e4m.e k;

    public c0(m mVar, ManagedPortfolioDetailsAllocationContract$InputData managedPortfolioDetailsAllocationContract$InputData, j6f.d dVar, d1h.j jVar) {
        this.d = mVar;
        this.f295122a = jVar;
        this.f295123b = dVar;
        this.f295124c = managedPortfolioDetailsAllocationContract$InputData;
        int i = 15;
        this.e = e4m.b.b(new vzc.j(mVar, this, 0, i));
        this.f = e4m.b.b(new vzc.j(mVar, this, 2, i));
        this.f295125g = e4m.b.b(new vzc.j(mVar, this, 1, i));
        this.f295126h = e4m.b.b(new vzc.j(mVar, this, 6, i));
        this.i = e4m.b.b(new vzc.j(mVar, this, 5, i));
        this.f295127j = e4m.b.b(new vzc.j(mVar, this, 4, i));
        this.k = e4m.b.b(new vzc.j(mVar, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of(dw3.l.m((d1h.e) this.e.get()), (yji.n) this.f.get());
    }

    @Override // xki.e
    public final Set g() {
        gah.f fVarA = ((u8h.b) this.d.f295191c).a();
        vc.s.j(fVarA);
        return ImmutableSet.of((yji.d) dw3.l.l(fVarA, this.f295122a, (d1h.e) this.e.get()), (yji.d) this.f295125g.get());
    }
}
