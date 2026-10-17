package p7c;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.revolutpay.impl.ui.payment_schedule.PaymentScheduleContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentScheduleContract$InputData f233647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f233648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f233649c;

    public n(r rVar, x xVar, PaymentScheduleContract$InputData paymentScheduleContract$InputData) {
        this.f233647a = paymentScheduleContract$InputData;
        int i = 11;
        this.f233648b = e4m.b.b(new p12.s0(this, 1, i));
        this.f233649c = e4m.b.b(new p12.s0(this, 0, i));
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
