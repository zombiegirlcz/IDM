package szg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f266812a;

    public b(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f266812a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f266812a, ((b) obj2).f266812a);
    }

    public final int hashCode() {
        return this.f266812a.hashCode();
    }
}
