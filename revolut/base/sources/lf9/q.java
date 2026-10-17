package lf9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pay_bills_taxes.api.navigation.BillPaymentNavigation$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class q implements xki.c, fri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillPaymentNavigation$InputData f194778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f194779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f194780c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f194781g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f194782h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f194783j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f194784l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f194785m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f194786n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f194787p;

    public q(m mVar, BillPaymentNavigation$InputData billPaymentNavigation$InputData) {
        this.f194779b = mVar;
        this.f194778a = billPaymentNavigation$InputData;
        int i = 24;
        this.d = e4m.b.b(new l9f.z(mVar, this, 0, i));
        this.e = e4m.b.b(new l9f.z(mVar, this, 1, i));
        this.f = e4m.b.b(new l9f.z(mVar, this, 3, i));
        this.f194781g = e4m.b.b(new l9f.z(mVar, this, 2, i));
        this.f194782h = e4m.b.b(new l9f.z(mVar, this, 6, i));
        this.i = e4m.b.b(new l9f.z(mVar, this, 5, i));
        this.f194783j = e4m.b.b(new l9f.z(mVar, this, 4, i));
        this.k = e4m.b.b(new l9f.z(mVar, this, 9, i));
        this.f194784l = e4m.b.b(new l9f.z(mVar, this, 8, i));
        this.f194785m = e4m.b.b(new l9f.z(mVar, this, 7, i));
        this.f194786n = e4m.b.b(new l9f.z(mVar, this, 10, i));
        this.o = e4m.b.b(new l9f.z(mVar, this, 11, i));
        this.f194787p = e4m.b.b(new l9f.z(mVar, this, 12, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f194781g.get(), (yji.n) this.f194783j.get(), (yji.n) this.f194785m.get(), (yji.n) this.f194786n.get(), (yji.n) this.o.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get(), (yji.d) this.e.get());
    }

    public final ph9.c q() {
        m mVar = this.f194779b;
        sf0.h hVarB = mVar.f194735c.b();
        vc.s.j(hVarB);
        v60.e eVarA = mVar.d.a();
        vc.s.j(eVarA);
        return new ph9.c(hVarB, eVarA, 0);
    }
}
