package h86;

import com.revolut.feature.devicemanagement.api.model.UserDevice;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserDevice f149945a;

    public d(UserDevice device) {
        Intrinsics.checkNotNullParameter(device, "device");
        this.f149945a = device;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f149945a, ((d) obj2).f149945a);
    }

    public final int hashCode() {
        return this.f149945a.hashCode();
    }
}
