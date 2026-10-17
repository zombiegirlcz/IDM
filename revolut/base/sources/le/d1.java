package le;

/* JADX INFO: loaded from: classes.dex */
public final class d1 extends g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f194245a;

    public d1(String str) {
        this.f194245a = str;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof g2)) {
            return false;
        }
        return this.f194245a.equals(((d1) ((g2) obj2)).f194245a);
    }

    public final int hashCode() {
        return this.f194245a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return v0.a.i(new StringBuilder("Log{content="), this.f194245a, "}");
    }
}
