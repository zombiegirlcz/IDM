package ar8;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8530a;

    public d(boolean z) {
        this.f8530a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f8530a == ((d) obj2).f8530a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8530a);
    }
}
