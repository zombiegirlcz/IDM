package pj7;

import com.revolut.feature.insurance.api.models.details.CFACPaymentPurpose;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CFACPaymentPurpose f236687a;

    public k(CFACPaymentPurpose selectedPaymentPurpose) {
        Intrinsics.checkNotNullParameter(selectedPaymentPurpose, "selectedPaymentPurpose");
        this.f236687a = selectedPaymentPurpose;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f236687a, ((k) obj2).f236687a);
    }

    public final int hashCode() {
        return this.f236687a.hashCode();
    }
}
