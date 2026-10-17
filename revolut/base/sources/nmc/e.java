package nmc;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f217266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f217267b;

    public e(int i, int i2) {
        this.f217266a = i;
        this.f217267b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f217266a == eVar.f217266a && this.f217267b == eVar.f217267b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f217267b) + (Integer.hashCode(this.f217266a) * 31);
    }
}
