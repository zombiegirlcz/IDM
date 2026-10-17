package ix0;

/* JADX INFO: loaded from: classes20.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f169229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f169230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f169231c;

    public f0(float f, float f4, float f5) {
        this.f169229a = f;
        this.f169230b = f4;
        this.f169231c = f5;
    }

    public final float a() {
        return this.f169229a;
    }

    public final float b() {
        return this.f169230b;
    }

    public final float c() {
        return this.f169231c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Float.compare(this.f169229a, f0Var.f169229a) == 0 && Float.compare(this.f169230b, f0Var.f169230b) == 0 && Float.compare(this.f169231c, f0Var.f169231c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f169231c) + m72.b.b(this.f169230b, Float.hashCode(this.f169229a) * 31, 31);
    }
}
