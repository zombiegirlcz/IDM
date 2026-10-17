package fci;

/* JADX INFO: loaded from: classes10.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f133762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f133763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f133764c;
    public final float d;

    public b0(float f, float f4, float f5, float f6) {
        this.f133762a = f;
        this.f133763b = f4;
        this.f133764c = f5;
        this.d = f6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Float.compare(this.f133762a, b0Var.f133762a) == 0 && Float.compare(this.f133763b, b0Var.f133763b) == 0 && Float.compare(this.f133764c, b0Var.f133764c) == 0 && Float.compare(this.d, b0Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + m72.b.b(this.f133764c, m72.b.b(this.f133763b, Float.hashCode(this.f133762a) * 31, 31), 31);
    }
}
