package orl;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\u0013\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0004R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u000b\u0010\u001dR\u001c\u0010#\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0006\u0010\"R\u001c\u0010'\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010%\u001a\u0004\b\u000f\u0010&R\u001c\u0010,\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+R\u001a\u00101\u001a\u00020-8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010.\u001a\u0004\b/\u00100R\u001c\u00105\u001a\u0004\u0018\u0001028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b \u00104R\u001c\u00107\u001a\u0004\u0018\u0001028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b\u0018\u00104R\u001c\u0010;\u001a\u0004\u0018\u0001088\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u00109\u001a\u0004\b\u0014\u0010:R\u001c\u0010@\u001a\u0004\u0018\u00010<8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b=\u0010?R\u001c\u0010D\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\b6\u0010CR\u001c\u0010H\u001a\u0004\u0018\u00010E8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010F\u001a\u0004\bA\u0010G¨\u0006I"}, d2 = {"Lorl/j0;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "k", "()J", "minOrderValue", "b", "i", "maxOrderValue", "", "c", "I", "h", "()I", "maxOrderQuantity", "d", "Ljava/lang/String;", "j", "minOrderQuantity", "e", "f", "lotQuantity", "", "Ljava/util/List;", "()Ljava/util/List;", "fees", "Lorl/b;", "g", "Lorl/b;", "()Lorl/b;", "dayTrades", "Lorl/c;", "Lorl/c;", "()Lorl/c;", "freeTrades", "Lorl/n0;", "Lorl/n0;", "p", "()Lorl/n0;", "tradeCommission", "Lorl/l0;", "Lorl/l0;", "m", "()Lorl/l0;", "orderTypes", "", "Ljava/lang/Float;", "()Ljava/lang/Float;", "marginRate", "l", "leverage", "Lorl/d;", "Lorl/d;", "()Lorl/d;", "fundLimits", "Lorl/h0;", "n", "Lorl/h0;", "()Lorl/h0;", "pocketsConfig", "o", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "openPositionsLimit", "Lorl/m0;", "Lorl/m0;", "()Lorl/m0;", "structuredNoteLimits", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("minOrderValue")
    private final long minOrderValue;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("maxOrderValue")
    private final long maxOrderValue;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("maxOrderQuantity")
    private final int maxOrderQuantity;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("minOrderQuantity")
    private final String minOrderQuantity;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("lotQuantity")
    private final String lotQuantity;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("fees")
    @NotNull
    private final List<String> fees;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("dayTrades")
    private final b dayTrades;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("freeTrades")
    private final c freeTrades;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("commission")
    private final n0 tradeCommission;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("orderTypes")
    @NotNull
    private final l0 orderTypes;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("marginRate")
    private final Float marginRate;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("leverage")
    private final Float leverage;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("fundLimits")
    private final d fundLimits;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("pockets")
    private final h0 pocketsConfig;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("openPositionsLimit")
    private final Integer openPositionsLimit;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("structuredNoteLimits")
    private final m0 structuredNoteLimits;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getDayTrades() {
        return this.dayTrades;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getFees() {
        return this.fees;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final c getFreeTrades() {
        return this.freeTrades;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final d getFundLimits() {
        return this.fundLimits;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Float getLeverage() {
        return this.leverage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return this.minOrderValue == j0Var.minOrderValue && this.maxOrderValue == j0Var.maxOrderValue && this.maxOrderQuantity == j0Var.maxOrderQuantity && Intrinsics.f(this.minOrderQuantity, j0Var.minOrderQuantity) && Intrinsics.f(this.lotQuantity, j0Var.lotQuantity) && Intrinsics.f(this.fees, j0Var.fees) && Intrinsics.f(this.dayTrades, j0Var.dayTrades) && Intrinsics.f(this.freeTrades, j0Var.freeTrades) && Intrinsics.f(this.tradeCommission, j0Var.tradeCommission) && Intrinsics.f(this.orderTypes, j0Var.orderTypes) && Intrinsics.f(this.marginRate, j0Var.marginRate) && Intrinsics.f(this.leverage, j0Var.leverage) && Intrinsics.f(this.fundLimits, j0Var.fundLimits) && Intrinsics.f(this.pocketsConfig, j0Var.pocketsConfig) && Intrinsics.f(this.openPositionsLimit, j0Var.openPositionsLimit) && Intrinsics.f(this.structuredNoteLimits, j0Var.structuredNoteLimits);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getLotQuantity() {
        return this.lotQuantity;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Float getMarginRate() {
        return this.marginRate;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getMaxOrderQuantity() {
        return this.maxOrderQuantity;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.maxOrderQuantity, a0.d.c(Long.hashCode(this.minOrderValue) * 31, 31, this.maxOrderValue), 31);
        String str = this.minOrderQuantity;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lotQuantity;
        int iD = p.a.d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.fees);
        b bVar = this.dayTrades;
        int iHashCode2 = (iD + (bVar == null ? 0 : bVar.hashCode())) * 31;
        c cVar = this.freeTrades;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        n0 n0Var = this.tradeCommission;
        int iHashCode4 = (this.orderTypes.hashCode() + ((iHashCode3 + (n0Var == null ? 0 : n0Var.hashCode())) * 31)) * 31;
        Float f = this.marginRate;
        int iHashCode5 = (iHashCode4 + (f == null ? 0 : f.hashCode())) * 31;
        Float f4 = this.leverage;
        int iHashCode6 = (iHashCode5 + (f4 == null ? 0 : f4.hashCode())) * 31;
        d dVar = this.fundLimits;
        int iHashCode7 = (iHashCode6 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        h0 h0Var = this.pocketsConfig;
        int iHashCode8 = (iHashCode7 + (h0Var == null ? 0 : h0Var.hashCode())) * 31;
        Integer num = this.openPositionsLimit;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        m0 m0Var = this.structuredNoteLimits;
        return iHashCode9 + (m0Var != null ? m0Var.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getMaxOrderValue() {
        return this.maxOrderValue;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getMinOrderQuantity() {
        return this.minOrderQuantity;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getMinOrderValue() {
        return this.minOrderValue;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final Integer getOpenPositionsLimit() {
        return this.openPositionsLimit;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final l0 getOrderTypes() {
        return this.orderTypes;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final h0 getPocketsConfig() {
        return this.pocketsConfig;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final m0 getStructuredNoteLimits() {
        return this.structuredNoteLimits;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final n0 getTradeCommission() {
        return this.tradeCommission;
    }
}
