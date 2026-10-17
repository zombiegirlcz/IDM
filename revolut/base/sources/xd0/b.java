package xd0;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0018\u0010\u0004R\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\b\u0010\u0004R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0010\u0010\u001eR\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R(\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010#\u001a\u0004\b\u001c\u0010$R(\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010#\u001a\u0004\b \u0010$R\u001c\u0010+\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010/\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010-\u001a\u0004\b\u001a\u0010.¨\u00060"}, d2 = {"Lxd0/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "code", "b", "f", "genericLocalizedName", "", "c", "I", "()I", "decimals", "d", "m", "type", "e", "k", "symbol", "l", "ticker", "g", "lightIconUrl", "h", "darkIconUrl", "i", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "displayDecimals", "j", "displayPattern", "", "Ljava/util/Map;", "()Ljava/util/Map;", "specificLocalizedNames", "specificLocalizedSymbols", "", "Ljava/lang/Boolean;", "n", "()Ljava/lang/Boolean;", "isStablecoin", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "settlementDate", "core_currency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("code")
    @NotNull
    private final String code;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("genericLocalizedName")
    @NotNull
    private final String genericLocalizedName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("decimals")
    private final int decimals;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("symbol")
    @NotNull
    private final String symbol;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("ticker")
    @NotNull
    private final String ticker;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("lightIconUrl")
    @NotNull
    private final String lightIconUrl;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("darkIconUrl")
    @NotNull
    private final String darkIconUrl;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("displayDecimals")
    private final Integer displayDecimals;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("displayPattern")
    private final String displayPattern;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("specificLocalizedNames")
    private final Map<String, String> specificLocalizedNames;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("specificLocalizedSymbols")
    private final Map<String, String> specificLocalizedSymbols;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("isStablecoin")
    private final Boolean isStablecoin;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("settlementDate")
    private final Long settlementDate;

    public b(String code, String genericLocalizedName, int i, String type, String symbol, String ticker, String lightIconUrl, String darkIconUrl, Integer num, String str, Map map, Map map2, Boolean bool, Long l2) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(genericLocalizedName, "genericLocalizedName");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ticker, "ticker");
        Intrinsics.checkNotNullParameter(lightIconUrl, "lightIconUrl");
        Intrinsics.checkNotNullParameter(darkIconUrl, "darkIconUrl");
        this.code = code;
        this.genericLocalizedName = genericLocalizedName;
        this.decimals = i;
        this.type = type;
        this.symbol = symbol;
        this.ticker = ticker;
        this.lightIconUrl = lightIconUrl;
        this.darkIconUrl = darkIconUrl;
        this.displayDecimals = num;
        this.displayPattern = str;
        this.specificLocalizedNames = map;
        this.specificLocalizedSymbols = map2;
        this.isStablecoin = bool;
        this.settlementDate = l2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDarkIconUrl() {
        return this.darkIconUrl;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getDecimals() {
        return this.decimals;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getDisplayDecimals() {
        return this.displayDecimals;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDisplayPattern() {
        return this.displayPattern;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.code, bVar.code) && Intrinsics.f(this.genericLocalizedName, bVar.genericLocalizedName) && this.decimals == bVar.decimals && Intrinsics.f(this.type, bVar.type) && Intrinsics.f(this.symbol, bVar.symbol) && Intrinsics.f(this.ticker, bVar.ticker) && Intrinsics.f(this.lightIconUrl, bVar.lightIconUrl) && Intrinsics.f(this.darkIconUrl, bVar.darkIconUrl) && Intrinsics.f(this.displayDecimals, bVar.displayDecimals) && Intrinsics.f(this.displayPattern, bVar.displayPattern) && Intrinsics.f(this.specificLocalizedNames, bVar.specificLocalizedNames) && Intrinsics.f(this.specificLocalizedSymbols, bVar.specificLocalizedSymbols) && Intrinsics.f(this.isStablecoin, bVar.isStablecoin) && Intrinsics.f(this.settlementDate, bVar.settlementDate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getGenericLocalizedName() {
        return this.genericLocalizedName;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getLightIconUrl() {
        return this.lightIconUrl;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Long getSettlementDate() {
        return this.settlementDate;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(j6.a.b(this.decimals, p.a.c(this.code.hashCode() * 31, 31, this.genericLocalizedName), 31), 31, this.type), 31, this.symbol), 31, this.ticker), 31, this.lightIconUrl), 31, this.darkIconUrl);
        Integer num = this.displayDecimals;
        int iHashCode = (iC + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.displayPattern;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, String> map = this.specificLocalizedNames;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.specificLocalizedSymbols;
        int iHashCode4 = (iHashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Boolean bool = this.isStablecoin;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l2 = this.settlementDate;
        return iHashCode5 + (l2 != null ? l2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Map getSpecificLocalizedNames() {
        return this.specificLocalizedNames;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Map getSpecificLocalizedSymbols() {
        return this.specificLocalizedSymbols;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getTicker() {
        return this.ticker;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Boolean getIsStablecoin() {
        return this.isStablecoin;
    }
}
