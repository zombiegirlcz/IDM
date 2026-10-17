package krl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u0000 <2\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0007\u001a\u0004\b\u0015\u0010\tR\u001a\u0010\u0018\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0007\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u0019\u0010\u0004R\u001a\u0010\u001c\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0007\u001a\u0004\b\u001b\u0010\tR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0007\u001a\u0004\b\u001e\u0010\tR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0007\u001a\u0004\b!\u0010\tR\u001c\u0010$\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0007\u001a\u0004\b\u001d\u0010\tR\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0012\u001a\u0004\b \u0010\u0004R\u001c\u0010*\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010(\u001a\u0004\b%\u0010)R\u001c\u0010+\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010(\u001a\u0004\b#\u0010)R\u001a\u0010-\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0012\u001a\u0004\b,\u0010\u0004R\u001c\u00100\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b/\u0010)R\u001c\u00102\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u0012\u001a\u0004\b.\u0010\u0004R\u001c\u00104\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010(\u001a\u0004\b3\u0010)R\u001c\u00108\u001a\u0004\u0018\u0001058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u00106\u001a\u0004\b\u0006\u00107R\u001c\u00109\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010:\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u0012\u001a\u0004\b1\u0010\u0004R\u001c\u0010;\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\f\u0010\u0004¨\u0006="}, d2 = {"Lkrl/q;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/b;", "a", "Ljo3/b;", "s", "()Ljo3/b;", "thresholdPrice", "Lkrl/r;", "b", "Lkrl/r;", "u", "()Lkrl/r;", "value", "c", "Ljava/lang/String;", "m", "instrumentName", "d", "estimatedNet", "e", "estimatedPrice", "f", "estimatedQuantity", "g", "estimatedTotal", "h", "l", "gross", "i", "n", "net", "j", "executedPrice", "k", "executedQuantity", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "expirationDate", "expectedSettlementDate", "t", "timeInForce", "o", "r", "startDate", "p", "period", "q", "scheduledExecutionDate", "Lkrl/s;", "Lkrl/s;", "()Lkrl/s;", "autoTopUp", "declineReason", "portfolioId", "badge", "Companion", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("thresholdPrice")
    private final jo3.b thresholdPrice;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("value")
    @NotNull
    private final r value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("instrumentName")
    private final String instrumentName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("estimatedNet")
    @NotNull
    private final jo3.b estimatedNet;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("estimatedPrice")
    @NotNull
    private final jo3.b estimatedPrice;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("estimatedQuantity")
    @NotNull
    private final String estimatedQuantity;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("estimatedTotal")
    @NotNull
    private final jo3.b estimatedTotal;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("gross")
    private final jo3.b gross;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("net")
    private final jo3.b net;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("executedPrice")
    private final jo3.b executedPrice;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("executedQuantity")
    private final String executedQuantity;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("expirationDate")
    private final Long expirationDate;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("expectedSettlementDate")
    private final Long expectedSettlementDate;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("timeInForce")
    @NotNull
    private final String timeInForce;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("startDate")
    private final Long startDate;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("period")
    private final String period;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("scheduledExecutionDate")
    private final Long scheduledExecutionDate;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("autoTopUp")
    private final s autoTopUp;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("declineReason")
    private final String declineReason;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("portfolioId")
    @NotNull
    private final String portfolioId;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("badge")
    private final String badge;

    public q(jo3.b bVar, r value, String str, jo3.b estimatedNet, jo3.b estimatedPrice, String estimatedQuantity, jo3.b estimatedTotal, jo3.b bVar2, jo3.b bVar3, jo3.b bVar4, String str2, Long l2, Long l3, String timeInForce, Long l4, String str3, Long l5, s sVar, String str4, String portfolioId, String str5) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(estimatedNet, "estimatedNet");
        Intrinsics.checkNotNullParameter(estimatedPrice, "estimatedPrice");
        Intrinsics.checkNotNullParameter(estimatedQuantity, "estimatedQuantity");
        Intrinsics.checkNotNullParameter(estimatedTotal, "estimatedTotal");
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.thresholdPrice = bVar;
        this.value = value;
        this.instrumentName = str;
        this.estimatedNet = estimatedNet;
        this.estimatedPrice = estimatedPrice;
        this.estimatedQuantity = estimatedQuantity;
        this.estimatedTotal = estimatedTotal;
        this.gross = bVar2;
        this.net = bVar3;
        this.executedPrice = bVar4;
        this.executedQuantity = str2;
        this.expirationDate = l2;
        this.expectedSettlementDate = l3;
        this.timeInForce = timeInForce;
        this.startDate = l4;
        this.period = str3;
        this.scheduledExecutionDate = l5;
        this.autoTopUp = sVar;
        this.declineReason = str4;
        this.portfolioId = portfolioId;
        this.badge = str5;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final s getAutoTopUp() {
        return this.autoTopUp;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBadge() {
        return this.badge;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDeclineReason() {
        return this.declineReason;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.b getEstimatedNet() {
        return this.estimatedNet;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.b getEstimatedPrice() {
        return this.estimatedPrice;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.thresholdPrice, qVar.thresholdPrice) && Intrinsics.f(this.value, qVar.value) && Intrinsics.f(this.instrumentName, qVar.instrumentName) && Intrinsics.f(this.estimatedNet, qVar.estimatedNet) && Intrinsics.f(this.estimatedPrice, qVar.estimatedPrice) && Intrinsics.f(this.estimatedQuantity, qVar.estimatedQuantity) && Intrinsics.f(this.estimatedTotal, qVar.estimatedTotal) && Intrinsics.f(this.gross, qVar.gross) && Intrinsics.f(this.net, qVar.net) && Intrinsics.f(this.executedPrice, qVar.executedPrice) && Intrinsics.f(this.executedQuantity, qVar.executedQuantity) && Intrinsics.f(this.expirationDate, qVar.expirationDate) && Intrinsics.f(this.expectedSettlementDate, qVar.expectedSettlementDate) && Intrinsics.f(this.timeInForce, qVar.timeInForce) && Intrinsics.f(this.startDate, qVar.startDate) && Intrinsics.f(this.period, qVar.period) && Intrinsics.f(this.scheduledExecutionDate, qVar.scheduledExecutionDate) && Intrinsics.f(this.autoTopUp, qVar.autoTopUp) && Intrinsics.f(this.declineReason, qVar.declineReason) && Intrinsics.f(this.portfolioId, qVar.portfolioId) && Intrinsics.f(this.badge, qVar.badge);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getEstimatedQuantity() {
        return this.estimatedQuantity;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final jo3.b getEstimatedTotal() {
        return this.estimatedTotal;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final jo3.b getExecutedPrice() {
        return this.executedPrice;
    }

    public final int hashCode() {
        jo3.b bVar = this.thresholdPrice;
        int iHashCode = (this.value.hashCode() + ((bVar == null ? 0 : bVar.hashCode()) * 31)) * 31;
        String str = this.instrumentName;
        int iE = y.e(this.estimatedTotal, p.a.c(y.e(this.estimatedPrice, y.e(this.estimatedNet, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.estimatedQuantity), 31);
        jo3.b bVar2 = this.gross;
        int iHashCode2 = (iE + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        jo3.b bVar3 = this.net;
        int iHashCode3 = (iHashCode2 + (bVar3 == null ? 0 : bVar3.hashCode())) * 31;
        jo3.b bVar4 = this.executedPrice;
        int iHashCode4 = (iHashCode3 + (bVar4 == null ? 0 : bVar4.hashCode())) * 31;
        String str2 = this.executedQuantity;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.expirationDate;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.expectedSettlementDate;
        int iC = p.a.c((iHashCode6 + (l3 == null ? 0 : l3.hashCode())) * 31, 31, this.timeInForce);
        Long l4 = this.startDate;
        int iHashCode7 = (iC + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str3 = this.period;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l5 = this.scheduledExecutionDate;
        int iHashCode9 = (iHashCode8 + (l5 == null ? 0 : l5.hashCode())) * 31;
        s sVar = this.autoTopUp;
        int iHashCode10 = (iHashCode9 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        String str4 = this.declineReason;
        int iC2 = p.a.c((iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.portfolioId);
        String str5 = this.badge;
        return iC2 + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getExecutedQuantity() {
        return this.executedQuantity;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Long getExpectedSettlementDate() {
        return this.expectedSettlementDate;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Long getExpirationDate() {
        return this.expirationDate;
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
    public final jo3.b getNet() {
        return this.net;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getPeriod() {
        return this.period;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getPortfolioId() {
        return this.portfolioId;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Long getScheduledExecutionDate() {
        return this.scheduledExecutionDate;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Long getStartDate() {
        return this.startDate;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final jo3.b getThresholdPrice() {
        return this.thresholdPrice;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getTimeInForce() {
        return this.timeInForce;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final r getValue() {
        return this.value;
    }
}
