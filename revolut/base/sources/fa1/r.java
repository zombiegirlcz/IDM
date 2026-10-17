package fa1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class r extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f133213a;

    public r(String deviceName) {
        Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        this.f133213a = deviceName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f133213a, ((r) obj2).f133213a);
    }

    public final int hashCode() {
        return this.f133213a.hashCode();
    }
}
