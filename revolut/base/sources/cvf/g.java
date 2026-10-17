package cvf;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\f\u0010\u001aR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010 R\u001a\u0010&\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010(\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b\u0018\u0010\u0004R\u001a\u0010)\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010-\u001a\u00020*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b'\u0010,R\u001c\u00101\u001a\u0004\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b%\u00100R\u001c\u00102\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\"\u0010\u0004R \u00104\u001a\b\u0012\u0004\u0012\u0002030\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b\u000f\u0010 R \u00106\u001a\b\u0012\u0004\u0012\u0002030\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010\u001e\u001a\u0004\b\u001d\u0010 R\u001c\u00107\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b5\u0010\u0004R\u001c\u0010<\u001a\u0004\u0018\u0001088\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b9\u0010;¨\u0006="}, d2 = {"Lcvf/g;", "Lcvf/i;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "id", "b", "m", "ticketOfferId", "c", "l", "ticketNumber", "d", "o", "title", "Lcvf/z;", "Lcvf/z;", "n", "()Lcvf/z;", "ticketType", "Lcvf/n;", "f", "Lcvf/n;", "()Lcvf/n;", "descriptions", "", "g", "Ljava/util/List;", "q", "()Ljava/util/List;", "zones", "h", "k", "tags", "i", "createdDate", "j", "locationName", "countryCode", "Lzuf/b;", "Lzuf/b;", "()Lzuf/b;", "provider", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "price", "pocketId", "Lavf/e;", "generalInputs", "p", "passengerInputs", "transactionId", "", "r", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "isDiscounted", "feature_transport_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g implements i {

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

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCreatedDate() {
        return this.createdDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final n getDescriptions() {
        return this.descriptions;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getGeneralInputs() {
        return this.generalInputs;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.id, gVar.id) && Intrinsics.f(this.ticketOfferId, gVar.ticketOfferId) && Intrinsics.f(this.ticketNumber, gVar.ticketNumber) && Intrinsics.f(this.title, gVar.title) && Intrinsics.f(this.ticketType, gVar.ticketType) && Intrinsics.f(this.descriptions, gVar.descriptions) && Intrinsics.f(this.zones, gVar.zones) && Intrinsics.f(this.tags, gVar.tags) && Intrinsics.f(this.createdDate, gVar.createdDate) && Intrinsics.f(this.locationName, gVar.locationName) && Intrinsics.f(this.countryCode, gVar.countryCode) && Intrinsics.f(this.provider, gVar.provider) && Intrinsics.f(this.price, gVar.price) && Intrinsics.f(this.pocketId, gVar.pocketId) && Intrinsics.f(this.generalInputs, gVar.generalInputs) && Intrinsics.f(this.passengerInputs, gVar.passengerInputs) && Intrinsics.f(this.transactionId, gVar.transactionId) && Intrinsics.f(this.isDiscounted, gVar.isDiscounted);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getLocationName() {
        return this.locationName;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final List getPassengerInputs() {
        return this.passengerInputs;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getPocketId() {
        return this.pocketId;
    }

    public final int hashCode() {
        int iC = p.a.c(this.id.hashCode() * 31, 31, this.ticketOfferId);
        String str = this.ticketNumber;
        int iHashCode = (this.provider.hashCode() + p.a.c(p.a.c(p.a.c(p.a.d(p.a.d((this.descriptions.hashCode() + ((this.ticketType.hashCode() + p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.title)) * 31)) * 31, 31, this.zones), 31, this.tags), 31, this.createdDate), 31, this.locationName), 31, this.countryCode)) * 31;
        jo3.a aVar = this.price;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str2 = this.pocketId;
        int iD = p.a.d(p.a.d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.generalInputs), 31, this.passengerInputs);
        String str3 = this.transactionId;
        int iHashCode3 = (iD + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isDiscounted;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final jo3.a getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final zuf.b getProvider() {
        return this.provider;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final List getTags() {
        return this.tags;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getTicketNumber() {
        return this.ticketNumber;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getTicketOfferId() {
        return this.ticketOfferId;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final z getTicketType() {
        return this.ticketType;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final List getZones() {
        return this.zones;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Boolean getIsDiscounted() {
        return this.isDiscounted;
    }
}
