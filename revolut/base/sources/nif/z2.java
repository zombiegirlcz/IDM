package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y2 f216090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0 f216091b;

    public z2(y2 y2Var, v0 v0Var) {
        this.f216090a = y2Var;
        this.f216091b = v0Var;
    }

    public final v0 a() {
        return this.f216091b;
    }

    public final y2 b() {
        return this.f216090a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z2)) {
            return false;
        }
        z2 z2Var = (z2) obj2;
        return Intrinsics.f(this.f216090a, z2Var.f216090a) && Intrinsics.f(this.f216091b, z2Var.f216091b);
    }

    public final int hashCode() {
        y2 y2Var = this.f216090a;
        int iHashCode = (y2Var == null ? 0 : y2Var.hashCode()) * 31;
        v0 v0Var = this.f216091b;
        return iHashCode + (v0Var != null ? v0Var.hashCode() : 0);
    }
}
