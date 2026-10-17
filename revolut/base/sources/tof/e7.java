package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e7 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272736a;

    public e7(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f272736a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e7) && Intrinsics.f(this.f272736a, ((e7) obj2).f272736a);
    }

    public final String getId() {
        return this.f272736a;
    }

    public final int hashCode() {
        return this.f272736a.hashCode();
    }
}
