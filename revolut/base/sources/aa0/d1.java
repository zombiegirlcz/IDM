package aa0;

/* JADX INFO: loaded from: classes19.dex */
public final class d1 implements g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2727a;

    public d1(boolean z) {
        this.f2727a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d1) && this.f2727a == ((d1) obj2).f2727a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2727a);
    }
}
