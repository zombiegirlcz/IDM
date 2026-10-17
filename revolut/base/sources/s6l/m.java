package s6l;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u001a\u0010 \u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004R\u001a\u0010%\u001a\u00020!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0005\u0010$R\u001c\u0010*\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010.\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010,\u001a\u0004\b\t\u0010-R\u001c\u00100\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u0011\u001a\u0004\b\f\u0010\u0013R\u001c\u00105\u001a\u0004\u0018\u0001018\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u00104R\u001c\u00109\u001a\u0004\u0018\u0001068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u00107\u001a\u0004\b\u001e\u00108R\u001c\u0010;\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010>\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010\u0006\u001a\u0004\b=\u0010\u0004R\u001c\u0010@\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b?\u0010\u0004R\u001a\u0010B\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\bA\u0010\u0004R\u001a\u0010D\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010\u0006\u001a\u0004\b<\u0010\u0004R\u001c\u0010E\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010\u0006\u001a\u0004\bC\u0010\u0004R\u001c\u0010H\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010\u0006\u001a\u0004\bG\u0010\u0004R\u001c\u0010J\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\bI\u0010\u0004R\u001c\u0010N\u001a\u0004\u0018\u00010K8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010L\u001a\u0004\b\u001b\u0010MR\u001c\u0010P\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\bO\u0010\u0004R\u001c\u0010Q\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010\u0006\u001a\u0004\b/\u0010\u0004R\u001c\u0010U\u001a\u0004\u0018\u00010R8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010S\u001a\u0004\b\"\u0010TR \u0010V\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010\u0017\u001a\u0004\b:\u0010\u0019R\u001c\u0010Z\u001a\u0004\u0018\u00010W8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010X\u001a\u0004\bF\u0010Y¨\u0006["}, d2 = {"Ls6l/m;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "brand", "b", "l", "code", "c", "q", "groupId", "Ls6l/o;", "d", "Ls6l/o;", "u", "()Ls6l/o;", "pricing", "", "Ls6l/i;", "Ljava/util/List;", "i", "()Ljava/util/List;", "cardLimits", "f", "p", ib.b.Features, "g", "j", "cardMaterial", "Ls6l/b;", "h", "Ls6l/b;", "()Ls6l/b;", "assets", "Ls6l/e;", "Ls6l/e;", "m", "()Ls6l/e;", "customisation", "Ls6l/c;", "Ls6l/c;", "()Ls6l/c;", "assumedDeliveryFee", "k", "assumedDeliveryPrice", "Ls6l/f;", "Ls6l/f;", "w", "()Ls6l/f;", "promoInfo", "Ls6l/g;", "Ls6l/g;", "()Ls6l/g;", "cardDesignVideoBackground", "n", "availabilityStatus", "o", "s", "lockReason", "z", "unlockHint", "y", "title", "r", "description", "groupName", "t", "v", "productType", "x", "subProductType", "Ls6l/d;", "Ls6l/d;", "()Ls6l/d;", "cardDesignCatalogueAssets", "A", "videoPreview", "cardProfileId", "Ls6l/h;", "Ls6l/h;", "()Ls6l/h;", "cardHolderName", "deliveryCountries", "Ljo3/b;", "Ljo3/b;", "()Ljo3/b;", "monthlyFee", "feature_shared_cards_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @lg.b("monthlyFee")
    private final jo3.b monthlyFee;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("brand")
    @NotNull
    private final String brand;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("code")
    @NotNull
    private final String code;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("groupId")
    @NotNull
    private final String groupId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("pricing")
    @NotNull
    private final o pricing;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("limits")
    private final List<i> cardLimits;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b(ib.b.Features)
    @NotNull
    private final List<String> features;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("cardMaterial")
    @NotNull
    private final String cardMaterial;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("assets")
    @NotNull
    private final b assets;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("customisation")
    private final e customisation;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("assumedDeliveryFee")
    private final c assumedDeliveryFee;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("assumedDeliveryPrice")
    private final o assumedDeliveryPrice;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("promoInfo")
    private final f promoInfo;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("cardDesignVideoBackground")
    private final g cardDesignVideoBackground;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("availabilityStatus")
    private final String availabilityStatus;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("lockReason")
    private final String lockReason;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("unlockHint")
    private final String unlockHint;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    @NotNull
    private final String description;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("groupName")
    private final String groupName;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("productType")
    private final String productType;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("subProductType")
    private final String subProductType;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("cardDesignCatalogueAssets")
    private final d cardDesignCatalogueAssets;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("videoPreview")
    private final String videoPreview;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @lg.b("cardProfileId")
    private final String cardProfileId;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @lg.b("cardHolderName")
    private final h cardHolderName;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @lg.b("deliveryCountries")
    @NotNull
    private final List<String> deliveryCountries;

    public m(String brand, String code, String groupId, o pricing, ArrayList arrayList, ArrayList features, String cardMaterial, b assets, e eVar, c cVar, o oVar, f fVar, g gVar, String str, String str2, String str3, String title, String description, String str4, String str5, String str6, d dVar, String str7, String str8, h hVar, ArrayList deliveryCountries, jo3.b bVar) {
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(pricing, "pricing");
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(cardMaterial, "cardMaterial");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(deliveryCountries, "deliveryCountries");
        this.brand = brand;
        this.code = code;
        this.groupId = groupId;
        this.pricing = pricing;
        this.cardLimits = arrayList;
        this.features = features;
        this.cardMaterial = cardMaterial;
        this.assets = assets;
        this.customisation = eVar;
        this.assumedDeliveryFee = cVar;
        this.assumedDeliveryPrice = oVar;
        this.promoInfo = fVar;
        this.cardDesignVideoBackground = gVar;
        this.availabilityStatus = str;
        this.lockReason = str2;
        this.unlockHint = str3;
        this.title = title;
        this.description = description;
        this.groupName = str4;
        this.productType = str5;
        this.subProductType = str6;
        this.cardDesignCatalogueAssets = dVar;
        this.videoPreview = str7;
        this.cardProfileId = str8;
        this.cardHolderName = hVar;
        this.deliveryCountries = deliveryCountries;
        this.monthlyFee = bVar;
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final String getVideoPreview() {
        return this.videoPreview;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getAssets() {
        return this.assets;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getAssumedDeliveryFee() {
        return this.assumedDeliveryFee;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final o getAssumedDeliveryPrice() {
        return this.assumedDeliveryPrice;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getAvailabilityStatus() {
        return this.availabilityStatus;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.brand, mVar.brand) && Intrinsics.f(this.code, mVar.code) && Intrinsics.f(this.groupId, mVar.groupId) && Intrinsics.f(this.pricing, mVar.pricing) && Intrinsics.f(this.cardLimits, mVar.cardLimits) && Intrinsics.f(this.features, mVar.features) && Intrinsics.f(this.cardMaterial, mVar.cardMaterial) && Intrinsics.f(this.assets, mVar.assets) && Intrinsics.f(this.customisation, mVar.customisation) && Intrinsics.f(this.assumedDeliveryFee, mVar.assumedDeliveryFee) && Intrinsics.f(this.assumedDeliveryPrice, mVar.assumedDeliveryPrice) && Intrinsics.f(this.promoInfo, mVar.promoInfo) && Intrinsics.f(this.cardDesignVideoBackground, mVar.cardDesignVideoBackground) && Intrinsics.f(this.availabilityStatus, mVar.availabilityStatus) && Intrinsics.f(this.lockReason, mVar.lockReason) && Intrinsics.f(this.unlockHint, mVar.unlockHint) && Intrinsics.f(this.title, mVar.title) && Intrinsics.f(this.description, mVar.description) && Intrinsics.f(this.groupName, mVar.groupName) && Intrinsics.f(this.productType, mVar.productType) && Intrinsics.f(this.subProductType, mVar.subProductType) && Intrinsics.f(this.cardDesignCatalogueAssets, mVar.cardDesignCatalogueAssets) && Intrinsics.f(this.videoPreview, mVar.videoPreview) && Intrinsics.f(this.cardProfileId, mVar.cardProfileId) && Intrinsics.f(this.cardHolderName, mVar.cardHolderName) && Intrinsics.f(this.deliveryCountries, mVar.deliveryCountries) && Intrinsics.f(this.monthlyFee, mVar.monthlyFee);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final d getCardDesignCatalogueAssets() {
        return this.cardDesignCatalogueAssets;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final g getCardDesignVideoBackground() {
        return this.cardDesignVideoBackground;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final h getCardHolderName() {
        return this.cardHolderName;
    }

    public final int hashCode() {
        int iHashCode = (this.pricing.hashCode() + p.a.c(p.a.c(this.brand.hashCode() * 31, 31, this.code), 31, this.groupId)) * 31;
        List<i> list = this.cardLimits;
        int iHashCode2 = (this.assets.hashCode() + p.a.c(p.a.d((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.features), 31, this.cardMaterial)) * 31;
        e eVar = this.customisation;
        int iHashCode3 = (iHashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        c cVar = this.assumedDeliveryFee;
        int iHashCode4 = (iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        o oVar = this.assumedDeliveryPrice;
        int iHashCode5 = (iHashCode4 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        f fVar = this.promoInfo;
        int iHashCode6 = (iHashCode5 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        g gVar = this.cardDesignVideoBackground;
        int iHashCode7 = (iHashCode6 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        String str = this.availabilityStatus;
        int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lockReason;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.unlockHint;
        int iC = p.a.c(p.a.c((iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.title), 31, this.description);
        String str4 = this.groupName;
        int iHashCode10 = (iC + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.productType;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.subProductType;
        int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        d dVar = this.cardDesignCatalogueAssets;
        int iHashCode13 = (iHashCode12 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str7 = this.videoPreview;
        int iHashCode14 = (iHashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.cardProfileId;
        int iHashCode15 = (iHashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        h hVar = this.cardHolderName;
        int iD = p.a.d((iHashCode15 + (hVar == null ? 0 : hVar.hashCode())) * 31, 31, this.deliveryCountries);
        jo3.b bVar = this.monthlyFee;
        return iD + (bVar != null ? bVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final List getCardLimits() {
        return this.cardLimits;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getCardMaterial() {
        return this.cardMaterial;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getCardProfileId() {
        return this.cardProfileId;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final e getCustomisation() {
        return this.customisation;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final List getDeliveryCountries() {
        return this.deliveryCountries;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final List getFeatures() {
        return this.features;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getGroupName() {
        return this.groupName;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getLockReason() {
        return this.lockReason;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final jo3.b getMonthlyFee() {
        return this.monthlyFee;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final o getPricing() {
        return this.pricing;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final String getProductType() {
        return this.productType;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final f getPromoInfo() {
        return this.promoInfo;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final String getSubProductType() {
        return this.subProductType;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final String getUnlockHint() {
        return this.unlockHint;
    }
}
