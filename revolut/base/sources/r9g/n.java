package r9g;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u001a\u0010\u0004R\u001a\u0010\u001f\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\t\u0010\u001eR\u001c\u0010$\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\r\u0010#R\u001a\u0010)\u001a\u00020%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u0005\u0010(R\u001a\u0010.\u001a\u00020*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b!\u0010-R\u001a\u00102\u001a\u00020/8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b\u0017\u00101R\u001c\u00104\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b3\u0010\u0004R\u001c\u00105\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b&\u0010\u0004R\"\u0010:\u001a\n\u0012\u0004\u0012\u000207\u0018\u0001068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u00108\u001a\u0004\b+\u00109¨\u0006;"}, d2 = {"Lr9g/n;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "id", "b", "l", "roomId", "Lr9g/m;", "c", "Lr9g/m;", "k", "()Lr9g/m;", "roomDetails", "Lr9g/g;", "d", "Lr9g/g;", "()Lr9g/g;", "confirmationIds", "e", "g", "itineraryIds", "n", "status", "Lcag/b;", "Lcag/b;", "()Lcag/b;", "cancellation", "Lr9g/c;", "h", "Lr9g/c;", "()Lr9g/c;", "cancellationRefund", "Lr9g/t;", "i", "Lr9g/t;", "()Lr9g/t;", "bedConfiguration", "Lcag/j;", "j", "Lcag/j;", "()Lcag/j;", "occupancy", "Lr9g/h0;", "Lr9g/h0;", "()Lr9g/h0;", "guestName", "m", "specialRequest", "propertyMessageLink", "", "Lofi/e;", "Ljava/util/List;", "()Ljava/util/List;", "rateAmenities", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("roomId")
    @NotNull
    private final String roomId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("roomDetails")
    @NotNull
    private final m roomDetails;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("confirmationIds")
    @NotNull
    private final g confirmationIds;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("itineraryIds")
    @NotNull
    private final g itineraryIds;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("status")
    @NotNull
    private final String status;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("cancellation")
    @NotNull
    private final cag.b cancellation;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("cancellationRefund")
    private final c cancellationRefund;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("bedConfiguration")
    @NotNull
    private final t bedConfiguration;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("occupancy")
    @NotNull
    private final cag.j occupancy;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("guestName")
    @NotNull
    private final h0 guestName;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("specialRequest")
    private final String specialRequest;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("propertyMessageLink")
    private final String propertyMessageLink;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("rateAmenities")
    private final List<ofi.e> rateAmenities;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final t getBedConfiguration() {
        return this.bedConfiguration;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final cag.b getCancellation() {
        return this.cancellation;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final c getCancellationRefund() {
        return this.cancellationRefund;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final g getConfirmationIds() {
        return this.confirmationIds;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final h0 getGuestName() {
        return this.guestName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.id, nVar.id) && Intrinsics.f(this.roomId, nVar.roomId) && Intrinsics.f(this.roomDetails, nVar.roomDetails) && Intrinsics.f(this.confirmationIds, nVar.confirmationIds) && Intrinsics.f(this.itineraryIds, nVar.itineraryIds) && Intrinsics.f(this.status, nVar.status) && Intrinsics.f(this.cancellation, nVar.cancellation) && Intrinsics.f(this.cancellationRefund, nVar.cancellationRefund) && Intrinsics.f(this.bedConfiguration, nVar.bedConfiguration) && Intrinsics.f(this.occupancy, nVar.occupancy) && Intrinsics.f(this.guestName, nVar.guestName) && Intrinsics.f(this.specialRequest, nVar.specialRequest) && Intrinsics.f(this.propertyMessageLink, nVar.propertyMessageLink) && Intrinsics.f(this.rateAmenities, nVar.rateAmenities);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final g getItineraryIds() {
        return this.itineraryIds;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final cag.j getOccupancy() {
        return this.occupancy;
    }

    public final int hashCode() {
        int iHashCode = (this.cancellation.hashCode() + p.a.c((this.itineraryIds.hashCode() + ((this.confirmationIds.hashCode() + ((this.roomDetails.hashCode() + p.a.c(this.id.hashCode() * 31, 31, this.roomId)) * 31)) * 31)) * 31, 31, this.status)) * 31;
        c cVar = this.cancellationRefund;
        int iHashCode2 = (this.guestName.hashCode() + ((this.occupancy.hashCode() + ((this.bedConfiguration.hashCode() + ((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31)) * 31)) * 31)) * 31;
        String str = this.specialRequest;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.propertyMessageLink;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<ofi.e> list = this.rateAmenities;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getPropertyMessageLink() {
        return this.propertyMessageLink;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final List getRateAmenities() {
        return this.rateAmenities;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final m getRoomDetails() {
        return this.roomDetails;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getRoomId() {
        return this.roomId;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getSpecialRequest() {
        return this.specialRequest;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getStatus() {
        return this.status;
    }
}
