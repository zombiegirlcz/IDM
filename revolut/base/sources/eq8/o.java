package eq8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f128398a;

    public o(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f128398a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f128398a, ((o) obj2).f128398a);
    }

    public final int hashCode() {
        return this.f128398a.hashCode();
    }
}
