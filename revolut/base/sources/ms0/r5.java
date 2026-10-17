package ms0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class r5 implements t5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5 f208406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w5 f208407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w5 f208408c;
    public final w5 d;
    public final n5 e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o5 f208409g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f208410h;

    public r5(w5 color, w5 highlightedColor, w5 w5Var, w5 w5Var2, n5 linePosition, boolean z, o5 size, boolean z3) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(highlightedColor, "highlightedColor");
        Intrinsics.checkNotNullParameter(linePosition, "linePosition");
        Intrinsics.checkNotNullParameter(size, "size");
        this.f208406a = color;
        this.f208407b = highlightedColor;
        this.f208408c = w5Var;
        this.d = w5Var2;
        this.e = linePosition;
        this.f = z;
        this.f208409g = size;
        this.f208410h = z3;
    }

    @Override // ms0.t5
    public final w5 a() {
        return this.f208408c;
    }

    @Override // ms0.t5
    public final boolean b() {
        return this.f;
    }

    @Override // ms0.t5
    public final w5 c() {
        return this.d;
    }

    @Override // ms0.t5
    public final n5 d() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r5)) {
            return false;
        }
        r5 r5Var = (r5) obj2;
        return Intrinsics.f(this.f208406a, r5Var.f208406a) && Intrinsics.f(this.f208407b, r5Var.f208407b) && Intrinsics.f(this.f208408c, r5Var.f208408c) && Intrinsics.f(this.d, r5Var.d) && this.e == r5Var.e && this.f == r5Var.f && this.f208409g == r5Var.f208409g && this.f208410h == r5Var.f208410h;
    }

    @Override // ms0.t5
    public final o5 getSize() {
        return this.f208409g;
    }

    public final int hashCode() {
        int iHashCode = (this.f208407b.hashCode() + (this.f208406a.hashCode() * 31)) * 31;
        w5 w5Var = this.f208408c;
        int iHashCode2 = (iHashCode + (w5Var == null ? 0 : w5Var.hashCode())) * 31;
        w5 w5Var2 = this.d;
        return Boolean.hashCode(this.f208410h) + ((this.f208409g.hashCode() + j6.a.c((this.e.hashCode() + ((iHashCode2 + (w5Var2 != null ? w5Var2.hashCode() : 0)) * 31)) * 31, 31, this.f)) * 31);
    }
}
