package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class gx implements qv0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164475a;

    public gx(boolean z) {
        this.f164475a = z;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.f164475a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof gx) && this.f164475a == ((gx) obj2).f164475a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164475a);
    }
}
