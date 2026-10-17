package fa1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class s extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f133214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f133215b;

    public s(String deviceName, int i) {
        Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        this.f133214a = deviceName;
        this.f133215b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f133214a, sVar.f133214a) && this.f133215b == sVar.f133215b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f133215b) + (this.f133214a.hashCode() * 31);
    }
}
