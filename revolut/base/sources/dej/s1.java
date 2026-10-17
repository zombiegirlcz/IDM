package dej;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113647b;

    public s1(String id10, String token) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(token, "token");
        this.f113646a = id10;
        this.f113647b = token;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj2;
        return Intrinsics.f(this.f113646a, s1Var.f113646a) && Intrinsics.f(this.f113647b, s1Var.f113647b);
    }

    public final int hashCode() {
        return this.f113647b.hashCode() + (this.f113646a.hashCode() * 31);
    }

    public final String toString() {
        return j6.a.q("id:", this.f113646a);
    }
}
