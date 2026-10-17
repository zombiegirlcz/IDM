package hs3;

/* JADX INFO: loaded from: classes21.dex */
public final class b0 implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f154868a;

    public b0(int i) {
        this.f154868a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b0) && this.f154868a == ((b0) obj2).f154868a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f154868a);
    }
}
