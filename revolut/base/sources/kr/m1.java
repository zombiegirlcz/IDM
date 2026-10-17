package kr;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class m1 {

    @NotNull
    public static final l1 Companion = new l1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f188529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f188530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f188531c;
    public final float d;
    public final float e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f188532g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f188533h;
    public final float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f188534j;
    public final float k;

    public m1(float f, float f4, float f5, float f6, float f32, float f35, float f36, float f37, float f41, float f42, float f57) {
        this.f188529a = f;
        this.f188530b = f4;
        this.f188531c = f5;
        this.d = f6;
        this.e = f32;
        this.f = f35;
        this.f188532g = f36;
        this.f188533h = f37;
        this.i = f41;
        this.f188534j = f42;
        this.k = f57;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj2;
        return Float.compare(this.f188529a, m1Var.f188529a) == 0 && Float.compare(this.f188530b, m1Var.f188530b) == 0 && Float.compare(this.f188531c, m1Var.f188531c) == 0 && Float.compare(this.d, m1Var.d) == 0 && Float.compare(this.e, m1Var.e) == 0 && Float.compare(this.f, m1Var.f) == 0 && Float.compare(this.f188532g, m1Var.f188532g) == 0 && Float.compare(this.f188533h, m1Var.f188533h) == 0 && Float.compare(this.i, m1Var.i) == 0 && Float.compare(this.f188534j, m1Var.f188534j) == 0 && Float.compare(this.k, m1Var.k) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.k) + m72.b.b(this.f188534j, m72.b.b(this.i, m72.b.b(this.f188533h, m72.b.b(this.f188532g, m72.b.b(this.f, m72.b.b(this.e, m72.b.b(this.d, m72.b.b(this.f188531c, m72.b.b(this.f188530b, Float.hashCode(this.f188529a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public /* synthetic */ m1(int i, float f, float f4, float f5, float f6, float f32, float f35, float f36, float f37, float f41, float f42, float f57) {
        if (2047 != (i & 2047)) {
            qlm.j1.f(k1.f188517a.getDescriptor(), i, 2047);
            throw null;
        }
        this.f188529a = f;
        this.f188530b = f4;
        this.f188531c = f5;
        this.d = f6;
        this.e = f32;
        this.f = f35;
        this.f188532g = f36;
        this.f188533h = f37;
        this.i = f41;
        this.f188534j = f42;
        this.k = f57;
    }
}
