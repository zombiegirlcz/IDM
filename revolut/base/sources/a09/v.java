package a09;

/* JADX INFO: loaded from: classes4.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u09.v f287a;

    public v(u09.v vVar) {
        this.f287a = vVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && this.f287a == ((v) obj2).f287a;
    }

    public final int hashCode() {
        u09.v vVar = this.f287a;
        if (vVar == null) {
            return 0;
        }
        return vVar.hashCode();
    }
}
