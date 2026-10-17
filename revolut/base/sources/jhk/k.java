package jhk;

/* JADX INFO: loaded from: classes11.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f174296a;

    public k(boolean z) {
        this.f174296a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f174296a == ((k) obj2).f174296a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f174296a);
    }
}
