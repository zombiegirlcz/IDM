package wk4;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f298237a;

    public c(int i) {
        this.f298237a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f298237a == ((c) obj2).f298237a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f298237a);
    }
}
