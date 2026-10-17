package ot3;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004¨\u0006\f"}, d2 = {"Lot3/n0;", "Lot3/y;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "selectedPlanId", "b", "billingOption", "offerToken", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class n0 extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("selectedPlanId")
    @NotNull
    private final String selectedPlanId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("billingOption")
    private final String billingOption;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("offerToken")
    private final String offerToken;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBillingOption() {
        return this.billingOption;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getOfferToken() {
        return this.offerToken;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSelectedPlanId() {
        return this.selectedPlanId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj2;
        return Intrinsics.f(this.selectedPlanId, n0Var.selectedPlanId) && Intrinsics.f(this.billingOption, n0Var.billingOption) && Intrinsics.f(this.offerToken, n0Var.offerToken);
    }

    public final int hashCode() {
        int iHashCode = this.selectedPlanId.hashCode() * 31;
        String str = this.billingOption;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.offerToken;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
