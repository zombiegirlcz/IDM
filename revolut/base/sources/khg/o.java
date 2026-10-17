package khg;

/* JADX INFO: loaded from: classes9.dex */
public final class o implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f184132a;

    public o(boolean z) {
        this.f184132a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && this.f184132a == ((o) obj2).f184132a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f184132a);
    }
}
