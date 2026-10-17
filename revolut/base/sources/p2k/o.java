package p2k;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.payments.bank_transfer.impl.comparison.ui.PriceComparisonScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class o implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PriceComparisonScreenContract$InputData f232420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f232421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f232422c;
    public final e4m.e d;
    public final e4m.e e;

    public o(n nVar, PriceComparisonScreenContract$InputData priceComparisonScreenContract$InputData) {
        this.f232420a = priceComparisonScreenContract$InputData;
        int i = 9;
        this.f232421b = e4m.b.b(new p12.f0(nVar, this, 1, i));
        this.f232422c = e4m.b.b(new p12.f0(nVar, this, 0, i));
        this.d = e4m.b.b(new p12.f0(nVar, this, 3, i));
        this.e = e4m.b.b(new p12.f0(nVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f232422c.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
