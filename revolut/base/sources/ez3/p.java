package ez3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f130913a;

    public p(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f130913a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f130913a, ((p) obj2).f130913a);
    }

    public final int hashCode() {
        return this.f130913a.hashCode();
    }
}
