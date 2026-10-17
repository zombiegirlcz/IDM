package q1k;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.payment_options.impl.ui.screens.options.PaymentOptionsScreenContract$InputData;
import e4m.e;
import java.util.Set;
import prk.k0;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentOptionsScreenContract$InputData f241460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f241461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f241462c;

    public c(a aVar, b bVar, PaymentOptionsScreenContract$InputData paymentOptionsScreenContract$InputData) {
        this.f241460a = paymentOptionsScreenContract$InputData;
        int i = 5;
        this.f241461b = e4m.b.b(new k0(aVar, this, 1, i));
        this.f241462c = e4m.b.b(new k0(aVar, this, 0, i));
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
