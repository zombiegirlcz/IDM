package mn4;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\f\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0016"}, d2 = {"Lmn4/b;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "e", "()Z", "isEligible", "Ljo3/a;", "b", "Ljo3/a;", "c", "()Ljo3/a;", "minCreditLimit", "maxCreditLimit", "d", "nonSelectableMinCreditLimit", "Ljava/lang/String;", "ineligibilityReason", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("isEligible")
    private final boolean isEligible;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("minCreditLimit")
    @NotNull
    private final jo3.a minCreditLimit;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("maxCreditLimit")
    @NotNull
    private final jo3.a maxCreditLimit;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("nonSelectableMinCreditLimit")
    @NotNull
    private final jo3.a nonSelectableMinCreditLimit;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("ineligibilityReason")
    private final String ineligibilityReason;

    public b(boolean z, jo3.a minCreditLimit, jo3.a maxCreditLimit, jo3.a nonSelectableMinCreditLimit, String str) {
        Intrinsics.checkNotNullParameter(minCreditLimit, "minCreditLimit");
        Intrinsics.checkNotNullParameter(maxCreditLimit, "maxCreditLimit");
        Intrinsics.checkNotNullParameter(nonSelectableMinCreditLimit, "nonSelectableMinCreditLimit");
        this.isEligible = z;
        this.minCreditLimit = minCreditLimit;
        this.maxCreditLimit = maxCreditLimit;
        this.nonSelectableMinCreditLimit = nonSelectableMinCreditLimit;
        this.ineligibilityReason = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getIneligibilityReason() {
        return this.ineligibilityReason;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getMaxCreditLimit() {
        return this.maxCreditLimit;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.a getMinCreditLimit() {
        return this.minCreditLimit;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getNonSelectableMinCreditLimit() {
        return this.nonSelectableMinCreditLimit;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsEligible() {
        return this.isEligible;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.isEligible == bVar.isEligible && Intrinsics.f(this.minCreditLimit, bVar.minCreditLimit) && Intrinsics.f(this.maxCreditLimit, bVar.maxCreditLimit) && Intrinsics.f(this.nonSelectableMinCreditLimit, bVar.nonSelectableMinCreditLimit) && Intrinsics.f(this.ineligibilityReason, bVar.ineligibilityReason);
    }

    public final int hashCode() {
        int iJ = v7.j(this.nonSelectableMinCreditLimit, v7.j(this.maxCreditLimit, v7.j(this.minCreditLimit, Boolean.hashCode(this.isEligible) * 31, 31), 31), 31);
        String str = this.ineligibilityReason;
        return iJ + (str == null ? 0 : str.hashCode());
    }
}
