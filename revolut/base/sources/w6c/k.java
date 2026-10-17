package w6c;

import com.revolut.feature.revolutpay.api.shared.navigation.PaymentBreakdownControllerDescriptor$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentBreakdownControllerDescriptor$InputData f295419a;

    public k(PaymentBreakdownControllerDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f295419a = inputData;
    }

    public final PaymentBreakdownControllerDescriptor$InputData b() {
        return this.f295419a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f295419a, ((k) obj2).f295419a);
    }

    public final int hashCode() {
        return this.f295419a.hashCode();
    }
}
