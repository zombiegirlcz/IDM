package uv;

/* JADX INFO: loaded from: classes16.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f283254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f283255b;

    public d(float f, long j2) {
        this.f283254a = f;
        this.f283255b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Float.compare(this.f283254a, dVar.f283254a) == 0 && this.f283255b == dVar.f283255b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f283255b) + (Float.hashCode(this.f283254a) * 31);
    }
}
