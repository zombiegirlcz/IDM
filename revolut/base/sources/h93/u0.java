package h93;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class u0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f150162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f150163b;

    public u0(boolean z, t0 t0Var) {
        this.f150162a = z;
        this.f150163b = t0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj2;
        return this.f150162a == u0Var.f150162a && Intrinsics.f(this.f150163b, u0Var.f150163b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f150162a) * 31;
        t0 t0Var = this.f150163b;
        return iHashCode + (t0Var == null ? 0 : t0Var.hashCode());
    }
}
