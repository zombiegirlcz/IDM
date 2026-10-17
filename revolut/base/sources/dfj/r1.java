package dfj;

/* JADX INFO: loaded from: classes11.dex */
public final class r1 extends s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f114086a;

    public r1(boolean z) {
        this.f114086a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r1) && this.f114086a == ((r1) obj2).f114086a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f114086a);
    }
}
