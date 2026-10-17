package nhg;

/* JADX INFO: loaded from: classes9.dex */
public final class w implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f215487a;

    public w(boolean z) {
        this.f215487a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && this.f215487a == ((w) obj2).f215487a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f215487a);
    }
}
