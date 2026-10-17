package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class t5 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u5 f273088b;

    public t5(String id10, u5 u5Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f273087a = id10;
        this.f273088b = u5Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t5)) {
            return false;
        }
        t5 t5Var = (t5) obj2;
        return Intrinsics.f(this.f273087a, t5Var.f273087a) && Intrinsics.f(this.f273088b, t5Var.f273088b);
    }

    public final int hashCode() {
        int iHashCode = this.f273087a.hashCode() * 31;
        u5 u5Var = this.f273088b;
        return iHashCode + (u5Var == null ? 0 : u5Var.hashCode());
    }
}
