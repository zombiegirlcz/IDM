package a9g;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0010\u0010\u001cR\u001c\u0010 \u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001cR\u001c\u0010#\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001cR\u001c\u0010&\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010\u001cR\u001c\u0010'\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b\u001e\u0010\u0004R\u001c\u0010(\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b!\u0010\u0004R\u001c\u0010)\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u001a\u0010\u0004R\u001c\u0010*\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0017\u0010\u0004R\u001c\u0010+\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010-\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u0006\u001a\u0004\b,\u0010\u0004R\u001c\u0010/\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b.\u0010\u0004R\u001c\u00100\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001b\u001a\u0004\b$\u0010\u001c¨\u00061"}, d2 = {"La9g/w;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "locationId", "b", "g", "locationType", "c", "checkIn", "d", "checkOut", "e", "p", "roomsOccupancy", "t", "starRatings", "o", "propertyTypeIds", "h", "amenityIds", "", "i", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "freeCancellation", "j", "n", "onlyPayNow", "k", "m", "onlyPayLater", "l", "q", "showOnlyAvailable", "minReviewScore", "minReviewScore10Scale", "minPrice", "maxPrice", "currency", "r", "sortBy", "s", "sortDirection", "onlyCampaigns", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("locationId")
    private final String locationId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("locationType")
    private final String locationType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("checkIn")
    @NotNull
    private final String checkIn;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("checkOut")
    @NotNull
    private final String checkOut;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("roomsOccupancy")
    @NotNull
    private final String roomsOccupancy;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("starRatings")
    private final String starRatings;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("propertyTypeIds")
    private final String propertyTypeIds;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("amenityIds")
    private final String amenityIds;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("freeCancellation")
    private final Boolean freeCancellation;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("onlyPayNow")
    private final Boolean onlyPayNow;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("onlyPayLater")
    private final Boolean onlyPayLater;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("showOnlyAvailable")
    private final Boolean showOnlyAvailable;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("minReviewScore")
    private final String minReviewScore;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("min_overall_review_score_10_scale")
    private final String minReviewScore10Scale;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("minPrice")
    private final String minPrice;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("maxPrice")
    private final String maxPrice;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("currency")
    private final String currency;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("sortBy")
    private final String sortBy;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("sortDirection")
    private final String sortDirection;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("onlyCampaigns")
    private final Boolean onlyCampaigns;

    public w(String str, String str2, String checkIn, String checkOut, String roomsOccupancy, String str3, String str4, String str5, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Boolean bool5) {
        Intrinsics.checkNotNullParameter(checkIn, "checkIn");
        Intrinsics.checkNotNullParameter(checkOut, "checkOut");
        Intrinsics.checkNotNullParameter(roomsOccupancy, "roomsOccupancy");
        this.locationId = str;
        this.locationType = str2;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.roomsOccupancy = roomsOccupancy;
        this.starRatings = str3;
        this.propertyTypeIds = str4;
        this.amenityIds = str5;
        this.freeCancellation = bool;
        this.onlyPayNow = bool2;
        this.onlyPayLater = bool3;
        this.showOnlyAvailable = bool4;
        this.minReviewScore = str6;
        this.minReviewScore10Scale = str7;
        this.minPrice = str8;
        this.maxPrice = str9;
        this.currency = str10;
        this.sortBy = str11;
        this.sortDirection = str12;
        this.onlyCampaigns = bool5;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAmenityIds() {
        return this.amenityIds;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCheckIn() {
        return this.checkIn;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCheckOut() {
        return this.checkOut;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Boolean getFreeCancellation() {
        return this.freeCancellation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.locationId, wVar.locationId) && Intrinsics.f(this.locationType, wVar.locationType) && Intrinsics.f(this.checkIn, wVar.checkIn) && Intrinsics.f(this.checkOut, wVar.checkOut) && Intrinsics.f(this.roomsOccupancy, wVar.roomsOccupancy) && Intrinsics.f(this.starRatings, wVar.starRatings) && Intrinsics.f(this.propertyTypeIds, wVar.propertyTypeIds) && Intrinsics.f(this.amenityIds, wVar.amenityIds) && Intrinsics.f(this.freeCancellation, wVar.freeCancellation) && Intrinsics.f(this.onlyPayNow, wVar.onlyPayNow) && Intrinsics.f(this.onlyPayLater, wVar.onlyPayLater) && Intrinsics.f(this.showOnlyAvailable, wVar.showOnlyAvailable) && Intrinsics.f(this.minReviewScore, wVar.minReviewScore) && Intrinsics.f(this.minReviewScore10Scale, wVar.minReviewScore10Scale) && Intrinsics.f(this.minPrice, wVar.minPrice) && Intrinsics.f(this.maxPrice, wVar.maxPrice) && Intrinsics.f(this.currency, wVar.currency) && Intrinsics.f(this.sortBy, wVar.sortBy) && Intrinsics.f(this.sortDirection, wVar.sortDirection) && Intrinsics.f(this.onlyCampaigns, wVar.onlyCampaigns);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getLocationId() {
        return this.locationId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getLocationType() {
        return this.locationType;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getMaxPrice() {
        return this.maxPrice;
    }

    public final int hashCode() {
        String str = this.locationId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.locationType;
        int iC = p.a.c(p.a.c(p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.checkIn), 31, this.checkOut), 31, this.roomsOccupancy);
        String str3 = this.starRatings;
        int iHashCode2 = (iC + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.propertyTypeIds;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.amenityIds;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.freeCancellation;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.onlyPayNow;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.onlyPayLater;
        int iHashCode7 = (iHashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.showOnlyAvailable;
        int iHashCode8 = (iHashCode7 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str6 = this.minReviewScore;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.minReviewScore10Scale;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.minPrice;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.maxPrice;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.currency;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.sortBy;
        int iHashCode14 = (iHashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.sortDirection;
        int iHashCode15 = (iHashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Boolean bool5 = this.onlyCampaigns;
        return iHashCode15 + (bool5 != null ? bool5.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getMinPrice() {
        return this.minPrice;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getMinReviewScore() {
        return this.minReviewScore;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getMinReviewScore10Scale() {
        return this.minReviewScore10Scale;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final Boolean getOnlyCampaigns() {
        return this.onlyCampaigns;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Boolean getOnlyPayLater() {
        return this.onlyPayLater;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Boolean getOnlyPayNow() {
        return this.onlyPayNow;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getPropertyTypeIds() {
        return this.propertyTypeIds;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getRoomsOccupancy() {
        return this.roomsOccupancy;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Boolean getShowOnlyAvailable() {
        return this.showOnlyAvailable;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getSortBy() {
        return this.sortBy;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getSortDirection() {
        return this.sortDirection;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getStarRatings() {
        return this.starRatings;
    }
}
