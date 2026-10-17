package snf;

/* JADX INFO: loaded from: classes8.dex */
public final class e0 implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f264578a;

    public e0() {
        this(false);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e0) && this.f264578a == ((e0) obj2).f264578a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f264578a);
    }

    public e0(boolean z) {
        this.f264578a = z;
    }
}
