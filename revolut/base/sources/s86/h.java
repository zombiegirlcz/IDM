package s86;

import aii.r;
import com.revolut.feature.devicemanagement.api.model.UserDevice;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserDevice f260906a;

    public h(UserDevice device) {
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter("DEVICE_ACTIONS_LOGOUT_LIST_ID", "loadingTag");
        this.f260906a = device;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f260906a.equals(((h) obj2).f260906a);
    }

    public final int hashCode() {
        return (this.f260906a.hashCode() * 31) - 879735214;
    }
}
