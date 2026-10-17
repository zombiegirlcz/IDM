package oq;

/* JADX INFO: loaded from: classes17.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227696a;

    public d(boolean z) {
        this.f227696a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f227696a == ((d) obj2).f227696a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227696a);
    }
}
