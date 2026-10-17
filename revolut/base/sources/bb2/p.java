package bb2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class p implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14150a;

    public p(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f14150a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f14150a, ((p) obj2).f14150a);
    }

    public final int hashCode() {
        return this.f14150a.hashCode();
    }
}
