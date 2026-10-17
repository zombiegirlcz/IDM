package y7a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class t implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f311452a;

    public t(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f311452a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f311452a, ((t) obj2).f311452a);
    }

    public final int hashCode() {
        return this.f311452a.hashCode();
    }
}
