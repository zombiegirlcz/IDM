package sc1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f261605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f261606b;

    public d(List discoveredDevices, boolean z) {
        Intrinsics.checkNotNullParameter(discoveredDevices, "discoveredDevices");
        this.f261605a = discoveredDevices;
        this.f261606b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f261605a, dVar.f261605a) && this.f261606b == dVar.f261606b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f261606b) + (this.f261605a.hashCode() * 31);
    }
}
