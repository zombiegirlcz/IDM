package to7;

import kl7.s0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements y7a.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0 f272543a;

    public p(s0 fuelType) {
        Intrinsics.checkNotNullParameter(fuelType, "fuelType");
        this.f272543a = fuelType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && this.f272543a == ((p) obj2).f272543a;
    }

    public final int hashCode() {
        return this.f272543a.hashCode();
    }
}
