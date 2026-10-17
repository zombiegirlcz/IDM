package orl;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 =2\u00020\u0001:\u0001>R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\fR\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006R\u001a\u0010\u001c\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u0019\u0010\fR\u001a\u0010\u001e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006R\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0004\u001a\u0004\b \u0010\u0006R\u001c\u0010$\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0004\u001a\u0004\b#\u0010\u0006R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0004\u001a\u0004\b\u001d\u0010\u0006R\u001c\u0010'\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\n\u001a\u0004\b\u001f\u0010\fR\u001c\u0010+\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010)\u001a\u0004\b%\u0010*R\u001c\u0010,\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010)\u001a\u0004\b\"\u0010*R\u001a\u0010/\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\n\u001a\u0004\b.\u0010\fR\u001c\u00102\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010)\u001a\u0004\b1\u0010*R\u001c\u00104\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010\n\u001a\u0004\b-\u0010\fR\u001c\u00105\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010)\u001a\u0004\b3\u0010*R\u001c\u00109\u001a\u0004\u0018\u0001068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b\u0003\u00108R\u001c\u0010:\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001a\u0010;\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\n\u001a\u0004\b0\u0010\fR\u001c\u0010<\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\t\u0010\f¨\u0006?"}, d2 = {"Lorl/q;", "Lorl/o;", "Ljo3/a;", "n", "Ljo3/a;", "G", "()Ljo3/a;", "thresholdPrice", "", "o", "Ljava/lang/String;", "F", "()Ljava/lang/String;", "symbol", "Lorl/r;", "p", "Lorl/r;", "I", "()Lorl/r;", "value", "q", "z", "instrumentName", "r", "estimatedNet", "s", "estimatedPrice", "t", "estimatedQuantity", "u", "estimatedTotal", "v", "y", "gross", "w", "A", "net", "x", "executedPrice", "executedQuantity", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "expirationDate", "expectedSettlementDate", "B", "H", "timeInForce", "C", "E", "startDate", "D", "period", "scheduledExecutionDate", "Lorl/s0;", "Lorl/s0;", "()Lorl/s0;", "autoTopUp", "declineReason", "portfolioId", "badge", "Companion", "a", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends o {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @lg.b("expectedSettlementDate")
    private final Long expectedSettlementDate;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @lg.b("timeInForce")
    @NotNull
    private final String timeInForce;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @lg.b("startDate")
    private final Long startDate;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @lg.b("period")
    private final String period;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @lg.b("scheduledExecutionDate")
    private final Long scheduledExecutionDate;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @lg.b("autoTopup")
    private final s0 autoTopUp;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @lg.b("declineReason")
    private final String declineReason;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @lg.b("portfolioId")
    @NotNull
    private final String portfolioId;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @lg.b("badge")
    private final String badge;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("thresholdPrice")
    private final jo3.a thresholdPrice;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("symbol")
    @NotNull
    private final String symbol;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("value")
    @NotNull
    private final r value;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("instrumentName")
    private final String instrumentName;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("estimatedNet")
    @NotNull
    private final jo3.a estimatedNet;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("estimatedPrice")
    @NotNull
    private final jo3.a estimatedPrice;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("estimatedQuantity")
    @NotNull
    private final String estimatedQuantity;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("estimatedTotal")
    @NotNull
    private final jo3.a estimatedTotal;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("gross")
    private final jo3.a gross;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("net")
    private final jo3.a net;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @lg.b("executedPrice")
    private final jo3.a executedPrice;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @lg.b("executedQuantity")
    private final String executedQuantity;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @lg.b("expirationDate")
    private final Long expirationDate;

    /* JADX INFO: renamed from: A, reason: from getter */
    public final jo3.a getNet() {
        return this.net;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final String getPeriod() {
        return this.period;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final String getPortfolioId() {
        return this.portfolioId;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final Long getScheduledExecutionDate() {
        return this.scheduledExecutionDate;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final Long getStartDate() {
        return this.startDate;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final jo3.a getThresholdPrice() {
        return this.thresholdPrice;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final String getTimeInForce() {
        return this.timeInForce;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final r getValue() {
        return this.value;
    }

    @Override // orl.o
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!q.class.equals(obj2 != null ? obj2.getClass() : null) || !super.equals(obj2)) {
            return false;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.trading.orders.data.network.models.InvestTaaOrderDto");
        q qVar = (q) obj2;
        return Intrinsics.f(this.thresholdPrice, qVar.thresholdPrice) && Intrinsics.f(this.symbol, qVar.symbol) && Intrinsics.f(this.value, qVar.value) && Intrinsics.f(this.instrumentName, qVar.instrumentName) && Intrinsics.f(this.estimatedNet, qVar.estimatedNet) && Intrinsics.f(this.estimatedPrice, qVar.estimatedPrice) && Intrinsics.f(this.estimatedQuantity, qVar.estimatedQuantity) && Intrinsics.f(this.estimatedTotal, qVar.estimatedTotal) && Intrinsics.f(this.gross, qVar.gross) && Intrinsics.f(this.net, qVar.net) && Intrinsics.f(this.executedPrice, qVar.executedPrice) && Intrinsics.f(this.executedQuantity, qVar.executedQuantity) && Intrinsics.f(this.expirationDate, qVar.expirationDate) && Intrinsics.f(this.expectedSettlementDate, qVar.expectedSettlementDate) && Intrinsics.f(this.timeInForce, qVar.timeInForce) && Intrinsics.f(this.startDate, qVar.startDate) && Intrinsics.f(this.period, qVar.period) && Intrinsics.f(this.scheduledExecutionDate, qVar.scheduledExecutionDate) && Intrinsics.f(this.autoTopUp, qVar.autoTopUp) && Intrinsics.f(this.declineReason, qVar.declineReason) && Intrinsics.f(this.portfolioId, qVar.portfolioId);
    }

    @Override // orl.o
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        jo3.a aVar = this.thresholdPrice;
        int iHashCode2 = (this.value.hashCode() + p.a.c((iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31, 31, this.symbol)) * 31;
        String str = this.instrumentName;
        int iJ = v7.j(this.estimatedTotal, p.a.c(v7.j(this.estimatedPrice, v7.j(this.estimatedNet, (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31), 31), 31, this.estimatedQuantity), 31);
        jo3.a aVar2 = this.gross;
        int iHashCode3 = (iJ + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        jo3.a aVar3 = this.net;
        int iHashCode4 = (iHashCode3 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31;
        jo3.a aVar4 = this.executedPrice;
        int iHashCode5 = (iHashCode4 + (aVar4 != null ? aVar4.hashCode() : 0)) * 31;
        String str2 = this.executedQuantity;
        int iHashCode6 = (iHashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Long l2 = this.expirationDate;
        int iHashCode7 = (iHashCode6 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 31;
        Long l3 = this.expectedSettlementDate;
        int iC = p.a.c((iHashCode7 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 31, 31, this.timeInForce);
        Long l4 = this.startDate;
        int iHashCode8 = (iC + (l4 != null ? Long.hashCode(l4.longValue()) : 0)) * 31;
        String str3 = this.period;
        int iHashCode9 = (iHashCode8 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Long l5 = this.scheduledExecutionDate;
        int iHashCode10 = (iHashCode9 + (l5 != null ? Long.hashCode(l5.longValue()) : 0)) * 31;
        s0 s0Var = this.autoTopUp;
        int iHashCode11 = (iHashCode10 + (s0Var != null ? s0Var.hashCode() : 0)) * 31;
        String str4 = this.declineReason;
        return this.portfolioId.hashCode() + ((iHashCode11 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final s0 getAutoTopUp() {
        return this.autoTopUp;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getBadge() {
        return this.badge;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getDeclineReason() {
        return this.declineReason;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final jo3.a getEstimatedNet() {
        return this.estimatedNet;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final jo3.a getEstimatedPrice() {
        return this.estimatedPrice;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getEstimatedQuantity() {
        return this.estimatedQuantity;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final jo3.a getEstimatedTotal() {
        return this.estimatedTotal;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final jo3.a getExecutedPrice() {
        return this.executedPrice;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final String getExecutedQuantity() {
        return this.executedQuantity;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final Long getExpectedSettlementDate() {
        return this.expectedSettlementDate;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final Long getExpirationDate() {
        return this.expirationDate;
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
