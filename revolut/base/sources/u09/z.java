package u09;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f276158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f276159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f276160c;
    public final g0 d;

    public z(y progress, boolean z, String courseId, g0 g0Var) {
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(courseId, "courseId");
        this.f276158a = progress;
        this.f276159b = z;
        this.f276160c = courseId;
        this.d = g0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return this.f276158a == zVar.f276158a && this.f276159b == zVar.f276159b && Intrinsics.f(this.f276160c, zVar.f276160c) && Intrinsics.f(this.d, zVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(j6.a.c(this.f276158a.hashCode() * 31, 31, this.f276159b), 31, this.f276160c);
        g0 g0Var = this.d;
        return iC + (g0Var == null ? 0 : g0Var.hashCode());
    }
}
