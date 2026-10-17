package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class hl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164573b;

    public hl(boolean z, boolean z3) {
        this.f164572a = z;
        this.f164573b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof hl)) {
            return false;
        }
        hl hlVar = (hl) obj2;
        return this.f164572a == hlVar.f164572a && this.f164573b == hlVar.f164573b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164573b) + (Boolean.hashCode(this.f164572a) * 31);
    }
}
