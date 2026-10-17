package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class rl extends tl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f166202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f166203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f166204c;

    public rl(long j2, long j3, Long l2) {
        this.f166202a = j2;
        this.f166203b = j3;
        this.f166204c = l2;
    }

    @Override // ip0.tl, ip0.ul
    public final Integer a() {
        return null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof rl)) {
            return false;
        }
        rl rlVar = (rl) obj2;
        return this.f166202a == rlVar.f166202a && this.f166203b == rlVar.f166203b && this.f166204c.equals(rlVar.f166204c);
    }

    public final int hashCode() {
        return (this.f166204c.hashCode() + a0.d.c(Long.hashCode(this.f166202a) * 31, 31, this.f166203b)) * 31;
    }
}
