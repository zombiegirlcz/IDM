package cqh;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f108102a;

    public b(int i) {
        this.f108102a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f108102a == ((b) obj2).f108102a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f108102a);
    }
}
