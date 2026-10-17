package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class de implements qv0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163884a;

    public de(boolean z) {
        this.f163884a = z;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.f163884a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof de) && this.f163884a == ((de) obj2).f163884a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f163884a);
    }
}
