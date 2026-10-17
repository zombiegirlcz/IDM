package fdl;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0010\b\n\u0002\b\u0015\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001a\u0010\u001f\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010%\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010(\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0006\u001a\u0004\b'\u0010\u0004R\u001c\u0010+\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\u0004R\u001c\u0010-\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b,\u0010\u0004R\u001a\u00101\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b\u0018\u00100R\u001c\u00105\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u00104R\u001c\u00107\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b6\u0010$R\u001c\u00109\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u00102\u001a\u0004\b8\u00104R\u001c\u0010;\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010=\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\r\u001a\u0004\b<\u0010\u001eR\u001c\u0010@\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u00102\u001a\u0004\b?\u00104R\u001c\u0010B\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\bA\u0010$R\u001c\u0010D\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bC\u00102\u001a\u0004\b\u0005\u00104R\u001c\u0010F\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bE\u00102\u001a\u0004\bC\u00104R\u001c\u0010H\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010\"\u001a\u0004\bE\u0010$R\u001c\u0010K\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010\u0006\u001a\u0004\bJ\u0010\u0004R\u001c\u0010N\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010\"\u001a\u0004\bM\u0010$R\u001c\u0010O\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\bG\u0010$R\u001c\u0010Q\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010\"\u001a\u0004\bP\u0010$R\u001c\u0010S\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010\"\u001a\u0004\bR\u0010$R\u001c\u0010U\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bT\u0010\u0006\u001a\u0004\bI\u0010\u0004R\u001c\u0010V\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00102\u001a\u0004\b&\u00104R\u001c\u0010W\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010\u0006\u001a\u0004\bL\u0010\u0004R\u001c\u0010[\u001a\u0004\u0018\u00010X8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010Y\u001a\u0004\b>\u0010ZR\u001c\u0010\\\u001a\u0004\u0018\u00010X8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bR\u0010Y\u001a\u0004\b:\u0010ZR\u001c\u0010]\u001a\u0004\u0018\u00010X8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010Y\u001a\u0004\b\u0013\u0010ZR\u001c\u0010^\u001a\u0004\u0018\u00010X8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bP\u0010Y\u001a\u0004\bT\u0010ZR\u001c\u0010`\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b_\u0010\"\u001a\u0004\b.\u0010$R\u001c\u0010a\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b\u001c\u0010$R\u001c\u0010b\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\"\u001a\u0004\b)\u0010$R\u001c\u0010d\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bc\u0010\"\u001a\u0004\bc\u0010$R\u001c\u0010f\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\be\u0010$R\u001c\u0010g\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010\"\u001a\u0004\b_\u0010$R\u001c\u0010h\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010j\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bi\u0010\"\u001a\u0004\b!\u0010$R\u001c\u0010k\u001a\u0004\u0018\u00010X8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010Y\u001a\u0004\b\f\u0010ZR\u001c\u0010l\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\be\u0010\u0006\u001a\u0004\bi\u0010\u0004¨\u0006m"}, d2 = {"Lfdl/c1;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "M", "tickerType", "b", "m", "instrument", "c", "J", "ref", "d", "O", "type", "", "e", "Ljava/lang/Boolean;", "k", "()Ljava/lang/Boolean;", "halted", "f", "K", "status", "", "g", "n", "()J", "last", "Ljava/math/BigDecimal;", "h", "Ljava/math/BigDecimal;", "y", "()Ljava/math/BigDecimal;", "lastPrecise", "i", "s", "lastClean", "j", "q", "lastBid", "o", "lastAsk", "l", "Z", "()Z", "delayed", "Ljava/lang/Long;", "C", "()Ljava/lang/Long;", "previous", "G", "previousPrecise", "A", "nextOpenUtcTimestamp", "p", "currency", "Q", "updatedAt", "r", "D", "previousClose", "E", "previousClosePrecise", "t", "baseline", "u", "lastClose", "v", "lastClosePrecise", "w", "N", "tradingSession", "x", "z", "lastYtm", "lastCloseYtm", "H", "previousYtm", "F", "previousCloseYtm", "B", "lastFmv", "fmvUpdatedAt", "lastMid", "", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "lastBidSize", "lastAskSize", "dayVolume", "openInterest", "I", "impliedVolatility", "delta", "gamma", "L", "theta", "R", "vega", "probabilityOfProfit", "breakEven", "P", "effectiveLeverage", "contractSize", "unit", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c1 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @lg.b("previousCloseYtm")
    private final BigDecimal previousCloseYtm;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @lg.b("lastFmv")
    private final String lastFmv;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @lg.b("fmvUpdatedAt")
    private final Long fmvUpdatedAt;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @lg.b("lastMid")
    private final String lastMid;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @lg.b("lastBidSize")
    private final Integer lastBidSize;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @lg.b("lastAskSize")
    private final Integer lastAskSize;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @lg.b("dayVolume")
    private final Integer dayVolume;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @lg.b("openInterest")
    private final Integer openInterest;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @lg.b("impliedVolatility")
    private final BigDecimal impliedVolatility;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @lg.b("delta")
    private final BigDecimal delta;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @lg.b("gamma")
    private final BigDecimal gamma;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @lg.b("theta")
    private final BigDecimal theta;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @lg.b("vega")
    private final BigDecimal vega;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @lg.b("probabilityOfProfit")
    private final BigDecimal probabilityOfProfit;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @lg.b("breakEven")
    private final String breakEven;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @lg.b("effectiveLeverage")
    private final BigDecimal effectiveLeverage;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @lg.b("contractSize")
    private final Integer contractSize;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @lg.b("unit")
    private final String unit;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("tickerType")
    private final String tickerType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("instrument")
    @NotNull
    private final String instrument;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("ref")
    private final String ref;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("type")
    private final String type;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("halted")
    private final Boolean halted;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("status")
    private final String status;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("last")
    private final long last;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("lastPrecise")
    private final BigDecimal lastPrecise;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("lastClean")
    private final String lastClean;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("lastBid")
    private final String lastBid;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("lastAsk")
    private final String lastAsk;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("delayed")
    private final boolean delayed;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("previous")
    private final Long previous;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("previousPrecise")
    private final BigDecimal previousPrecise;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("nextOpenUtcTimestamp")
    private final Long nextOpenUtcTimestamp;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("currency")
    private final String currency;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("updatedAt")
    private final long updatedAt;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("previousClose")
    private final Long previousClose;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("previousClosePrecise")
    private final BigDecimal previousClosePrecise;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("baseline")
    private final Long baseline;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("lastClose")
    private final Long lastClose;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("lastClosePrecise")
    private final BigDecimal lastClosePrecise;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("tradingSession")
    private final String tradingSession;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @lg.b("lastYtm")
    private final BigDecimal lastYtm;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @lg.b("lastCloseYtm")
    private final BigDecimal lastCloseYtm;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @lg.b("previousYtm")
    private final BigDecimal previousYtm;

    /* JADX INFO: renamed from: A, reason: from getter */
    public final Long getNextOpenUtcTimestamp() {
        return this.nextOpenUtcTimestamp;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final Integer getOpenInterest() {
        return this.openInterest;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final Long getPrevious() {
        return this.previous;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final Long getPreviousClose() {
        return this.previousClose;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final BigDecimal getPreviousClosePrecise() {
        return this.previousClosePrecise;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final BigDecimal getPreviousCloseYtm() {
        return this.previousCloseYtm;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final BigDecimal getPreviousPrecise() {
        return this.previousPrecise;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final BigDecimal getPreviousYtm() {
        return this.previousYtm;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final BigDecimal getProbabilityOfProfit() {
        return this.probabilityOfProfit;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final String getRef() {
        return this.ref;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final BigDecimal getTheta() {
        return this.theta;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final String getTickerType() {
        return this.tickerType;
    }

    /* JADX INFO: renamed from: N, reason: from getter */
    public final String getTradingSession() {
        return this.tradingSession;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: R, reason: from getter */
    public final BigDecimal getVega() {
        return this.vega;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getBaseline() {
        return this.baseline;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBreakEven() {
        return this.breakEven;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getContractSize() {
        return this.contractSize;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getDayVolume() {
        return this.dayVolume;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj2;
        return Intrinsics.f(this.tickerType, c1Var.tickerType) && Intrinsics.f(this.instrument, c1Var.instrument) && Intrinsics.f(this.ref, c1Var.ref) && Intrinsics.f(this.type, c1Var.type) && Intrinsics.f(this.halted, c1Var.halted) && Intrinsics.f(this.status, c1Var.status) && this.last == c1Var.last && Intrinsics.f(this.lastPrecise, c1Var.lastPrecise) && Intrinsics.f(this.lastClean, c1Var.lastClean) && Intrinsics.f(this.lastBid, c1Var.lastBid) && Intrinsics.f(this.lastAsk, c1Var.lastAsk) && this.delayed == c1Var.delayed && Intrinsics.f(this.previous, c1Var.previous) && Intrinsics.f(this.previousPrecise, c1Var.previousPrecise) && Intrinsics.f(this.nextOpenUtcTimestamp, c1Var.nextOpenUtcTimestamp) && Intrinsics.f(this.currency, c1Var.currency) && this.updatedAt == c1Var.updatedAt && Intrinsics.f(this.previousClose, c1Var.previousClose) && Intrinsics.f(this.previousClosePrecise, c1Var.previousClosePrecise) && Intrinsics.f(this.baseline, c1Var.baseline) && Intrinsics.f(this.lastClose, c1Var.lastClose) && Intrinsics.f(this.lastClosePrecise, c1Var.lastClosePrecise) && Intrinsics.f(this.tradingSession, c1Var.tradingSession) && Intrinsics.f(this.lastYtm, c1Var.lastYtm) && Intrinsics.f(this.lastCloseYtm, c1Var.lastCloseYtm) && Intrinsics.f(this.previousYtm, c1Var.previousYtm) && Intrinsics.f(this.previousCloseYtm, c1Var.previousCloseYtm) && Intrinsics.f(this.lastFmv, c1Var.lastFmv) && Intrinsics.f(this.fmvUpdatedAt, c1Var.fmvUpdatedAt) && Intrinsics.f(this.lastMid, c1Var.lastMid) && Intrinsics.f(this.lastBidSize, c1Var.lastBidSize) && Intrinsics.f(this.lastAskSize, c1Var.lastAskSize) && Intrinsics.f(this.dayVolume, c1Var.dayVolume) && Intrinsics.f(this.openInterest, c1Var.openInterest) && Intrinsics.f(this.impliedVolatility, c1Var.impliedVolatility) && Intrinsics.f(this.delta, c1Var.delta) && Intrinsics.f(this.gamma, c1Var.gamma) && Intrinsics.f(this.theta, c1Var.theta) && Intrinsics.f(this.vega, c1Var.vega) && Intrinsics.f(this.probabilityOfProfit, c1Var.probabilityOfProfit) && Intrinsics.f(this.breakEven, c1Var.breakEven) && Intrinsics.f(this.effectiveLeverage, c1Var.effectiveLeverage) && Intrinsics.f(this.contractSize, c1Var.contractSize) && Intrinsics.f(this.unit, c1Var.unit);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getDelayed() {
        return this.delayed;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final BigDecimal getDelta() {
        return this.delta;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final BigDecimal getEffectiveLeverage() {
        return this.effectiveLeverage;
    }

    public final int hashCode() {
        String str = this.tickerType;
        int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.instrument);
        String str2 = this.ref;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.halted;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.status;
        int iC2 = a0.d.c((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.last);
        BigDecimal bigDecimal = this.lastPrecise;
        int iHashCode4 = (iC2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str5 = this.lastClean;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.lastBid;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.lastAsk;
        int iC3 = j6.a.c((iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.delayed);
        Long l2 = this.previous;
        int iHashCode7 = (iC3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.previousPrecise;
        int iHashCode8 = (iHashCode7 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        Long l3 = this.nextOpenUtcTimestamp;
        int iHashCode9 = (iHashCode8 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str8 = this.currency;
        int iC4 = a0.d.c((iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31, 31, this.updatedAt);
        Long l4 = this.previousClose;
        int iHashCode10 = (iC4 + (l4 == null ? 0 : l4.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.previousClosePrecise;
        int iHashCode11 = (iHashCode10 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        Long l5 = this.baseline;
        int iHashCode12 = (iHashCode11 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l22 = this.lastClose;
        int iHashCode13 = (iHashCode12 + (l22 == null ? 0 : l22.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.lastClosePrecise;
        int iHashCode14 = (iHashCode13 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        String str9 = this.tradingSession;
        int iHashCode15 = (iHashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.lastYtm;
        int iHashCode16 = (iHashCode15 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.lastCloseYtm;
        int iHashCode17 = (iHashCode16 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.previousYtm;
        int iHashCode18 = (iHashCode17 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.previousCloseYtm;
        int iHashCode19 = (iHashCode18 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        String str10 = this.lastFmv;
        int iHashCode20 = (iHashCode19 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Long l31 = this.fmvUpdatedAt;
        int iHashCode21 = (iHashCode20 + (l31 == null ? 0 : l31.hashCode())) * 31;
        String str11 = this.lastMid;
        int iHashCode22 = (iHashCode21 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Integer num = this.lastBidSize;
        int iHashCode23 = (iHashCode22 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.lastAskSize;
        int iHashCode24 = (iHashCode23 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.dayVolume;
        int iHashCode25 = (iHashCode24 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.openInterest;
        int iHashCode26 = (iHashCode25 + (num4 == null ? 0 : num4.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.impliedVolatility;
        int iHashCode27 = (iHashCode26 + (bigDecimal9 == null ? 0 : bigDecimal9.hashCode())) * 31;
        BigDecimal bigDecimal10 = this.delta;
        int iHashCode28 = (iHashCode27 + (bigDecimal10 == null ? 0 : bigDecimal10.hashCode())) * 31;
        BigDecimal bigDecimal11 = this.gamma;
        int iHashCode29 = (iHashCode28 + (bigDecimal11 == null ? 0 : bigDecimal11.hashCode())) * 31;
        BigDecimal bigDecimal12 = this.theta;
        int iHashCode30 = (iHashCode29 + (bigDecimal12 == null ? 0 : bigDecimal12.hashCode())) * 31;
        BigDecimal bigDecimal13 = this.vega;
        int iHashCode31 = (iHashCode30 + (bigDecimal13 == null ? 0 : bigDecimal13.hashCode())) * 31;
        BigDecimal bigDecimal14 = this.probabilityOfProfit;
        int iHashCode32 = (iHashCode31 + (bigDecimal14 == null ? 0 : bigDecimal14.hashCode())) * 31;
        String str12 = this.breakEven;
        int iHashCode33 = (iHashCode32 + (str12 == null ? 0 : str12.hashCode())) * 31;
        BigDecimal bigDecimal15 = this.effectiveLeverage;
        int iHashCode34 = (iHashCode33 + (bigDecimal15 == null ? 0 : bigDecimal15.hashCode())) * 31;
        Integer num5 = this.contractSize;
        int iHashCode35 = (iHashCode34 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str13 = this.unit;
        return iHashCode35 + (str13 != null ? str13.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Long getFmvUpdatedAt() {
        return this.fmvUpdatedAt;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final BigDecimal getGamma() {
        return this.gamma;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Boolean getHalted() {
        return this.halted;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final BigDecimal getImpliedVolatility() {
        return this.impliedVolatility;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getInstrument() {
        return this.instrument;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final long getLast() {
        return this.last;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getLastAsk() {
        return this.lastAsk;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final Integer getLastAskSize() {
        return this.lastAskSize;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getLastBid() {
        return this.lastBid;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Integer getLastBidSize() {
        return this.lastBidSize;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getLastClean() {
        return this.lastClean;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Long getLastClose() {
        return this.lastClose;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final BigDecimal getLastClosePrecise() {
        return this.lastClosePrecise;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final BigDecimal getLastCloseYtm() {
        return this.lastCloseYtm;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final String getLastFmv() {
        return this.lastFmv;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final String getLastMid() {
        return this.lastMid;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final BigDecimal getLastPrecise() {
        return this.lastPrecise;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final BigDecimal getLastYtm() {
        return this.lastYtm;
    }
}
