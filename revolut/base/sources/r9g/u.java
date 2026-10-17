package r9g;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\b\u0010\u0012¨\u0006\u0014"}, d2 = {"Lr9g/u;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "bookingToken", "b", "d", "status", "Lcag/j;", "c", "Lcag/j;", "()Lcag/j;", "occupancy", "Lofi/n;", "Lofi/n;", "()Lofi/n;", "currentPricing", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("bookingToken")
    @NotNull
    private final String bookingToken;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("status")
    @NotNull
    private final String status;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("occupancy")
    @NotNull
    private final cag.j occupancy;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("currentPricing")
    private final ofi.n currentPricing;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBookingToken() {
        return this.bookingToken;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ofi.n getCurrentPricing() {
        return this.currentPricing;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final cag.j getOccupancy() {
        return this.occupancy;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.bookingToken, uVar.bookingToken) && Intrinsics.f(this.status, uVar.status) && Intrinsics.f(this.occupancy, uVar.occupancy) && Intrinsics.f(this.currentPricing, uVar.currentPricing);
    }

    public final int hashCode() {
        int iHashCode = (this.occupancy.hashCode() + p.a.c(this.bookingToken.hashCode() * 31, 31, this.status)) * 31;
        ofi.n nVar = this.currentPricing;
        return iHashCode + (nVar == null ? 0 : nVar.hashCode());
    }
}
