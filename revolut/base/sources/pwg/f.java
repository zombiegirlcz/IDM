package pwg;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f240460a;

    public f(float f) {
        this.f240460a = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Float.compare(this.f240460a, ((f) obj2).f240460a) == 0;
    }

    @Override // pwg.g
    public final float f() {
        return this.f240460a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f240460a);
    }
}
