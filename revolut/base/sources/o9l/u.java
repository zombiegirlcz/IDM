package o9l;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0014"}, d2 = {"Lo9l/u;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "d", "()Z", "isTrial", "", "b", "Ljava/util/List;", "()Ljava/util/List;", "billingCycles", "c", "Ljava/lang/String;", "planName", "planTier", "feature_shared_recurring_payments_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("isTrial")
    private final boolean isTrial;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("billingCycles")
    private final List<String> billingCycles;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("planName")
    private final String planName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("planTier")
    private final String planTier;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getBillingCycles() {
        return this.billingCycles;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPlanName() {
        return this.planName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPlanTier() {
        return this.planTier;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsTrial() {
        return this.isTrial;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return this.isTrial == uVar.isTrial && Intrinsics.f(this.billingCycles, uVar.billingCycles) && Intrinsics.f(this.planName, uVar.planName) && Intrinsics.f(this.planTier, uVar.planTier);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.isTrial) * 31;
        List<String> list = this.billingCycles;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.planName;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.planTier;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }
}
