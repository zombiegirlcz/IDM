package dv;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gv.d f118002a;

    public d(gv.d state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f118002a = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f118002a, ((d) obj2).f118002a);
    }

    public final int hashCode() {
        return this.f118002a.hashCode();
    }
}
