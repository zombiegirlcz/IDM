package lya;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f200767a;

    public a(long j2) {
        this.f200767a = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f200767a == ((a) obj2).f200767a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f200767a);
    }
}
