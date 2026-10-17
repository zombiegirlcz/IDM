package y3j;

import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BeneficiaryInfoState f310739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f310740b;

    public a(BeneficiaryInfoState newState, boolean z) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        this.f310739a = newState;
        this.f310740b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f310739a, aVar.f310739a) && this.f310740b == aVar.f310740b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f310740b) + (this.f310739a.hashCode() * 31);
    }
}
