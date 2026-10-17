package lxe;

import com.revolut.feature.topup_screen.impl.flows.checkout.screen.custom_amount.CheckoutCustomAmountScreenContract$ValidationResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f200559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CheckoutCustomAmountScreenContract$ValidationResult f200560b;

    public d(dj0.d customAmount, CheckoutCustomAmountScreenContract$ValidationResult checkoutCustomAmountScreenContract$ValidationResult) {
        Intrinsics.checkNotNullParameter(customAmount, "customAmount");
        this.f200559a = customAmount;
        this.f200560b = checkoutCustomAmountScreenContract$ValidationResult;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f200559a, dVar.f200559a) && Intrinsics.f(this.f200560b, dVar.f200560b);
    }

    public final int hashCode() {
        int iHashCode = this.f200559a.hashCode() * 31;
        CheckoutCustomAmountScreenContract$ValidationResult checkoutCustomAmountScreenContract$ValidationResult = this.f200560b;
        return iHashCode + (checkoutCustomAmountScreenContract$ValidationResult == null ? 0 : checkoutCustomAmountScreenContract$ValidationResult.hashCode());
    }
}
