package jr;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class b1 {

    @NotNull
    public static final a1 Companion = new a1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f177764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f177765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f177766c;
    public final float d;
    public final float e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f177767g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f177768h;
    public final float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f177769j;
    public final float k;

    public /* synthetic */ b1(int i, float f, float f4, float f5, float f6, float f32, float f35, float f36, float f37, float f41, float f42, float f57) {
        if (2047 != (i & 2047)) {
            qlm.j1.f(z0.f177880a.getDescriptor(), i, 2047);
            throw null;
        }
        this.f177764a = f;
        this.f177765b = f4;
        this.f177766c = f5;
        this.d = f6;
        this.e = f32;
        this.f = f35;
        this.f177767g = f36;
        this.f177768h = f37;
        this.i = f41;
        this.f177769j = f42;
        this.k = f57;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj2;
        return Float.compare(this.f177764a, b1Var.f177764a) == 0 && Float.compare(this.f177765b, b1Var.f177765b) == 0 && Float.compare(this.f177766c, b1Var.f177766c) == 0 && Float.compare(this.d, b1Var.d) == 0 && Float.compare(this.e, b1Var.e) == 0 && Float.compare(this.f, b1Var.f) == 0 && Float.compare(this.f177767g, b1Var.f177767g) == 0 && Float.compare(this.f177768h, b1Var.f177768h) == 0 && Float.compare(this.i, b1Var.i) == 0 && Float.compare(this.f177769j, b1Var.f177769j) == 0 && Float.compare(this.k, b1Var.k) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.k) + m72.b.b(this.f177769j, m72.b.b(this.i, m72.b.b(this.f177768h, m72.b.b(this.f177767g, m72.b.b(this.f, m72.b.b(this.e, m72.b.b(this.d, m72.b.b(this.f177766c, m72.b.b(this.f177765b, Float.hashCode(this.f177764a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
