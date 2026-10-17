package orl;

import ip0.v7;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 I2\u00020\u0001:\u0001JR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\"\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u001c\u0010#\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010 \u001a\u0004\b\u0012\u0010!R\u001c\u0010(\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u0003\u0010'R\u001c\u0010)\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u000e\u0010\u0015R\u001c\u0010+\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u001a\u001a\u0004\b%\u0010\u001cR\u001a\u0010-\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b,\u0010\u0006R\u001c\u0010/\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u0013\u001a\u0004\b.\u0010\u0015R\u001c\u00102\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010\u0004\u001a\u0004\b1\u0010\u0006R\u001c\u00105\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010\u001a\u001a\u0004\b4\u0010\u001cR\u001c\u00107\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\u001a\u001a\u0004\b6\u0010\u001cR\u001c\u00109\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010 \u001a\u0004\b8\u0010!R\u001a\u0010<\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010\u0004\u001a\u0004\b;\u0010\u0006R\u001a\u0010A\u001a\u00020=8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010B\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010\u0013\u001a\u0004\b3\u0010\u0015R\u001a\u0010C\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b*\u0010\u0015R\u001a\u0010D\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010\n\u001a\u0004\b0\u0010\fR\u001a\u0010F\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010\u0013\u001a\u0004\bE\u0010\u0015R\u001c\u0010G\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010H\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010\u0004\u001a\u0004\b:\u0010\u0006¨\u0006K"}, d2 = {"Lorl/i;", "Lorl/o;", "", "n", "Ljava/lang/String;", "H", "()Ljava/lang/String;", "symbol", "Ljava/math/BigDecimal;", "o", "Ljava/math/BigDecimal;", "r", "()Ljava/math/BigDecimal;", "estimatedQuantity", "p", "u", "executedQuantity", "Ljo3/a;", "q", "Ljo3/a;", "y", "()Ljo3/a;", "gross", "s", "estimatedTotal", "", "Ljava/lang/Long;", "w", "()Ljava/lang/Long;", "expirationDate", "Lko3/a;", "t", "Lko3/a;", "()Lko3/a;", "executedPrice", "estimatedPrice", "Lorl/s0;", "v", "Lorl/s0;", "()Lorl/s0;", "autoTopUp", "estimatedNet", "x", "expectedSettlementDate", "z", "instrumentName", "C", "net", "A", "D", "period", "B", "F", "scheduledExecutionDate", "G", "startDate", "I", "thresholdPrice", "E", "J", "timeInForce", "Lorl/r;", "Lorl/r;", "L", "()Lorl/r;", "value", "margin", "exposure", "leverage", "K", "totalMargin", "declineReason", "portfolioId", "Companion", "a", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i extends o {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @lg.b("period")
    private final String period;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @lg.b("scheduledExecutionDate")
    private final Long scheduledExecutionDate;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @lg.b("startDate")
    private final Long startDate;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @lg.b("thresholdPrice")
    private final ko3.a thresholdPrice;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @lg.b("timeInForce")
    @NotNull
    private final String timeInForce;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @lg.b("value")
    @NotNull
    private final r value;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @lg.b("margin")
    @NotNull
    private final jo3.a margin;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @lg.b("exposure")
    @NotNull
    private final jo3.a exposure;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @lg.b("leverage")
    @NotNull
    private final BigDecimal leverage;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @lg.b("totalMargin")
    @NotNull
    private final jo3.a totalMargin;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @lg.b("declineReason")
    private final String declineReason;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @lg.b("portfolioId")
    @NotNull
    private final String portfolioId;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("symbol")
    @NotNull
    private final String symbol;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("estimatedQuantity")
    @NotNull
    private final BigDecimal estimatedQuantity;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("executedQuantity")
    private final BigDecimal executedQuantity;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("gross")
    private final jo3.a gross;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("estimatedTotal")
    @NotNull
    private final jo3.a estimatedTotal;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("expirationDate")
    private final Long expirationDate;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("executedPrice")
    private final ko3.a executedPrice;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("estimatedPrice")
    private final ko3.a estimatedPrice;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("autoTopup")
    private final s0 autoTopUp;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("estimatedNet")
    private final jo3.a estimatedNet;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @lg.b("expectedSettlementDate")
    private final Long expectedSettlementDate;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @lg.b("instrumentName")
    @NotNull
    private final String instrumentName;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @lg.b("net")
    private final jo3.a net;

    /* JADX INFO: renamed from: A, reason: from getter */
    public final BigDecimal getLeverage() {
        return this.leverage;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final jo3.a getMargin() {
        return this.margin;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final jo3.a getNet() {
        return this.net;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final String getPeriod() {
        return this.period;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final String getPortfolioId() {
        return this.portfolioId;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final Long getScheduledExecutionDate() {
        return this.scheduledExecutionDate;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final Long getStartDate() {
        return this.startDate;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final ko3.a getThresholdPrice() {
        return this.thresholdPrice;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final String getTimeInForce() {
        return this.timeInForce;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final jo3.a getTotalMargin() {
        return this.totalMargin;
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final r getValue() {
        return this.value;
    }

    @Override // orl.o
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!i.class.equals(obj2 != null ? obj2.getClass() : null) || !super.equals(obj2)) {
            return false;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.trading.orders.data.network.models.InvestMarginTradingOrderDto");
        i iVar = (i) obj2;
        return Intrinsics.f(this.symbol, iVar.symbol) && Intrinsics.f(this.estimatedQuantity, iVar.estimatedQuantity) && Intrinsics.f(this.executedQuantity, iVar.executedQuantity) && Intrinsics.f(this.gross, iVar.gross) && Intrinsics.f(this.estimatedTotal, iVar.estimatedTotal) && Intrinsics.f(this.expirationDate, iVar.expirationDate) && Intrinsics.f(this.executedPrice, iVar.executedPrice) && Intrinsics.f(this.estimatedPrice, iVar.estimatedPrice) && Intrinsics.f(this.autoTopUp, iVar.autoTopUp) && Intrinsics.f(this.estimatedNet, iVar.estimatedNet) && Intrinsics.f(this.expectedSettlementDate, iVar.expectedSettlementDate) && Intrinsics.f(this.instrumentName, iVar.instrumentName) && Intrinsics.f(this.net, iVar.net) && Intrinsics.f(this.period, iVar.period) && Intrinsics.f(this.scheduledExecutionDate, iVar.scheduledExecutionDate) && Intrinsics.f(this.startDate, iVar.startDate) && Intrinsics.f(this.thresholdPrice, iVar.thresholdPrice) && Intrinsics.f(this.timeInForce, iVar.timeInForce) && Intrinsics.f(this.value, iVar.value) && Intrinsics.f(this.margin, iVar.margin) && Intrinsics.f(this.exposure, iVar.exposure) && Intrinsics.f(this.leverage, iVar.leverage) && Intrinsics.f(this.totalMargin, iVar.totalMargin) && Intrinsics.f(this.declineReason, iVar.declineReason) && Intrinsics.f(this.portfolioId, iVar.portfolioId);
    }

    @Override // orl.o
    public final int hashCode() {
        int iD = t61.a.d(this.estimatedQuantity, p.a.c(super.hashCode() * 31, 31, this.symbol), 31);
        BigDecimal bigDecimal = this.executedQuantity;
        int iHashCode = (iD + (bigDecimal != null ? bigDecimal.hashCode() : 0)) * 31;
        jo3.a aVar = this.gross;
        int iJ = v7.j(this.estimatedTotal, (iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31, 31);
        Long l2 = this.expirationDate;
        int iHashCode2 = (iJ + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 31;
        ko3.a aVar2 = this.executedPrice;
        int iHashCode3 = (iHashCode2 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        ko3.a aVar3 = this.estimatedPrice;
        int iHashCode4 = (iHashCode3 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31;
        s0 s0Var = this.autoTopUp;
        int iHashCode5 = (iHashCode4 + (s0Var != null ? s0Var.hashCode() : 0)) * 31;
        jo3.a aVar4 = this.estimatedNet;
        int iHashCode6 = (iHashCode5 + (aVar4 != null ? aVar4.hashCode() : 0)) * 31;
        Long l3 = this.expectedSettlementDate;
        int iC = p.a.c((iHashCode6 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 31, 31, this.instrumentName);
        jo3.a aVar5 = this.net;
        int iHashCode7 = (iC + (aVar5 != null ? aVar5.hashCode() : 0)) * 31;
        String str = this.period;
        int iHashCode8 = (iHashCode7 + (str != null ? str.hashCode() : 0)) * 31;
        Long l4 = this.scheduledExecutionDate;
        int iHashCode9 = (iHashCode8 + (l4 != null ? Long.hashCode(l4.longValue()) : 0)) * 31;
        Long l5 = this.startDate;
        int iHashCode10 = (iHashCode9 + (l5 != null ? Long.hashCode(l5.longValue()) : 0)) * 31;
        ko3.a aVar6 = this.thresholdPrice;
        int iJ2 = v7.j(this.totalMargin, t61.a.d(this.leverage, v7.j(this.exposure, v7.j(this.margin, (this.value.hashCode() + p.a.c((iHashCode10 + (aVar6 != null ? aVar6.hashCode() : 0)) * 31, 31, this.timeInForce)) * 31, 31), 31), 31), 31);
        String str2 = this.declineReason;
        return this.portfolioId.hashCode() + ((iJ2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final s0 getAutoTopUp() {
        return this.autoTopUp;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getDeclineReason() {
        return this.declineReason;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final jo3.a getEstimatedNet() {
        return this.estimatedNet;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final ko3.a getEstimatedPrice() {
        return this.estimatedPrice;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final BigDecimal getEstimatedQuantity() {
        return this.estimatedQuantity;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final jo3.a getEstimatedTotal() {
        return this.estimatedTotal;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final ko3.a getExecutedPrice() {
        return this.executedPrice;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final BigDecimal getExecutedQuantity() {
        return this.executedQuantity;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final Long getExpectedSettlementDate() {
        return this.expectedSettlementDate;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final Long getExpirationDate() {
        return this.expirationDate;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final jo3.a getExposure() {
        return this.exposure;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final jo3.a getGross() {
        return this.gross;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final String getInstrumentName() {
        return this.instrumentName;
    }
}
