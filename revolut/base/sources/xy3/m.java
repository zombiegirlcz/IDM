package xy3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements ht3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f309583a;

    public m(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f309583a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f309583a, ((m) obj2).f309583a);
    }

    public final int hashCode() {
        return this.f309583a.hashCode();
    }
}
