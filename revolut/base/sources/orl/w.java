package orl;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001a\u0010\u001d\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010#\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010)\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010,\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010\"R\u001c\u0010/\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010&\u001a\u0004\b.\u0010(R\u001c\u00102\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010\u0006\u001a\u0004\b1\u0010\u0004R\u001c\u00105\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b4\u0010\u0004R\u001c\u0010;\u001a\u0004\u0018\u0001068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001c\u0010>\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010\u0006\u001a\u0004\b=\u0010\u0004R(\u0010D\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010?8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001c\u0010J\u001a\u0004\u0018\u00010E8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I¨\u0006K"}, d2 = {"Lorl/w;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getSecurityRef", "securityRef", "b", "getCcyPair", "ccyPair", "c", "getSide", "side", "d", "getType", "type", "e", "getTimeInForce", "timeInForce", "f", "getExpirationDate", "expirationDate", "Lorl/r;", "g", "Lorl/r;", "getValue", "()Lorl/r;", "value", "Ljo3/a;", "h", "Ljo3/a;", "getClientPrice", "()Ljo3/a;", "clientPrice", "Lko3/a;", "i", "Lko3/a;", "getClientPricePrecise", "()Lko3/a;", "clientPricePrecise", "j", "getThresholdPrice", "thresholdPrice", "k", "getThresholdPricePrecise", "thresholdPricePrecise", "l", "getStartDate", "startDate", "m", "getPeriod", "period", "Lorl/s0;", "n", "Lorl/s0;", "getAutoTopUp", "()Lorl/s0;", "autoTopUp", "o", "getPositionId", "positionId", "", "p", "Ljava/util/Map;", "getAppliedPromotions", "()Ljava/util/Map;", "appliedPromotions", "Le4l/b;", "q", "Le4l/b;", "getExitStrategies", "()Le4l/b;", "exitStrategies", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("ref")
    private final String securityRef;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("ccyPair")
    private final String ccyPair;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("side")
    @NotNull
    private final String side;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("timeInForce")
    @NotNull
    private final String timeInForce;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("expirationDate")
    private final String expirationDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("value")
    @NotNull
    private final r value;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("clientPrice")
    private final jo3.a clientPrice;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("clientPricePrecise")
    private final ko3.a clientPricePrecise;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("thresholdPrice")
    private final jo3.a thresholdPrice;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("thresholdPricePrecise")
    private final ko3.a thresholdPricePrecise;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("startDate")
    private final String startDate;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("period")
    private final String period;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("autoTopup")
    private final s0 autoTopUp;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("positionId")
    private final String positionId;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("appliedPromotions")
    private final Map<String, String> appliedPromotions;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("exitStrategies")
    private final e4l.b exitStrategies;

    public w(String str, String str2, String side, String type, String timeInForce, String str3, r value, jo3.a aVar, ko3.a aVar2, jo3.a aVar3, ko3.a aVar4, String str4, String str5, s0 s0Var, String str6, e4l.b bVar) {
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        Intrinsics.checkNotNullParameter(value, "value");
        this.securityRef = str;
        this.ccyPair = str2;
        this.side = side;
        this.type = type;
        this.timeInForce = timeInForce;
        this.expirationDate = str3;
        this.value = value;
        this.clientPrice = aVar;
        this.clientPricePrecise = aVar2;
        this.thresholdPrice = aVar3;
        this.thresholdPricePrecise = aVar4;
        this.startDate = str4;
        this.period = str5;
        this.autoTopUp = s0Var;
        this.positionId = str6;
        this.appliedPromotions = null;
        this.exitStrategies = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.securityRef, wVar.securityRef) && Intrinsics.f(this.ccyPair, wVar.ccyPair) && Intrinsics.f(this.side, wVar.side) && Intrinsics.f(this.type, wVar.type) && Intrinsics.f(this.timeInForce, wVar.timeInForce) && Intrinsics.f(this.expirationDate, wVar.expirationDate) && Intrinsics.f(this.value, wVar.value) && Intrinsics.f(this.clientPrice, wVar.clientPrice) && Intrinsics.f(this.clientPricePrecise, wVar.clientPricePrecise) && Intrinsics.f(this.thresholdPrice, wVar.thresholdPrice) && Intrinsics.f(this.thresholdPricePrecise, wVar.thresholdPricePrecise) && Intrinsics.f(this.startDate, wVar.startDate) && Intrinsics.f(this.period, wVar.period) && Intrinsics.f(this.autoTopUp, wVar.autoTopUp) && Intrinsics.f(this.positionId, wVar.positionId) && Intrinsics.f(this.appliedPromotions, wVar.appliedPromotions) && Intrinsics.f(this.exitStrategies, wVar.exitStrategies);
    }

    public final int hashCode() {
        String str = this.securityRef;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.ccyPair;
        int iC = p.a.c(p.a.c(p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.side), 31, this.type), 31, this.timeInForce);
        String str3 = this.expirationDate;
        int iHashCode2 = (this.value.hashCode() + ((iC + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        jo3.a aVar = this.clientPrice;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        ko3.a aVar2 = this.clientPricePrecise;
        int iHashCode4 = (iHashCode3 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        jo3.a aVar3 = this.thresholdPrice;
        int iHashCode5 = (iHashCode4 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        ko3.a aVar4 = this.thresholdPricePrecise;
        int iHashCode6 = (iHashCode5 + (aVar4 == null ? 0 : aVar4.hashCode())) * 31;
        String str4 = this.startDate;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.period;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        s0 s0Var = this.autoTopUp;
        int iHashCode9 = (iHashCode8 + (s0Var == null ? 0 : s0Var.hashCode())) * 31;
        String str6 = this.positionId;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Map<String, String> map = this.appliedPromotions;
        int iHashCode11 = (iHashCode10 + (map == null ? 0 : map.hashCode())) * 31;
        e4l.b bVar = this.exitStrategies;
        return iHashCode11 + (bVar != null ? bVar.hashCode() : 0);
    }
}
