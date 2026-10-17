package n33;

/* JADX INFO: loaded from: classes21.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f211732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f211733b;

    public i(boolean z, boolean z3) {
        this.f211732a = z;
        this.f211733b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f211732a == iVar.f211732a && this.f211733b == iVar.f211733b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f211733b) + (Boolean.hashCode(this.f211732a) * 31);
    }
}
