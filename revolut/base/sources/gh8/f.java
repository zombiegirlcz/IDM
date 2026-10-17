package gh8;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f143884a;

    public f(int i) {
        this.f143884a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f143884a == ((f) obj2).f143884a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f143884a);
    }
}
