package yna;

/* JADX INFO: loaded from: classes5.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f315301a;

    public a0(boolean z) {
        this.f315301a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a0) && this.f315301a == ((a0) obj2).f315301a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f315301a);
    }
}
