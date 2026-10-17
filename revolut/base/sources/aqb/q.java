package aqb;

/* JADX INFO: loaded from: classes6.dex */
public final class q implements jki.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8296a;

    public q(boolean z) {
        this.f8296a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && this.f8296a == ((q) obj2).f8296a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8296a);
    }
}
