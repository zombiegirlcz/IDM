package p7c;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.revolutpay.shared.ui.add_payment_method.AddPaymentMethodControllerDescriptor$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class b0 implements hdc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AddPaymentMethodControllerDescriptor$InputData f233583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f233584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f233585c;
    public final e4m.e d;

    public b0(r rVar, j jVar, AddPaymentMethodControllerDescriptor$InputData addPaymentMethodControllerDescriptor$InputData) {
        this.f233584b = rVar;
        this.f233585c = jVar;
        this.f233583a = addPaymentMethodControllerDescriptor$InputData;
        this.d = e4m.b.b(new p2k.c(rVar, this, 6));
    }

    @Override // hdc.b
    public final gdc.m a() {
        return (gdc.m) this.d.get();
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f233585c.f233628h.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
