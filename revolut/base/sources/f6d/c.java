package f6d;

import com.revolut.feature.shared.beneficiary.api.confirmation_of_payee.BeneficiaryCreationType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BeneficiaryCreationType f132417a;

    public c(BeneficiaryCreationType replacementName) {
        Intrinsics.checkNotNullParameter(replacementName, "replacementName");
        this.f132417a = replacementName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f132417a, ((c) obj2).f132417a);
    }

    public final int hashCode() {
        return this.f132417a.hashCode();
    }
}
