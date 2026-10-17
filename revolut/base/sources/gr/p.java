package gr;

/* JADX INFO: loaded from: classes17.dex */
public final class p implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f145790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f145791b;

    public p(long j2, long j3) {
        this.f145790a = j2;
        this.f145791b = j3;
    }

    @Override // gr.q
    public final long a() {
        return this.f145791b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f145790a == pVar.f145790a && this.f145791b == pVar.f145791b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f145791b) + (Long.hashCode(this.f145790a) * 31);
    }
}
