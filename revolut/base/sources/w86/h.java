package w86;

import com.revolut.feature.devicemanagement.api.model.UserDevice;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserDevice f295595a;

    public h(UserDevice device) {
        Intrinsics.checkNotNullParameter(device, "device");
        this.f295595a = device;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f295595a, ((h) obj2).f295595a);
    }

    public final int hashCode() {
        return this.f295595a.hashCode();
    }
}
