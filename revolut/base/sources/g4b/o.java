package g4b;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f140455a;

    public o(k performance) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        this.f140455a = performance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f140455a, ((o) obj2).f140455a);
    }

    public final int hashCode() {
        return this.f140455a.hashCode();
    }
}
