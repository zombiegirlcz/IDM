package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c6 extends h6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272667a;

    public c6(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f272667a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c6) && Intrinsics.f(this.f272667a, ((c6) obj2).f272667a);
    }

    public final int hashCode() {
        return this.f272667a.hashCode();
    }
}
