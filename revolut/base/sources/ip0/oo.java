package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class oo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165701a;

    public oo(boolean z) {
        this.f165701a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof oo) && this.f165701a == ((oo) obj2).f165701a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165701a);
    }
}
