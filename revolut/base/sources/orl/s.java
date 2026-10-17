package orl;

import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0006\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\r¨\u0006\u000f"}, d2 = {"Lorl/s;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "b", "()Ljo3/a;", "total", "Lorl/s$a;", "Lorl/s$a;", "()Lorl/s$a;", "breakdown", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("total")
    @NotNull
    private final jo3.a total;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("breakdown")
    private final a breakdown;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0007\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\r\u0010\u0013¨\u0006\u0015"}, d2 = {"Lorl/s$a;", "", "", "toString", "()Ljava/lang/String;", "", "Lorl/s$b;", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "primary", "Ljo3/a;", "b", "Ljo3/a;", "()Ljo3/a;", "others", "", "I", "()I", "othersCount", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("primary")
        @NotNull
        private final List<b> primary;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("others")
        @NotNull
        private final jo3.a others;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("othersCount")
        private final int othersCount;

        public a(ArrayList primary, jo3.a others, int i) {
            Intrinsics.checkNotNullParameter(primary, "primary");
            Intrinsics.checkNotNullParameter(others, "others");
            this.primary = primary;
            this.others = others;
            this.othersCount = i;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final jo3.a getOthers() {
            return this.others;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getOthersCount() {
            return this.othersCount;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final List getPrimary() {
            return this.primary;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.primary, aVar.primary) && Intrinsics.f(this.others, aVar.others) && this.othersCount == aVar.othersCount;
        }

        public final int hashCode() {
            return Integer.hashCode(this.othersCount) + v7.j(this.others, this.primary.hashCode() * 31, 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"Lorl/s$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "ref", "c", "symbol", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "investment", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("ref")
        @NotNull
        private final String ref;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("symbol")
        @NotNull
        private final String symbol;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("investment")
        @NotNull
        private final jo3.a investment;

        public b(String ref2, String symbol, jo3.a investment) {
            Intrinsics.checkNotNullParameter(ref2, "ref");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(investment, "investment");
            this.ref = ref2;
            this.symbol = symbol;
            this.investment = investment;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final jo3.a getInvestment() {
            return this.investment;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getRef() {
            return this.ref;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.ref, bVar.ref) && Intrinsics.f(this.symbol, bVar.symbol) && Intrinsics.f(this.investment, bVar.investment);
        }

        public final int hashCode() {
            return this.investment.hashCode() + p.a.c(this.ref.hashCode() * 31, 31, this.symbol);
        }
    }

    public s(jo3.a total, a aVar) {
        Intrinsics.checkNotNullParameter(total, "total");
        this.total = total;
        this.breakdown = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getBreakdown() {
        return this.breakdown;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getTotal() {
        return this.total;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.total, sVar.total) && Intrinsics.f(this.breakdown, sVar.breakdown);
    }

    public final int hashCode() {
        int iHashCode = this.total.hashCode() * 31;
        a aVar = this.breakdown;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}
