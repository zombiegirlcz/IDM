package le;

/* JADX INFO: loaded from: classes.dex */
public final class k1 extends m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f194321a;

    public k1(String str) {
        this.f194321a = str;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof m2)) {
            return false;
        }
        return this.f194321a.equals(((k1) ((m2) obj2)).f194321a);
    }

    public final int hashCode() {
        return this.f194321a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return v0.a.i(new StringBuilder("User{identifier="), this.f194321a, "}");
    }
}
