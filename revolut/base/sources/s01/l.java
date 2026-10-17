package s01;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class l implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f258797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f258798b;

    public l(String id10, String name) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f258797a = id10;
        this.f258798b = name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f258797a, lVar.f258797a) && Intrinsics.f(this.f258798b, lVar.f258798b);
    }

    public final int hashCode() {
        return this.f258798b.hashCode() + (this.f258797a.hashCode() * 31);
    }
}
