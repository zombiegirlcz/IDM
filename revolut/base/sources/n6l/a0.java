package n6l;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010 \u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u0005\u0010\u001fR\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\u0004R\u001c\u0010'\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010%\u001a\u0004\b\u0012\u0010&R \u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R\u001c\u0010-\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010/\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b.\u0010\u0004R\u001c\u00102\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010\u0006\u001a\u0004\b1\u0010\u0004R\u001c\u00104\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b3\u0010\u0004R\u001c\u00106\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010\u0006\u001a\u0004\b!\u0010\u0004R\u001c\u00107\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b0\u0010\u0004R\u001c\u00109\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010\u0006\u001a\u0004\b8\u0010\u0004R\u001c\u0010;\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010\u0006\u001a\u0004\b:\u0010\u0004R\u001c\u0010<\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b\u0018\u0010\u0004R\u001c\u0010@\u001a\u0004\u0018\u00010=8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010>\u001a\u0004\b5\u0010?R\u001c\u0010E\u001a\u0004\u0018\u00010A8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bB\u0010D¨\u0006F"}, d2 = {"Ln6l/a0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "brand", "b", "f", "code", "", "Z", "h", "()Z", "disposable", "Ln6l/i;", "d", "Ln6l/i;", "j", "()Ln6l/i;", "fee", "Ln6l/w;", "e", "Ln6l/w;", "o", "()Ln6l/w;", "pricing", "Ln6l/z;", "Ln6l/z;", "()Ln6l/z;", "assets", "g", "k", "group", "Ln6l/o;", "Ln6l/o;", "()Ln6l/o;", "cardLimits", "", "i", "Ljava/util/List;", "()Ljava/util/List;", ib.b.Features, "availabilityStatus", "m", "lockReason", "l", "s", "unlockHint", "r", "title", "n", "description", "groupName", "p", "productType", "q", "subProductType", "cardProfileId", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "monthlyFee", "Ln6l/x;", "t", "Ln6l/x;", "()Ln6l/x;", "unlockRequirement", "feature_shared_cards_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("brand")
    @NotNull
    private final String brand;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("code")
    @NotNull
    private final String code;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("disposable")
    private final boolean disposable;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("fee")
    private final i fee;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("price")
    private final w pricing;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("assets")
    private final z assets;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("group")
    private final String group;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("countLimits")
    private final o cardLimits;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b(ib.b.Features)
    @NotNull
    private final List<String> features;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("availabilityStatus")
    private final String availabilityStatus;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("lockReason")
    private final String lockReason;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("unlockHint")
    private final String unlockHint;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    private final String title;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("groupName")
    private final String groupName;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("productType")
    private final String productType;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("subProductType")
    private final String subProductType;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("cardProfileId")
    private final String cardProfileId;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("monthlyFee")
    private final jo3.a monthlyFee;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("unlockRequirement")
    private final x unlockRequirement;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final z getAssets() {
        return this.assets;
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
    public final o getCardLimits() {
        return this.cardLimits;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCardProfileId() {
        return this.cardProfileId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.brand, a0Var.brand) && Intrinsics.f(this.code, a0Var.code) && this.disposable == a0Var.disposable && Intrinsics.f(this.fee, a0Var.fee) && Intrinsics.f(this.pricing, a0Var.pricing) && Intrinsics.f(this.assets, a0Var.assets) && Intrinsics.f(this.group, a0Var.group) && Intrinsics.f(this.cardLimits, a0Var.cardLimits) && Intrinsics.f(this.features, a0Var.features) && Intrinsics.f(this.availabilityStatus, a0Var.availabilityStatus) && Intrinsics.f(this.lockReason, a0Var.lockReason) && Intrinsics.f(this.unlockHint, a0Var.unlockHint) && Intrinsics.f(this.title, a0Var.title) && Intrinsics.f(this.description, a0Var.description) && Intrinsics.f(this.groupName, a0Var.groupName) && Intrinsics.f(this.productType, a0Var.productType) && Intrinsics.f(this.subProductType, a0Var.subProductType) && Intrinsics.f(this.cardProfileId, a0Var.cardProfileId) && Intrinsics.f(this.monthlyFee, a0Var.monthlyFee) && Intrinsics.f(this.unlockRequirement, a0Var.unlockRequirement);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getDisposable() {
        return this.disposable;
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.c(this.brand.hashCode() * 31, 31, this.code), 31, this.disposable);
        i iVar = this.fee;
        int iHashCode = (iC + (iVar == null ? 0 : iVar.hashCode())) * 31;
        w wVar = this.pricing;
        int iHashCode2 = (iHashCode + (wVar == null ? 0 : wVar.hashCode())) * 31;
        z zVar = this.assets;
        int iHashCode3 = (iHashCode2 + (zVar == null ? 0 : zVar.hashCode())) * 31;
        String str = this.group;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        o oVar = this.cardLimits;
        int iD = p.a.d((iHashCode4 + (oVar == null ? 0 : oVar.hashCode())) * 31, 31, this.features);
        String str2 = this.availabilityStatus;
        int iHashCode5 = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lockReason;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.unlockHint;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.title;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.description;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.groupName;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.productType;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.subProductType;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.cardProfileId;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        jo3.a aVar = this.monthlyFee;
        int iHashCode14 = (iHashCode13 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        x xVar = this.unlockRequirement;
        return iHashCode14 + (xVar != null ? xVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final List getFeatures() {
        return this.features;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final i getFee() {
        return this.fee;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getGroup() {
        return this.group;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getGroupName() {
        return this.groupName;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getLockReason() {
        return this.lockReason;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final jo3.a getMonthlyFee() {
        return this.monthlyFee;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final w getPricing() {
        return this.pricing;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getProductType() {
        return this.productType;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getSubProductType() {
        return this.subProductType;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getUnlockHint() {
        return this.unlockHint;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final x getUnlockRequirement() {
        return this.unlockRequirement;
    }
}
