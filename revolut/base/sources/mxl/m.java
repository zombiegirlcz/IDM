package mxl;

/* JADX INFO: loaded from: classes12.dex */
public final class m extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f210274a;

    public m(int i) {
        this.f210274a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && this.f210274a == ((m) obj2).f210274a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f210274a);
    }
}
