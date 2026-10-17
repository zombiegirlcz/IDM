package qw0;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f249727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f249728b;

    public c(boolean z, boolean z3) {
        this.f249727a = z;
        this.f249728b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f249727a == cVar.f249727a && this.f249728b == cVar.f249728b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f249728b) + (Boolean.hashCode(this.f249727a) * 31);
    }
}
