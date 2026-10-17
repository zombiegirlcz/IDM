package b43;

import com.revolut.feature.card_payment_method.api.declaration.SelectedPaymentMethodResultContract$SelectedCardBindingStrategy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SelectedPaymentMethodResultContract$SelectedCardBindingStrategy f12158a;

    public a(SelectedPaymentMethodResultContract$SelectedCardBindingStrategy selectedCardBindingStrategy) {
        Intrinsics.checkNotNullParameter(selectedCardBindingStrategy, "selectedCardBindingStrategy");
        this.f12158a = selectedCardBindingStrategy;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f12158a, ((a) obj2).f12158a);
    }

    public final int hashCode() {
        return this.f12158a.hashCode();
    }
}
