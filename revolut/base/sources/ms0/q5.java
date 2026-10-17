package ms0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q5 implements t5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5 f208387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w5 f208388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w5 f208389c;
    public final n5 d;
    public final boolean e;
    public final o5 f;

    public q5(w5 color, w5 w5Var, w5 w5Var2, n5 linePosition, boolean z, o5 size) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(linePosition, "linePosition");
        Intrinsics.checkNotNullParameter(size, "size");
        this.f208387a = color;
        this.f208388b = w5Var;
        this.f208389c = w5Var2;
        this.d = linePosition;
        this.e = z;
        this.f = size;
    }

    @Override // ms0.t5
    public final w5 a() {
        return this.f208388b;
    }

    @Override // ms0.t5
    public final boolean b() {
        return this.e;
    }

    @Override // ms0.t5
    public final w5 c() {
        return this.f208389c;
    }

    @Override // ms0.t5
    public final n5 d() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q5)) {
            return false;
        }
        q5 q5Var = (q5) obj2;
        return Intrinsics.f(this.f208387a, q5Var.f208387a) && Intrinsics.f(this.f208388b, q5Var.f208388b) && Intrinsics.f(this.f208389c, q5Var.f208389c) && this.d == q5Var.d && this.e == q5Var.e && this.f == q5Var.f;
    }

    @Override // ms0.t5
    public final o5 getSize() {
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = this.f208387a.hashCode() * 31;
        w5 w5Var = this.f208388b;
        int iHashCode2 = (iHashCode + (w5Var == null ? 0 : w5Var.hashCode())) * 31;
        w5 w5Var2 = this.f208389c;
        return this.f.hashCode() + j6.a.c((this.d.hashCode() + ((iHashCode2 + (w5Var2 != null ? w5Var2.hashCode() : 0)) * 31)) * 31, 31, this.e);
    }
}
