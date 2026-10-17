package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class vb extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273122a;

    public vb(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f273122a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof vb) && Intrinsics.f(this.f273122a, ((vb) obj2).f273122a);
    }

    public final String getId() {
        return this.f273122a;
    }

    public final int hashCode() {
        return this.f273122a.hashCode();
    }
}
