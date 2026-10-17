package fdl;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010\u0019\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R.\u0010 \u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001a\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010%\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\"\u001a\u0004\b#\u0010$R \u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b\u0005\u0010\u001fR\u001a\u0010)\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010+\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001a\u0010,\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u00100\u001a\u00020-8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010.\u001a\u0004\b*\u0010/R\u001c\u00104\u001a\u0004\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b&\u00103R\u001c\u00106\u001a\u0004\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b5\u00103R\u001c\u00107\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b1\u0010\u0004R\u001c\u0010:\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010\u0006\u001a\u0004\b9\u0010\u0004R(\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001aj\u0004\u0018\u0001`;8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b(\u0010\u001fR\u001c\u0010@\u001a\u0004\u0018\u00010=8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\b\u001c\u0010?R\u001c\u0010A\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b8\u0010\u0004R\u001c\u0010E\u001a\u0004\u0018\u00010B8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010C\u001a\u0004\b\f\u0010D¨\u0006F"}, d2 = {"Lfdl/u0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "id", "b", "l", "ref", "c", "s", "type", "d", "h", "name", "r", "ticker", "Lfdl/x0;", "f", "Lfdl/x0;", "p", "()Lfdl/x0;", "stateDetails", "", "Lcom/revolut/shared/feature/wealth/domain/impl/data/network/model/RequiredProductsMatrixDto;", "g", "Ljava/util/List;", "m", "()Ljava/util/List;", "requiredProducts", "Lfdl/h;", "Lfdl/h;", "t", "()Lfdl/h;", "typeSpecificProperties", "i", "allSymbols", "j", "currency", "k", "isin", "exchange", "", "I", "()I", "quantityDecimalPlaces", "n", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "priceDecimalPlaces", "o", "sortOrder", "shortOverview", "q", "u", "underlyingCurrency", "Lcom/revolut/shared/feature/wealth/domain/impl/data/network/model/PromotionCampaignsDto;", "promotionCampaigns", "Lfdl/v0;", "Lfdl/v0;", "()Lfdl/v0;", "listStatus", "stateReason", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "delistDate", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("ref")
    @NotNull
    private final String ref;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("ticker")
    @NotNull
    private final String ticker;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("stateDetails")
    @NotNull
    private final x0 stateDetails;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("requiredProducts")
    private final List<List<String>> requiredProducts;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("typeSpecificProperties")
    private final h typeSpecificProperties;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("allSymbols")
    @NotNull
    private final List<String> allSymbols;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("isin")
    private final String isin;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("exchange")
    @NotNull
    private final String exchange;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("quantityDecimalPlaces")
    private final int quantityDecimalPlaces;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("priceDecimalPlaces")
    private final Integer priceDecimalPlaces;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("sortOrder")
    private final Integer sortOrder;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("shortOverview")
    private final String shortOverview;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("underlyingCurrency")
    private final String underlyingCurrency;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("promotionCampaigns")
    private final List<String> promotionCampaigns;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("listStatus")
    private final v0 listStatus;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("stateReason")
    private final String stateReason;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("delistDate")
    private final Long delistDate;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAllSymbols() {
        return this.allSymbols;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getDelistDate() {
        return this.delistDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getExchange() {
        return this.exchange;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj2;
        return Intrinsics.f(this.id, u0Var.id) && Intrinsics.f(this.ref, u0Var.ref) && Intrinsics.f(this.type, u0Var.type) && Intrinsics.f(this.name, u0Var.name) && Intrinsics.f(this.ticker, u0Var.ticker) && Intrinsics.f(this.stateDetails, u0Var.stateDetails) && Intrinsics.f(this.requiredProducts, u0Var.requiredProducts) && Intrinsics.f(this.typeSpecificProperties, u0Var.typeSpecificProperties) && Intrinsics.f(this.allSymbols, u0Var.allSymbols) && Intrinsics.f(this.currency, u0Var.currency) && Intrinsics.f(this.isin, u0Var.isin) && Intrinsics.f(this.exchange, u0Var.exchange) && this.quantityDecimalPlaces == u0Var.quantityDecimalPlaces && Intrinsics.f(this.priceDecimalPlaces, u0Var.priceDecimalPlaces) && Intrinsics.f(this.sortOrder, u0Var.sortOrder) && Intrinsics.f(this.shortOverview, u0Var.shortOverview) && Intrinsics.f(this.underlyingCurrency, u0Var.underlyingCurrency) && Intrinsics.f(this.promotionCampaigns, u0Var.promotionCampaigns) && Intrinsics.f(this.listStatus, u0Var.listStatus) && Intrinsics.f(this.stateReason, u0Var.stateReason) && Intrinsics.f(this.delistDate, u0Var.delistDate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getIsin() {
        return this.isin;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final v0 getListStatus() {
        return this.listStatus;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final int hashCode() {
        int iHashCode = (this.stateDetails.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.ref), 31, this.type), 31, this.name), 31, this.ticker)) * 31;
        List<List<String>> list = this.requiredProducts;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        h hVar = this.typeSpecificProperties;
        int iC = p.a.c(p.a.d((iHashCode2 + (hVar == null ? 0 : hVar.hashCode())) * 31, 31, this.allSymbols), 31, this.currency);
        String str = this.isin;
        int iB = j6.a.b(this.quantityDecimalPlaces, p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.exchange), 31);
        Integer num = this.priceDecimalPlaces;
        int iHashCode3 = (iB + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.sortOrder;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.shortOverview;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.underlyingCurrency;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list2 = this.promotionCampaigns;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        v0 v0Var = this.listStatus;
        int iHashCode8 = (iHashCode7 + (v0Var == null ? 0 : v0Var.hashCode())) * 31;
        String str4 = this.stateReason;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l2 = this.delistDate;
        return iHashCode9 + (l2 != null ? l2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Integer getPriceDecimalPlaces() {
        return this.priceDecimalPlaces;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final List getPromotionCampaigns() {
        return this.promotionCampaigns;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getQuantityDecimalPlaces() {
        return this.quantityDecimalPlaces;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getRef() {
        return this.ref;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final List getRequiredProducts() {
        return this.requiredProducts;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getShortOverview() {
        return this.shortOverview;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Integer getSortOrder() {
        return this.sortOrder;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final x0 getStateDetails() {
        return this.stateDetails;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getStateReason() {
        return this.stateReason;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getTicker() {
        return this.ticker;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final h getTypeSpecificProperties() {
        return this.typeSpecificProperties;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getUnderlyingCurrency() {
        return this.underlyingCurrency;
    }
}
