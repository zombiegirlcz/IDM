package yo6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f315607a;

    public b(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f315607a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f315607a, ((b) obj2).f315607a);
    }

    public final int hashCode() {
        return this.f315607a.hashCode();
    }
}
