package gfk;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b\t\u0010\u001eR\u001c\u0010 \u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u000e\u0010\u0019¨\u0006!"}, d2 = {"Lgfk/z;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "id", "b", "accountType", "c", "billingPeriod", "", "d", "Ljava/lang/Long;", "h", "()Ljava/lang/Long;", "startDate", "e", "g", "nextBillingDate", "", "Ljava/lang/Boolean;", "i", "()Ljava/lang/Boolean;", "isFamily", "displayCode", "Lgfk/s;", "Lgfk/s;", "()Lgfk/s;", "billingDetails", "canCancel", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("accountType")
    private final String accountType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("billingPeriod")
    private final String billingPeriod;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("startDate")
    private final Long startDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("nextBillingDate")
    private final Long nextBillingDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("isFamily")
    private final Boolean isFamily;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("displayCode")
    private final String displayCode;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("billingDetails")
    private final s billingDetails;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("canCancel")
    private final Boolean canCancel;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAccountType() {
        return this.accountType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final s getBillingDetails() {
        return this.billingDetails;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBillingPeriod() {
        return this.billingPeriod;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getCanCancel() {
        return this.canCancel;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDisplayCode() {
        return this.displayCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.id, zVar.id) && Intrinsics.f(this.accountType, zVar.accountType) && Intrinsics.f(this.billingPeriod, zVar.billingPeriod) && Intrinsics.f(this.startDate, zVar.startDate) && Intrinsics.f(this.nextBillingDate, zVar.nextBillingDate) && Intrinsics.f(this.isFamily, zVar.isFamily) && Intrinsics.f(this.displayCode, zVar.displayCode) && Intrinsics.f(this.billingDetails, zVar.billingDetails) && Intrinsics.f(this.canCancel, zVar.canCancel);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Long getNextBillingDate() {
        return this.nextBillingDate;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Long getStartDate() {
        return this.startDate;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.accountType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.billingPeriod;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.startDate;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.nextBillingDate;
        int iHashCode5 = (iHashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Boolean bool = this.isFamily;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.displayCode;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        s sVar = this.billingDetails;
        int iHashCode8 = (iHashCode7 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        Boolean bool2 = this.canCancel;
        return iHashCode8 + (bool2 != null ? bool2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Boolean getIsFamily() {
        return this.isFamily;
    }
}
