package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class hw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164611c;

    public hw(boolean z, boolean z3, boolean z4) {
        this.f164609a = z;
        this.f164610b = z3;
        this.f164611c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof hw)) {
            return false;
        }
        hw hwVar = (hw) obj2;
        return this.f164609a == hwVar.f164609a && this.f164610b == hwVar.f164610b && this.f164611c == hwVar.f164611c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164611c) + j6.a.c(Boolean.hashCode(this.f164609a) * 31, 31, this.f164610b);
    }
}
