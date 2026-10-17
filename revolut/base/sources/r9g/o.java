package r9g;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004¨\u0006\u0018"}, d2 = {"Lr9g/o;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getOccupancy", "occupancy", "b", "getBookingToken", "bookingToken", "Lr9g/h0;", "c", "Lr9g/h0;", "getGuestName", "()Lr9g/h0;", "guestName", "d", "getSpecialRequest", "specialRequest", "e", "getPointsRedeemToken", "pointsRedeemToken", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("occupancy")
    @NotNull
    private final String occupancy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("bookingToken")
    @NotNull
    private final String bookingToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("guestName")
    @NotNull
    private final h0 guestName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("specialRequest")
    private final String specialRequest;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("pointsRedeemToken")
    private final String pointsRedeemToken;

    public o(String occupancy, String bookingToken, h0 guestName, String str, String str2) {
        Intrinsics.checkNotNullParameter(occupancy, "occupancy");
        Intrinsics.checkNotNullParameter(bookingToken, "bookingToken");
        Intrinsics.checkNotNullParameter(guestName, "guestName");
        this.occupancy = occupancy;
        this.bookingToken = bookingToken;
        this.guestName = guestName;
        this.specialRequest = str;
        this.pointsRedeemToken = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.occupancy, oVar.occupancy) && Intrinsics.f(this.bookingToken, oVar.bookingToken) && Intrinsics.f(this.guestName, oVar.guestName) && Intrinsics.f(this.specialRequest, oVar.specialRequest) && Intrinsics.f(this.pointsRedeemToken, oVar.pointsRedeemToken);
    }

    public final int hashCode() {
        int iHashCode = (this.guestName.hashCode() + p.a.c(this.occupancy.hashCode() * 31, 31, this.bookingToken)) * 31;
        String str = this.specialRequest;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pointsRedeemToken;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
