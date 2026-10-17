package xec;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f304576a;

    public d(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f304576a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f304576a, ((d) obj2).f304576a);
    }

    public final int hashCode() {
        return this.f304576a.hashCode();
    }
}
