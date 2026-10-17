package tof;

/* JADX INFO: loaded from: classes8.dex */
public final class h9 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f272788a;

    public h9(boolean z) {
        this.f272788a = z;
    }

    public final boolean a() {
        return this.f272788a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h9) && this.f272788a == ((h9) obj2).f272788a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f272788a);
    }
}
