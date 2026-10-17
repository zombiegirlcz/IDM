package aa0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2740a;

    public r(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f2740a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f2740a, ((r) obj2).f2740a);
    }

    public final int hashCode() {
        return this.f2740a.hashCode();
    }
}
