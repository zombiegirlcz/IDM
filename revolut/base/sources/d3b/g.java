package d3b;

import ip0.v7;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0006\u000bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000f\u0010\tR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0006\u0010\u0014R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\u000b\u0010\u0014¨\u0006\u0018"}, d2 = {"Ld3b/g;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "d", "()Ljo3/a;", "unrealisedPnl", "b", "Ljava/lang/String;", "c", "unrealisedPerformance", "e", "value", "", "Ld3b/g$a;", "Ljava/util/List;", "()Ljava/util/List;", "cashBalances", "Ld3b/g$b;", "positions", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("unrealisedPnl")
    @NotNull
    private final jo3.a unrealisedPnl;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("unrealisedPerformance")
    @NotNull
    private final String unrealisedPerformance;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("value")
    @NotNull
    private final jo3.a value;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("cashBalances")
    @NotNull
    private final List<a> cashBalances;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("positions")
    @NotNull
    private final List<b> positions;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0005\u0010\u000e¨\u0006\u0013"}, d2 = {"Ld3b/g$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "b", "currency", "Ljo3/a;", "Ljo3/a;", "d", "()Ljo3/a;", "investable", "e", "withdrawable", "blocked", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("currency")
        @NotNull
        private final String currency;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("investable")
        @NotNull
        private final jo3.a investable;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("withdrawable")
        @NotNull
        private final jo3.a withdrawable;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("blocked")
        @NotNull
        private final jo3.a blocked;

        public a(String id10, String currency, jo3.a investable, jo3.a withdrawable, jo3.a blocked) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(investable, "investable");
            Intrinsics.checkNotNullParameter(withdrawable, "withdrawable");
            Intrinsics.checkNotNullParameter(blocked, "blocked");
            this.id = id10;
            this.currency = currency;
            this.investable = investable;
            this.withdrawable = withdrawable;
            this.blocked = blocked;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final jo3.a getBlocked() {
            return this.blocked;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final jo3.a getInvestable() {
            return this.investable;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final jo3.a getWithdrawable() {
            return this.withdrawable;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.currency, aVar.currency) && Intrinsics.f(this.investable, aVar.investable) && Intrinsics.f(this.withdrawable, aVar.withdrawable) && Intrinsics.f(this.blocked, aVar.blocked);
        }

        public final int hashCode() {
            return this.blocked.hashCode() + v7.j(this.withdrawable, v7.j(this.investable, p.a.c(this.id.hashCode() * 31, 31, this.currency), 31), 31);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\t\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u000e\u001a\u0004\b\r\u0010\u0010R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004R\u001c\u0010!\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0017\u0010\u0004R\u001c\u0010&\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010$\u001a\u0004\b\u0005\u0010%¨\u0006'"}, d2 = {"Ld3b/g$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "id", "b", "e", "instrumentRef", "Ljo3/a;", "c", "Ljo3/a;", "k", "()Ljo3/a;", "unrealisedPnl", "j", "unrealisedPerformance", "l", "value", "Lko3/a;", "f", "Lko3/a;", "g", "()Lko3/a;", "midPrice", "currentPrice", "h", "exposure", "i", "quantity", "openingPrice", "leverage", "Ljava/time/Instant;", "Ljava/time/Instant;", "()Ljava/time/Instant;", "createdDate", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("instrumentRef")
        private final String instrumentRef;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("unrealisedPnl")
        @NotNull
        private final jo3.a unrealisedPnl;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("unrealisedPerformance")
        @NotNull
        private final String unrealisedPerformance;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("value")
        @NotNull
        private final jo3.a value;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("midPrice")
        private final ko3.a midPrice;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("currentPrice")
        @NotNull
        private final ko3.a currentPrice;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @lg.b("exposure")
        @NotNull
        private final jo3.a exposure;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @lg.b("quantity")
        private final String quantity;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @lg.b("openingPrice")
        private final ko3.a openingPrice;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @lg.b("leverage")
        private final String leverage;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @lg.b("createdDate")
        private final Instant createdDate;

        public b(String id10, String str, jo3.a unrealisedPnl, String unrealisedPerformance, jo3.a value, ko3.a aVar, ko3.a currentPrice, jo3.a exposure, String str2, ko3.a aVar2, String str3, Instant instant) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(unrealisedPnl, "unrealisedPnl");
            Intrinsics.checkNotNullParameter(unrealisedPerformance, "unrealisedPerformance");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(currentPrice, "currentPrice");
            Intrinsics.checkNotNullParameter(exposure, "exposure");
            this.id = id10;
            this.instrumentRef = str;
            this.unrealisedPnl = unrealisedPnl;
            this.unrealisedPerformance = unrealisedPerformance;
            this.value = value;
            this.midPrice = aVar;
            this.currentPrice = currentPrice;
            this.exposure = exposure;
            this.quantity = str2;
            this.openingPrice = aVar2;
            this.leverage = str3;
            this.createdDate = instant;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Instant getCreatedDate() {
            return this.createdDate;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ko3.a getCurrentPrice() {
            return this.currentPrice;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final jo3.a getExposure() {
            return this.exposure;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getInstrumentRef() {
            return this.instrumentRef;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.id, bVar.id) && Intrinsics.f(this.instrumentRef, bVar.instrumentRef) && Intrinsics.f(this.unrealisedPnl, bVar.unrealisedPnl) && Intrinsics.f(this.unrealisedPerformance, bVar.unrealisedPerformance) && Intrinsics.f(this.value, bVar.value) && Intrinsics.f(this.midPrice, bVar.midPrice) && Intrinsics.f(this.currentPrice, bVar.currentPrice) && Intrinsics.f(this.exposure, bVar.exposure) && Intrinsics.f(this.quantity, bVar.quantity) && Intrinsics.f(this.openingPrice, bVar.openingPrice) && Intrinsics.f(this.leverage, bVar.leverage) && Intrinsics.f(this.createdDate, bVar.createdDate);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getLeverage() {
            return this.leverage;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final ko3.a getMidPrice() {
            return this.midPrice;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final ko3.a getOpeningPrice() {
            return this.openingPrice;
        }

        public final int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            String str = this.instrumentRef;
            int iJ = v7.j(this.value, p.a.c(v7.j(this.unrealisedPnl, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.unrealisedPerformance), 31);
            ko3.a aVar = this.midPrice;
            int iJ2 = v7.j(this.exposure, (this.currentPrice.hashCode() + ((iJ + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31, 31);
            String str2 = this.quantity;
            int iHashCode2 = (iJ2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            ko3.a aVar2 = this.openingPrice;
            int iHashCode3 = (iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
            String str3 = this.leverage;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Instant instant = this.createdDate;
            return iHashCode4 + (instant != null ? instant.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getQuantity() {
            return this.quantity;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getUnrealisedPerformance() {
            return this.unrealisedPerformance;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final jo3.a getUnrealisedPnl() {
            return this.unrealisedPnl;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final jo3.a getValue() {
            return this.value;
        }
    }

    public g(jo3.a unrealisedPnl, String unrealisedPerformance, jo3.a value, ArrayList cashBalances, ArrayList positions) {
        Intrinsics.checkNotNullParameter(unrealisedPnl, "unrealisedPnl");
        Intrinsics.checkNotNullParameter(unrealisedPerformance, "unrealisedPerformance");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(cashBalances, "cashBalances");
        Intrinsics.checkNotNullParameter(positions, "positions");
        this.unrealisedPnl = unrealisedPnl;
        this.unrealisedPerformance = unrealisedPerformance;
        this.value = value;
        this.cashBalances = cashBalances;
        this.positions = positions;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getCashBalances() {
        return this.cashBalances;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getPositions() {
        return this.positions;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getUnrealisedPerformance() {
        return this.unrealisedPerformance;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getUnrealisedPnl() {
        return this.unrealisedPnl;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.a getValue() {
        return this.value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.unrealisedPnl, gVar.unrealisedPnl) && Intrinsics.f(this.unrealisedPerformance, gVar.unrealisedPerformance) && Intrinsics.f(this.value, gVar.value) && Intrinsics.f(this.cashBalances, gVar.cashBalances) && Intrinsics.f(this.positions, gVar.positions);
    }

    public final int hashCode() {
        return this.positions.hashCode() + p.a.d(v7.j(this.value, p.a.c(this.unrealisedPnl.hashCode() * 31, 31, this.unrealisedPerformance), 31), 31, this.cashBalances);
    }
}
