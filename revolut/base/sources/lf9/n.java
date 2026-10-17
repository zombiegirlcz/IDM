package lf9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pay_bills_taxes.api.navigation.PayBillsAndTaxesNavigation$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class n implements xki.c, ng9.a, pg9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PayBillsAndTaxesNavigation$InputData f194748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f194749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f194750c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f194751g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f194752h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f194753j;

    public n(m mVar, PayBillsAndTaxesNavigation$InputData payBillsAndTaxesNavigation$InputData) {
        this.f194749b = mVar;
        this.f194748a = payBillsAndTaxesNavigation$InputData;
        int i = 23;
        this.d = e4m.b.b(new l9f.z(mVar, this, 0, i));
        this.e = e4m.b.b(new l9f.z(mVar, this, 1, i));
        this.f = e4m.b.b(new l9f.z(mVar, this, 3, i));
        this.f194751g = e4m.b.b(new l9f.z(mVar, this, 2, i));
        this.f194752h = e4m.b.b(new l9f.z(mVar, this, 5, i));
        this.i = e4m.b.b(new l9f.z(mVar, this, 4, i));
        this.f194753j = e4m.b.b(new l9f.z(mVar, this, 6, i));
    }

    @Override // ng9.a
    public final v b() {
        return new v(this.f194749b, this.f194750c, 2);
    }

    @Override // pg9.a
    public final x c() {
        return new x(this.f194749b, this.f194750c, 2);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f194751g.get(), (yji.n) this.i.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get(), (yji.d) this.e.get());
    }
}
