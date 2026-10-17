package zek;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004¨\u0006\u0010"}, d2 = {"Lzek/m;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "type", "b", "c", "pricingPlanId", "endDate", "d", "totalPeriod", "leftPeriod", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("pricingPlanId")
    @NotNull
    private final String pricingPlanId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("endDate")
    private final String endDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("totalPeriod")
    @NotNull
    private final String totalPeriod;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("leftPeriod")
    private final String leftPeriod;

    public m(String type, String pricingPlanId, String str, String totalPeriod, String str2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(pricingPlanId, "pricingPlanId");
        Intrinsics.checkNotNullParameter(totalPeriod, "totalPeriod");
        this.type = type;
        this.pricingPlanId = pricingPlanId;
        this.endDate = str;
        this.totalPeriod = totalPeriod;
        this.leftPeriod = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLeftPeriod() {
        return this.leftPeriod;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPricingPlanId() {
        return this.pricingPlanId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTotalPeriod() {
        return this.totalPeriod;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.type, mVar.type) && Intrinsics.f(this.pricingPlanId, mVar.pricingPlanId) && Intrinsics.f(this.endDate, mVar.endDate) && Intrinsics.f(this.totalPeriod, mVar.totalPeriod) && Intrinsics.f(this.leftPeriod, mVar.leftPeriod);
    }

    public final int hashCode() {
        int iC = p.a.c(this.type.hashCode() * 31, 31, this.pricingPlanId);
        String str = this.endDate;
        int iC2 = p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.totalPeriod);
        String str2 = this.leftPeriod;
        return iC2 + (str2 != null ? str2.hashCode() : 0);
    }
}
