package ove;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.custom_amount.CheckoutCustomAmountScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckoutCustomAmountScreenContract$InputData f230090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f230091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f230092c;
    public final e4m.e d;

    public l(t tVar, CheckoutCustomAmountScreenContract$InputData checkoutCustomAmountScreenContract$InputData) {
        this.f230091b = tVar;
        this.f230090a = checkoutCustomAmountScreenContract$InputData;
        this.f230092c = e4m.b.b(new oi9.a(tVar, this, 1, 26));
        this.d = e4m.b.b(new oi9.a(tVar, this, 0, 26));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
