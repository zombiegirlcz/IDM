package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class mb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165351b;

    public mb(boolean z, boolean z3) {
        this.f165350a = z;
        this.f165351b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof mb)) {
            return false;
        }
        mb mbVar = (mb) obj2;
        return this.f165350a == mbVar.f165350a && this.f165351b == mbVar.f165351b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165351b) + (Boolean.hashCode(this.f165350a) * 31);
    }
}
