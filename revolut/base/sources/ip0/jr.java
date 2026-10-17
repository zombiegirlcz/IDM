package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class jr implements sr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f164902a;

    public jr(int i) {
        this.f164902a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof jr) && this.f164902a == ((jr) obj2).f164902a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f164902a);
    }
}
