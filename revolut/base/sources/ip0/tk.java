package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class tk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f166534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f166535b;

    public tk(int i, int i2) {
        this.f166534a = i;
        this.f166535b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof tk)) {
            return false;
        }
        tk tkVar = (tk) obj2;
        return this.f166534a == tkVar.f166534a && this.f166535b == tkVar.f166535b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f166535b) + (Integer.hashCode(this.f166534a) * 31);
    }
}
