package va6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u0000 92\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010\u0019\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\u0004R\u001a\u0010 \u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010$\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b\u0011\u0010#R\u001a\u0010)\u001a\u00020%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010*\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001a\u0010+\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010/\u001a\u00020,8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b\u001c\u0010.R\u001a\u00105\u001a\u0002008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u00106\u001a\u00020%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010&\u001a\u0004\b\u001f\u0010(R\u001c\u00107\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u00108\u001a\u00020%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010&\u001a\u0004\b1\u0010(¨\u0006:"}, d2 = {"Lva6/g;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "k", "id", "b", "m", "name", "c", "n", "pocketId", "d", "brief", "e", "g", "description", "Lva6/h;", "f", "Lva6/h;", "r", "()Lva6/h;", "totalDonation", "l", "myDonation", "h", "j", "iconUrl", "i", "bannerUrl", "Lva6/a;", "Lva6/a;", "()Lva6/a;", "campaign", "", "Z", "q", "()Z", "shareable", "code", "availabilityArea", "", "J", "()J", "donorsCount", "", "o", "I", "p", "()I", "rank", "featured", "availability", "pointsRedemptionAvailable", "Companion", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("pocketId")
    @NotNull
    private final String pocketId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("brief")
    @NotNull
    private final String brief;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("description")
    @NotNull
    private final String description;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("totalDonation")
    @NotNull
    private final h totalDonation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("myDonation")
    @NotNull
    private final h myDonation;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("iconUrl")
    @NotNull
    private final String iconUrl;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("bannerUrl")
    @NotNull
    private final String bannerUrl;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("campaign")
    private final a campaign;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("shareable")
    private final boolean shareable;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("code")
    @NotNull
    private final String code;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("availabilityArea")
    @NotNull
    private final String availabilityArea;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("donorsCount")
    private final long donorsCount;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("rank")
    private final int rank;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("featured")
    private final boolean featured;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("availability")
    private final String availability;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("pointsRedemptionAvailable")
    private final boolean pointsRedemptionAvailable;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAvailability() {
        return this.availability;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAvailabilityArea() {
        return this.availabilityArea;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBannerUrl() {
        return this.bannerUrl;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getBrief() {
        return this.brief;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final a getCampaign() {
        return this.campaign;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.id, gVar.id) && Intrinsics.f(this.name, gVar.name) && Intrinsics.f(this.pocketId, gVar.pocketId) && Intrinsics.f(this.brief, gVar.brief) && Intrinsics.f(this.description, gVar.description) && Intrinsics.f(this.totalDonation, gVar.totalDonation) && Intrinsics.f(this.myDonation, gVar.myDonation) && Intrinsics.f(this.iconUrl, gVar.iconUrl) && Intrinsics.f(this.bannerUrl, gVar.bannerUrl) && Intrinsics.f(this.campaign, gVar.campaign) && this.shareable == gVar.shareable && Intrinsics.f(this.code, gVar.code) && Intrinsics.f(this.availabilityArea, gVar.availabilityArea) && this.donorsCount == gVar.donorsCount && this.rank == gVar.rank && this.featured == gVar.featured && Intrinsics.f(this.availability, gVar.availability) && this.pointsRedemptionAvailable == gVar.pointsRedemptionAvailable;
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
    public final long getDonorsCount() {
        return this.donorsCount;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c((this.myDonation.hashCode() + ((this.totalDonation.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.name), 31, this.pocketId), 31, this.brief), 31, this.description)) * 31)) * 31, 31, this.iconUrl), 31, this.bannerUrl);
        a aVar = this.campaign;
        int iC2 = j6.a.c(j6.a.b(this.rank, a0.d.c(p.a.c(p.a.c(j6.a.c((iC + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.shareable), 31, this.code), 31, this.availabilityArea), 31, this.donorsCount), 31), 31, this.featured);
        String str = this.availability;
        return Boolean.hashCode(this.pointsRedemptionAvailable) + ((iC2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getFeatured() {
        return this.featured;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final h getMyDonation() {
        return this.myDonation;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getPocketId() {
        return this.pocketId;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getPointsRedemptionAvailable() {
        return this.pointsRedemptionAvailable;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final int getRank() {
        return this.rank;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getShareable() {
        return this.shareable;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final h getTotalDonation() {
        return this.totalDonation;
    }
}
