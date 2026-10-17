package gdc;

import com.revolut.feature.revolutpay.shared.ui.add_payment_method.AddPaymentMethodControllerDescriptor$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements aii.e {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AddPaymentMethodControllerDescriptor$InputData f143127a;

    public c(AddPaymentMethodControllerDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f143127a = inputData;
    }

    public final AddPaymentMethodControllerDescriptor$InputData b() {
        return this.f143127a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f143127a, ((c) obj2).f143127a);
    }

    public final int hashCode() {
        return this.f143127a.hashCode();
    }
}
