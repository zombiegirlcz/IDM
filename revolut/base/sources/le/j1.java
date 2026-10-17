package le;

/* JADX INFO: loaded from: classes.dex */
public final class j1 extends l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f194306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f194307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f194308c;
    public final boolean d;

    public j1(int i, String str, boolean z, String str2) {
        this.f194306a = i;
        this.f194307b = str;
        this.f194308c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof l2) {
            j1 j1Var = (j1) ((l2) obj2);
            if (this.f194306a == j1Var.f194306a && this.f194307b.equals(j1Var.f194307b) && this.f194308c.equals(j1Var.f194308c) && this.d == j1Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f194306a ^ 1000003) * 1000003) ^ this.f194307b.hashCode()) * 1000003) ^ this.f194308c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("OperatingSystem{platform=");
        sb6.append(this.f194306a);
        sb6.append(", version=");
        sb6.append(this.f194307b);
        sb6.append(", buildVersion=");
        sb6.append(this.f194308c);
        sb6.append(", jailbroken=");
        return com.google.android.gms.internal.mlkit_vision_face.a.t(sb6, this.d, "}");
    }
}
