package kp0;

/* JADX INFO: loaded from: classes19.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f187982a;

    public c1(int i) {
        this.f187982a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c1) && this.f187982a == ((c1) obj2).f187982a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f187982a) + (Integer.hashCode(1) * 31);
    }
}
