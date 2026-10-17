package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class mh implements qv0.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165380a;

    public mh(boolean z) {
        this.f165380a = z;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.f165380a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof mh) && this.f165380a == ((mh) obj2).f165380a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165380a);
    }
}
