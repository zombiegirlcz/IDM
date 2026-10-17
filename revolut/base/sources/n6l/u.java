package n6l;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010%\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010*\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u0005\u0010)R\u001c\u0010.\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b\t\u0010-R\u001c\u0010/\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\"\u001a\u0004\b\f\u0010$R\u001c\u00105\u001a\u0004\u0018\u0001008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001c\u0010:\u001a\u0004\u0018\u0001068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b!\u00109R\u001c\u0010;\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010=\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b<\u0010\u0004R\u001c\u0010?\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b>\u0010\u0004R\u001c\u0010B\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010\u0006\u001a\u0004\bA\u0010\u0004R\u001c\u0010C\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010\u0006\u001a\u0004\b7\u0010\u0004R\u001c\u0010E\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010\u0006\u001a\u0004\b@\u0010\u0004R\u001c\u0010G\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\bF\u0010\u0004R\u001c\u0010I\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010\u0006\u001a\u0004\bH\u0010\u0004R\u001c\u0010J\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b'\u0010\u0004R\u001c\u0010N\u001a\u0004\u0018\u00010K8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010L\u001a\u0004\b\u001b\u0010MR\"\u0010O\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010\u0011\u001a\u0004\b1\u0010\u0013R\u001c\u0010S\u001a\u0004\u0018\u00010P8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010Q\u001a\u0004\bD\u0010R¨\u0006T"}, d2 = {"Ln6l/u;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "brand", "b", "i", "code", "c", "o", "group", "", "d", "Ljava/util/List;", "m", "()Ljava/util/List;", ib.b.Features, "Ln6l/f;", "Ln6l/f;", "j", "()Ln6l/f;", "customisation", "Ln6l/i;", "f", "Ln6l/i;", "n", "()Ln6l/i;", "fee", "Ln6l/w;", "g", "Ln6l/w;", "s", "()Ln6l/w;", "pricing", "Ln6l/d;", "h", "Ln6l/d;", "()Ln6l/d;", "assetsDto", "Ln6l/h;", "Ln6l/h;", "()Ln6l/h;", "assumedDeliveryFee", "assumedDeliveryPrice", "Ln6l/j;", "k", "Ln6l/j;", "u", "()Ln6l/j;", "promo", "Ln6l/o;", "l", "Ln6l/o;", "()Ln6l/o;", "cardLimits", "availabilityStatus", "q", "lockReason", "x", "unlockHint", "p", "w", "title", "description", "r", "groupName", "t", "productType", "v", "subProductType", "cardProfileId", "Ln6l/l;", "Ln6l/l;", "()Ln6l/l;", "cardHolderName", "deliveryCountries", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "monthlyFee", "feature_shared_cards_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("brand")
    @NotNull
    private final String brand;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("code")
    @NotNull
    private final String code;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("group")
    private final String group;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b(ib.b.Features)
    @NotNull
    private final List<String> features;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("customisation")
    private final f customisation;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("fee")
    private final i fee;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("price")
    private final w pricing;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("assets")
    private final d assetsDto;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("assumedDeliveryFee")
    private final h assumedDeliveryFee;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("assumedDeliveryPrice")
    private final w assumedDeliveryPrice;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("promo")
    private final j promo;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("countLimits")
    private final o cardLimits;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("availabilityStatus")
    private final String availabilityStatus;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("lockReason")
    private final String lockReason;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("unlockHint")
    private final String unlockHint;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    private final String title;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("groupName")
    private final String groupName;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("productType")
    private final String productType;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("subProductType")
    private final String subProductType;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("cardProfileId")
    private final String cardProfileId;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("cardHolderName")
    private final l cardHolderName;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("deliveryCountries")
    private final List<String> deliveryCountries;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @lg.b("monthlyFee")
    private final jo3.a monthlyFee;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final d getAssetsDto() {
        return this.assetsDto;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final h getAssumedDeliveryFee() {
        return this.assumedDeliveryFee;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final w getAssumedDeliveryPrice() {
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
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.brand, uVar.brand) && Intrinsics.f(this.code, uVar.code) && Intrinsics.f(this.group, uVar.group) && Intrinsics.f(this.features, uVar.features) && Intrinsics.f(this.customisation, uVar.customisation) && Intrinsics.f(this.fee, uVar.fee) && Intrinsics.f(this.pricing, uVar.pricing) && Intrinsics.f(this.assetsDto, uVar.assetsDto) && Intrinsics.f(this.assumedDeliveryFee, uVar.assumedDeliveryFee) && Intrinsics.f(this.assumedDeliveryPrice, uVar.assumedDeliveryPrice) && Intrinsics.f(this.promo, uVar.promo) && Intrinsics.f(this.cardLimits, uVar.cardLimits) && Intrinsics.f(this.availabilityStatus, uVar.availabilityStatus) && Intrinsics.f(this.lockReason, uVar.lockReason) && Intrinsics.f(this.unlockHint, uVar.unlockHint) && Intrinsics.f(this.title, uVar.title) && Intrinsics.f(this.description, uVar.description) && Intrinsics.f(this.groupName, uVar.groupName) && Intrinsics.f(this.productType, uVar.productType) && Intrinsics.f(this.subProductType, uVar.subProductType) && Intrinsics.f(this.cardProfileId, uVar.cardProfileId) && Intrinsics.f(this.cardHolderName, uVar.cardHolderName) && Intrinsics.f(this.deliveryCountries, uVar.deliveryCountries) && Intrinsics.f(this.monthlyFee, uVar.monthlyFee);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final l getCardHolderName() {
        return this.cardHolderName;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final o getCardLimits() {
        return this.cardLimits;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getCardProfileId() {
        return this.cardProfileId;
    }

    public final int hashCode() {
        int iC = p.a.c(this.brand.hashCode() * 31, 31, this.code);
        String str = this.group;
        int iD = p.a.d((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.features);
        f fVar = this.customisation;
        int iHashCode = (iD + (fVar == null ? 0 : fVar.hashCode())) * 31;
        i iVar = this.fee;
        int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        w wVar = this.pricing;
        int iHashCode3 = (iHashCode2 + (wVar == null ? 0 : wVar.hashCode())) * 31;
        d dVar = this.assetsDto;
        int iHashCode4 = (iHashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        h hVar = this.assumedDeliveryFee;
        int iHashCode5 = (iHashCode4 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        w wVar2 = this.assumedDeliveryPrice;
        int iHashCode6 = (iHashCode5 + (wVar2 == null ? 0 : wVar2.hashCode())) * 31;
        j jVar = this.promo;
        int iHashCode7 = (iHashCode6 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        o oVar = this.cardLimits;
        int iHashCode8 = (iHashCode7 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        String str2 = this.availabilityStatus;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lockReason;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.unlockHint;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.title;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.description;
        int iHashCode13 = (iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.groupName;
        int iHashCode14 = (iHashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.productType;
        int iHashCode15 = (iHashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.subProductType;
        int iHashCode16 = (iHashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.cardProfileId;
        int iHashCode17 = (iHashCode16 + (str10 == null ? 0 : str10.hashCode())) * 31;
        l lVar = this.cardHolderName;
        int iHashCode18 = (iHashCode17 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        List<String> list = this.deliveryCountries;
        int iHashCode19 = (iHashCode18 + (list == null ? 0 : list.hashCode())) * 31;
        jo3.a aVar = this.monthlyFee;
        return iHashCode19 + (aVar != null ? aVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final f getCustomisation() {
        return this.customisation;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final List getDeliveryCountries() {
        return this.deliveryCountries;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final List getFeatures() {
        return this.features;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final i getFee() {
        return this.fee;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getGroup() {
        return this.group;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getGroupName() {
        return this.groupName;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getLockReason() {
        return this.lockReason;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final jo3.a getMonthlyFee() {
        return this.monthlyFee;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final w getPricing() {
        return this.pricing;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getProductType() {
        return this.productType;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final j getPromo() {
        return this.promo;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final String getSubProductType() {
        return this.subProductType;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final String getUnlockHint() {
        return this.unlockHint;
    }
}
