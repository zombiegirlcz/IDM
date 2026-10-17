package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class io {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164720b;

    public io(boolean z, boolean z3) {
        this.f164719a = z;
        this.f164720b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof io)) {
            return false;
        }
        io ioVar = (io) obj2;
        return this.f164719a == ioVar.f164719a && this.f164720b == ioVar.f164720b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164720b) + (Boolean.hashCode(this.f164719a) * 31);
    }
}
