package c43;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_payment_method.api.declaration.PaymentMethodInfoInputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentMethodInfoInputData f21031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f21032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f21033c;

    public i(h hVar, PaymentMethodInfoInputData paymentMethodInfoInputData) {
        this.f21031a = paymentMethodInfoInputData;
        int i = 20;
        this.f21032b = e4m.b.b(new aq1.e(this, 0, i));
        this.f21033c = e4m.b.b(new aq1.e(this, 1, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
