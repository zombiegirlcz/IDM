package ty8;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f275521a;

    public h(int i) {
        this.f275521a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f275521a == ((h) obj2).f275521a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f275521a);
    }
}
