package ms0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s5 implements t5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5 f208423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w5 f208424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w5 f208425c;
    public final n5 d;
    public final boolean e;
    public final o5 f;

    public s5(w5 color, w5 w5Var, w5 w5Var2, n5 linePosition, boolean z, o5 size) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(linePosition, "linePosition");
        Intrinsics.checkNotNullParameter(size, "size");
        this.f208423a = color;
        this.f208424b = w5Var;
        this.f208425c = w5Var2;
        this.d = linePosition;
        this.e = z;
        this.f = size;
    }

    @Override // ms0.t5
    public final w5 a() {
        return this.f208424b;
    }

    @Override // ms0.t5
    public final boolean b() {
        return this.e;
    }

    @Override // ms0.t5
    public final w5 c() {
        return this.f208425c;
    }

    @Override // ms0.t5
    public final n5 d() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s5)) {
            return false;
        }
        s5 s5Var = (s5) obj2;
        return Intrinsics.f(this.f208423a, s5Var.f208423a) && Intrinsics.f(this.f208424b, s5Var.f208424b) && Intrinsics.f(this.f208425c, s5Var.f208425c) && this.d == s5Var.d && this.e == s5Var.e && this.f == s5Var.f;
    }

    @Override // ms0.t5
    public final o5 getSize() {
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = this.f208423a.hashCode() * 31;
        w5 w5Var = this.f208424b;
        int iHashCode2 = (iHashCode + (w5Var == null ? 0 : w5Var.hashCode())) * 31;
        w5 w5Var2 = this.f208425c;
        return this.f.hashCode() + j6.a.c((this.d.hashCode() + ((iHashCode2 + (w5Var2 != null ? w5Var2.hashCode() : 0)) * 31)) * 31, 31, this.e);
    }
}
