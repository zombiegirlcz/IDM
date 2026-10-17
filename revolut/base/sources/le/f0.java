package le;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f194260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f194261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f194262c;

    public f0(String str, String str2, String str3) {
        this.f194260a = str;
        this.f194261b = str2;
        this.f194262c = str3;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof p1) {
            f0 f0Var = (f0) ((p1) obj2);
            if (this.f194260a.equals(f0Var.f194260a) && this.f194261b.equals(f0Var.f194261b) && this.f194262c.equals(f0Var.f194262c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f194260a.hashCode() ^ 1000003) * 1000003) ^ this.f194261b.hashCode()) * 1000003) ^ this.f194262c.hashCode();
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb6.append(this.f194260a);
        sb6.append(", libraryName=");
        sb6.append(this.f194261b);
        sb6.append(", buildId=");
        return v0.a.i(sb6, this.f194262c, "}");
    }
}
