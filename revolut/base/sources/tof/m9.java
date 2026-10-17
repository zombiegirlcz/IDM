package tof;

/* JADX INFO: loaded from: classes8.dex */
public final class m9 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f272936a;

    public m9(boolean z) {
        this.f272936a = z;
    }

    public final boolean a() {
        return this.f272936a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m9) && this.f272936a == ((m9) obj2).f272936a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f272936a);
    }
}
