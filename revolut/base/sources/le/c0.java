package le;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends o2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f194221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f194222c;
    public final int d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f194223g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f194224h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f194225j;
    public final n2 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t1 f194226l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final q1 f194227m;

    public c0(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, n2 n2Var, t1 t1Var, q1 q1Var) {
        this.f194221b = str;
        this.f194222c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.f194223g = str5;
        this.f194224h = str6;
        this.i = str7;
        this.f194225j = str8;
        this.k = n2Var;
        this.f194226l = t1Var;
        this.f194227m = q1Var;
    }

    public final b0 a() {
        b0 b0Var = new b0();
        b0Var.f194206a = this.f194221b;
        b0Var.f194207b = this.f194222c;
        b0Var.f194208c = this.d;
        b0Var.d = this.e;
        b0Var.e = this.f;
        b0Var.f = this.f194223g;
        b0Var.f194209g = this.f194224h;
        b0Var.f194210h = this.i;
        b0Var.i = this.f194225j;
        b0Var.f194211j = this.k;
        b0Var.k = this.f194226l;
        b0Var.f194212l = this.f194227m;
        b0Var.f194213m = (byte) 1;
        return b0Var;
    }

    public final boolean equals(Object obj2) {
        String str;
        String str2;
        String str3;
        n2 n2Var;
        t1 t1Var;
        q1 q1Var;
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof o2) {
            c0 c0Var = (c0) ((o2) obj2);
            q1 q1Var2 = c0Var.f194227m;
            t1 t1Var2 = c0Var.f194226l;
            n2 n2Var2 = c0Var.k;
            String str4 = c0Var.f194224h;
            String str5 = c0Var.f194223g;
            String str6 = c0Var.f;
            if (this.f194221b.equals(c0Var.f194221b) && this.f194222c.equals(c0Var.f194222c) && this.d == c0Var.d && this.e.equals(c0Var.e) && ((str = this.f) != null ? str.equals(str6) : str6 == null) && ((str2 = this.f194223g) != null ? str2.equals(str5) : str5 == null) && ((str3 = this.f194224h) != null ? str3.equals(str4) : str4 == null) && this.i.equals(c0Var.i) && this.f194225j.equals(c0Var.f194225j) && ((n2Var = this.k) != null ? n2Var.equals(n2Var2) : n2Var2 == null) && ((t1Var = this.f194226l) != null ? t1Var.equals(t1Var2) : t1Var2 == null) && ((q1Var = this.f194227m) != null ? q1Var.equals(q1Var2) : q1Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f194221b.hashCode() ^ 1000003) * 1000003) ^ this.f194222c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        String str = this.f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f194223g;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f194224h;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.f194225j.hashCode()) * 1000003;
        n2 n2Var = this.k;
        int iHashCode5 = (iHashCode4 ^ (n2Var == null ? 0 : n2Var.hashCode())) * 1000003;
        t1 t1Var = this.f194226l;
        int iHashCode6 = (iHashCode5 ^ (t1Var == null ? 0 : t1Var.hashCode())) * 1000003;
        q1 q1Var = this.f194227m;
        return iHashCode6 ^ (q1Var != null ? q1Var.hashCode() : 0);
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f194221b + ", gmpAppId=" + this.f194222c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f + ", firebaseAuthenticationToken=" + this.f194223g + ", appQualitySessionId=" + this.f194224h + ", buildVersion=" + this.i + ", displayVersion=" + this.f194225j + ", session=" + this.k + ", ndkPayload=" + this.f194226l + ", appExitInfo=" + this.f194227m + "}";
    }
}
