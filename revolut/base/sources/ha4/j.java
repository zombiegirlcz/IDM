package ha4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f150444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f150445b;

    public j(dj0.d value, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f150444a = id10;
        this.f150445b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f150444a, jVar.f150444a) && Intrinsics.f(this.f150445b, jVar.f150445b);
    }

    public final int hashCode() {
        return this.f150445b.hashCode() + (this.f150444a.hashCode() * 31);
    }
}
