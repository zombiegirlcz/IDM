package khj;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f184149a;

    public f(int i) {
        this.f184149a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f184149a == ((f) obj2).f184149a;
    }

    @Override // khj.i
    public final String getId() {
        return "ID_ALL_PLANS_OPTION";
    }

    public final int hashCode() {
        return Integer.hashCode(this.f184149a);
    }
}
