package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d6 extends h6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272691a;

    public d6(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f272691a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d6) && Intrinsics.f(this.f272691a, ((d6) obj2).f272691a);
    }

    public final int hashCode() {
        return this.f272691a.hashCode();
    }
}
