package le;

/* JADX INFO: loaded from: classes.dex */
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f194334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f194335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f194336c;
    public final String d;
    public final int e;
    public final ao.h f;

    public m1(String str, String str2, String str3, String str4, int i, ao.h hVar) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f194334a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f194335b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f194336c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.d = str4;
        this.e = i;
        this.f = hVar;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof m1) {
            m1 m1Var = (m1) obj2;
            if (this.f194334a.equals(m1Var.f194334a) && this.f194335b.equals(m1Var.f194335b) && this.f194336c.equals(m1Var.f194336c) && this.d.equals(m1Var.d) && this.e == m1Var.e && this.f.equals(m1Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.f194334a.hashCode() ^ 1000003) * 1000003) ^ this.f194335b.hashCode()) * 1000003) ^ this.f194336c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f194334a + ", versionCode=" + this.f194335b + ", versionName=" + this.f194336c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f + "}";
    }
}
