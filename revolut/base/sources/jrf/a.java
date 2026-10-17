package jrf;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f178003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f178004b;

    public a(long j2, boolean z) {
        this.f178003a = j2;
        this.f178004b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f178003a == aVar.f178003a && this.f178004b == aVar.f178004b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f178004b) + (Long.hashCode(this.f178003a) * 31);
    }
}
