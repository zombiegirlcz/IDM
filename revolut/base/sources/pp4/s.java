package pp4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f238271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f238272b;

    public s(String id10, String userName) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(userName, "userName");
        this.f238271a = id10;
        this.f238272b = userName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f238271a, sVar.f238271a) && Intrinsics.f(this.f238272b, sVar.f238272b);
    }

    public final int hashCode() {
        return this.f238272b.hashCode() + (this.f238271a.hashCode() * 31);
    }
}
