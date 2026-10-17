package s6l;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0005\u0010\u001dR\"\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR \u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\"\u0010\u001dR\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010(\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0006\u001a\u0004\b'\u0010\u0004R\u001c\u0010*\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b)\u0010\u0004R\u001a\u0010,\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b+\u0010\u0004R\u001a\u0010-\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b&\u0010\u0004R\u001c\u0010/\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b.\u0010\u0004R\u001c\u00101\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b0\u0010\u0004R\u001c\u00104\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010\u0006\u001a\u0004\b3\u0010\u0004R\u001c\u00108\u001a\u0004\u0018\u0001058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u00106\u001a\u0004\b$\u00107R\u001c\u0010<\u001a\u0004\u0018\u0001098\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010:\u001a\u0004\b\u000f\u0010;R\u001c\u0010>\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b=\u0010\u0004R\u001c\u0010B\u001a\u0004\u0018\u00010?8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010@\u001a\u0004\b\u0015\u0010AR\u001c\u0010C\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b \u0010\u0004R\u001c\u0010H\u001a\u0004\u0018\u00010D8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\b2\u0010GR\u001c\u0010L\u001a\u0004\u0018\u00010I8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010J\u001a\u0004\bE\u0010K¨\u0006M"}, d2 = {"Ls6l/q;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "brand", "b", "h", "code", "m", "groupId", "", "d", "Z", "k", "()Z", "disposable", "Ls6l/o;", "e", "Ls6l/o;", "q", "()Ls6l/o;", "pricing", "", "f", "Ljava/util/List;", "()Ljava/util/List;", "assets3dTextures", "Ls6l/i;", "g", "cardLimits", "l", ib.b.Features, "i", "availabilityStatus", "j", "o", "lockReason", "u", "unlockHint", "t", "title", "description", "n", "groupName", "r", "productType", "p", "s", "subProductType", "Ls6l/k;", "Ls6l/k;", "()Ls6l/k;", "colorPicker", "Ls6l/d;", "Ls6l/d;", "()Ls6l/d;", "cardDesignCatalogueAssets", "w", "videoPreview", "Ls6l/g;", "Ls6l/g;", "()Ls6l/g;", "cardDesignVideoBackground", "cardProfileId", "Ljo3/b;", "v", "Ljo3/b;", "()Ljo3/b;", "monthlyFee", "Ls6l/p;", "Ls6l/p;", "()Ls6l/p;", "unlockRequirement", "feature_shared_cards_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class q {

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
    @lg.b("disposable")
    private final boolean disposable;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("pricing")
    @NotNull
    private final o pricing;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("assets3dTextures")
    @NotNull
    private final List<String> assets3dTextures;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("limits")
    private final List<i> cardLimits;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b(ib.b.Features)
    @NotNull
    private final List<String> features;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("availabilityStatus")
    private final String availabilityStatus;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("lockReason")
    private final String lockReason;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("unlockHint")
    private final String unlockHint;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    @NotNull
    private final String description;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("groupName")
    private final String groupName;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("productType")
    private final String productType;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("subProductType")
    private final String subProductType;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("colorPicker")
    private final k colorPicker;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("cardDesignCatalogueAssets")
    private final d cardDesignCatalogueAssets;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("videoPreview")
    private final String videoPreview;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("cardDesignVideoBackground")
    private final g cardDesignVideoBackground;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("cardProfileId")
    private final String cardProfileId;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("monthlyFee")
    private final jo3.b monthlyFee;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("unlockRequirement")
    private final p unlockRequirement;

    public q(String brand, String code, String groupId, boolean z, o pricing, List assets3dTextures, ArrayList arrayList, ArrayList features, String str, String str2, String str3, String title, String description, String str4, String str5, String str6, k kVar, d dVar, String str7, g gVar, String str8, jo3.b bVar, p pVar) {
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(pricing, "pricing");
        Intrinsics.checkNotNullParameter(assets3dTextures, "assets3dTextures");
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.brand = brand;
        this.code = code;
        this.groupId = groupId;
        this.disposable = z;
        this.pricing = pricing;
        this.assets3dTextures = assets3dTextures;
        this.cardLimits = arrayList;
        this.features = features;
        this.availabilityStatus = str;
        this.lockReason = str2;
        this.unlockHint = str3;
        this.title = title;
        this.description = description;
        this.groupName = str4;
        this.productType = str5;
        this.subProductType = str6;
        this.colorPicker = kVar;
        this.cardDesignCatalogueAssets = dVar;
        this.videoPreview = str7;
        this.cardDesignVideoBackground = gVar;
        this.cardProfileId = str8;
        this.monthlyFee = bVar;
        this.unlockRequirement = pVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAssets3dTextures() {
        return this.assets3dTextures;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAvailabilityStatus() {
        return this.availabilityStatus;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final d getCardDesignCatalogueAssets() {
        return this.cardDesignCatalogueAssets;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final g getCardDesignVideoBackground() {
        return this.cardDesignVideoBackground;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.brand, qVar.brand) && Intrinsics.f(this.code, qVar.code) && Intrinsics.f(this.groupId, qVar.groupId) && this.disposable == qVar.disposable && Intrinsics.f(this.pricing, qVar.pricing) && Intrinsics.f(this.assets3dTextures, qVar.assets3dTextures) && Intrinsics.f(this.cardLimits, qVar.cardLimits) && Intrinsics.f(this.features, qVar.features) && Intrinsics.f(this.availabilityStatus, qVar.availabilityStatus) && Intrinsics.f(this.lockReason, qVar.lockReason) && Intrinsics.f(this.unlockHint, qVar.unlockHint) && Intrinsics.f(this.title, qVar.title) && Intrinsics.f(this.description, qVar.description) && Intrinsics.f(this.groupName, qVar.groupName) && Intrinsics.f(this.productType, qVar.productType) && Intrinsics.f(this.subProductType, qVar.subProductType) && Intrinsics.f(this.colorPicker, qVar.colorPicker) && Intrinsics.f(this.cardDesignCatalogueAssets, qVar.cardDesignCatalogueAssets) && Intrinsics.f(this.videoPreview, qVar.videoPreview) && Intrinsics.f(this.cardDesignVideoBackground, qVar.cardDesignVideoBackground) && Intrinsics.f(this.cardProfileId, qVar.cardProfileId) && Intrinsics.f(this.monthlyFee, qVar.monthlyFee) && Intrinsics.f(this.unlockRequirement, qVar.unlockRequirement);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getCardLimits() {
        return this.cardLimits;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getCardProfileId() {
        return this.cardProfileId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    public final int hashCode() {
        int iD = p.a.d((this.pricing.hashCode() + j6.a.c(p.a.c(p.a.c(this.brand.hashCode() * 31, 31, this.code), 31, this.groupId), 31, this.disposable)) * 31, 31, this.assets3dTextures);
        List<i> list = this.cardLimits;
        int iD2 = p.a.d((iD + (list == null ? 0 : list.hashCode())) * 31, 31, this.features);
        String str = this.availabilityStatus;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lockReason;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.unlockHint;
        int iC = p.a.c(p.a.c((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.title), 31, this.description);
        String str4 = this.groupName;
        int iHashCode3 = (iC + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.productType;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.subProductType;
        int iHashCode5 = (iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        k kVar = this.colorPicker;
        int iHashCode6 = (iHashCode5 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        d dVar = this.cardDesignCatalogueAssets;
        int iHashCode7 = (iHashCode6 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str7 = this.videoPreview;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        g gVar = this.cardDesignVideoBackground;
        int iHashCode9 = (iHashCode8 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        String str8 = this.cardProfileId;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        jo3.b bVar = this.monthlyFee;
        int iHashCode11 = (iHashCode10 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        p pVar = this.unlockRequirement;
        return iHashCode11 + (pVar != null ? pVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final k getColorPicker() {
        return this.colorPicker;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getDisposable() {
        return this.disposable;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final List getFeatures() {
        return this.features;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getGroupName() {
        return this.groupName;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getLockReason() {
        return this.lockReason;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final jo3.b getMonthlyFee() {
        return this.monthlyFee;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final o getPricing() {
        return this.pricing;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getProductType() {
        return this.productType;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getSubProductType() {
        return this.subProductType;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getUnlockHint() {
        return this.unlockHint;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final p getUnlockRequirement() {
        return this.unlockRequirement;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final String getVideoPreview() {
        return this.videoPreview;
    }
}
