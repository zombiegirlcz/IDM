package hs3;

/* JADX INFO: loaded from: classes21.dex */
public final class c0 implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f154873a;

    public c0(int i) {
        this.f154873a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c0) && this.f154873a == ((c0) obj2).f154873a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f154873a);
    }
}
