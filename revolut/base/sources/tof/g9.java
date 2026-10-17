package tof;

/* JADX INFO: loaded from: classes8.dex */
public final class g9 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f272770a;

    public g9(boolean z) {
        this.f272770a = z;
    }

    public final boolean a() {
        return this.f272770a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g9) && this.f272770a == ((g9) obj2).f272770a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f272770a);
    }
}
