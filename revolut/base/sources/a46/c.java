package a46;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1197a;

    public c(long j2) {
        this.f1197a = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f1197a == ((c) obj2).f1197a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1197a);
    }
}
