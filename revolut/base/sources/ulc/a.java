package ulc;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0006\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\tR\u001a\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0011\u0010\tR\u001a\u0010\u0015\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0007\u001a\u0004\b\u0014\u0010\tR\u001a\u0010\u0018\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0007\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u001a\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0007\u001a\u0004\b\u0010\u0010\tR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u001b\u0010\tR\u001a\u0010\u001e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0007\u001a\u0004\b\u001d\u0010\tR\u001a\u0010 \u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0007\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0007\u001a\u0004\b!\u0010\tR\u001c\u0010$\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0007\u001a\u0004\b#\u0010\tR\u001a\u0010&\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001c\u0010'\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0007\u001a\u0004\b\u0013\u0010\tR\u001c\u0010(\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0016\u0010\tR\u001c\u0010-\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b\r\u0010,R\u001c\u0010/\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010+\u001a\u0004\b.\u0010,R\u001c\u00100\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u0019\u0010\tR\u001c\u00101\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\u0007\u001a\u0004\b%\u0010\tR\"\u00106\u001a\n\u0012\u0004\u0012\u000203\u0018\u0001028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u00104\u001a\u0004\b*\u00105¨\u00067"}, d2 = {"Lulc/a;", "", "", "toString", "()Ljava/lang/String;", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "b", "()Ljava/math/BigDecimal;", "averageAnnualReturn", "r", "standardDeviation", "c", "h", "benchmarkStandardDeviation", "d", "o", "medianReturn", "e", "i", "bestYearReturn", "f", "n", "maxDrawdown", "g", "averageDrawdown", "j", "beta", "q", "sharpeRatio", "t", "valueAtRisk", "k", "cagr", "l", "dividendYield", "m", "annualTotalReturn", "benchmarkAnnualTotalReturn", "benchmarkAverageAnnualReturn", "Lulc/a$a;", "p", "Lulc/a$a;", "()Lulc/a$a;", "averageAnnualReturnBreakdown", "s", "totalAnnualReturnBreakdown", "benchmarkSharpeRatio", "freeRiskReturn", "", "Lulc/a$b;", "Ljava/util/List;", "()Ljava/util/List;", "overview", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("averageAnnualReturn")
    @NotNull
    private final BigDecimal averageAnnualReturn;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("standardDeviation")
    @NotNull
    private final BigDecimal standardDeviation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("benchmarkStandardDeviation")
    private final BigDecimal benchmarkStandardDeviation;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("medianReturn")
    @NotNull
    private final BigDecimal medianReturn;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("bestYearReturn")
    @NotNull
    private final BigDecimal bestYearReturn;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("maxDrawdown")
    @NotNull
    private final BigDecimal maxDrawdown;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("averageDrawdown")
    @NotNull
    private final BigDecimal averageDrawdown;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("beta")
    private final BigDecimal beta;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("sharpeRatio")
    @NotNull
    private final BigDecimal sharpeRatio;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("valueAtRisk")
    @NotNull
    private final BigDecimal valueAtRisk;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("cagr")
    private final BigDecimal cagr;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("dividendYield")
    private final BigDecimal dividendYield;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("annualTotalReturn")
    @NotNull
    private final BigDecimal annualTotalReturn;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("benchmarkAnnualTotalReturn")
    private final BigDecimal benchmarkAnnualTotalReturn;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("benchmarkAverageAnnualReturn")
    private final BigDecimal benchmarkAverageAnnualReturn;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("averageAnnualReturnBreakdown")
    private final C1553a averageAnnualReturnBreakdown;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalAnnualReturnBreakdown")
    private final C1553a totalAnnualReturnBreakdown;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("benchmarkSharpeRatio")
    private final BigDecimal benchmarkSharpeRatio;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("freeRiskReturn")
    private final BigDecimal freeRiskReturn;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("overview")
    private final List<b> overview;

    /* JADX INFO: renamed from: ulc.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u000b\u0010\u000f¨\u0006\u0011"}, d2 = {"Lulc/a$a;", "", "", "toString", "()Ljava/lang/String;", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "c", "()Ljava/math/BigDecimal;", "valueAppreciation", "b", "fees", "Lulc/a$a$a;", "Lulc/a$a$a;", "()Lulc/a$a$a;", "ongoingCharges", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1553a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("valueAppreciation")
        @NotNull
        private final BigDecimal valueAppreciation;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("fees")
        @NotNull
        private final BigDecimal fees;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("ongoingCharges")
        private final C1554a ongoingCharges;

        /* JADX INFO: renamed from: ulc.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\f"}, d2 = {"Lulc/a$a$a;", "", "", "toString", "()Ljava/lang/String;", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "b", "()Ljava/math/BigDecimal;", "min", "max", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1554a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("min")
            @NotNull
            private final BigDecimal min;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("max")
            @NotNull
            private final BigDecimal max;

            public C1554a(BigDecimal min, BigDecimal max) {
                Intrinsics.checkNotNullParameter(min, "min");
                Intrinsics.checkNotNullParameter(max, "max");
                this.min = min;
                this.max = max;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BigDecimal getMax() {
                return this.max;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final BigDecimal getMin() {
                return this.min;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C1554a)) {
                    return false;
                }
                C1554a c1554a = (C1554a) obj2;
                return Intrinsics.f(this.min, c1554a.min) && Intrinsics.f(this.max, c1554a.max);
            }

            public final int hashCode() {
                return this.max.hashCode() + (this.min.hashCode() * 31);
            }
        }

        public C1553a(BigDecimal valueAppreciation, BigDecimal fees, C1554a c1554a) {
            Intrinsics.checkNotNullParameter(valueAppreciation, "valueAppreciation");
            Intrinsics.checkNotNullParameter(fees, "fees");
            this.valueAppreciation = valueAppreciation;
            this.fees = fees;
            this.ongoingCharges = c1554a;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BigDecimal getFees() {
            return this.fees;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C1554a getOngoingCharges() {
            return this.ongoingCharges;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final BigDecimal getValueAppreciation() {
            return this.valueAppreciation;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C1553a)) {
                return false;
            }
            C1553a c1553a = (C1553a) obj2;
            return Intrinsics.f(this.valueAppreciation, c1553a.valueAppreciation) && Intrinsics.f(this.fees, c1553a.fees) && Intrinsics.f(this.ongoingCharges, c1553a.ongoingCharges);
        }

        public final int hashCode() {
            int iD = t61.a.d(this.fees, this.valueAppreciation.hashCode() * 31, 31);
            C1554a c1554a = this.ongoingCharges;
            return iD + (c1554a == null ? 0 : c1554a.hashCode());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Lulc/a$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "icon", "description", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("icon")
        @NotNull
        private final String icon;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("description")
        @NotNull
        private final String description;

        public b(String icon, String description) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(description, "description");
            this.icon = icon;
            this.description = description;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.icon, bVar.icon) && Intrinsics.f(this.description, bVar.description);
        }

        public final int hashCode() {
            return this.description.hashCode() + (this.icon.hashCode() * 31);
        }
    }

    public a(BigDecimal averageAnnualReturn, BigDecimal standardDeviation, BigDecimal bigDecimal, BigDecimal medianReturn, BigDecimal bestYearReturn, BigDecimal maxDrawdown, BigDecimal averageDrawdown, BigDecimal bigDecimal2, BigDecimal sharpeRatio, BigDecimal valueAtRisk, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal annualTotalReturn, BigDecimal bigDecimal5, BigDecimal bigDecimal6, C1553a c1553a, C1553a c1553a2, BigDecimal bigDecimal7, BigDecimal bigDecimal8, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(averageAnnualReturn, "averageAnnualReturn");
        Intrinsics.checkNotNullParameter(standardDeviation, "standardDeviation");
        Intrinsics.checkNotNullParameter(medianReturn, "medianReturn");
        Intrinsics.checkNotNullParameter(bestYearReturn, "bestYearReturn");
        Intrinsics.checkNotNullParameter(maxDrawdown, "maxDrawdown");
        Intrinsics.checkNotNullParameter(averageDrawdown, "averageDrawdown");
        Intrinsics.checkNotNullParameter(sharpeRatio, "sharpeRatio");
        Intrinsics.checkNotNullParameter(valueAtRisk, "valueAtRisk");
        Intrinsics.checkNotNullParameter(annualTotalReturn, "annualTotalReturn");
        this.averageAnnualReturn = averageAnnualReturn;
        this.standardDeviation = standardDeviation;
        this.benchmarkStandardDeviation = bigDecimal;
        this.medianReturn = medianReturn;
        this.bestYearReturn = bestYearReturn;
        this.maxDrawdown = maxDrawdown;
        this.averageDrawdown = averageDrawdown;
        this.beta = bigDecimal2;
        this.sharpeRatio = sharpeRatio;
        this.valueAtRisk = valueAtRisk;
        this.cagr = bigDecimal3;
        this.dividendYield = bigDecimal4;
        this.annualTotalReturn = annualTotalReturn;
        this.benchmarkAnnualTotalReturn = bigDecimal5;
        this.benchmarkAverageAnnualReturn = bigDecimal6;
        this.averageAnnualReturnBreakdown = c1553a;
        this.totalAnnualReturnBreakdown = c1553a2;
        this.benchmarkSharpeRatio = bigDecimal7;
        this.freeRiskReturn = bigDecimal8;
        this.overview = arrayList;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getAnnualTotalReturn() {
        return this.annualTotalReturn;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BigDecimal getAverageAnnualReturn() {
        return this.averageAnnualReturn;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C1553a getAverageAnnualReturnBreakdown() {
        return this.averageAnnualReturnBreakdown;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final BigDecimal getAverageDrawdown() {
        return this.averageDrawdown;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final BigDecimal getBenchmarkAnnualTotalReturn() {
        return this.benchmarkAnnualTotalReturn;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.averageAnnualReturn, aVar.averageAnnualReturn) && Intrinsics.f(this.standardDeviation, aVar.standardDeviation) && Intrinsics.f(this.benchmarkStandardDeviation, aVar.benchmarkStandardDeviation) && Intrinsics.f(this.medianReturn, aVar.medianReturn) && Intrinsics.f(this.bestYearReturn, aVar.bestYearReturn) && Intrinsics.f(this.maxDrawdown, aVar.maxDrawdown) && Intrinsics.f(this.averageDrawdown, aVar.averageDrawdown) && Intrinsics.f(this.beta, aVar.beta) && Intrinsics.f(this.sharpeRatio, aVar.sharpeRatio) && Intrinsics.f(this.valueAtRisk, aVar.valueAtRisk) && Intrinsics.f(this.cagr, aVar.cagr) && Intrinsics.f(this.dividendYield, aVar.dividendYield) && Intrinsics.f(this.annualTotalReturn, aVar.annualTotalReturn) && Intrinsics.f(this.benchmarkAnnualTotalReturn, aVar.benchmarkAnnualTotalReturn) && Intrinsics.f(this.benchmarkAverageAnnualReturn, aVar.benchmarkAverageAnnualReturn) && Intrinsics.f(this.averageAnnualReturnBreakdown, aVar.averageAnnualReturnBreakdown) && Intrinsics.f(this.totalAnnualReturnBreakdown, aVar.totalAnnualReturnBreakdown) && Intrinsics.f(this.benchmarkSharpeRatio, aVar.benchmarkSharpeRatio) && Intrinsics.f(this.freeRiskReturn, aVar.freeRiskReturn) && Intrinsics.f(this.overview, aVar.overview);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final BigDecimal getBenchmarkAverageAnnualReturn() {
        return this.benchmarkAverageAnnualReturn;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final BigDecimal getBenchmarkSharpeRatio() {
        return this.benchmarkSharpeRatio;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final BigDecimal getBenchmarkStandardDeviation() {
        return this.benchmarkStandardDeviation;
    }

    public final int hashCode() {
        int iD = t61.a.d(this.standardDeviation, this.averageAnnualReturn.hashCode() * 31, 31);
        BigDecimal bigDecimal = this.benchmarkStandardDeviation;
        int iD2 = t61.a.d(this.averageDrawdown, t61.a.d(this.maxDrawdown, t61.a.d(this.bestYearReturn, t61.a.d(this.medianReturn, (iD + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31, 31), 31), 31), 31);
        BigDecimal bigDecimal2 = this.beta;
        int iD3 = t61.a.d(this.valueAtRisk, t61.a.d(this.sharpeRatio, (iD2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31, 31), 31);
        BigDecimal bigDecimal3 = this.cagr;
        int iHashCode = (iD3 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.dividendYield;
        int iD4 = t61.a.d(this.annualTotalReturn, (iHashCode + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31, 31);
        BigDecimal bigDecimal5 = this.benchmarkAnnualTotalReturn;
        int iHashCode2 = (iD4 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.benchmarkAverageAnnualReturn;
        int iHashCode3 = (iHashCode2 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        C1553a c1553a = this.averageAnnualReturnBreakdown;
        int iHashCode4 = (iHashCode3 + (c1553a == null ? 0 : c1553a.hashCode())) * 31;
        C1553a c1553a2 = this.totalAnnualReturnBreakdown;
        int iHashCode5 = (iHashCode4 + (c1553a2 == null ? 0 : c1553a2.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.benchmarkSharpeRatio;
        int iHashCode6 = (iHashCode5 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.freeRiskReturn;
        int iHashCode7 = (iHashCode6 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        List<b> list = this.overview;
        return iHashCode7 + (list != null ? list.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final BigDecimal getBestYearReturn() {
        return this.bestYearReturn;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final BigDecimal getBeta() {
        return this.beta;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final BigDecimal getCagr() {
        return this.cagr;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final BigDecimal getDividendYield() {
        return this.dividendYield;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final BigDecimal getFreeRiskReturn() {
        return this.freeRiskReturn;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final BigDecimal getMaxDrawdown() {
        return this.maxDrawdown;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final BigDecimal getMedianReturn() {
        return this.medianReturn;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final List getOverview() {
        return this.overview;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final BigDecimal getSharpeRatio() {
        return this.sharpeRatio;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final BigDecimal getStandardDeviation() {
        return this.standardDeviation;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final C1553a getTotalAnnualReturnBreakdown() {
        return this.totalAnnualReturnBreakdown;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final BigDecimal getValueAtRisk() {
        return this.valueAtRisk;
    }
}
