package ne6;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f214419a;

    public a(int i) {
        this.f214419a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f214419a == ((a) obj2).f214419a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f214419a);
    }
}
