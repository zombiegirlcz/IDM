package aw;

/* JADX INFO: loaded from: classes16.dex */
public final class x implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10218b;

    public x(float f, long j2) {
        this.f10217a = f;
        this.f10218b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Float.compare(this.f10217a, xVar.f10217a) == 0 && this.f10218b == xVar.f10218b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f10218b) + (Float.hashCode(this.f10217a) * 31);
    }
}
