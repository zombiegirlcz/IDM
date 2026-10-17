package pjc;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f236726a;

    public e(int i) {
        this.f236726a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f236726a == ((e) obj2).f236726a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f236726a);
    }
}
