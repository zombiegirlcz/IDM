package vgc;

import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsLinkedPayments;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RentAndBillsLinkedPayments.Category.LinkedPayment f288823a;

    public g(RentAndBillsLinkedPayments.Category.LinkedPayment linkedPayment) {
        Intrinsics.checkNotNullParameter(linkedPayment, "linkedPayment");
        this.f288823a = linkedPayment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f288823a, ((g) obj2).f288823a);
    }

    public final int hashCode() {
        return this.f288823a.hashCode();
    }
}
