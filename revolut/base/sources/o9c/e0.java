package o9c;

/* JADX INFO: loaded from: classes6.dex */
public final class e0 implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f223191a;

    public e0(boolean z) {
        this.f223191a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e0) && this.f223191a == ((e0) obj2).f223191a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f223191a);
    }
}
