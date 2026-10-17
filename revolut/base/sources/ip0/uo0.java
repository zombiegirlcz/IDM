package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class uo0 implements qv0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166710a;

    public uo0(boolean z) {
        this.f166710a = z;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.f166710a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof uo0) && this.f166710a == ((uo0) obj2).f166710a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f166710a);
    }
}
