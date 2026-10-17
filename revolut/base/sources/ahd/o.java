package ahd;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4952a;

    public o(boolean z) {
        this.f4952a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && this.f4952a == ((o) obj2).f4952a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4952a);
    }
}
