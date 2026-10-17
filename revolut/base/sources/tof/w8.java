package tof;

/* JADX INFO: loaded from: classes8.dex */
public final class w8 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f273147a;

    public w8(boolean z) {
        this.f273147a = z;
    }

    public final boolean a() {
        return this.f273147a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w8) && this.f273147a == ((w8) obj2).f273147a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f273147a);
    }
}
