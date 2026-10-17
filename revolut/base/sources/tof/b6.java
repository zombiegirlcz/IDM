package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b6 extends h6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272648a;

    public b6(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f272648a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b6) && Intrinsics.f(this.f272648a, ((b6) obj2).f272648a);
    }

    public final int hashCode() {
        return this.f272648a.hashCode();
    }
}
