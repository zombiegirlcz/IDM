package vdd;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0005\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\t\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\f\u0010\u0016R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0018\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001c\u0010 \u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u001c\u0010%\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$¨\u0006&"}, d2 = {"Lvdd/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "name", "b", "h", "productId", "c", "g", "pocketId", "Ljo3/b;", "d", "Ljo3/b;", "()Ljo3/b;", "depositAmount", "Lvdd/a$a;", "Lvdd/a$a;", "()Lvdd/a$a;", "displayRate", "f", "nextInterestPaymentDate", "challengeAccountId", "interestBalance", "Lvdd/a$b;", "i", "Lvdd/a$b;", "()Lvdd/a$b;", "term", "Lvdd/g;", "j", "Lvdd/g;", "()Lvdd/g;", "transferConfig", "feature_shared_vaults_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("productId")
    @NotNull
    private final String productId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("pocketId")
    private final String pocketId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("depositAmount")
    @NotNull
    private final jo3.b depositAmount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("displayRate")
    @NotNull
    private final C1594a displayRate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("nextInterestPaymentDate")
    private final String nextInterestPaymentDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("challengeAccountId")
    private final String challengeAccountId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("interestBalance")
    private final jo3.b interestBalance;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("term")
    private final b term;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("transferConfig")
    private final g transferConfig;

    /* JADX INFO: renamed from: vdd.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Lvdd/a$a;", "", "", "toString", "()Ljava/lang/String;", "Lvdd/a$a$a;", "a", "Lvdd/a$a$a;", "()Lvdd/a$a$a;", "primary", "b", "secondary", "feature_shared_vaults_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1594a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("primary")
        @NotNull
        private final C1595a primary;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("secondary")
        private final C1595a secondary;

        /* JADX INFO: renamed from: vdd.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000b\u001a\u0004\b\r\u0010\u0004¨\u0006\u000f"}, d2 = {"Lvdd/a$a$a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "D", "()D", "percentage", "b", "Ljava/lang/String;", "suffix", "c", "type", "feature_shared_vaults_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1595a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("percentage")
            private final double percentage;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("suffix")
            @NotNull
            private final String suffix;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("type")
            @NotNull
            private final String type;

            public C1595a(double d, String suffix, String type) {
                Intrinsics.checkNotNullParameter(suffix, "suffix");
                Intrinsics.checkNotNullParameter(type, "type");
                this.percentage = d;
                this.suffix = suffix;
                this.type = type;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final double getPercentage() {
                return this.percentage;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getSuffix() {
                return this.suffix;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getType() {
                return this.type;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C1595a)) {
                    return false;
                }
                C1595a c1595a = (C1595a) obj2;
                return Double.compare(this.percentage, c1595a.percentage) == 0 && Intrinsics.f(this.suffix, c1595a.suffix) && Intrinsics.f(this.type, c1595a.type);
            }

            public final int hashCode() {
                return this.type.hashCode() + p.a.c(Double.hashCode(this.percentage) * 31, 31, this.suffix);
            }
        }

        public C1594a(C1595a primary, C1595a c1595a) {
            Intrinsics.checkNotNullParameter(primary, "primary");
            this.primary = primary;
            this.secondary = c1595a;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C1595a getPrimary() {
            return this.primary;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C1595a getSecondary() {
            return this.secondary;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C1594a)) {
                return false;
            }
            C1594a c1594a = (C1594a) obj2;
            return Intrinsics.f(this.primary, c1594a.primary) && Intrinsics.f(this.secondary, c1594a.secondary);
        }

        public final int hashCode() {
            int iHashCode = this.primary.hashCode() * 31;
            C1595a c1595a = this.secondary;
            return iHashCode + (c1595a == null ? 0 : c1595a.hashCode());
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lvdd/a$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "title", "Lvdd/a$b$a;", "Lvdd/a$b$a;", "()Lvdd/a$b$a;", "maturity", "feature_shared_vaults_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("maturity")
        @NotNull
        private final C1596a maturity;

        /* JADX INFO: renamed from: vdd.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u000f"}, d2 = {"Lvdd/a$b$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "period", "", "b", "J", "()J", "maturityDate", "explanationDeeplink", "feature_shared_vaults_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1596a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("period")
            @NotNull
            private final String period;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("maturityDate")
            private final long maturityDate;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("explanationDeeplink")
            @NotNull
            private final String explanationDeeplink;

            public C1596a(String period, long j2, String explanationDeeplink) {
                Intrinsics.checkNotNullParameter(period, "period");
                Intrinsics.checkNotNullParameter(explanationDeeplink, "explanationDeeplink");
                this.period = period;
                this.maturityDate = j2;
                this.explanationDeeplink = explanationDeeplink;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getExplanationDeeplink() {
                return this.explanationDeeplink;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final long getMaturityDate() {
                return this.maturityDate;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getPeriod() {
                return this.period;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C1596a)) {
                    return false;
                }
                C1596a c1596a = (C1596a) obj2;
                return Intrinsics.f(this.period, c1596a.period) && this.maturityDate == c1596a.maturityDate && Intrinsics.f(this.explanationDeeplink, c1596a.explanationDeeplink);
            }

            public final int hashCode() {
                return this.explanationDeeplink.hashCode() + a0.d.c(this.period.hashCode() * 31, 31, this.maturityDate);
            }
        }

        public b(String title, C1596a maturity) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(maturity, "maturity");
            this.title = title;
            this.maturity = maturity;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C1596a getMaturity() {
            return this.maturity;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.title, bVar.title) && Intrinsics.f(this.maturity, bVar.maturity);
        }

        public final int hashCode() {
            return this.maturity.hashCode() + (this.title.hashCode() * 31);
        }
    }

    public a(String name, String productId, String str, jo3.b depositAmount, C1594a displayRate, String str2, String str3, jo3.b bVar, b bVar2, g gVar) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(depositAmount, "depositAmount");
        Intrinsics.checkNotNullParameter(displayRate, "displayRate");
        this.name = name;
        this.productId = productId;
        this.pocketId = str;
        this.depositAmount = depositAmount;
        this.displayRate = displayRate;
        this.nextInterestPaymentDate = str2;
        this.challengeAccountId = str3;
        this.interestBalance = bVar;
        this.term = bVar2;
        this.transferConfig = gVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getChallengeAccountId() {
        return this.challengeAccountId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.b getDepositAmount() {
        return this.depositAmount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C1594a getDisplayRate() {
        return this.displayRate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.b getInterestBalance() {
        return this.interestBalance;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.name, aVar.name) && Intrinsics.f(this.productId, aVar.productId) && Intrinsics.f(this.pocketId, aVar.pocketId) && Intrinsics.f(this.depositAmount, aVar.depositAmount) && Intrinsics.f(this.displayRate, aVar.displayRate) && Intrinsics.f(this.nextInterestPaymentDate, aVar.nextInterestPaymentDate) && Intrinsics.f(this.challengeAccountId, aVar.challengeAccountId) && Intrinsics.f(this.interestBalance, aVar.interestBalance) && Intrinsics.f(this.term, aVar.term) && Intrinsics.f(this.transferConfig, aVar.transferConfig);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getNextInterestPaymentDate() {
        return this.nextInterestPaymentDate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getPocketId() {
        return this.pocketId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    public final int hashCode() {
        int iC = p.a.c(this.name.hashCode() * 31, 31, this.productId);
        String str = this.pocketId;
        int iHashCode = (this.displayRate.hashCode() + y.e(this.depositAmount, (iC + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31;
        String str2 = this.nextInterestPaymentDate;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.challengeAccountId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        jo3.b bVar = this.interestBalance;
        int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        b bVar2 = this.term;
        int iHashCode5 = (iHashCode4 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        g gVar = this.transferConfig;
        return iHashCode5 + (gVar != null ? gVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final b getTerm() {
        return this.term;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final g getTransferConfig() {
        return this.transferConfig;
    }
}
