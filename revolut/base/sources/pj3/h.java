package pj3;

/* JADX INFO: loaded from: classes21.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f236637a;

    public h(int i) {
        this.f236637a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f236637a == ((h) obj2).f236637a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f236637a);
    }
}
