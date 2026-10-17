package a9g;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\t\u0010\u0019R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\r\u0010\u001dR\u001a\u0010#\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0005\u0010\"R\u001a\u0010(\u001a\u00020$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b \u0010'R\u001a\u0010-\u001a\u00020)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b\u0014\u0010,R\u001c\u00100\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b/\u0010\u0004R\u001c\u00101\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b%\u0010\u0004R\u001a\u00105\u001a\u0002028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u00103\u001a\u0004\b.\u00104R\"\u0010:\u001a\n\u0012\u0004\u0012\u000207\u0018\u0001068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00108\u001a\u0004\b*\u00109¨\u0006;"}, d2 = {"La9g/z0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "id", "b", "l", "roomId", "La9g/t0;", "c", "La9g/t0;", "d", "()La9g/t0;", "confirmationIds", "g", "itineraryIds", "e", "n", "status", "La9g/d;", "La9g/d;", "()La9g/d;", "cancellation", "La9g/f;", "La9g/f;", "()La9g/f;", "cancellationRefund", "La9g/q1;", "h", "La9g/q1;", "()La9g/q1;", "bedConfiguration", "La9g/j2;", "i", "La9g/j2;", "()La9g/j2;", "occupancy", "La9g/e1;", "j", "La9g/e1;", "()La9g/e1;", "guestName", "k", "m", "specialRequest", "propertyMessageLink", "La9g/y0;", "La9g/y0;", "()La9g/y0;", "roomDetails", "", "La9g/p;", "Ljava/util/List;", "()Ljava/util/List;", "rateAmenities", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("roomId")
    @NotNull
    private final String roomId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("confirmationIds")
    @NotNull
    private final t0 confirmationIds;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("itineraryIds")
    @NotNull
    private final t0 itineraryIds;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("status")
    @NotNull
    private final String status;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("cancellation")
    @NotNull
    private final d cancellation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("cancellationRefund")
    private final f cancellationRefund;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("bedConfiguration")
    @NotNull
    private final q1 bedConfiguration;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("occupancy")
    @NotNull
    private final j2 occupancy;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("guestName")
    @NotNull
    private final e1 guestName;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("specialRequest")
    private final String specialRequest;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("propertyMessageLink")
    private final String propertyMessageLink;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("roomDetails")
    @NotNull
    private final y0 roomDetails;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("rateAmenities")
    private final List<p> rateAmenities;

    public z0(String id10, String roomId, t0 confirmationIds, t0 itineraryIds, String status, d cancellation, f fVar, q1 bedConfiguration, j2 occupancy, e1 guestName, String str, String str2, y0 roomDetails, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        Intrinsics.checkNotNullParameter(confirmationIds, "confirmationIds");
        Intrinsics.checkNotNullParameter(itineraryIds, "itineraryIds");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(cancellation, "cancellation");
        Intrinsics.checkNotNullParameter(bedConfiguration, "bedConfiguration");
        Intrinsics.checkNotNullParameter(occupancy, "occupancy");
        Intrinsics.checkNotNullParameter(guestName, "guestName");
        Intrinsics.checkNotNullParameter(roomDetails, "roomDetails");
        this.id = id10;
        this.roomId = roomId;
        this.confirmationIds = confirmationIds;
        this.itineraryIds = itineraryIds;
        this.status = status;
        this.cancellation = cancellation;
        this.cancellationRefund = fVar;
        this.bedConfiguration = bedConfiguration;
        this.occupancy = occupancy;
        this.guestName = guestName;
        this.specialRequest = str;
        this.propertyMessageLink = str2;
        this.roomDetails = roomDetails;
        this.rateAmenities = arrayList;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final q1 getBedConfiguration() {
        return this.bedConfiguration;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final d getCancellation() {
        return this.cancellation;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final f getCancellationRefund() {
        return this.cancellationRefund;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final t0 getConfirmationIds() {
        return this.confirmationIds;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final e1 getGuestName() {
        return this.guestName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj2;
        return Intrinsics.f(this.id, z0Var.id) && Intrinsics.f(this.roomId, z0Var.roomId) && Intrinsics.f(this.confirmationIds, z0Var.confirmationIds) && Intrinsics.f(this.itineraryIds, z0Var.itineraryIds) && Intrinsics.f(this.status, z0Var.status) && Intrinsics.f(this.cancellation, z0Var.cancellation) && Intrinsics.f(this.cancellationRefund, z0Var.cancellationRefund) && Intrinsics.f(this.bedConfiguration, z0Var.bedConfiguration) && Intrinsics.f(this.occupancy, z0Var.occupancy) && Intrinsics.f(this.guestName, z0Var.guestName) && Intrinsics.f(this.specialRequest, z0Var.specialRequest) && Intrinsics.f(this.propertyMessageLink, z0Var.propertyMessageLink) && Intrinsics.f(this.roomDetails, z0Var.roomDetails) && Intrinsics.f(this.rateAmenities, z0Var.rateAmenities);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final t0 getItineraryIds() {
        return this.itineraryIds;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final j2 getOccupancy() {
        return this.occupancy;
    }

    public final int hashCode() {
        int iHashCode = (this.cancellation.hashCode() + p.a.c((this.itineraryIds.hashCode() + ((this.confirmationIds.hashCode() + p.a.c(this.id.hashCode() * 31, 31, this.roomId)) * 31)) * 31, 31, this.status)) * 31;
        f fVar = this.cancellationRefund;
        int iHashCode2 = (this.guestName.hashCode() + ((this.occupancy.hashCode() + ((this.bedConfiguration.hashCode() + ((iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31)) * 31)) * 31)) * 31;
        String str = this.specialRequest;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.propertyMessageLink;
        int iHashCode4 = (this.roomDetails.hashCode() + ((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        List<p> list = this.rateAmenities;
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
    public final y0 getRoomDetails() {
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
