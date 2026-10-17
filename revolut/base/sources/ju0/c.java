package ju0;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f178548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f178549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f178550c;

    public c(boolean z, long j2, long j3) {
        this.f178548a = z;
        this.f178549b = j2;
        this.f178550c = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f178548a == cVar.f178548a && this.f178549b == cVar.f178549b && this.f178550c == cVar.f178550c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f178550c) + a0.d.c(Boolean.hashCode(this.f178548a) * 31, 31, this.f178549b);
    }
}
