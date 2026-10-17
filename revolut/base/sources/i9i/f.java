package i9i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f159884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f159885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f159886c;

    public f(String id10, int i, int i2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f159884a = id10;
        this.f159885b = i;
        this.f159886c = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f159884a, fVar.f159884a) && this.f159885b == fVar.f159885b && this.f159886c == fVar.f159886c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f159886c) + j6.a.b(this.f159885b, this.f159884a.hashCode() * 31, 31);
    }
}
