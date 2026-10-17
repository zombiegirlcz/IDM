package oq;

/* JADX INFO: loaded from: classes17.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227694a;

    public b(boolean z) {
        this.f227694a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f227694a == ((b) obj2).f227694a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227694a);
    }
}
