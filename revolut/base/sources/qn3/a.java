package qn3;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f247868a;

    public a(long j2) {
        this.f247868a = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f247868a == ((a) obj2).f247868a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f247868a);
    }
}
