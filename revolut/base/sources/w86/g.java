package w86;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f295594a;

    public g(String deviceId) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        this.f295594a = deviceId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f295594a, ((g) obj2).f295594a);
    }

    public final int hashCode() {
        return this.f295594a.hashCode();
    }
}
