package o7h;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a {

    @NotNull
    public static final C1238a Companion = new C1238a();

    /* JADX INFO: renamed from: o7h.a$a, reason: collision with other inner class name */
    public static final class C1238a {
        private C1238a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\n\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\u000b"}, d2 = {"Lo7h/a$b;", "Lo7h/a;", "", "toString", "()Ljava/lang/String;", "Lo7h/a$b$b;", "a", "Lo7h/a$b$b;", "()Lo7h/a$b$b;", "investmentPlans", "b", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("investmentPlans")
        private final C1240b investmentPlans;

        /* JADX INFO: renamed from: o7h.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\n"}, d2 = {"Lo7h/a$b$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "ref", "b", "symbol", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1239a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("ref")
            private final String ref;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("symbol")
            @NotNull
            private final String symbol;

            public C1239a(String str, String symbol) {
                Intrinsics.checkNotNullParameter(symbol, "symbol");
                this.ref = str;
                this.symbol = symbol;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getRef() {
                return this.ref;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getSymbol() {
                return this.symbol;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C1239a)) {
                    return false;
                }
                C1239a c1239a = (C1239a) obj2;
                return Intrinsics.f(this.ref, c1239a.ref) && Intrinsics.f(this.symbol, c1239a.symbol);
            }

            public final int hashCode() {
                String str = this.ref;
                return this.symbol.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
            }
        }

        /* JADX INFO: renamed from: o7h.a$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0016"}, d2 = {"Lo7h/a$b$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "title", "b", "d", "subtitle", "c", "annualReturn", "badgeIcon", "badgeTitle", "", "Lo7h/a$b$a;", "f", "Ljava/util/List;", "()Ljava/util/List;", "topHoldings", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1240b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("title")
            @NotNull
            private final String title;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("subtitle")
            private final String subtitle;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("annualReturn")
            private final String annualReturn;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("badgeIcon")
            private final String badgeIcon;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @lg.b("badgeTitle")
            private final String badgeTitle;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            @lg.b("topHoldings")
            private final List<C1239a> topHoldings;

            public C1240b(String title, String str, String str2, List list, String str3, String str4) {
                Intrinsics.checkNotNullParameter(title, "title");
                this.title = title;
                this.subtitle = str;
                this.annualReturn = str2;
                this.badgeIcon = str3;
                this.badgeTitle = str4;
                this.topHoldings = list;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getAnnualReturn() {
                return this.annualReturn;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getBadgeIcon() {
                return this.badgeIcon;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getBadgeTitle() {
                return this.badgeTitle;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C1240b)) {
                    return false;
                }
                C1240b c1240b = (C1240b) obj2;
                return Intrinsics.f(this.title, c1240b.title) && Intrinsics.f(this.subtitle, c1240b.subtitle) && Intrinsics.f(this.annualReturn, c1240b.annualReturn) && Intrinsics.f(this.badgeIcon, c1240b.badgeIcon) && Intrinsics.f(this.badgeTitle, c1240b.badgeTitle) && Intrinsics.f(this.topHoldings, c1240b.topHoldings);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final List getTopHoldings() {
                return this.topHoldings;
            }

            public final int hashCode() {
                int iHashCode = this.title.hashCode() * 31;
                String str = this.subtitle;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.annualReturn;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.badgeIcon;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.badgeTitle;
                int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                List<C1239a> list = this.topHoldings;
                return iHashCode5 + (list != null ? list.hashCode() : 0);
            }
        }

        public b(C1240b c1240b) {
            this.investmentPlans = c1240b;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C1240b getInvestmentPlans() {
            return this.investmentPlans;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.investmentPlans, ((b) obj2).investmentPlans);
        }

        public final int hashCode() {
            C1240b c1240b = this.investmentPlans;
            if (c1240b == null) {
                return 0;
            }
            return c1240b.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lo7h/a$c;", "Lo7h/a;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "annualReturn", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("annualReturn")
        private final String annualReturn;

        public c(String str) {
            this.annualReturn = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAnnualReturn() {
            return this.annualReturn;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && Intrinsics.f(this.annualReturn, ((c) obj2).annualReturn);
        }

        public final int hashCode() {
            String str = this.annualReturn;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lo7h/a$d;", "Lo7h/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f222794a = new d();

        private d() {
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof d);
        }

        public final int hashCode() {
            return -1724042176;
        }
    }

    private a() {
    }
}
