package ko4;

import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\b\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\r¨\u0006\u000f"}, d2 = {"Lko4/a;", "", "", "toString", "()Ljava/lang/String;", "Lko4/a$b;", "a", "Lko4/a$b;", "b", "()Lko4/a$b;", "interestFree", "Lko4/a$a;", "Lko4/a$a;", "()Lko4/a$a;", "cashback", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("interestFree")
    @NotNull
    private final b interestFree;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("cashback")
    private final C1055a cashback;

    /* JADX INFO: renamed from: ko4.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0005\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0013"}, d2 = {"Lko4/a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "defaultRate", "Lko4/a$a$a;", "b", "Lko4/a$a$a;", "()Lko4/a$a$a;", "promo", "", "Lko4/a$a$b;", "c", "Ljava/util/List;", "()Ljava/util/List;", "promotions", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1055a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("defaultRate")
        @NotNull
        private final String defaultRate;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("promo")
        @NotNull
        private final C1056a promo;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("promotions")
        @NotNull
        private final List<b> promotions;

        /* JADX INFO: renamed from: ko4.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004¨\u0006\u0011"}, d2 = {"Lko4/a$a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "lowerRate", "higherRate", "Ljo3/a;", "c", "Ljo3/a;", "d", "()Ljo3/a;", "spendsThreshold", "period", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1056a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("lowerRate")
            @NotNull
            private final String lowerRate;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("higherRate")
            @NotNull
            private final String higherRate;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("spendsThreshold")
            @NotNull
            private final jo3.a spendsThreshold;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("period")
            @NotNull
            private final String period;

            public C1056a(String lowerRate, String higherRate, String period, jo3.a spendsThreshold) {
                Intrinsics.checkNotNullParameter(lowerRate, "lowerRate");
                Intrinsics.checkNotNullParameter(higherRate, "higherRate");
                Intrinsics.checkNotNullParameter(spendsThreshold, "spendsThreshold");
                Intrinsics.checkNotNullParameter(period, "period");
                this.lowerRate = lowerRate;
                this.higherRate = higherRate;
                this.spendsThreshold = spendsThreshold;
                this.period = period;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getHigherRate() {
                return this.higherRate;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getLowerRate() {
                return this.lowerRate;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getPeriod() {
                return this.period;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final jo3.a getSpendsThreshold() {
                return this.spendsThreshold;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C1056a)) {
                    return false;
                }
                C1056a c1056a = (C1056a) obj2;
                return Intrinsics.f(this.lowerRate, c1056a.lowerRate) && Intrinsics.f(this.higherRate, c1056a.higherRate) && Intrinsics.f(this.spendsThreshold, c1056a.spendsThreshold) && Intrinsics.f(this.period, c1056a.period);
            }

            public final int hashCode() {
                return this.period.hashCode() + v7.j(this.spendsThreshold, p.a.c(this.lowerRate.hashCode() * 31, 31, this.higherRate), 31);
            }
        }

        /* JADX INFO: renamed from: ko4.a$a$b */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u000f"}, d2 = {"Lko4/a$a$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "rate", "Ljo3/a;", "Ljo3/a;", "c", "()Ljo3/a;", "spendsCap", "period", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("rate")
            @NotNull
            private final String rate;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("spendsCap")
            @NotNull
            private final jo3.a spendsCap;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("period")
            @NotNull
            private final String period;

            public b(String rate, String period, jo3.a spendsCap) {
                Intrinsics.checkNotNullParameter(rate, "rate");
                Intrinsics.checkNotNullParameter(spendsCap, "spendsCap");
                Intrinsics.checkNotNullParameter(period, "period");
                this.rate = rate;
                this.spendsCap = spendsCap;
                this.period = period;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getPeriod() {
                return this.period;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getRate() {
                return this.rate;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final jo3.a getSpendsCap() {
                return this.spendsCap;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof b)) {
                    return false;
                }
                b bVar = (b) obj2;
                return Intrinsics.f(this.rate, bVar.rate) && Intrinsics.f(this.spendsCap, bVar.spendsCap) && Intrinsics.f(this.period, bVar.period);
            }

            public final int hashCode() {
                return this.period.hashCode() + v7.j(this.spendsCap, this.rate.hashCode() * 31, 31);
            }
        }

        public C1055a(String defaultRate, C1056a promo, ArrayList promotions) {
            Intrinsics.checkNotNullParameter(defaultRate, "defaultRate");
            Intrinsics.checkNotNullParameter(promo, "promo");
            Intrinsics.checkNotNullParameter(promotions, "promotions");
            this.defaultRate = defaultRate;
            this.promo = promo;
            this.promotions = promotions;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDefaultRate() {
            return this.defaultRate;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C1056a getPromo() {
            return this.promo;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final List getPromotions() {
            return this.promotions;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C1055a)) {
                return false;
            }
            C1055a c1055a = (C1055a) obj2;
            return Intrinsics.f(this.defaultRate, c1055a.defaultRate) && Intrinsics.f(this.promo, c1055a.promo) && Intrinsics.f(this.promotions, c1055a.promotions);
        }

        public final int hashCode() {
            return this.promotions.hashCode() + ((this.promo.hashCode() + (this.defaultRate.hashCode() * 31)) * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lko4/a$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "period", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("period")
        @NotNull
        private final String period;

        public b(String period) {
            Intrinsics.checkNotNullParameter(period, "period");
            this.period = period;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getPeriod() {
            return this.period;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.period, ((b) obj2).period);
        }

        public final int hashCode() {
            return this.period.hashCode();
        }
    }

    public a(b interestFree, C1055a c1055a) {
        Intrinsics.checkNotNullParameter(interestFree, "interestFree");
        this.interestFree = interestFree;
        this.cashback = c1055a;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C1055a getCashback() {
        return this.cashback;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getInterestFree() {
        return this.interestFree;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.interestFree, aVar.interestFree) && Intrinsics.f(this.cashback, aVar.cashback);
    }

    public final int hashCode() {
        int iHashCode = this.interestFree.hashCode() * 31;
        C1055a c1055a = this.cashback;
        return iHashCode + (c1055a == null ? 0 : c1055a.hashCode());
    }
}
