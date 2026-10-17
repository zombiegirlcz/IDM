package zac;

import com.revolut.feature.revolutpay.order_tracking.impl.ui.add_shipping_tracking.AddShippingTrackingScreenContract$TrackingRequest;
import com.revolut.feature.revolutpay.order_tracking.models.delivery.DeliveryCarrier;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f320648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DeliveryCarrier f320649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f320650c;
    public final AddShippingTrackingScreenContract$TrackingRequest d;

    public f(String trackingNumber, DeliveryCarrier deliveryCarrier, boolean z, AddShippingTrackingScreenContract$TrackingRequest request) {
        Intrinsics.checkNotNullParameter(trackingNumber, "trackingNumber");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f320648a = trackingNumber;
        this.f320649b = deliveryCarrier;
        this.f320650c = z;
        this.d = request;
    }

    public static f a(f fVar, String trackingNumber, DeliveryCarrier deliveryCarrier, int i) {
        if ((i & 1) != 0) {
            trackingNumber = fVar.f320648a;
        }
        if ((i & 2) != 0) {
            deliveryCarrier = fVar.f320649b;
        }
        boolean z = (i & 4) != 0 ? fVar.f320650c : true;
        AddShippingTrackingScreenContract$TrackingRequest request = fVar.d;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(trackingNumber, "trackingNumber");
        Intrinsics.checkNotNullParameter(request, "request");
        return new f(trackingNumber, deliveryCarrier, z, request);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f320648a, fVar.f320648a) && Intrinsics.f(this.f320649b, fVar.f320649b) && this.f320650c == fVar.f320650c && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f320648a.hashCode() * 31;
        DeliveryCarrier deliveryCarrier = this.f320649b;
        return this.d.hashCode() + j6.a.c((iHashCode + (deliveryCarrier == null ? 0 : deliveryCarrier.hashCode())) * 31, 31, this.f320650c);
    }
}
