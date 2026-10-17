package pwg;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f240459a;

    public e(float f) {
        this.f240459a = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Float.compare(this.f240459a, ((e) obj2).f240459a) == 0;
    }

    @Override // pwg.g
    public final float f() {
        return this.f240459a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f240459a);
    }
}
