package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class z5 extends h6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273195a;

    public z5(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f273195a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z5) && Intrinsics.f(this.f273195a, ((z5) obj2).f273195a);
    }

    public final int hashCode() {
        return this.f273195a.hashCode();
    }
}
