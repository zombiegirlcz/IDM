package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class aa implements qv0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163415a;

    public aa(boolean z) {
        this.f163415a = z;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.f163415a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof aa) && this.f163415a == ((aa) obj2).f163415a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f163415a);
    }
}
