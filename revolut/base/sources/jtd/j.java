package jtd;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f178481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f178482b;

    public j(long j2, int i) {
        this.f178481a = j2;
        this.f178482b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f178481a == jVar.f178481a && this.f178482b == jVar.f178482b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f178482b) + (Long.hashCode(this.f178481a) * 31);
    }
}
