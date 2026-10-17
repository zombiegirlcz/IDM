package to7;

import kl7.s0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0 f272544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f272545b;

    public q(s0 fuelType, String displayName) {
        Intrinsics.checkNotNullParameter(fuelType, "fuelType");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        this.f272544a = fuelType;
        this.f272545b = displayName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f272544a == qVar.f272544a && Intrinsics.f(this.f272545b, qVar.f272545b);
    }

    public final int hashCode() {
        return this.f272545b.hashCode() + (this.f272544a.hashCode() * 31);
    }
}
