package fa1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class t extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f133216a;

    public t(String deviceName) {
        Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        this.f133216a = deviceName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f133216a, ((t) obj2).f133216a);
    }

    public final int hashCode() {
        return this.f133216a.hashCode();
    }
}
