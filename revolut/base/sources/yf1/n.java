package yf1;

/* JADX INFO: loaded from: classes20.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qf1.c f313126a;

    public n(qf1.c cVar) {
        this.f313126a = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && this.f313126a == ((n) obj2).f313126a;
    }

    public final int hashCode() {
        qf1.c cVar = this.f313126a;
        if (cVar == null) {
            return 0;
        }
        return cVar.hashCode();
    }
}
