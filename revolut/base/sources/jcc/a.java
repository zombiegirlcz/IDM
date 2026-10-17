package jcc;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.revolutpay.promoted_merchants.impl.ui.promotedmerchants.chekout.PromotedMerchantCheckoutContract$InputData;
import iwh.k;
import java.util.Set;
import yji.n;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PromotedMerchantCheckoutContract$InputData f172758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f172759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f172760c;

    public a(e eVar, PromotedMerchantCheckoutContract$InputData promotedMerchantCheckoutContract$InputData) {
        this.f172759b = eVar;
        this.f172758a = promotedMerchantCheckoutContract$InputData;
        this.f172760c = e4m.b.b(new k(eVar, this, 5));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.f172759b.v.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
