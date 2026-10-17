package n3j;

import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class q implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BeneficiaryInfoState f212153a;

    public q(BeneficiaryInfoState infoState) {
        Intrinsics.checkNotNullParameter(infoState, "infoState");
        Intrinsics.checkNotNullParameter("AccountFieldsScreenContract_BUTTON_TAG", "ctaTag");
        this.f212153a = infoState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && this.f212153a.equals(((q) obj2).f212153a);
    }

    public final int hashCode() {
        return (this.f212153a.hashCode() * 31) + 1340926376;
    }
}
