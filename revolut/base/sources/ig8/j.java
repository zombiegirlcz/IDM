package ig8;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f161096a;

    public j(boolean z) {
        this.f161096a = z;
    }

    @Override // ig8.l
    public final boolean a() {
        return this.f161096a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && this.f161096a == ((j) obj2).f161096a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f161096a);
    }
}
