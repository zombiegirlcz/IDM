package a09;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u09.v f259a;

    public g(u09.v vVar) {
        this.f259a = vVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f259a == ((g) obj2).f259a;
    }

    public final int hashCode() {
        u09.v vVar = this.f259a;
        if (vVar == null) {
            return 0;
        }
        return vVar.hashCode();
    }
}
