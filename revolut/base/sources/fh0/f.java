package fh0;

/* JADX INFO: loaded from: classes19.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f135122a;

    public f(long j2) {
        this.f135122a = j2;
    }

    public final long a() {
        return this.f135122a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f135122a == ((f) obj2).f135122a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f135122a);
    }
}
