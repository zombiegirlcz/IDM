package pac;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u0000 <2\u00020\u0001:\u0003\f\t\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0005\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u001b\u0010\u0004R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001d\u0010\u0004R\u001a\u0010 \u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004R\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001a\u0010\u0004R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010$\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010)\u001a\u00020%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u0010\u0010(R\u001c\u0010.\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010+\u001a\u0004\b,\u0010-R\"\u00103\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b\u0016\u00102R\u001c\u00107\u001a\u0004\u0018\u0001048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b&\u00106R\u001c\u0010;\u001a\u0004\u0018\u0001088\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u00109\u001a\u0004\b#\u0010:¨\u0006="}, d2 = {"Lpac/f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "j", "id", "b", "n", "trackingNumber", "c", "o", "trackingUrl", "Lpac/b;", "d", "Lpac/b;", "h", "()Lpac/b;", "destinationAddress", "", "e", "Z", "()Z", "addedManually", "f", "g", "deliveryStatus", "i", "estimatedDeliveryDate", "m", "orderedDate", "deliveredDate", "cancelledDate", "k", "availableForPickupDate", "Lpac/c;", "l", "Lpac/c;", "()Lpac/c;", "carrier", "Lpac/g;", "Lpac/g;", "p", "()Lpac/g;", "weight", "", "Lpac/e;", "Ljava/util/List;", "()Ljava/util/List;", "checkpoints", "Lpac/f$c;", "Lpac/f$c;", "()Lpac/f$c;", "order", "Lpac/f$b;", "Lpac/f$b;", "()Lpac/f$b;", "merchant", "Companion", "feature_revolut_pay_order_tracking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("trackingNumber")
    @NotNull
    private final String trackingNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("trackingUrl")
    private final String trackingUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("destinationAddress")
    private final pac.b destinationAddress;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("addedManually")
    private final boolean addedManually;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("deliveryStatus")
    @NotNull
    private final String deliveryStatus;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("estimatedDeliveryDate")
    private final String estimatedDeliveryDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("orderedDate")
    @NotNull
    private final String orderedDate;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("deliveredDate")
    private final String deliveredDate;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("cancelledDate")
    private final String cancelledDate;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("availableForPickupDate")
    private final String availableForPickupDate;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("carrier")
    @NotNull
    private final pac.c carrier;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("weight")
    private final g weight;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("checkpoints")
    private final List<e> checkpoints;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("orderData")
    private final c order;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("merchantData")
    private final b merchant;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u0000 \n2\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u000b"}, d2 = {"Lpac/f$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "name", "logoUrl", "Companion", "feature_revolut_pay_order_tracking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("logoUrl")
        private final String logoUrl;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getLogoUrl() {
            return this.logoUrl;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.name, bVar.name) && Intrinsics.f(this.logoUrl, bVar.logoUrl);
        }

        public final int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            String str = this.logoUrl;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u0000 \n2\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Lpac/f$c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "id", "b", "number", "Companion", "feature_revolut_pay_order_tracking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("number")
        private final String number;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getNumber() {
            return this.number;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.id, cVar.id) && Intrinsics.f(this.number, cVar.number);
        }

        public final int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            String str = this.number;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAddedManually() {
        return this.addedManually;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAvailableForPickupDate() {
        return this.availableForPickupDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCancelledDate() {
        return this.cancelledDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final pac.c getCarrier() {
        return this.carrier;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getCheckpoints() {
        return this.checkpoints;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.id, fVar.id) && Intrinsics.f(this.trackingNumber, fVar.trackingNumber) && Intrinsics.f(this.trackingUrl, fVar.trackingUrl) && Intrinsics.f(this.destinationAddress, fVar.destinationAddress) && this.addedManually == fVar.addedManually && Intrinsics.f(this.deliveryStatus, fVar.deliveryStatus) && Intrinsics.f(this.estimatedDeliveryDate, fVar.estimatedDeliveryDate) && Intrinsics.f(this.orderedDate, fVar.orderedDate) && Intrinsics.f(this.deliveredDate, fVar.deliveredDate) && Intrinsics.f(this.cancelledDate, fVar.cancelledDate) && Intrinsics.f(this.availableForPickupDate, fVar.availableForPickupDate) && Intrinsics.f(this.carrier, fVar.carrier) && Intrinsics.f(this.weight, fVar.weight) && Intrinsics.f(this.checkpoints, fVar.checkpoints) && Intrinsics.f(this.order, fVar.order) && Intrinsics.f(this.merchant, fVar.merchant);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDeliveredDate() {
        return this.deliveredDate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getDeliveryStatus() {
        return this.deliveryStatus;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final pac.b getDestinationAddress() {
        return this.destinationAddress;
    }

    public final int hashCode() {
        int iC = p.a.c(this.id.hashCode() * 31, 31, this.trackingNumber);
        String str = this.trackingUrl;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        pac.b bVar = this.destinationAddress;
        int iC2 = p.a.c(j6.a.c((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.addedManually), 31, this.deliveryStatus);
        String str2 = this.estimatedDeliveryDate;
        int iC3 = p.a.c((iC2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.orderedDate);
        String str3 = this.deliveredDate;
        int iHashCode2 = (iC3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cancelledDate;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.availableForPickupDate;
        int iHashCode4 = (this.carrier.hashCode() + ((iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31)) * 31;
        g gVar = this.weight;
        int iHashCode5 = (iHashCode4 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        List<e> list = this.checkpoints;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        c cVar = this.order;
        int iHashCode7 = (iHashCode6 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        b bVar2 = this.merchant;
        return iHashCode7 + (bVar2 != null ? bVar2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getEstimatedDeliveryDate() {
        return this.estimatedDeliveryDate;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final b getMerchant() {
        return this.merchant;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final c getOrder() {
        return this.order;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getOrderedDate() {
        return this.orderedDate;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getTrackingNumber() {
        return this.trackingNumber;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getTrackingUrl() {
        return this.trackingUrl;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final g getWeight() {
        return this.weight;
    }
}
