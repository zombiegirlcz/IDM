package op0;

/* JADX INFO: loaded from: classes19.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f227461b;

    public w(boolean z, boolean z3) {
        this.f227460a = z;
        this.f227461b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return this.f227460a == wVar.f227460a && this.f227461b == wVar.f227461b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227461b) + (Boolean.hashCode(this.f227460a) * 31);
    }
}
