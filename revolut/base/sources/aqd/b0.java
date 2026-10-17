package aqd;

/* JADX INFO: loaded from: classes7.dex */
public final class b0 implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8328a;

    public b0(int i) {
        this.f8328a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b0) && this.f8328a == ((b0) obj2).f8328a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8328a);
    }
}
