package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class zv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f167541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167542b;

    public zv(boolean z, boolean z3) {
        this.f167541a = z;
        this.f167542b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zv)) {
            return false;
        }
        zv zvVar = (zv) obj2;
        return this.f167541a == zvVar.f167541a && this.f167542b == zvVar.f167542b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f167542b) + (Boolean.hashCode(this.f167541a) * 31);
    }
}
