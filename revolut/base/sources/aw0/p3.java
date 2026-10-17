package aw0;

/* JADX INFO: loaded from: classes19.dex */
public final class p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10463b;

    public p3(float f, long j2) {
        this.f10462a = f;
        this.f10463b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p3)) {
            return false;
        }
        p3 p3Var = (p3) obj2;
        return Float.compare(this.f10462a, p3Var.f10462a) == 0 && this.f10463b == p3Var.f10463b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f10463b) + (Float.hashCode(this.f10462a) * 31);
    }
}
