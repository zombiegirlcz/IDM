package pj7;

import com.revolut.feature.insurance.api.models.details.CFACPaymentCanceller;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CFACPaymentCanceller f236684a;

    public i(CFACPaymentCanceller selectedCanceller) {
        Intrinsics.checkNotNullParameter(selectedCanceller, "selectedCanceller");
        this.f236684a = selectedCanceller;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f236684a, ((i) obj2).f236684a);
    }

    public final int hashCode() {
        return this.f236684a.hashCode();
    }
}
