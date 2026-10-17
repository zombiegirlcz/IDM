package q7k;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.payments.payment_links.api.navigation.PaymentLinksFeatureInputData;
import java.util.Set;
import prk.k0;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentLinksFeatureInputData f242922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f242923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f242924c;
    public final e4m.e d;

    public k(j jVar, PaymentLinksFeatureInputData paymentLinksFeatureInputData) {
        this.f242922a = paymentLinksFeatureInputData;
        int i = 9;
        this.f242923b = e4m.b.b(new k0(jVar, this, 0, i));
        this.f242924c = e4m.b.b(new k0(jVar, this, 1, i));
        this.d = e4m.b.b(new k0(jVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f242923b.get(), (yji.d) this.f242924c.get());
    }
}
