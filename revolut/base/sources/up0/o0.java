package up0;

/* JADX INFO: loaded from: classes19.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f281751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f281752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f281753c;
    public final long d;

    public o0(float f, float f4) {
        this.f281751a = f;
        this.f281752b = f4;
        this.f281753c = (long) (1000000000 * f);
        this.d = (long) (f * 1000);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return Float.compare(this.f281751a, o0Var.f281751a) == 0 && Float.compare(this.f281752b, o0Var.f281752b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f281752b) + (Float.hashCode(this.f281751a) * 31);
    }
}
