package cmf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25222a;

    public b(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f25222a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f25222a, ((b) obj2).f25222a);
    }

    public final int hashCode() {
        return this.f25222a.hashCode();
    }
}
