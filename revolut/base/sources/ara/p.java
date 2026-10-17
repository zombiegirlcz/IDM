package ara;

import com.revolut.feature.push_to_card.api.model.CardEligibility;
import com.revolut.feature.push_to_card.api.navigation.creation.CardOwnerInfoState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardOwnerInfoState f8613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CardEligibility f8614b;

    public p(CardOwnerInfoState cardOwnerInfo, CardEligibility eligibilityData) {
        Intrinsics.checkNotNullParameter(cardOwnerInfo, "cardOwnerInfo");
        Intrinsics.checkNotNullParameter(eligibilityData, "eligibilityData");
        Intrinsics.checkNotNullParameter("CardOwnerMainInfoScreenContract_BUTTON_TAG", "ctaTag");
        this.f8613a = cardOwnerInfo;
        this.f8614b = eligibilityData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f8613a, pVar.f8613a) && this.f8614b.equals(pVar.f8614b);
    }

    public final int hashCode() {
        return ((this.f8614b.hashCode() + (this.f8613a.hashCode() * 31)) * 31) + 1229083844;
    }
}
