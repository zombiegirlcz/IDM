package zx0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f326003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f326004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f326005c;

    public l(String id10, int i, int i2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f326003a = id10;
        this.f326004b = i;
        this.f326005c = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f326003a, lVar.f326003a) && this.f326004b == lVar.f326004b && this.f326005c == lVar.f326005c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f326005c) + j6.a.b(this.f326004b, this.f326003a.hashCode() * 31, 31);
    }
}
