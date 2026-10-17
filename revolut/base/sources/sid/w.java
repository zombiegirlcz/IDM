package sid;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u001b\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\f\u0010\u001fR\u001c\u0010%\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0012\u0010$R\u001c\u0010)\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010'\u001a\u0004\b\u0017\u0010(R\u001c\u0010.\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b\u001a\u0010-R\u001c\u00103\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b+\u00102R\u001c\u00107\u001a\u0004\u0018\u0001048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u00105\u001a\u0004\b\u0005\u00106R\u001c\u0010<\u001a\u0004\u0018\u0001088\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b9\u0010;R\u001c\u0010@\u001a\u0004\u0018\u00010=8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010>\u001a\u0004\b\"\u0010?R\u001c\u0010D\u001a\u0004\u0018\u00010A8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010B\u001a\u0004\b\u0014\u0010CR\u001c\u0010H\u001a\u0004\u0018\u00010E8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010F\u001a\u0004\b\u000f\u0010GR\u001c\u0010L\u001a\u0004\u0018\u00010I8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010J\u001a\u0004\b0\u0010K¨\u0006M"}, d2 = {"Lsid/w;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "i", "id", "b", "s", "type", "c", "r", "title", "d", "k", "logoUrl", "e", "backgroundImageUrl", "f", "q", "tallBackgroundImageUrl", "g", "n", "shortBackgroundImageUrl", "h", "p", "subtitle", "Lsid/d;", "Lsid/d;", "()Lsid/d;", "badge", "Lsid/f;", "j", "Lsid/f;", "()Lsid/f;", "campaignOffer", "Lsid/i;", "Lsid/i;", "()Lsid/i;", "deeplinkOffer", "Lsid/k;", "l", "Lsid/k;", "()Lsid/k;", "frozenOffer", "Lsid/t;", "m", "Lsid/t;", "()Lsid/t;", "productOffer", "Lsid/b;", "Lsid/b;", "()Lsid/b;", "auctionOffer", "Lsid/v;", "o", "Lsid/v;", "()Lsid/v;", "soldOutProductOffer", "Lsid/p;", "Lsid/p;", "()Lsid/p;", "lockedProductOffer", "Lsid/h;", "Lsid/h;", "()Lsid/h;", "comingSoonProductOffer", "Lsid/e;", "Lsid/e;", "()Lsid/e;", "bid", "Lsid/u;", "Lsid/u;", "()Lsid/u;", "purchase", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class w {

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
    @lg.b("badge")
    private final d badge;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("campaignOffer")
    private final f campaignOffer;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("deeplinkOffer")
    private final i deeplinkOffer;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("frozenOffer")
    private final k frozenOffer;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("productOffer")
    private final t productOffer;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("auctionOffer")
    private final b auctionOffer;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("soldOutProductOffer")
    private final v soldOutProductOffer;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("lockedProductOffer")
    private final p lockedProductOffer;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("comingSoonProductOffer")
    private final h comingSoonProductOffer;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("bid")
    private final e bid;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("purchase")
    private final u purchase;

    public w(String id10, String type, String title, String str, String backgroundImageUrl, String str2, String str3, String str4, d dVar, f fVar, i iVar, k kVar, t tVar, b bVar, v vVar, p pVar, h hVar, e eVar, u uVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(backgroundImageUrl, "backgroundImageUrl");
        this.id = id10;
        this.type = type;
        this.title = title;
        this.logoUrl = str;
        this.backgroundImageUrl = backgroundImageUrl;
        this.tallBackgroundImageUrl = str2;
        this.shortBackgroundImageUrl = str3;
        this.subtitle = str4;
        this.badge = dVar;
        this.campaignOffer = fVar;
        this.deeplinkOffer = iVar;
        this.frozenOffer = kVar;
        this.productOffer = tVar;
        this.auctionOffer = bVar;
        this.soldOutProductOffer = vVar;
        this.lockedProductOffer = pVar;
        this.comingSoonProductOffer = hVar;
        this.bid = eVar;
        this.purchase = uVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getAuctionOffer() {
        return this.auctionOffer;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final d getBadge() {
        return this.badge;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final e getBid() {
        return this.bid;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final f getCampaignOffer() {
        return this.campaignOffer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.id, wVar.id) && Intrinsics.f(this.type, wVar.type) && Intrinsics.f(this.title, wVar.title) && Intrinsics.f(this.logoUrl, wVar.logoUrl) && Intrinsics.f(this.backgroundImageUrl, wVar.backgroundImageUrl) && Intrinsics.f(this.tallBackgroundImageUrl, wVar.tallBackgroundImageUrl) && Intrinsics.f(this.shortBackgroundImageUrl, wVar.shortBackgroundImageUrl) && Intrinsics.f(this.subtitle, wVar.subtitle) && Intrinsics.f(this.badge, wVar.badge) && Intrinsics.f(this.campaignOffer, wVar.campaignOffer) && Intrinsics.f(this.deeplinkOffer, wVar.deeplinkOffer) && Intrinsics.f(this.frozenOffer, wVar.frozenOffer) && Intrinsics.f(this.productOffer, wVar.productOffer) && Intrinsics.f(this.auctionOffer, wVar.auctionOffer) && Intrinsics.f(this.soldOutProductOffer, wVar.soldOutProductOffer) && Intrinsics.f(this.lockedProductOffer, wVar.lockedProductOffer) && Intrinsics.f(this.comingSoonProductOffer, wVar.comingSoonProductOffer) && Intrinsics.f(this.bid, wVar.bid) && Intrinsics.f(this.purchase, wVar.purchase);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final h getComingSoonProductOffer() {
        return this.comingSoonProductOffer;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final i getDeeplinkOffer() {
        return this.deeplinkOffer;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final k getFrozenOffer() {
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
        d dVar = this.badge;
        int iHashCode4 = (iHashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        f fVar = this.campaignOffer;
        int iHashCode5 = (iHashCode4 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        i iVar = this.deeplinkOffer;
        int iHashCode6 = (iHashCode5 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        k kVar = this.frozenOffer;
        int iHashCode7 = (iHashCode6 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        t tVar = this.productOffer;
        int iHashCode8 = (iHashCode7 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        b bVar = this.auctionOffer;
        int iHashCode9 = (iHashCode8 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        v vVar = this.soldOutProductOffer;
        int iHashCode10 = (iHashCode9 + (vVar == null ? 0 : vVar.hashCode())) * 31;
        p pVar = this.lockedProductOffer;
        int iHashCode11 = (iHashCode10 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        h hVar = this.comingSoonProductOffer;
        int iHashCode12 = (iHashCode11 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        e eVar = this.bid;
        int iHashCode13 = (iHashCode12 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        u uVar = this.purchase;
        return iHashCode13 + (uVar != null ? uVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final p getLockedProductOffer() {
        return this.lockedProductOffer;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final t getProductOffer() {
        return this.productOffer;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final u getPurchase() {
        return this.purchase;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getShortBackgroundImageUrl() {
        return this.shortBackgroundImageUrl;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final v getSoldOutProductOffer() {
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
