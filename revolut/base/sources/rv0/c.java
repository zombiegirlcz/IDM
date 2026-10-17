package rv0;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f257634a;

    public c(int i) {
        this.f257634a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f257634a == ((c) obj2).f257634a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f257634a);
    }
}
