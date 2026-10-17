package aw0;

/* JADX INFO: loaded from: classes19.dex */
public final class z7 implements b8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10645a;

    public z7(int i) {
        this.f10645a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z7) && this.f10645a == ((z7) obj2).f10645a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10645a);
    }
}
