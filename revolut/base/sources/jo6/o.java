package jo6;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f176882a;

    public o(boolean z) {
        this.f176882a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && this.f176882a == ((o) obj2).f176882a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f176882a);
    }
}
