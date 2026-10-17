package e3e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f3e.d f122261a;

    public k(f3e.d boundaries) {
        Intrinsics.checkNotNullParameter(boundaries, "boundaries");
        this.f122261a = boundaries;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f122261a, ((k) obj2).f122261a);
    }

    public final int hashCode() {
        return this.f122261a.hashCode();
    }
}
