package fmb;

import com.revolut.feature.retail.savings.api.challenge.model.SavingsChallengeCreationData;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class z implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsProductData f136318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SavingsChallengeCreationData f136319b;

    public z(SavingsProductData productData, SavingsChallengeCreationData savingsChallengeCreationData) {
        Intrinsics.checkNotNullParameter(productData, "productData");
        this.f136318a = productData;
        this.f136319b = savingsChallengeCreationData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f136318a, zVar.f136318a) && Intrinsics.f(this.f136319b, zVar.f136319b);
    }

    public final int hashCode() {
        int iHashCode = this.f136318a.hashCode() * 31;
        SavingsChallengeCreationData savingsChallengeCreationData = this.f136319b;
        return iHashCode + (savingsChallengeCreationData == null ? 0 : savingsChallengeCreationData.hashCode());
    }
}
