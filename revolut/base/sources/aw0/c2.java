package aw0;

/* JADX INFO: loaded from: classes19.dex */
public final class c2 implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10253a;

    public c2(int i) {
        this.f10253a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c2) && this.f10253a == ((c2) obj2).f10253a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10253a);
    }
}
