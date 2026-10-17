package ryj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f258403a;

    public l(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f258403a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f258403a, ((l) obj2).f258403a);
    }

    public final int hashCode() {
        return this.f258403a.hashCode();
    }
}
