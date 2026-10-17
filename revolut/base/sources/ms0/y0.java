package ms0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class y0 implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f208493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0 f208494b;

    public y0(v0 v0Var, v0 v0Var2) {
        this.f208493a = v0Var;
        this.f208494b = v0Var2;
    }

    @Override // ms0.z0
    public final v0 a() {
        return this.f208493a;
    }

    @Override // ms0.z0
    public final v0 b() {
        return this.f208494b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj2;
        return Intrinsics.f(this.f208493a, y0Var.f208493a) && Intrinsics.f(this.f208494b, y0Var.f208494b);
    }

    public final int hashCode() {
        v0 v0Var = this.f208493a;
        int iHashCode = (v0Var == null ? 0 : v0Var.hashCode()) * 31;
        v0 v0Var2 = this.f208494b;
        return iHashCode + (v0Var2 != null ? v0Var2.hashCode() : 0);
    }
}
