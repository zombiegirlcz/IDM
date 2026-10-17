package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class se0 implements te0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f166344a;

    public se0(int i) {
        this.f166344a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof se0) && this.f166344a == ((se0) obj2).f166344a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f166344a);
    }
}
