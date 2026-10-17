package wwf;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f300651a;

    public a(long j2) {
        this.f300651a = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f300651a == ((a) obj2).f300651a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f300651a);
    }
}
