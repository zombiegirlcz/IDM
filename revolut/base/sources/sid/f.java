package sid;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\u0004R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b!\u0010\u0004R\u001c\u0010&\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010$\u001a\u0004\b\u0016\u0010%R\u001c\u0010)\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010%R\u001c\u0010.\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b'\u0010-R\u001c\u00103\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b\u0010\u00102R\u001a\u00106\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010\u0017\u001a\u0004\b5\u0010\u0019R\u001a\u00108\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010\u0017\u001a\u0004\b7\u0010\u0019R\u001a\u00109\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010\u0017\u001a\u0004\b4\u0010\u0019R\u001c\u0010=\u001a\u0004\u0018\u00010:8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b\u001b\u0010<R\u001c\u0010?\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010\u0006\u001a\u0004\b\u001d\u0010\u0004R\u001a\u0010@\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\"\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010A8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010B\u001a\u0004\b+\u0010CR\"\u0010F\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010A8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010B\u001a\u0004\b \u0010CR\u001c\u0010J\u001a\u0004\u0018\u00010G8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010H\u001a\u0004\bE\u0010IR\u001c\u0010K\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b0\u0010\u0004R\u001c\u0010O\u001a\u0004\u0018\u00010L8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010M\u001a\u0004\b>\u0010N¨\u0006P"}, d2 = {"Lsid/f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "r", "id", "b", "c", "adSetId", "adId", "d", "f", "brandId", "e", "u", "name", "t", "logoUrl", "", "g", "Z", "x", "()Z", "requiresManualActivation", "h", "activationState", "i", "y", "shortDescription", "j", "k", "description", "", "Ljava/lang/Double;", "()Ljava/lang/Double;", "cashbackPercentage", "l", "w", "pointsMultiplier", "Lsid/j;", "m", "Lsid/j;", "()Lsid/j;", "earningRate", "Lsid/d;", "n", "Lsid/d;", "()Lsid/d;", "badge", "o", "p", "hasPromoCode", "q", "hasWebhook", "hasProducts", "Lsid/g;", "Lsid/g;", "()Lsid/g;", "category", "s", "checkoutImageUrl", "analyticsRef", "", "Ljava/util/List;", "()Ljava/util/List;", "eligiblePaymentMethods", "v", "countries", "Lsid/s;", "Lsid/s;", "()Lsid/s;", "nearestOutlet", "endDate", "Lsid/n;", "Lsid/n;", "()Lsid/n;", "instalmentOption", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("adSetId")
    private final String adSetId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("adId")
    private final String adId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("brandId")
    @NotNull
    private final String brandId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("logoUrl")
    @NotNull
    private final String logoUrl;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("requiresManualActivation")
    private final boolean requiresManualActivation;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("activationState")
    private final String activationState;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("shortDescription")
    private final String shortDescription;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("cashbackPercentage")
    private final Double cashbackPercentage;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("pointsMultiplier")
    private final Double pointsMultiplier;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("earningRate")
    private final j earningRate;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("badge")
    private final d badge;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("hasPromoCode")
    private final boolean hasPromoCode;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("hasWebhook")
    private final boolean hasWebhook;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("hasProducts")
    private final boolean hasProducts;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("category")
    private final g category;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("checkoutImageUrl")
    private final String checkoutImageUrl;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("analyticsRef")
    @NotNull
    private final String analyticsRef;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("eligiblePaymentMethods")
    private final List<String> eligiblePaymentMethods;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("countries")
    private final List<String> countries;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b(alternate = {"outlet"}, value = "nearestOutlet")
    private final s nearestOutlet;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @lg.b("endDate")
    private final String endDate;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @lg.b("instalmentOption")
    private final n instalmentOption;

    public f(String id10, String str, String str2, String brandId, String name, String logoUrl, boolean z, String str3, String str4, String str5, Double d, Double d5, j jVar, d dVar, boolean z3, boolean z4, boolean z6, g gVar, String str6, String analyticsRef, List list, List list2, s sVar, String str7, n nVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(brandId, "brandId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        Intrinsics.checkNotNullParameter(analyticsRef, "analyticsRef");
        this.id = id10;
        this.adSetId = str;
        this.adId = str2;
        this.brandId = brandId;
        this.name = name;
        this.logoUrl = logoUrl;
        this.requiresManualActivation = z;
        this.activationState = str3;
        this.shortDescription = str4;
        this.description = str5;
        this.cashbackPercentage = d;
        this.pointsMultiplier = d5;
        this.earningRate = jVar;
        this.badge = dVar;
        this.hasPromoCode = z3;
        this.hasWebhook = z4;
        this.hasProducts = z6;
        this.category = gVar;
        this.checkoutImageUrl = str6;
        this.analyticsRef = analyticsRef;
        this.eligiblePaymentMethods = list;
        this.countries = list2;
        this.nearestOutlet = sVar;
        this.endDate = str7;
        this.instalmentOption = nVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getActivationState() {
        return this.activationState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAdId() {
        return this.adId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAdSetId() {
        return this.adSetId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getAnalyticsRef() {
        return this.analyticsRef;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final d getBadge() {
        return this.badge;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.id, fVar.id) && Intrinsics.f(this.adSetId, fVar.adSetId) && Intrinsics.f(this.adId, fVar.adId) && Intrinsics.f(this.brandId, fVar.brandId) && Intrinsics.f(this.name, fVar.name) && Intrinsics.f(this.logoUrl, fVar.logoUrl) && this.requiresManualActivation == fVar.requiresManualActivation && Intrinsics.f(this.activationState, fVar.activationState) && Intrinsics.f(this.shortDescription, fVar.shortDescription) && Intrinsics.f(this.description, fVar.description) && Intrinsics.f(this.cashbackPercentage, fVar.cashbackPercentage) && Intrinsics.f(this.pointsMultiplier, fVar.pointsMultiplier) && Intrinsics.f(this.earningRate, fVar.earningRate) && Intrinsics.f(this.badge, fVar.badge) && this.hasPromoCode == fVar.hasPromoCode && this.hasWebhook == fVar.hasWebhook && this.hasProducts == fVar.hasProducts && Intrinsics.f(this.category, fVar.category) && Intrinsics.f(this.checkoutImageUrl, fVar.checkoutImageUrl) && Intrinsics.f(this.analyticsRef, fVar.analyticsRef) && Intrinsics.f(this.eligiblePaymentMethods, fVar.eligiblePaymentMethods) && Intrinsics.f(this.countries, fVar.countries) && Intrinsics.f(this.nearestOutlet, fVar.nearestOutlet) && Intrinsics.f(this.endDate, fVar.endDate) && Intrinsics.f(this.instalmentOption, fVar.instalmentOption);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getBrandId() {
        return this.brandId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Double getCashbackPercentage() {
        return this.cashbackPercentage;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final g getCategory() {
        return this.category;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.adSetId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.adId;
        int iC = j6.a.c(p.a.c(p.a.c(p.a.c((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.brandId), 31, this.name), 31, this.logoUrl), 31, this.requiresManualActivation);
        String str3 = this.activationState;
        int iHashCode3 = (iC + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.shortDescription;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.description;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Double d = this.cashbackPercentage;
        int iHashCode6 = (iHashCode5 + (d == null ? 0 : d.hashCode())) * 31;
        Double d5 = this.pointsMultiplier;
        int iHashCode7 = (iHashCode6 + (d5 == null ? 0 : d5.hashCode())) * 31;
        j jVar = this.earningRate;
        int iHashCode8 = (iHashCode7 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        d dVar = this.badge;
        int iC2 = j6.a.c(j6.a.c(j6.a.c((iHashCode8 + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.hasPromoCode), 31, this.hasWebhook), 31, this.hasProducts);
        g gVar = this.category;
        int iHashCode9 = (iC2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        String str6 = this.checkoutImageUrl;
        int iC3 = p.a.c((iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.analyticsRef);
        List<String> list = this.eligiblePaymentMethods;
        int iHashCode10 = (iC3 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.countries;
        int iHashCode11 = (iHashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        s sVar = this.nearestOutlet;
        int iHashCode12 = (iHashCode11 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        String str7 = this.endDate;
        int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        n nVar = this.instalmentOption;
        return iHashCode13 + (nVar != null ? nVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getCheckoutImageUrl() {
        return this.checkoutImageUrl;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final List getCountries() {
        return this.countries;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final j getEarningRate() {
        return this.earningRate;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final List getEligiblePaymentMethods() {
        return this.eligiblePaymentMethods;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getHasProducts() {
        return this.hasProducts;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getHasPromoCode() {
        return this.hasPromoCode;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getHasWebhook() {
        return this.hasWebhook;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final n getInstalmentOption() {
        return this.instalmentOption;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final s getNearestOutlet() {
        return this.nearestOutlet;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final Double getPointsMultiplier() {
        return this.pointsMultiplier;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final boolean getRequiresManualActivation() {
        return this.requiresManualActivation;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final String getShortDescription() {
        return this.shortDescription;
    }
}
