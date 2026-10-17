package dej;

import com.revolut.feature.devicemanagement.api.model.UserDevice;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class q3 implements s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserDevice f113630a;

    public q3(UserDevice userDevice) {
        this.f113630a = userDevice;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q3) && Intrinsics.f(this.f113630a, ((q3) obj2).f113630a);
    }

    public final int hashCode() {
        UserDevice userDevice = this.f113630a;
        if (userDevice == null) {
            return 0;
        }
        return userDevice.hashCode();
    }
}
