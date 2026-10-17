package u9g;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b,\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\u0004R\u001c\u0010$\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b\u001b\u0010\u0004R\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001e\u0010\u0004R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010'\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0017\u0010\u0004R\u001c\u0010(\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010*\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b)\u0010\u0004R\u001c\u0010,\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b+\u0010\u0004R\u001c\u0010-\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b!\u0010\u0004¨\u0006."}, d2 = {"Lu9g/d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "locationId", "b", "g", "locationType", "c", "checkIn", "d", "checkOut", "e", "p", "roomsOccupancy", "t", "starRatings", "o", "propertyTypeIds", "h", "amenityIds", "i", "freeCancellation", "j", "n", "onlyPayNow", "k", "m", "onlyPayLater", "l", "q", "showOnlyAvailable", "minReviewScore", "minReviewScore10Scale", "minPrice", "maxPrice", "currency", "r", "sortBy", "s", "sortDirection", "onlyCampaigns", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("location_id")
    private final String locationId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("location_type")
    private final String locationType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("checkin")
    @NotNull
    private final String checkIn;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("checkout")
    @NotNull
    private final String checkOut;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("occupancy")
    @NotNull
    private final String roomsOccupancy;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("star_ratings")
    private final String starRatings;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("property_type_ids")
    private final String propertyTypeIds;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("amenity_ids")
    private final String amenityIds;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("free_cancellation")
    private final String freeCancellation;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("only_pay_now")
    private final String onlyPayNow;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("only_pay_later")
    private final String onlyPayLater;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("show_only_available")
    private final String showOnlyAvailable;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("min_overall_review_score")
    private final String minReviewScore;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("min_overall_review_score_10_scale")
    private final String minReviewScore10Scale;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("min_price")
    private final String minPrice;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("max_price")
    private final String maxPrice;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("currency")
    private final String currency;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("sort_by")
    private final String sortBy;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("sort_direction")
    private final String sortDirection;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("only_campaigns")
    private final String onlyCampaigns;

    public d(String str, String str2, String checkIn, String checkOut, String roomsOccupancy, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17) {
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
        this.freeCancellation = str6;
        this.onlyPayNow = str7;
        this.onlyPayLater = str8;
        this.showOnlyAvailable = str9;
        this.minReviewScore = str10;
        this.minReviewScore10Scale = str11;
        this.minPrice = str12;
        this.maxPrice = str13;
        this.currency = str14;
        this.sortBy = str15;
        this.sortDirection = str16;
        this.onlyCampaigns = str17;
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
    public final String getFreeCancellation() {
        return this.freeCancellation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.locationId, dVar.locationId) && Intrinsics.f(this.locationType, dVar.locationType) && Intrinsics.f(this.checkIn, dVar.checkIn) && Intrinsics.f(this.checkOut, dVar.checkOut) && Intrinsics.f(this.roomsOccupancy, dVar.roomsOccupancy) && Intrinsics.f(this.starRatings, dVar.starRatings) && Intrinsics.f(this.propertyTypeIds, dVar.propertyTypeIds) && Intrinsics.f(this.amenityIds, dVar.amenityIds) && Intrinsics.f(this.freeCancellation, dVar.freeCancellation) && Intrinsics.f(this.onlyPayNow, dVar.onlyPayNow) && Intrinsics.f(this.onlyPayLater, dVar.onlyPayLater) && Intrinsics.f(this.showOnlyAvailable, dVar.showOnlyAvailable) && Intrinsics.f(this.minReviewScore, dVar.minReviewScore) && Intrinsics.f(this.minReviewScore10Scale, dVar.minReviewScore10Scale) && Intrinsics.f(this.minPrice, dVar.minPrice) && Intrinsics.f(this.maxPrice, dVar.maxPrice) && Intrinsics.f(this.currency, dVar.currency) && Intrinsics.f(this.sortBy, dVar.sortBy) && Intrinsics.f(this.sortDirection, dVar.sortDirection) && Intrinsics.f(this.onlyCampaigns, dVar.onlyCampaigns);
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
        String str6 = this.freeCancellation;
        int iHashCode5 = (iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.onlyPayNow;
        int iHashCode6 = (iHashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.onlyPayLater;
        int iHashCode7 = (iHashCode6 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.showOnlyAvailable;
        int iHashCode8 = (iHashCode7 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.minReviewScore;
        int iHashCode9 = (iHashCode8 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.minReviewScore10Scale;
        int iHashCode10 = (iHashCode9 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.minPrice;
        int iHashCode11 = (iHashCode10 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.maxPrice;
        int iHashCode12 = (iHashCode11 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.currency;
        int iHashCode13 = (iHashCode12 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.sortBy;
        int iHashCode14 = (iHashCode13 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.sortDirection;
        int iHashCode15 = (iHashCode14 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.onlyCampaigns;
        return iHashCode15 + (str17 != null ? str17.hashCode() : 0);
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
    public final String getOnlyCampaigns() {
        return this.onlyCampaigns;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getOnlyPayLater() {
        return this.onlyPayLater;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getOnlyPayNow() {
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
    public final String getShowOnlyAvailable() {
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
