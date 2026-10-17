package ig8;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f161097a;

    public k(boolean z) {
        this.f161097a = z;
    }

    @Override // ig8.l
    public final boolean a() {
        return this.f161097a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f161097a == ((k) obj2).f161097a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f161097a);
    }
}
