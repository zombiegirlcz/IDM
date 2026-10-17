package tof;

/* JADX INFO: loaded from: classes8.dex */
public final class u9 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f273107a;

    public u9(boolean z) {
        this.f273107a = z;
    }

    public final boolean a() {
        return this.f273107a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u9) && this.f273107a == ((u9) obj2).f273107a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f273107a);
    }
}
