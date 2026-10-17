package uz;

/* JADX INFO: loaded from: classes16.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f284532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f284533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f284534c;
    public float d;

    public k0(float f, float f4, float f5, float f6) {
        this.f284532a = f;
        this.f284533b = f4;
        this.f284534c = f5;
        this.d = f6;
    }

    public static k0 a(k0 k0Var) {
        float f = k0Var.f284532a;
        float f4 = k0Var.f284533b;
        float f5 = k0Var.f284534c;
        float f6 = k0Var.d;
        k0Var.getClass();
        return new k0(f, f4, f5, f6);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return Float.compare(this.f284532a, k0Var.f284532a) == 0 && Float.compare(this.f284533b, k0Var.f284533b) == 0 && Float.compare(this.f284534c, k0Var.f284534c) == 0 && Float.compare(this.d, k0Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + m72.b.b(this.f284534c, m72.b.b(this.f284533b, Float.hashCode(this.f284532a) * 31, 31), 31);
    }
}
