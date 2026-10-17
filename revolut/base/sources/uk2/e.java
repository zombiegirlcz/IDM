package uk2;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f280647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f280648b;

    public e(int i, int i2) {
        this.f280647a = i;
        this.f280648b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f280647a == eVar.f280647a && this.f280648b == eVar.f280648b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f280648b) + (Integer.hashCode(this.f280647a) * 31);
    }
}
