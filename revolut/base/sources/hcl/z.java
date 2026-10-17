package hcl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u000e\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016R\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u0012\u0010\u001b¨\u0006\u001d"}, d2 = {"Lhcl/z;", "", "", "toString", "()Ljava/lang/String;", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "f", "()Ljava/math/BigDecimal;", "targetAnnualReturn", "b", "g", "valueGrowth", "c", "dividendYield", "d", "managementFee", "e", "carriedInterest", "", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "recommendedHoldingPeriodMonths", "", "Lhcl/z$a;", "Ljava/util/List;", "()Ljava/util/List;", "scenarios", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("targetAnnualReturn")
    private final BigDecimal targetAnnualReturn;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("valueGrowth")
    private final BigDecimal valueGrowth;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("dividendYield")
    private final BigDecimal dividendYield;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("managementFee")
    private final BigDecimal managementFee;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("carriedInterest")
    private final BigDecimal carriedInterest;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("recommendedHoldingPeriodMonths")
    private final Integer recommendedHoldingPeriodMonths;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("scenarios")
    private final List<a> scenarios;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\r"}, d2 = {"Lhcl/z$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "type", "Ljava/math/BigDecimal;", "b", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "value", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        private final String type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("value")
        private final BigDecimal value;

        public a(String str, BigDecimal bigDecimal) {
            this.type = str;
            this.value = bigDecimal;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final BigDecimal getValue() {
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
            BigDecimal bigDecimal = this.value;
            return iHashCode + (bigDecimal != null ? bigDecimal.hashCode() : 0);
        }
    }

    public z(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, Integer num, ArrayList arrayList) {
        this.targetAnnualReturn = bigDecimal;
        this.valueGrowth = bigDecimal2;
        this.dividendYield = bigDecimal3;
        this.managementFee = bigDecimal4;
        this.carriedInterest = bigDecimal5;
        this.recommendedHoldingPeriodMonths = num;
        this.scenarios = arrayList;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getCarriedInterest() {
        return this.carriedInterest;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BigDecimal getDividendYield() {
        return this.dividendYield;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final BigDecimal getManagementFee() {
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
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.targetAnnualReturn, zVar.targetAnnualReturn) && Intrinsics.f(this.valueGrowth, zVar.valueGrowth) && Intrinsics.f(this.dividendYield, zVar.dividendYield) && Intrinsics.f(this.managementFee, zVar.managementFee) && Intrinsics.f(this.carriedInterest, zVar.carriedInterest) && Intrinsics.f(this.recommendedHoldingPeriodMonths, zVar.recommendedHoldingPeriodMonths) && Intrinsics.f(this.scenarios, zVar.scenarios);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final BigDecimal getTargetAnnualReturn() {
        return this.targetAnnualReturn;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final BigDecimal getValueGrowth() {
        return this.valueGrowth;
    }

    public final int hashCode() {
        BigDecimal bigDecimal = this.targetAnnualReturn;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.valueGrowth;
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.dividendYield;
        int iHashCode3 = (iHashCode2 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.managementFee;
        int iHashCode4 = (iHashCode3 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.carriedInterest;
        int iHashCode5 = (iHashCode4 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        Integer num = this.recommendedHoldingPeriodMonths;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        List<a> list = this.scenarios;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }
}
