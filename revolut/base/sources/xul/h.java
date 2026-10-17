package xul;

import k4l.r0;

/* JADX INFO: loaded from: classes12.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f309118a;

    public h(r0 r0Var) {
        this.f309118a = r0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f309118a == ((h) obj2).f309118a;
    }

    public final int hashCode() {
        r0 r0Var = this.f309118a;
        if (r0Var == null) {
            return 0;
        }
        return r0Var.hashCode();
    }
}
