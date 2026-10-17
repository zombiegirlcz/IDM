package y7a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f311446a;

    public q(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f311446a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f311446a, ((q) obj2).f311446a);
    }

    public final int hashCode() {
        return this.f311446a.hashCode();
    }
}
