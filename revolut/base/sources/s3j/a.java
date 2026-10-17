package s3j;

import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BeneficiaryInfoState f259695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f259696b;

    public a(BeneficiaryInfoState newState, boolean z) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        this.f259695a = newState;
        this.f259696b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f259695a, aVar.f259695a) && this.f259696b == aVar.f259696b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f259696b) + (this.f259695a.hashCode() * 31);
    }
}
