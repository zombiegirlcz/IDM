package s01;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class p implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f258803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f258804b;

    public p(String id10, String name) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f258803a = id10;
        this.f258804b = name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f258803a, pVar.f258803a) && Intrinsics.f(this.f258804b, pVar.f258804b);
    }

    public final int hashCode() {
        return this.f258804b.hashCode() + (this.f258803a.hashCode() * 31);
    }
}
