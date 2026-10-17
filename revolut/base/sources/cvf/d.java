package cvf;

import ip0.v7;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b#\u0010!R\u001a\u0010&\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010(\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b%\u0010\u0004R\u001a\u0010*\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u00100\u001a\u00020+8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u00104\u001a\u0002018\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u00102\u001a\u0004\b,\u00103R\u001c\u00106\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010\u0006\u001a\u0004\b)\u0010\u0004R \u00108\u001a\b\u0012\u0004\u0012\u0002070\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b\u001e\u0010!R \u00109\u001a\b\u0012\u0004\u0012\u0002070\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b'\u0010!R\u001c\u0010;\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b:\u0010\u0004R\u001c\u0010@\u001a\u0004\u0018\u00010<8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010D\u001a\u00020A8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010B\u001a\u0004\b5\u0010CR\u001a\u0010I\u001a\u00020E8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010F\u001a\u0004\bG\u0010HR\u001c\u0010J\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010K\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010L\u001a\u0004\u0018\u00010<8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010=\u001a\u0004\b\t\u0010?¨\u0006M"}, d2 = {"Lcvf/d;", "Lcvf/i;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "h", "id", "b", "q", "ticketOfferId", "c", "p", "ticketNumber", "d", "s", "title", "Lcvf/z;", "e", "Lcvf/z;", "r", "()Lcvf/z;", "ticketType", "Lcvf/n;", "f", "Lcvf/n;", "()Lcvf/n;", "descriptions", "", "g", "Ljava/util/List;", "v", "()Ljava/util/List;", "zones", "o", "tags", "i", "createdDate", "j", "locationName", "k", "countryCode", "Lzuf/b;", "l", "Lzuf/b;", "m", "()Lzuf/b;", "provider", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "price", "n", "pocketId", "Lavf/e;", "generalInputs", "passengerInputs", "t", "transactionId", "", "Ljava/lang/Boolean;", "w", "()Ljava/lang/Boolean;", "isDiscounted", "Lzuf/d;", "Lzuf/d;", "()Lzuf/d;", "qrCode", "Lcvf/k;", "Lcvf/k;", "u", "()Lcvf/k;", "validityTimeInterval", "activatedAt", "controlNumber", "canBeUsedForExtension", "feature_transport_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("ticketOfferId")
    @NotNull
    private final String ticketOfferId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("number")
    @NotNull
    private final String ticketNumber;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("ticketType")
    @NotNull
    private final z ticketType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("descriptions")
    @NotNull
    private final n descriptions;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("zones")
    @NotNull
    private final List<String> zones;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("tags")
    @NotNull
    private final List<String> tags;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("createdDate")
    @NotNull
    private final String createdDate;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("locationName")
    @NotNull
    private final String locationName;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("countryCode")
    @NotNull
    private final String countryCode;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("provider")
    @NotNull
    private final zuf.b provider;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("price")
    @NotNull
    private final jo3.a price;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("pocketId")
    private final String pocketId;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("generalInputs")
    @NotNull
    private final List<avf.e> generalInputs;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("passengerInputs")
    @NotNull
    private final List<avf.e> passengerInputs;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("transactionId")
    private final String transactionId;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("isDiscounted")
    private final Boolean isDiscounted;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("qrCode")
    @NotNull
    private final zuf.d qrCode;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("validityTimeInterval")
    @NotNull
    private final k validityTimeInterval;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("activatedAt")
    private final String activatedAt;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("controlNumber")
    private final String controlNumber;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("canBeUsedForExtension")
    private final Boolean canBeUsedForExtension;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getActivatedAt() {
        return this.activatedAt;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getCanBeUsedForExtension() {
        return this.canBeUsedForExtension;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getControlNumber() {
        return this.controlNumber;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCreatedDate() {
        return this.createdDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.id, dVar.id) && Intrinsics.f(this.ticketOfferId, dVar.ticketOfferId) && Intrinsics.f(this.ticketNumber, dVar.ticketNumber) && Intrinsics.f(this.title, dVar.title) && Intrinsics.f(this.ticketType, dVar.ticketType) && Intrinsics.f(this.descriptions, dVar.descriptions) && Intrinsics.f(this.zones, dVar.zones) && Intrinsics.f(this.tags, dVar.tags) && Intrinsics.f(this.createdDate, dVar.createdDate) && Intrinsics.f(this.locationName, dVar.locationName) && Intrinsics.f(this.countryCode, dVar.countryCode) && Intrinsics.f(this.provider, dVar.provider) && Intrinsics.f(this.price, dVar.price) && Intrinsics.f(this.pocketId, dVar.pocketId) && Intrinsics.f(this.generalInputs, dVar.generalInputs) && Intrinsics.f(this.passengerInputs, dVar.passengerInputs) && Intrinsics.f(this.transactionId, dVar.transactionId) && Intrinsics.f(this.isDiscounted, dVar.isDiscounted) && Intrinsics.f(this.qrCode, dVar.qrCode) && Intrinsics.f(this.validityTimeInterval, dVar.validityTimeInterval) && Intrinsics.f(this.activatedAt, dVar.activatedAt) && Intrinsics.f(this.controlNumber, dVar.controlNumber) && Intrinsics.f(this.canBeUsedForExtension, dVar.canBeUsedForExtension);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final n getDescriptions() {
        return this.descriptions;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final List getGeneralInputs() {
        return this.generalInputs;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        int iJ = v7.j(this.price, (this.provider.hashCode() + p.a.c(p.a.c(p.a.c(p.a.d(p.a.d((this.descriptions.hashCode() + ((this.ticketType.hashCode() + p.a.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.ticketOfferId), 31, this.ticketNumber), 31, this.title)) * 31)) * 31, 31, this.zones), 31, this.tags), 31, this.createdDate), 31, this.locationName), 31, this.countryCode)) * 31, 31);
        String str = this.pocketId;
        int iD = p.a.d(p.a.d((iJ + (str == null ? 0 : str.hashCode())) * 31, 31, this.generalInputs), 31, this.passengerInputs);
        String str2 = this.transactionId;
        int iHashCode = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isDiscounted;
        int iHashCode2 = (this.validityTimeInterval.hashCode() + ((this.qrCode.hashCode() + ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31)) * 31)) * 31;
        String str3 = this.activatedAt;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.controlNumber;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool2 = this.canBeUsedForExtension;
        return iHashCode4 + (bool2 != null ? bool2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getLocationName() {
        return this.locationName;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final List getPassengerInputs() {
        return this.passengerInputs;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getPocketId() {
        return this.pocketId;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final jo3.a getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final zuf.b getProvider() {
        return this.provider;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final zuf.d getQrCode() {
        return this.qrCode;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final List getTags() {
        return this.tags;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getTicketNumber() {
        return this.ticketNumber;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getTicketOfferId() {
        return this.ticketOfferId;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final z getTicketType() {
        return this.ticketType;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final k getValidityTimeInterval() {
        return this.validityTimeInterval;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final List getZones() {
        return this.zones;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final Boolean getIsDiscounted() {
        return this.isDiscounted;
    }
}
