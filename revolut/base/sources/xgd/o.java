package xgd;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f305687a;

    public o(boolean z) {
        this.f305687a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && this.f305687a == ((o) obj2).f305687a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f305687a);
    }
}
