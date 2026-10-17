package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class s1 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1 f273039b;

    public s1(String id10, t1 t1Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f273038a = id10;
        this.f273039b = t1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj2;
        return Intrinsics.f(this.f273038a, s1Var.f273038a) && this.f273039b == s1Var.f273039b;
    }

    public final int hashCode() {
        int iHashCode = this.f273038a.hashCode() * 31;
        t1 t1Var = this.f273039b;
        return iHashCode + (t1Var == null ? 0 : t1Var.hashCode());
    }
}
