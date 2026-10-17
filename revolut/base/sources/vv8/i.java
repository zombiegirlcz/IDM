package vv8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t3i.i f292482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f292483b;

    public i(t3i.i scanResult, int i) {
        Intrinsics.checkNotNullParameter(scanResult, "scanResult");
        this.f292482a = scanResult;
        this.f292483b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f292482a, iVar.f292482a) && this.f292483b == iVar.f292483b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f292483b) + (this.f292482a.hashCode() * 31);
    }
}
