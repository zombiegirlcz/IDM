package r9g;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\t\u0010\u0011R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\f\u0010\u001bR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u001f"}, d2 = {"Lr9g/l0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "id", "b", "g", "type", "c", "f", "paymentMode", "", "I", "()I", "availableRooms", "", "Lofi/e;", "e", "Ljava/util/List;", "()Ljava/util/List;", "amenities", "Lcag/b;", "Lcag/b;", "()Lcag/b;", "cancellationPolicy", "Lr9g/k0;", "occupancyRates", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentMode")
    @NotNull
    private final String paymentMode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("availableRooms")
    private final int availableRooms;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("amenities")
    @NotNull
    private final List<ofi.e> amenities;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("cancellationPolicy")
    @NotNull
    private final cag.b cancellationPolicy;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("occupancyRates")
    @NotNull
    private final List<k0> occupancyRates;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAmenities() {
        return this.amenities;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getAvailableRooms() {
        return this.availableRooms;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final cag.b getCancellationPolicy() {
        return this.cancellationPolicy;
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
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.id, l0Var.id) && Intrinsics.f(this.type, l0Var.type) && Intrinsics.f(this.paymentMode, l0Var.paymentMode) && this.availableRooms == l0Var.availableRooms && Intrinsics.f(this.amenities, l0Var.amenities) && Intrinsics.f(this.cancellationPolicy, l0Var.cancellationPolicy) && Intrinsics.f(this.occupancyRates, l0Var.occupancyRates);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPaymentMode() {
        return this.paymentMode;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.occupancyRates.hashCode() + ((this.cancellationPolicy.hashCode() + p.a.d(j6.a.b(this.availableRooms, p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.type), 31, this.paymentMode), 31), 31, this.amenities)) * 31);
    }
}
