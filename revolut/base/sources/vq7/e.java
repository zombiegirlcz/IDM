package vq7;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f291349a;

    public e(Data telematicsDeviceDelivery) {
        Intrinsics.checkNotNullParameter(telematicsDeviceDelivery, "telematicsDeviceDelivery");
        this.f291349a = telematicsDeviceDelivery;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f291349a, ((e) obj2).f291349a);
    }

    public final int hashCode() {
        return this.f291349a.hashCode();
    }
}
