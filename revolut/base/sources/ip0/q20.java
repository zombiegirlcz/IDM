package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class q20 implements qv0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165914a;

    public q20(boolean z) {
        this.f165914a = z;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.f165914a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q20) && this.f165914a == ((q20) obj2).f165914a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165914a);
    }
}
