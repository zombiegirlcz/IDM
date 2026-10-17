package to7;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements y7a.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f272547a;

    public t(int i) {
        this.f272547a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && this.f272547a == ((t) obj2).f272547a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f272547a);
    }
}
