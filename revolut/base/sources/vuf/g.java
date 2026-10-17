package vuf;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f292368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f292369b;

    public g(long j2, long j3) {
        this.f292368a = j2;
        this.f292369b = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f292368a == gVar.f292368a && this.f292369b == gVar.f292369b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f292369b) + (Long.hashCode(this.f292368a) * 31);
    }
}
