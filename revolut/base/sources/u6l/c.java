package u6l;

import h93.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0011\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\u0004R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010$\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b\t\u0010#R\u001c\u0010)\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u0017\u0010(R\u001c\u0010+\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0006\u001a\u0004\b\u001a\u0010\u0004R\u001c\u0010/\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b*\u0010.R\u001c\u00102\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010\u0006\u001a\u0004\b1\u0010\u0004R\u001c\u00104\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b&\u0010\u0004R\u001c\u00106\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u00107\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b0\u0010\u0004R\u001c\u00109\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b8\u0010\u001fR\u001c\u0010:\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010;\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b5\u0010\u0004R\u001c\u0010<\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010\u0006\u001a\u0004\b3\u0010\u0004¨\u0006="}, d2 = {"Lu6l/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "h", "deliveryStatus", "b", "l", "issueDate", "c", "e", "deliveryDate", "d", "q", "printDate", "Lh93/s;", "Lh93/s;", "r", "()Lh93/s;", "trackingChannel", "f", "s", "trackingLink", "g", "address", "", "Ljava/lang/Boolean;", "i", "()Ljava/lang/Boolean;", "deliveryUpdateAllowed", "Lso3/c;", "Lso3/c;", "()Lso3/c;", "addressDetails", "Lu6l/b;", "j", "Lu6l/b;", "()Lu6l/b;", "deliveryDateRange", "k", "deliveryMethod", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "eventDate", "m", "p", "postedDate", "n", "estimatedPostedDate", "o", "courier", "localCourier", "t", "isBulkShipment", "courierStatus", "location", "localisedMessage", "feature_shared_cards_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("deliveryStatus")
    @NotNull
    private final String deliveryStatus;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("issueDate")
    private final String issueDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("deliveryDate")
    private final String deliveryDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("printDate")
    private final String printDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("trackingChannel")
    private final s trackingChannel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("trackingLink")
    private final String trackingLink;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("address")
    private final String address;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("deliveryUpdateAllowed")
    private final Boolean deliveryUpdateAllowed;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("addressDetails")
    private final so3.c addressDetails;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("estimatedDeliveryDateRange")
    private final b deliveryDateRange;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("deliveryMethod")
    private final String deliveryMethod;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("eventDate")
    private final Long eventDate;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("postedDate")
    private final String postedDate;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("estimatedPostedDate")
    private final String estimatedPostedDate;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("courier")
    private final String courier;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("localCourier")
    private final String localCourier;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("isBulkShipment")
    private final Boolean isBulkShipment;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("courierStatus")
    private final String courierStatus;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("location")
    private final String location;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("localisedMessage")
    private final String localisedMessage;

    public c(String deliveryStatus, String str, String str2, String str3, s sVar, String str4, String str5, Boolean bool, so3.c cVar, b bVar, String str6, Long l2, String str7, String str8, String str9, String str10, Boolean bool2, String str11, String str12, String str13) {
        Intrinsics.checkNotNullParameter(deliveryStatus, "deliveryStatus");
        this.deliveryStatus = deliveryStatus;
        this.issueDate = str;
        this.deliveryDate = str2;
        this.printDate = str3;
        this.trackingChannel = sVar;
        this.trackingLink = str4;
        this.address = str5;
        this.deliveryUpdateAllowed = bool;
        this.addressDetails = cVar;
        this.deliveryDateRange = bVar;
        this.deliveryMethod = str6;
        this.eventDate = l2;
        this.postedDate = str7;
        this.estimatedPostedDate = str8;
        this.courier = str9;
        this.localCourier = str10;
        this.isBulkShipment = bool2;
        this.courierStatus = str11;
        this.location = str12;
        this.localisedMessage = str13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final so3.c getAddressDetails() {
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
        return Intrinsics.f(this.deliveryStatus, cVar.deliveryStatus) && Intrinsics.f(this.issueDate, cVar.issueDate) && Intrinsics.f(this.deliveryDate, cVar.deliveryDate) && Intrinsics.f(this.printDate, cVar.printDate) && this.trackingChannel == cVar.trackingChannel && Intrinsics.f(this.trackingLink, cVar.trackingLink) && Intrinsics.f(this.address, cVar.address) && Intrinsics.f(this.deliveryUpdateAllowed, cVar.deliveryUpdateAllowed) && Intrinsics.f(this.addressDetails, cVar.addressDetails) && Intrinsics.f(this.deliveryDateRange, cVar.deliveryDateRange) && Intrinsics.f(this.deliveryMethod, cVar.deliveryMethod) && Intrinsics.f(this.eventDate, cVar.eventDate) && Intrinsics.f(this.postedDate, cVar.postedDate) && Intrinsics.f(this.estimatedPostedDate, cVar.estimatedPostedDate) && Intrinsics.f(this.courier, cVar.courier) && Intrinsics.f(this.localCourier, cVar.localCourier) && Intrinsics.f(this.isBulkShipment, cVar.isBulkShipment) && Intrinsics.f(this.courierStatus, cVar.courierStatus) && Intrinsics.f(this.location, cVar.location) && Intrinsics.f(this.localisedMessage, cVar.localisedMessage);
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
        int iHashCode = this.deliveryStatus.hashCode() * 31;
        String str = this.issueDate;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.deliveryDate;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.printDate;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        s sVar = this.trackingChannel;
        int iHashCode5 = (iHashCode4 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        String str4 = this.trackingLink;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.address;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.deliveryUpdateAllowed;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        so3.c cVar = this.addressDetails;
        int iHashCode9 = (iHashCode8 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        b bVar = this.deliveryDateRange;
        int iHashCode10 = (iHashCode9 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str6 = this.deliveryMethod;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l2 = this.eventDate;
        int iHashCode12 = (iHashCode11 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str7 = this.postedDate;
        int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.estimatedPostedDate;
        int iHashCode14 = (iHashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.courier;
        int iHashCode15 = (iHashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.localCourier;
        int iHashCode16 = (iHashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool2 = this.isBulkShipment;
        int iHashCode17 = (iHashCode16 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str11 = this.courierStatus;
        int iHashCode18 = (iHashCode17 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.location;
        int iHashCode19 = (iHashCode18 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.localisedMessage;
        return iHashCode19 + (str13 != null ? str13.hashCode() : 0);
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
    public final Long getEventDate() {
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
    public final s getTrackingChannel() {
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
