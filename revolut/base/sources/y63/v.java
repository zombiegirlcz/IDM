package y63;

/* JADX INFO: loaded from: classes21.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mf8.d f311145a;

    public v(mf8.d dVar) {
        this.f311145a = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && this.f311145a == ((v) obj2).f311145a;
    }

    public final int hashCode() {
        mf8.d dVar = this.f311145a;
        if (dVar == null) {
            return 0;
        }
        return dVar.hashCode();
    }
}
