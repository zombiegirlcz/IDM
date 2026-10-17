package krl;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\r\b\u0080\b\u0018\u0000 J2\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010#\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u001c\u0010$\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010!\u001a\u0004\b\u0013\u0010\"R\u001c\u0010)\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u0005\u0010(R\u001c\u0010*\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u000f\u0010\u0016R\u001c\u0010,\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u001b\u001a\u0004\b&\u0010\u001dR\u001a\u0010.\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b-\u0010\u0004R\u001c\u00100\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u0014\u001a\u0004\b/\u0010\u0016R\u001c\u00103\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\u0004R\u001c\u00106\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010\u001b\u001a\u0004\b5\u0010\u001dR\u001c\u00108\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u001b\u001a\u0004\b7\u0010\u001dR\u001c\u0010:\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010!\u001a\u0004\b9\u0010\"R\u001a\u0010=\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010\u0006\u001a\u0004\b<\u0010\u0004R\u001a\u0010B\u001a\u00020>8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010C\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010\u0014\u001a\u0004\b4\u0010\u0016R\u001a\u0010D\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b+\u0010\u0016R\u001a\u0010E\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010\u000b\u001a\u0004\b1\u0010\rR\u001a\u0010G\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010\u0014\u001a\u0004\bF\u0010\u0016R\u001c\u0010H\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010I\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010\u0006\u001a\u0004\b;\u0010\u0004¨\u0006K"}, d2 = {"Lkrl/e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "u", "symbol", "Ljava/math/BigDecimal;", "b", "Ljava/math/BigDecimal;", "e", "()Ljava/math/BigDecimal;", "estimatedQuantity", "c", "h", "executedQuantity", "Ljo3/b;", "d", "Ljo3/b;", "l", "()Ljo3/b;", "gross", "f", "estimatedTotal", "", "Ljava/lang/Long;", "j", "()Ljava/lang/Long;", "expirationDate", "Lko3/b;", "g", "Lko3/b;", "()Lko3/b;", "executedPrice", "estimatedPrice", "Lkrl/s;", "i", "Lkrl/s;", "()Lkrl/s;", "autoTopUp", "estimatedNet", "k", "expectedSettlementDate", "m", "instrumentName", "p", "net", "n", "q", "period", "o", "s", "scheduledExecutionDate", "t", "startDate", "v", "thresholdPrice", "r", "w", "timeInForce", "Lkrl/r;", "Lkrl/r;", "y", "()Lkrl/r;", "value", "margin", "exposure", "leverage", "x", "totalMargin", "declineReason", "portfolioId", "Companion", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("symbol")
    @NotNull
    private final String symbol;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("estimatedQuantity")
    @NotNull
    private final BigDecimal estimatedQuantity;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("executedQuantity")
    private final BigDecimal executedQuantity;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("gross")
    private final jo3.b gross;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("estimatedTotal")
    @NotNull
    private final jo3.b estimatedTotal;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("expirationDate")
    private final Long expirationDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("executedPrice")
    private final ko3.b executedPrice;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("estimatedPrice")
    private final ko3.b estimatedPrice;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("autoTopup")
    private final s autoTopUp;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("estimatedNet")
    private final jo3.b estimatedNet;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("expectedSettlementDate")
    private final Long expectedSettlementDate;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("instrumentName")
    @NotNull
    private final String instrumentName;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("net")
    private final jo3.b net;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("period")
    private final String period;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("scheduledExecutionDate")
    private final Long scheduledExecutionDate;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("startDate")
    private final Long startDate;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("thresholdPrice")
    private final ko3.b thresholdPrice;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("timeInForce")
    @NotNull
    private final String timeInForce;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("value")
    @NotNull
    private final r value;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("margin")
    @NotNull
    private final jo3.b margin;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("exposure")
    @NotNull
    private final jo3.b exposure;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("leverage")
    @NotNull
    private final BigDecimal leverage;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalMargin")
    @NotNull
    private final jo3.b totalMargin;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @lg.b("declineReason")
    private final String declineReason;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @lg.b("portfolioId")
    @NotNull
    private final String portfolioId;

    public e(String symbol, BigDecimal estimatedQuantity, BigDecimal bigDecimal, jo3.b bVar, jo3.b estimatedTotal, Long l2, ko3.b bVar2, ko3.b bVar3, s sVar, jo3.b bVar4, Long l3, String instrumentName, jo3.b bVar5, String str, Long l4, Long l5, ko3.b bVar6, String timeInForce, r value, jo3.b margin, jo3.b exposure, BigDecimal leverage, jo3.b totalMargin, String str2, String portfolioId) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(estimatedQuantity, "estimatedQuantity");
        Intrinsics.checkNotNullParameter(estimatedTotal, "estimatedTotal");
        Intrinsics.checkNotNullParameter(instrumentName, "instrumentName");
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(margin, "margin");
        Intrinsics.checkNotNullParameter(exposure, "exposure");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        Intrinsics.checkNotNullParameter(totalMargin, "totalMargin");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.symbol = symbol;
        this.estimatedQuantity = estimatedQuantity;
        this.executedQuantity = bigDecimal;
        this.gross = bVar;
        this.estimatedTotal = estimatedTotal;
        this.expirationDate = l2;
        this.executedPrice = bVar2;
        this.estimatedPrice = bVar3;
        this.autoTopUp = sVar;
        this.estimatedNet = bVar4;
        this.expectedSettlementDate = l3;
        this.instrumentName = instrumentName;
        this.net = bVar5;
        this.period = str;
        this.scheduledExecutionDate = l4;
        this.startDate = l5;
        this.thresholdPrice = bVar6;
        this.timeInForce = timeInForce;
        this.value = value;
        this.margin = margin;
        this.exposure = exposure;
        this.leverage = leverage;
        this.totalMargin = totalMargin;
        this.declineReason = str2;
        this.portfolioId = portfolioId;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final s getAutoTopUp() {
        return this.autoTopUp;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDeclineReason() {
        return this.declineReason;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.b getEstimatedNet() {
        return this.estimatedNet;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ko3.b getEstimatedPrice() {
        return this.estimatedPrice;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final BigDecimal getEstimatedQuantity() {
        return this.estimatedQuantity;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.symbol, eVar.symbol) && Intrinsics.f(this.estimatedQuantity, eVar.estimatedQuantity) && Intrinsics.f(this.executedQuantity, eVar.executedQuantity) && Intrinsics.f(this.gross, eVar.gross) && Intrinsics.f(this.estimatedTotal, eVar.estimatedTotal) && Intrinsics.f(this.expirationDate, eVar.expirationDate) && Intrinsics.f(this.executedPrice, eVar.executedPrice) && Intrinsics.f(this.estimatedPrice, eVar.estimatedPrice) && Intrinsics.f(this.autoTopUp, eVar.autoTopUp) && Intrinsics.f(this.estimatedNet, eVar.estimatedNet) && Intrinsics.f(this.expectedSettlementDate, eVar.expectedSettlementDate) && Intrinsics.f(this.instrumentName, eVar.instrumentName) && Intrinsics.f(this.net, eVar.net) && Intrinsics.f(this.period, eVar.period) && Intrinsics.f(this.scheduledExecutionDate, eVar.scheduledExecutionDate) && Intrinsics.f(this.startDate, eVar.startDate) && Intrinsics.f(this.thresholdPrice, eVar.thresholdPrice) && Intrinsics.f(this.timeInForce, eVar.timeInForce) && Intrinsics.f(this.value, eVar.value) && Intrinsics.f(this.margin, eVar.margin) && Intrinsics.f(this.exposure, eVar.exposure) && Intrinsics.f(this.leverage, eVar.leverage) && Intrinsics.f(this.totalMargin, eVar.totalMargin) && Intrinsics.f(this.declineReason, eVar.declineReason) && Intrinsics.f(this.portfolioId, eVar.portfolioId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final jo3.b getEstimatedTotal() {
        return this.estimatedTotal;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final ko3.b getExecutedPrice() {
        return this.executedPrice;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final BigDecimal getExecutedQuantity() {
        return this.executedQuantity;
    }

    public final int hashCode() {
        int iD = t61.a.d(this.estimatedQuantity, this.symbol.hashCode() * 31, 31);
        BigDecimal bigDecimal = this.executedQuantity;
        int iHashCode = (iD + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        jo3.b bVar = this.gross;
        int iE = y.e(this.estimatedTotal, (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31);
        Long l2 = this.expirationDate;
        int iHashCode2 = (iE + (l2 == null ? 0 : l2.hashCode())) * 31;
        ko3.b bVar2 = this.executedPrice;
        int iHashCode3 = (iHashCode2 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        ko3.b bVar3 = this.estimatedPrice;
        int iHashCode4 = (iHashCode3 + (bVar3 == null ? 0 : bVar3.hashCode())) * 31;
        s sVar = this.autoTopUp;
        int iHashCode5 = (iHashCode4 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        jo3.b bVar4 = this.estimatedNet;
        int iHashCode6 = (iHashCode5 + (bVar4 == null ? 0 : bVar4.hashCode())) * 31;
        Long l3 = this.expectedSettlementDate;
        int iC = p.a.c((iHashCode6 + (l3 == null ? 0 : l3.hashCode())) * 31, 31, this.instrumentName);
        jo3.b bVar5 = this.net;
        int iHashCode7 = (iC + (bVar5 == null ? 0 : bVar5.hashCode())) * 31;
        String str = this.period;
        int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        Long l4 = this.scheduledExecutionDate;
        int iHashCode9 = (iHashCode8 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.startDate;
        int iHashCode10 = (iHashCode9 + (l5 == null ? 0 : l5.hashCode())) * 31;
        ko3.b bVar6 = this.thresholdPrice;
        int iE2 = y.e(this.totalMargin, t61.a.d(this.leverage, y.e(this.exposure, y.e(this.margin, (this.value.hashCode() + p.a.c((iHashCode10 + (bVar6 == null ? 0 : bVar6.hashCode())) * 31, 31, this.timeInForce)) * 31, 31), 31), 31), 31);
        String str2 = this.declineReason;
        return this.portfolioId.hashCode() + ((iE2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Long getExpectedSettlementDate() {
        return this.expectedSettlementDate;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Long getExpirationDate() {
        return this.expirationDate;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final jo3.b getExposure() {
        return this.exposure;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final jo3.b getGross() {
        return this.gross;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getInstrumentName() {
        return this.instrumentName;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final BigDecimal getLeverage() {
        return this.leverage;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final jo3.b getMargin() {
        return this.margin;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final jo3.b getNet() {
        return this.net;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getPeriod() {
        return this.period;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getPortfolioId() {
        return this.portfolioId;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final Long getScheduledExecutionDate() {
        return this.scheduledExecutionDate;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Long getStartDate() {
        return this.startDate;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final ko3.b getThresholdPrice() {
        return this.thresholdPrice;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final String getTimeInForce() {
        return this.timeInForce;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final jo3.b getTotalMargin() {
        return this.totalMargin;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final r getValue() {
        return this.value;
    }
}
