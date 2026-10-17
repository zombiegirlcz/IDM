package wb;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f295988a;

    public c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f295988a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        return this.f295988a.equals(((c) obj2).f295988a);
    }

    public final int hashCode() {
        return this.f295988a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return v0.a.i(new StringBuilder("Encoding{name=\""), this.f295988a, "\"}");
    }
}
