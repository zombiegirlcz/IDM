package y4g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f310921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f310922b;

    public g(String email, j jVar) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.f310921a = email;
        this.f310922b = jVar;
    }

    public static g a(g gVar, String email, j jVar, int i) {
        if ((i & 1) != 0) {
            email = gVar.f310921a;
        }
        if ((i & 2) != 0) {
            jVar = gVar.f310922b;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(email, "email");
        return new g(email, jVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f310921a, gVar.f310921a) && Intrinsics.f(this.f310922b, gVar.f310922b);
    }

    public final int hashCode() {
        int iHashCode = this.f310921a.hashCode() * 31;
        j jVar = this.f310922b;
        return iHashCode + (jVar == null ? 0 : jVar.hashCode());
    }
}
