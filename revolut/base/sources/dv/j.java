package dv;

/* JADX INFO: loaded from: classes16.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f118009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f118010b;

    public j(float f, long j2) {
        this.f118009a = f;
        this.f118010b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Float.compare(this.f118009a, jVar.f118009a) == 0 && this.f118010b == jVar.f118010b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f118010b) + (Float.hashCode(this.f118009a) * 31);
    }
}
