package pj7;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f236685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f236686b;

    public j(boolean z, long j2) {
        this.f236685a = z;
        this.f236686b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f236685a == jVar.f236685a && this.f236686b == jVar.f236686b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f236686b) + (Boolean.hashCode(this.f236685a) * 31);
    }
}
