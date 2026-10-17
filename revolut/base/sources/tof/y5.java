package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class y5 extends h6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273181a;

    public y5(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f273181a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y5) && Intrinsics.f(this.f273181a, ((y5) obj2).f273181a);
    }

    public final int hashCode() {
        return this.f273181a.hashCode();
    }
}
