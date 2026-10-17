package jed;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0007\b\u000e\f\u0012\u0017\u0006$J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\f\u0010\u0014R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0012\u0010\u0019R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001c\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b\u0006\u0010!R\u001c\u0010'\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&¨\u0006("}, d2 = {"Ljed/e;", "Ljed/b;", "", "toString", "()Ljava/lang/String;", "Ljed/e$f;", "a", "Ljed/e$f;", "f", "()Ljed/e$f;", "price", "Ljed/e$e;", "b", "Ljed/e$e;", "e", "()Ljed/e$e;", "marketCapitalization", "Ljed/e$b;", "c", "Ljed/e$b;", "()Ljed/e$b;", "dividends", "Ljed/e$c;", "d", "Ljed/e$c;", "()Ljed/e$c;", "expenseRatios", "Ljed/e$d;", "Ljed/e$d;", "()Ljed/e$d;", "managementFees", "Ljed/e$a;", "Ljed/e$a;", "()Ljed/e$a;", "charges", "Ljed/e$g;", "g", "Ljed/e$g;", "()Ljed/e$g;", "riskRating", "feature_shared_wealth_data_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e implements jed.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("price")
    private final f price;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("marketCap")
    private final C0985e marketCapitalization;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("dividend")
    private final b dividends;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("expenseRatio")
    private final c expenseRatios;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("managementFee")
    private final d managementFees;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("charge")
    private final a charges;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("riskRatings")
    private final g riskRating;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Ljed/e$a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Double;", "()Ljava/lang/Double;", "annualCharge", "feature_shared_wealth_data_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("annualCharge")
        private final Double annualCharge;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Double getAnnualCharge() {
            return this.annualCharge;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.annualCharge, ((a) obj2).annualCharge);
        }

        public final int hashCode() {
            Double d = this.annualCharge;
            if (d == null) {
                return 0;
            }
            return d.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\r¨\u0006\u000f"}, d2 = {"Ljed/e$b;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "b", "()Ljo3/a;", "incomeDividend", "", "Ljava/lang/Double;", "()Ljava/lang/Double;", "dividendYield", "feature_shared_wealth_data_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("incomeDividend")
        private final jo3.a incomeDividend;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("dividendYield")
        private final Double dividendYield;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Double getDividendYield() {
            return this.dividendYield;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final jo3.a getIncomeDividend() {
            return this.incomeDividend;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.incomeDividend, bVar.incomeDividend) && Intrinsics.f(this.dividendYield, bVar.dividendYield);
        }

        public final int hashCode() {
            jo3.a aVar = this.incomeDividend;
            int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            Double d = this.dividendYield;
            return iHashCode + (d != null ? d.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\f\u0010\b¨\u0006\u000e"}, d2 = {"Ljed/e$c;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Double;", "()Ljava/lang/Double;", "grossExpenseRatio", "b", "netExpenseRatio", "c", "totalExpenseRatio", "feature_shared_wealth_data_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("grossExpenseRatio")
        private final Double grossExpenseRatio;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("netExpenseRatio")
        private final Double netExpenseRatio;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("totalExpenseRatio")
        private final Double totalExpenseRatio;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Double getGrossExpenseRatio() {
            return this.grossExpenseRatio;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Double getNetExpenseRatio() {
            return this.netExpenseRatio;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Double getTotalExpenseRatio() {
            return this.totalExpenseRatio;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.grossExpenseRatio, cVar.grossExpenseRatio) && Intrinsics.f(this.netExpenseRatio, cVar.netExpenseRatio) && Intrinsics.f(this.totalExpenseRatio, cVar.totalExpenseRatio);
        }

        public final int hashCode() {
            Double d = this.grossExpenseRatio;
            int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
            Double d5 = this.netExpenseRatio;
            int iHashCode2 = (iHashCode + (d5 == null ? 0 : d5.hashCode())) * 31;
            Double d6 = this.totalExpenseRatio;
            return iHashCode2 + (d6 != null ? d6.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Ljed/e$d;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Double;", "()Ljava/lang/Double;", "grossManagementFee", "b", "netManagementFee", "feature_shared_wealth_data_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("grossManagementFee")
        private final Double grossManagementFee;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("netManagementFee")
        private final Double netManagementFee;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Double getGrossManagementFee() {
            return this.grossManagementFee;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Double getNetManagementFee() {
            return this.netManagementFee;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return Intrinsics.f(this.grossManagementFee, dVar.grossManagementFee) && Intrinsics.f(this.netManagementFee, dVar.netManagementFee);
        }

        public final int hashCode() {
            Double d = this.grossManagementFee;
            int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
            Double d5 = this.netManagementFee;
            return iHashCode + (d5 != null ? d5.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: jed.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\f"}, d2 = {"Ljed/e$e;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "b", "()Ljo3/a;", "totalAssets", "nav", "feature_shared_wealth_data_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C0985e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("totalNetAssets")
        private final jo3.a totalAssets;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("netAssetValue")
        private final jo3.a nav;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final jo3.a getNav() {
            return this.nav;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final jo3.a getTotalAssets() {
            return this.totalAssets;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C0985e)) {
                return false;
            }
            C0985e c0985e = (C0985e) obj2;
            return Intrinsics.f(this.totalAssets, c0985e.totalAssets) && Intrinsics.f(this.nav, c0985e.nav);
        }

        public final int hashCode() {
            jo3.a aVar = this.totalAssets;
            int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            jo3.a aVar2 = this.nav;
            return iHashCode + (aVar2 != null ? aVar2.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u0006\u0010\u0016¨\u0006\u0018"}, d2 = {"Ljed/e$f;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "b", "()Ljo3/a;", "dailyOpenPrice", "Ljed/g;", "Ljed/g;", "c", "()Ljed/g;", "dayRange", "d", "fiftyTwoWeekRange", "e", "fiveYearRange", "", "Ljava/lang/Double;", "()Ljava/lang/Double;", "beta", "feature_shared_wealth_data_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("dailyOpenPrice")
        private final jo3.a dailyOpenPrice;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("dayRange")
        private final jed.g dayRange;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("fiftyTwoWeekRange")
        private final jed.g fiftyTwoWeekRange;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("fiveYearRange")
        private final jed.g fiveYearRange;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("beta")
        private final Double beta;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Double getBeta() {
            return this.beta;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final jo3.a getDailyOpenPrice() {
            return this.dailyOpenPrice;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final jed.g getDayRange() {
            return this.dayRange;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final jed.g getFiftyTwoWeekRange() {
            return this.fiftyTwoWeekRange;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final jed.g getFiveYearRange() {
            return this.fiveYearRange;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof f)) {
                return false;
            }
            f fVar = (f) obj2;
            return Intrinsics.f(this.dailyOpenPrice, fVar.dailyOpenPrice) && Intrinsics.f(this.dayRange, fVar.dayRange) && Intrinsics.f(this.fiftyTwoWeekRange, fVar.fiftyTwoWeekRange) && Intrinsics.f(this.fiveYearRange, fVar.fiveYearRange) && Intrinsics.f(this.beta, fVar.beta);
        }

        public final int hashCode() {
            jo3.a aVar = this.dailyOpenPrice;
            int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            jed.g gVar = this.dayRange;
            int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
            jed.g gVar2 = this.fiftyTwoWeekRange;
            int iHashCode3 = (iHashCode2 + (gVar2 == null ? 0 : gVar2.hashCode())) * 31;
            jed.g gVar3 = this.fiveYearRange;
            int iHashCode4 = (iHashCode3 + (gVar3 == null ? 0 : gVar3.hashCode())) * 31;
            Double d = this.beta;
            return iHashCode4 + (d != null ? d.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Ljed/e$g;", "", "", "toString", "()Ljava/lang/String;", "Ljed/e$g$a;", "a", "Ljed/e$g$a;", "()Ljed/e$g$a;", "sriRatio", "b", "srriRatio", "feature_shared_wealth_data_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("sri")
        private final a sriRatio;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("srri")
        private final a srriRatio;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\f"}, d2 = {"Ljed/e$g$a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Double;", "b", "()Ljava/lang/Double;", "value", "max", "feature_shared_wealth_data_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("value")
            private final Double value;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("max")
            private final Double max;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Double getMax() {
                return this.max;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Double getValue() {
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
                return Intrinsics.f(this.value, aVar.value) && Intrinsics.f(this.max, aVar.max);
            }

            public final int hashCode() {
                Double d = this.value;
                int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
                Double d5 = this.max;
                return iHashCode + (d5 != null ? d5.hashCode() : 0);
            }
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final a getSriRatio() {
            return this.sriRatio;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final a getSrriRatio() {
            return this.srriRatio;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof g)) {
                return false;
            }
            g gVar = (g) obj2;
            return Intrinsics.f(this.sriRatio, gVar.sriRatio) && Intrinsics.f(this.srriRatio, gVar.srriRatio);
        }

        public final int hashCode() {
            a aVar = this.sriRatio;
            int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            a aVar2 = this.srriRatio;
            return iHashCode + (aVar2 != null ? aVar2.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getCharges() {
        return this.charges;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getDividends() {
        return this.dividends;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final c getExpenseRatios() {
        return this.expenseRatios;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final d getManagementFees() {
        return this.managementFees;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C0985e getMarketCapitalization() {
        return this.marketCapitalization;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.price, eVar.price) && Intrinsics.f(this.marketCapitalization, eVar.marketCapitalization) && Intrinsics.f(this.dividends, eVar.dividends) && Intrinsics.f(this.expenseRatios, eVar.expenseRatios) && Intrinsics.f(this.managementFees, eVar.managementFees) && Intrinsics.f(this.charges, eVar.charges) && Intrinsics.f(this.riskRating, eVar.riskRating);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final f getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final g getRiskRating() {
        return this.riskRating;
    }

    public final int hashCode() {
        f fVar = this.price;
        int iHashCode = (fVar == null ? 0 : fVar.hashCode()) * 31;
        C0985e c0985e = this.marketCapitalization;
        int iHashCode2 = (iHashCode + (c0985e == null ? 0 : c0985e.hashCode())) * 31;
        b bVar = this.dividends;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        c cVar = this.expenseRatios;
        int iHashCode4 = (iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        d dVar = this.managementFees;
        int iHashCode5 = (iHashCode4 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        a aVar = this.charges;
        int iHashCode6 = (iHashCode5 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        g gVar = this.riskRating;
        return iHashCode6 + (gVar != null ? gVar.hashCode() : 0);
    }
}
