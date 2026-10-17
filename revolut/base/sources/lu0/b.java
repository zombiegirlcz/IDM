package lu0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f199982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f199983b;

    public b(String id10, int i) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f199982a = id10;
        this.f199983b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f199982a, bVar.f199982a) && this.f199983b == bVar.f199983b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f199983b) + (this.f199982a.hashCode() * 31);
    }
}
