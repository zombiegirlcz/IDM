package oc8;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f224108a;

    public b(boolean z) {
        this.f224108a = z;
    }

    @Override // oc8.c
    public final boolean a() {
        return this.f224108a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f224108a == ((b) obj2).f224108a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f224108a);
    }
}
