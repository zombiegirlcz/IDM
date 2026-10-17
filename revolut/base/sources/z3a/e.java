package z3a;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f319231a;

    public e(boolean z) {
        this.f319231a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f319231a == ((e) obj2).f319231a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f319231a);
    }
}
