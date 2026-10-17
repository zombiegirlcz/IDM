package gnh;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f145001a;

    public h() {
        this(3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f145001a == ((h) obj2).f145001a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f145001a);
    }

    public h(int i) {
        this.f145001a = i;
    }
}
