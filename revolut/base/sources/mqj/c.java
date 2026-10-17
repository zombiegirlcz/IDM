package mqj;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f208016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f208017b;

    public c(long j2, long j3) {
        this.f208016a = j2;
        this.f208017b = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f208016a == cVar.f208016a && this.f208017b == cVar.f208017b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f208017b) + (Long.hashCode(this.f208016a) * 31);
    }
}
