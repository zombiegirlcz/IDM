package jed;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0004\u0006\u000b\u0012\u0010J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\u0010\u0010\u0017¨\u0006\u0019"}, d2 = {"Ljed/c;", "Ljed/b;", "", "toString", "()Ljava/lang/String;", "Ljed/c$a;", "a", "Ljed/c$a;", "()Ljed/c$a;", "price", "Ljed/c$b;", "b", "Ljed/c$b;", "()Ljed/c$b;", "primaryStats", "Ljed/c$d;", "c", "Ljed/c$d;", "d", "()Ljed/c$d;", "yieldStats", "Ljed/c$c;", "Ljed/c$c;", "()Ljed/c$c;", "riskStats", "feature_shared_wealth_data_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c implements jed.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("price")
    @NotNull
    private final a price;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("primaryStats")
    @NotNull
    private final b primaryStats;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("yieldStats")
    @NotNull
    private final d yieldStats;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("riskStats")
    @NotNull
    private final C0984c riskStats;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000f\u0010\r¨\u0006\u0011"}, d2 = {"Ljed/c$a;", "", "", "toString", "()Ljava/lang/String;", "Lko3/a;", "a", "Lko3/a;", "()Lko3/a;", "dailyOpenPricePrecise", "Ljed/h;", "b", "Ljed/h;", "()Ljed/h;", "dayRangePrecise", "c", "fiftyTwoWeekRangePrecise", "feature_shared_wealth_data_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("dailyOpenPricePrecise")
        private final ko3.a dailyOpenPricePrecise;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("dayRangePrecise")
        private final h dayRangePrecise;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("fiftyTwoWeekRangePrecise")
        private final h fiftyTwoWeekRangePrecise;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ko3.a getDailyOpenPricePrecise() {
            return this.dailyOpenPricePrecise;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final h getDayRangePrecise() {
            return this.dayRangePrecise;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final h getFiftyTwoWeekRangePrecise() {
            return this.fiftyTwoWeekRangePrecise;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.dailyOpenPricePrecise, aVar.dailyOpenPricePrecise) && Intrinsics.f(this.dayRangePrecise, aVar.dayRangePrecise) && Intrinsics.f(this.fiftyTwoWeekRangePrecise, aVar.fiftyTwoWeekRangePrecise);
        }

        public final int hashCode() {
            ko3.a aVar = this.dailyOpenPricePrecise;
            int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            h hVar = this.dayRangePrecise;
            int iHashCode2 = (iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
            h hVar2 = this.fiftyTwoWeekRangePrecise;
            return iHashCode2 + (hVar2 != null ? hVar2.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\r\u0010\u0011R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, d2 = {"Ljed/c$b;", "", "", "toString", "()Ljava/lang/String;", "Lko3/a;", "a", "Lko3/a;", "b", "()Lko3/a;", "cleanPrice", "d", "dirtyPrice", "c", "accruedInterest", "Ljava/math/BigDecimal;", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "currentYield", "e", "yieldToMaturity", "feature_shared_wealth_data_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("cleanPrice")
        private final ko3.a cleanPrice;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("dirtyPrice")
        private final ko3.a dirtyPrice;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("accruedInterest")
        private final ko3.a accruedInterest;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("currentYield")
        private final BigDecimal currentYield;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("yieldToMaturity")
        private final BigDecimal yieldToMaturity;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ko3.a getAccruedInterest() {
            return this.accruedInterest;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ko3.a getCleanPrice() {
            return this.cleanPrice;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final BigDecimal getCurrentYield() {
            return this.currentYield;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ko3.a getDirtyPrice() {
            return this.dirtyPrice;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final BigDecimal getYieldToMaturity() {
            return this.yieldToMaturity;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.cleanPrice, bVar.cleanPrice) && Intrinsics.f(this.dirtyPrice, bVar.dirtyPrice) && Intrinsics.f(this.accruedInterest, bVar.accruedInterest) && Intrinsics.f(this.currentYield, bVar.currentYield) && Intrinsics.f(this.yieldToMaturity, bVar.yieldToMaturity);
        }

        public final int hashCode() {
            ko3.a aVar = this.cleanPrice;
            int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            ko3.a aVar2 = this.dirtyPrice;
            int iHashCode2 = (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
            ko3.a aVar3 = this.accruedInterest;
            int iHashCode3 = (iHashCode2 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
            BigDecimal bigDecimal = this.currentYield;
            int iHashCode4 = (iHashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            BigDecimal bigDecimal2 = this.yieldToMaturity;
            return iHashCode4 + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: jed.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\u000e"}, d2 = {"Ljed/c$c;", "", "", "toString", "()Ljava/lang/String;", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "b", "()Ljava/math/BigDecimal;", "macaulayDuration", "c", "modifiedDuration", "convexity", "feature_shared_wealth_data_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C0984c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("macaulayDuration")
        private final BigDecimal macaulayDuration;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("modifiedDuration")
        private final BigDecimal modifiedDuration;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("convexity")
        private final BigDecimal convexity;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BigDecimal getConvexity() {
            return this.convexity;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final BigDecimal getMacaulayDuration() {
            return this.macaulayDuration;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final BigDecimal getModifiedDuration() {
            return this.modifiedDuration;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C0984c)) {
                return false;
            }
            C0984c c0984c = (C0984c) obj2;
            return Intrinsics.f(this.macaulayDuration, c0984c.macaulayDuration) && Intrinsics.f(this.modifiedDuration, c0984c.modifiedDuration) && Intrinsics.f(this.convexity, c0984c.convexity);
        }

        public final int hashCode() {
            BigDecimal bigDecimal = this.macaulayDuration;
            int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
            BigDecimal bigDecimal2 = this.modifiedDuration;
            int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
            BigDecimal bigDecimal3 = this.convexity;
            return iHashCode2 + (bigDecimal3 != null ? bigDecimal3.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000f\u0010\r¨\u0006\u0011"}, d2 = {"Ljed/c$d;", "", "", "toString", "()Ljava/lang/String;", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "dailyOpen", "Ljed/d;", "b", "Ljed/d;", "()Ljed/d;", "dayRange", "c", "fiftyTwoWeekRange", "feature_shared_wealth_data_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("dailyOpen")
        private final BigDecimal dailyOpen;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("dayRange")
        private final jed.d dayRange;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("fiftyTwoWeekRange")
        private final jed.d fiftyTwoWeekRange;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BigDecimal getDailyOpen() {
            return this.dailyOpen;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final jed.d getDayRange() {
            return this.dayRange;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final jed.d getFiftyTwoWeekRange() {
            return this.fiftyTwoWeekRange;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return Intrinsics.f(this.dailyOpen, dVar.dailyOpen) && Intrinsics.f(this.dayRange, dVar.dayRange) && Intrinsics.f(this.fiftyTwoWeekRange, dVar.fiftyTwoWeekRange);
        }

        public final int hashCode() {
            BigDecimal bigDecimal = this.dailyOpen;
            int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
            jed.d dVar = this.dayRange;
            int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
            jed.d dVar2 = this.fiftyTwoWeekRange;
            return iHashCode2 + (dVar2 != null ? dVar2.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getPrimaryStats() {
        return this.primaryStats;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C0984c getRiskStats() {
        return this.riskStats;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final d getYieldStats() {
        return this.yieldStats;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.price, cVar.price) && Intrinsics.f(this.primaryStats, cVar.primaryStats) && Intrinsics.f(this.yieldStats, cVar.yieldStats) && Intrinsics.f(this.riskStats, cVar.riskStats);
    }

    public final int hashCode() {
        return this.riskStats.hashCode() + ((this.yieldStats.hashCode() + ((this.primaryStats.hashCode() + (this.price.hashCode() * 31)) * 31)) * 31);
    }
}
