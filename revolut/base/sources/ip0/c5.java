package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class c5 implements qv0.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163683a;

    public c5(boolean z) {
        this.f163683a = z;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.f163683a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c5) && this.f163683a == ((c5) obj2).f163683a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f163683a);
    }
}
