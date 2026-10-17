package pjc;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f236727a;

    public f(int i) {
        this.f236727a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f236727a == ((f) obj2).f236727a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f236727a);
    }
}
