package sx2;

import com.revolut.feature.card_payment_method.api.declaration.SelectedPaymentMethodResultContract$SelectedCardBindingStrategy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e0 extends com.revolut.feature.card_design.impl.card_design.carousel.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e93.d f266282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pi3.h f266283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hha.d f266284c;
    public final boolean d;
    public final SelectedPaymentMethodResultContract$SelectedCardBindingStrategy e;

    public e0(e93.d cardDesign, pi3.h hVar, hha.d currentPricingPlan, boolean z, SelectedPaymentMethodResultContract$SelectedCardBindingStrategy selectedPaymentMethodResultContract$SelectedCardBindingStrategy) {
        Intrinsics.checkNotNullParameter(cardDesign, "cardDesign");
        Intrinsics.checkNotNullParameter(currentPricingPlan, "currentPricingPlan");
        this.f266282a = cardDesign;
        this.f266283b = hVar;
        this.f266284c = currentPricingPlan;
        this.d = z;
        this.e = selectedPaymentMethodResultContract$SelectedCardBindingStrategy;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f266282a, e0Var.f266282a) && Intrinsics.f(this.f266283b, e0Var.f266283b) && Intrinsics.f(this.f266284c, e0Var.f266284c) && this.d == e0Var.d && Intrinsics.f(this.e, e0Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.f266282a.hashCode() * 31;
        pi3.h hVar = this.f266283b;
        int iC = j6.a.c((this.f266284c.hashCode() + ((iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31)) * 31, 31, this.d);
        SelectedPaymentMethodResultContract$SelectedCardBindingStrategy selectedPaymentMethodResultContract$SelectedCardBindingStrategy = this.e;
        return iC + (selectedPaymentMethodResultContract$SelectedCardBindingStrategy != null ? selectedPaymentMethodResultContract$SelectedCardBindingStrategy.hashCode() : 0);
    }
}
