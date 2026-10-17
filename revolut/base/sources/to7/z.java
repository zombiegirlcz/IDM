package to7;

import kl7.m2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class z implements y7a.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m2 f272555a;

    public z(m2 transmission) {
        Intrinsics.checkNotNullParameter(transmission, "transmission");
        this.f272555a = transmission;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z) && this.f272555a == ((z) obj2).f272555a;
    }

    public final int hashCode() {
        return this.f272555a.hashCode();
    }
}
