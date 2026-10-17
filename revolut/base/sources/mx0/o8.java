package mx0;

/* JADX INFO: loaded from: classes20.dex */
public final class o8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f209888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f209889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f209890c;
    public final float d;

    public o8(float f, float f4, float f5, float f6) {
        this.f209888a = f;
        this.f209889b = f4;
        this.f209890c = f5;
        this.d = f6;
    }

    public final float a() {
        return this.f209889b;
    }

    public final float b() {
        return this.f209890c;
    }

    public final float c() {
        return this.d;
    }

    public final float d() {
        return this.f209888a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o8)) {
            return false;
        }
        o8 o8Var = (o8) obj2;
        return Float.compare(this.f209888a, o8Var.f209888a) == 0 && Float.compare(this.f209889b, o8Var.f209889b) == 0 && Float.compare(this.f209890c, o8Var.f209890c) == 0 && Float.compare(this.d, o8Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + m72.b.b(this.f209890c, m72.b.b(this.f209889b, Float.hashCode(this.f209888a) * 31, 31), 31);
    }
}
