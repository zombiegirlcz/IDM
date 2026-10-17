package yf;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f313106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f313107b;

    public a(String str, String str2) {
        this.f313106a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f313107b = str2;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof a) {
            a aVar = (a) obj2;
            if (this.f313106a.equals(aVar.f313106a) && this.f313107b.equals(aVar.f313107b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f313106a.hashCode() ^ 1000003) * 1000003) ^ this.f313107b.hashCode();
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("LibraryVersion{libraryName=");
        sb6.append(this.f313106a);
        sb6.append(", version=");
        return v0.a.i(sb6, this.f313107b, "}");
    }
}
