package f3e;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f131969a;

    public g(boolean z) {
        this.f131969a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f131969a == ((g) obj2).f131969a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f131969a);
    }
}
