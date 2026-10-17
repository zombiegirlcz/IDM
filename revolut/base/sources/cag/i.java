package cag;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\u000fR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\r\u0010\u0019R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u0017\u0010\u0014R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u001c\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcag/i;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "id", "b", "g", "type", "", "c", "I", "()I", "availableRooms", "", "Lofi/e;", "Ljava/util/List;", "()Ljava/util/List;", "amenities", "Lcag/b;", "e", "Lcag/b;", "()Lcag/b;", "cancellation", "Lcag/h;", "f", "occupancyRates", "paymentModes", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("availableRooms")
    private final int availableRooms;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("amenities")
    @NotNull
    private final List<ofi.e> amenities;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("cancellation")
    @NotNull
    private final b cancellation;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("occupancyRates")
    @NotNull
    private final List<h> occupancyRates;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentModes")
    @NotNull
    private final List<String> paymentModes;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAmenities() {
        return this.amenities;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getAvailableRooms() {
        return this.availableRooms;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b getCancellation() {
        return this.cancellation;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getOccupancyRates() {
        return this.occupancyRates;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.id, iVar.id) && Intrinsics.f(this.type, iVar.type) && this.availableRooms == iVar.availableRooms && Intrinsics.f(this.amenities, iVar.amenities) && Intrinsics.f(this.cancellation, iVar.cancellation) && Intrinsics.f(this.occupancyRates, iVar.occupancyRates) && Intrinsics.f(this.paymentModes, iVar.paymentModes);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getPaymentModes() {
        return this.paymentModes;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.paymentModes.hashCode() + p.a.d((this.cancellation.hashCode() + p.a.d(j6.a.b(this.availableRooms, p.a.c(this.id.hashCode() * 31, 31, this.type), 31), 31, this.amenities)) * 31, 31, this.occupancyRates);
    }
}
