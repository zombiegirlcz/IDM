package hkc;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0015\u0010\u001cR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\t\u0010\u0004¨\u0006\u001f"}, d2 = {"Lhkc/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "h", "entityId", "b", "d", "badgeType", "c", "i", "logoUrl", "backgroundImageUrl", "e", "k", "title", "f", "description", "g", "j", "loyaltyDescription", "deepLink", "activation", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "endDate", "analyticsRef", "feature_retail_rewards_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("entityId")
    private final String entityId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("badgeType")
    private final String badgeType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @b("logoUrl")
    @NotNull
    private final String logoUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @b("backgroundImageUrl")
    @NotNull
    private final String backgroundImageUrl;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @b("description")
    @NotNull
    private final String description;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @b("loyaltyDescription")
    private final String loyaltyDescription;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @b("deepLink")
    @NotNull
    private final String deepLink;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @b("activation")
    private final String activation;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @b("endDate")
    private final Long endDate;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @b("analyticsRef")
    private final String analyticsRef;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getActivation() {
        return this.activation;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAnalyticsRef() {
        return this.analyticsRef;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getBadgeType() {
        return this.badgeType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDeepLink() {
        return this.deepLink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.entityId, aVar.entityId) && Intrinsics.f(this.badgeType, aVar.badgeType) && Intrinsics.f(this.logoUrl, aVar.logoUrl) && Intrinsics.f(this.backgroundImageUrl, aVar.backgroundImageUrl) && Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.description, aVar.description) && Intrinsics.f(this.loyaltyDescription, aVar.loyaltyDescription) && Intrinsics.f(this.deepLink, aVar.deepLink) && Intrinsics.f(this.activation, aVar.activation) && Intrinsics.f(this.endDate, aVar.endDate) && Intrinsics.f(this.analyticsRef, aVar.analyticsRef);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Long getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getEntityId() {
        return this.entityId;
    }

    public final int hashCode() {
        String str = this.entityId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.badgeType;
        int iC = p.a.c(p.a.c(p.a.c(p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.logoUrl), 31, this.backgroundImageUrl), 31, this.title), 31, this.description);
        String str3 = this.loyaltyDescription;
        int iC2 = p.a.c((iC + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.deepLink);
        String str4 = this.activation;
        int iHashCode2 = (iC2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l2 = this.endDate;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str5 = this.analyticsRef;
        return iHashCode3 + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getLoyaltyDescription() {
        return this.loyaltyDescription;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
