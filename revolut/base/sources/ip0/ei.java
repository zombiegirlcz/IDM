package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class ei {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164106b;

    public ei(boolean z, boolean z3) {
        this.f164105a = z;
        this.f164106b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ei)) {
            return false;
        }
        ei eiVar = (ei) obj2;
        return this.f164105a == eiVar.f164105a && this.f164106b == eiVar.f164106b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164106b) + (Boolean.hashCode(this.f164105a) * 31);
    }
}
