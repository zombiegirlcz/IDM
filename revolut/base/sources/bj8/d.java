package bj8;

import com.revolut.feature.junior_payment_links.api.model.PaymentLinkCustomAmountBundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentLinkCustomAmountBundle f15585a;

    public d(PaymentLinkCustomAmountBundle initialCustomAmountBundle) {
        Intrinsics.checkNotNullParameter(initialCustomAmountBundle, "initialCustomAmountBundle");
        this.f15585a = initialCustomAmountBundle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f15585a, ((d) obj2).f15585a);
    }

    public final int hashCode() {
        return this.f15585a.hashCode();
    }
}
