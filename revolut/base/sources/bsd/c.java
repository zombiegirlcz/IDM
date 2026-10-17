package bsd;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18164a;

    public c(int i) {
        this.f18164a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f18164a == ((c) obj2).f18164a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18164a);
    }
}
