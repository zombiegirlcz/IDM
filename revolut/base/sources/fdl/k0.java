package fdl;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014R\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0010\u0010\u0019¨\u0006\u001b"}, d2 = {"Lfdl/k0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "targetAnnualReturn", "b", "g", "valueGrowth", "c", "dividendYield", "d", "managementFee", "e", "carriedInterest", "", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "recommendedHoldingPeriodMonths", "", "Lfdl/k0$a;", "Ljava/util/List;", "()Ljava/util/List;", "scenarios", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("targetAnnualReturn")
    private final String targetAnnualReturn;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("valueGrowth")
    private final String valueGrowth;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("dividendYield")
    private final String dividendYield;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("managementFee")
    private final String managementFee;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("carriedInterest")
    private final String carriedInterest;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("recommendedHoldingPeriodMonths")
    private final Integer recommendedHoldingPeriodMonths;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("scenarios")
    private final List<a> scenarios;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\n"}, d2 = {"Lfdl/k0$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "type", "b", "value", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        private final String type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("value")
        private final String value;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.type, aVar.type) && Intrinsics.f(this.value, aVar.value);
        }

        public final int hashCode() {
            String str = this.type;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.value;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCarriedInterest() {
        return this.carriedInterest;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDividendYield() {
        return this.dividendYield;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getManagementFee() {
        return this.managementFee;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getRecommendedHoldingPeriodMonths() {
        return this.recommendedHoldingPeriodMonths;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getScenarios() {
        return this.scenarios;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return Intrinsics.f(this.targetAnnualReturn, k0Var.targetAnnualReturn) && Intrinsics.f(this.valueGrowth, k0Var.valueGrowth) && Intrinsics.f(this.dividendYield, k0Var.dividendYield) && Intrinsics.f(this.managementFee, k0Var.managementFee) && Intrinsics.f(this.carriedInterest, k0Var.carriedInterest) && Intrinsics.f(this.recommendedHoldingPeriodMonths, k0Var.recommendedHoldingPeriodMonths) && Intrinsics.f(this.scenarios, k0Var.scenarios);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTargetAnnualReturn() {
        return this.targetAnnualReturn;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getValueGrowth() {
        return this.valueGrowth;
    }

    public final int hashCode() {
        String str = this.targetAnnualReturn;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.valueGrowth;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dividendYield;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.managementFee;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.carriedInterest;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.recommendedHoldingPeriodMonths;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        List<a> list = this.scenarios;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }
}
