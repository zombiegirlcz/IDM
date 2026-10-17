package p6l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0017\u0010\u0004R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010!\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001c\u0010&\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\t\u0010%R\u001c\u0010(\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010)\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b'\u0010\u0004R\u001c\u0010,\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0006\u001a\u0004\b+\u0010\u0004R\u001c\u0010.\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u0006\u001a\u0004\b#\u0010\u0004R\u001c\u00100\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u00101\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b*\u0010\u0004R\u001c\u00103\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b2\u0010 R\u001c\u00104\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u00105\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b/\u0010\u0004R\u001c\u00106\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010\u0006\u001a\u0004\b-\u0010\u0004¨\u00067"}, d2 = {"Lp6l/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "h", "deliveryStatus", "b", "l", "issueDate", "c", "q", "printDate", "Lp6l/b;", "d", "Lp6l/b;", "f", "()Lp6l/b;", "deliveryDateRange", "e", "deliveryDate", "r", "trackingChannel", "g", "s", "trackingLink", "address", "", "i", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "deliveryUpdateAllowed", "Lno3/b;", "j", "Lno3/b;", "()Lno3/b;", "addressDetails", "k", "deliveryMethod", "eventDate", "m", "p", "postedDate", "n", "estimatedPostedDate", "o", "courier", "localCourier", "t", "isBulkShipment", "courierStatus", "location", "localisedMessage", "feature_shared_cards_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("status")
    private final String deliveryStatus = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("convertedOn")
    private final String issueDate = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("ept")
    private final String printDate = null;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("estimatedDeliveryDateRange")
    private final b deliveryDateRange = null;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("edt")
    private final String deliveryDate = null;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("trackingChannel")
    private final String trackingChannel = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("trackingLink")
    private final String trackingLink = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("address")
    private final String address = null;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("deliveryUpdateAllowed")
    private final Boolean deliveryUpdateAllowed = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("addressDetails")
    private final no3.b addressDetails = null;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("method")
    private final String deliveryMethod = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("eventDate")
    private final String eventDate = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("postedDate")
    private final String postedDate = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("estimatedPostedDate")
    private final String estimatedPostedDate = null;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("courier")
    private final String courier = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("localCourier")
    private final String localCourier = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("isBulkShipment")
    private final Boolean isBulkShipment = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("courierStatus")
    private final String courierStatus = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("location")
    private final String location = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("localisedMessage")
    private final String localisedMessage = null;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final no3.b getAddressDetails() {
        return this.addressDetails;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCourier() {
        return this.courier;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCourierStatus() {
        return this.courierStatus;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDeliveryDate() {
        return this.deliveryDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.deliveryStatus, cVar.deliveryStatus) && Intrinsics.f(this.issueDate, cVar.issueDate) && Intrinsics.f(this.printDate, cVar.printDate) && Intrinsics.f(this.deliveryDateRange, cVar.deliveryDateRange) && Intrinsics.f(this.deliveryDate, cVar.deliveryDate) && Intrinsics.f(this.trackingChannel, cVar.trackingChannel) && Intrinsics.f(this.trackingLink, cVar.trackingLink) && Intrinsics.f(this.address, cVar.address) && Intrinsics.f(this.deliveryUpdateAllowed, cVar.deliveryUpdateAllowed) && Intrinsics.f(this.addressDetails, cVar.addressDetails) && Intrinsics.f(this.deliveryMethod, cVar.deliveryMethod) && Intrinsics.f(this.eventDate, cVar.eventDate) && Intrinsics.f(this.postedDate, cVar.postedDate) && Intrinsics.f(this.estimatedPostedDate, cVar.estimatedPostedDate) && Intrinsics.f(this.courier, cVar.courier) && Intrinsics.f(this.localCourier, cVar.localCourier) && Intrinsics.f(this.isBulkShipment, cVar.isBulkShipment) && Intrinsics.f(this.courierStatus, cVar.courierStatus) && Intrinsics.f(this.location, cVar.location) && Intrinsics.f(this.localisedMessage, cVar.localisedMessage);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final b getDeliveryDateRange() {
        return this.deliveryDateRange;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getDeliveryMethod() {
        return this.deliveryMethod;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getDeliveryStatus() {
        return this.deliveryStatus;
    }

    public final int hashCode() {
        String str = this.deliveryStatus;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.issueDate;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.printDate;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        b bVar = this.deliveryDateRange;
        int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str4 = this.deliveryDate;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.trackingChannel;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.trackingLink;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.address;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.deliveryUpdateAllowed;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        no3.b bVar2 = this.addressDetails;
        int iHashCode10 = (iHashCode9 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        String str8 = this.deliveryMethod;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.eventDate;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.postedDate;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.estimatedPostedDate;
        int iHashCode14 = (iHashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.courier;
        int iHashCode15 = (iHashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.localCourier;
        int iHashCode16 = (iHashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Boolean bool2 = this.isBulkShipment;
        int iHashCode17 = (iHashCode16 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str14 = this.courierStatus;
        int iHashCode18 = (iHashCode17 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.location;
        int iHashCode19 = (iHashCode18 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.localisedMessage;
        return iHashCode19 + (str16 != null ? str16.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Boolean getDeliveryUpdateAllowed() {
        return this.deliveryUpdateAllowed;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getEstimatedPostedDate() {
        return this.estimatedPostedDate;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getEventDate() {
        return this.eventDate;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getIssueDate() {
        return this.issueDate;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getLocalCourier() {
        return this.localCourier;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getLocalisedMessage() {
        return this.localisedMessage;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getPostedDate() {
        return this.postedDate;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getPrintDate() {
        return this.printDate;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getTrackingChannel() {
        return this.trackingChannel;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getTrackingLink() {
        return this.trackingLink;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Boolean getIsBulkShipment() {
        return this.isBulkShipment;
    }
}
