package j2c;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f170814a;

    public k(int i) {
        this.f170814a = i;
    }

    @Override // j2c.l
    public final int a() {
        return this.f170814a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f170814a == ((k) obj2).f170814a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f170814a);
    }
}
