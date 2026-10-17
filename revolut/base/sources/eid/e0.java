package eid;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u001b\u0010\u0004R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u001d\u0010\u0004R\u001c\u0010#\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\f\u0010\"R\u001c\u0010'\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b\u0012\u0010&R\u001c\u0010,\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\u0017\u0010+R\u001c\u00101\u001a\u0004\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b\u001a\u00100R\u001c\u00105\u001a\u0004\u0018\u0001028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u00103\u001a\u0004\b)\u00104R\u001c\u0010:\u001a\u0004\u0018\u0001068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b\u0005\u00109R\u001c\u0010>\u001a\u0004\u0018\u00010;8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010<\u001a\u0004\b7\u0010=R\u001c\u0010B\u001a\u0004\u0018\u00010?8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010@\u001a\u0004\b \u0010AR\u001c\u0010F\u001a\u0004\u0018\u00010C8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010D\u001a\u0004\b\u0014\u0010ER\u001c\u0010J\u001a\u0004\u0018\u00010G8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010H\u001a\u0004\b\u000f\u0010IR\u001c\u0010O\u001a\u0004\u0018\u00010K8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\b.\u0010N¨\u0006P"}, d2 = {"Leid/e0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "i", "id", "b", "s", "type", "c", "r", "title", "d", "k", "logoUrl", "e", "backgroundImageUrl", "f", "q", "tallBackgroundImageUrl", "g", "n", "shortBackgroundImageUrl", "h", "p", "subtitle", "getLoyaltySubtitle", "loyaltySubtitle", "Leid/h;", "j", "Leid/h;", "()Leid/h;", "badge", "Leid/j;", "Leid/j;", "()Leid/j;", "campaignOffer", "Leid/m;", "l", "Leid/m;", "()Leid/m;", "deeplinkOffer", "Leid/o;", "m", "Leid/o;", "()Leid/o;", "frozenOffer", "Leid/z;", "Leid/z;", "()Leid/z;", "productOffer", "Leid/f;", "o", "Leid/f;", "()Leid/f;", "auctionOffer", "Leid/d0;", "Leid/d0;", "()Leid/d0;", "soldOutProductOffer", "Leid/v;", "Leid/v;", "()Leid/v;", "lockedProductOffer", "Leid/l;", "Leid/l;", "()Leid/l;", "comingSoonProductOffer", "Leid/i;", "Leid/i;", "()Leid/i;", "bid", "Leid/a0;", "t", "Leid/a0;", "()Leid/a0;", "purchase", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("logoUrl")
    private final String logoUrl;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("backgroundImageUrl")
    @NotNull
    private final String backgroundImageUrl;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("tallBackgroundImageUrl")
    private final String tallBackgroundImageUrl;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("shortBackgroundImageUrl")
    private final String shortBackgroundImageUrl;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("subtitle")
    private final String subtitle;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("loyaltySubtitle")
    private final String loyaltySubtitle;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("badge")
    private final h badge;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("campaignOffer")
    private final j campaignOffer;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("deeplinkOffer")
    private final m deeplinkOffer;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("frozenOffer")
    private final o frozenOffer;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("productOffer")
    private final z productOffer;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("auctionOffer")
    private final f auctionOffer;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("soldOutProductOffer")
    private final d0 soldOutProductOffer;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("lockedProductOffer")
    private final v lockedProductOffer;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("comingSoonProductOffer")
    private final l comingSoonProductOffer;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("bid")
    private final i bid;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("purchase")
    private final a0 purchase;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final f getAuctionOffer() {
        return this.auctionOffer;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final h getBadge() {
        return this.badge;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final i getBid() {
        return this.bid;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final j getCampaignOffer() {
        return this.campaignOffer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.id, e0Var.id) && Intrinsics.f(this.type, e0Var.type) && Intrinsics.f(this.title, e0Var.title) && Intrinsics.f(this.logoUrl, e0Var.logoUrl) && Intrinsics.f(this.backgroundImageUrl, e0Var.backgroundImageUrl) && Intrinsics.f(this.tallBackgroundImageUrl, e0Var.tallBackgroundImageUrl) && Intrinsics.f(this.shortBackgroundImageUrl, e0Var.shortBackgroundImageUrl) && Intrinsics.f(this.subtitle, e0Var.subtitle) && Intrinsics.f(this.loyaltySubtitle, e0Var.loyaltySubtitle) && Intrinsics.f(this.badge, e0Var.badge) && Intrinsics.f(this.campaignOffer, e0Var.campaignOffer) && Intrinsics.f(this.deeplinkOffer, e0Var.deeplinkOffer) && Intrinsics.f(this.frozenOffer, e0Var.frozenOffer) && Intrinsics.f(this.productOffer, e0Var.productOffer) && Intrinsics.f(this.auctionOffer, e0Var.auctionOffer) && Intrinsics.f(this.soldOutProductOffer, e0Var.soldOutProductOffer) && Intrinsics.f(this.lockedProductOffer, e0Var.lockedProductOffer) && Intrinsics.f(this.comingSoonProductOffer, e0Var.comingSoonProductOffer) && Intrinsics.f(this.bid, e0Var.bid) && Intrinsics.f(this.purchase, e0Var.purchase);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final l getComingSoonProductOffer() {
        return this.comingSoonProductOffer;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final m getDeeplinkOffer() {
        return this.deeplinkOffer;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final o getFrozenOffer() {
        return this.frozenOffer;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.type), 31, this.title);
        String str = this.logoUrl;
        int iC2 = p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.backgroundImageUrl);
        String str2 = this.tallBackgroundImageUrl;
        int iHashCode = (iC2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.shortBackgroundImageUrl;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subtitle;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.loyaltySubtitle;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        h hVar = this.badge;
        int iHashCode5 = (iHashCode4 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        j jVar = this.campaignOffer;
        int iHashCode6 = (iHashCode5 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        m mVar = this.deeplinkOffer;
        int iHashCode7 = (iHashCode6 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        o oVar = this.frozenOffer;
        int iHashCode8 = (iHashCode7 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        z zVar = this.productOffer;
        int iHashCode9 = (iHashCode8 + (zVar == null ? 0 : zVar.hashCode())) * 31;
        f fVar = this.auctionOffer;
        int iHashCode10 = (iHashCode9 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        d0 d0Var = this.soldOutProductOffer;
        int iHashCode11 = (iHashCode10 + (d0Var == null ? 0 : d0Var.hashCode())) * 31;
        v vVar = this.lockedProductOffer;
        int iHashCode12 = (iHashCode11 + (vVar == null ? 0 : vVar.hashCode())) * 31;
        l lVar = this.comingSoonProductOffer;
        int iHashCode13 = (iHashCode12 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        i iVar = this.bid;
        int iHashCode14 = (iHashCode13 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        a0 a0Var = this.purchase;
        return iHashCode14 + (a0Var != null ? a0Var.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final v getLockedProductOffer() {
        return this.lockedProductOffer;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final z getProductOffer() {
        return this.productOffer;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final a0 getPurchase() {
        return this.purchase;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getShortBackgroundImageUrl() {
        return this.shortBackgroundImageUrl;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final d0 getSoldOutProductOffer() {
        return this.soldOutProductOffer;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getTallBackgroundImageUrl() {
        return this.tallBackgroundImageUrl;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
