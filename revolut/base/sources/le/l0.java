package le;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f194325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f194326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f194327c;
    public final String d;
    public final String e;
    public final String f;

    public l0(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f194325a = str;
        this.f194326b = str2;
        this.f194327c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj2) {
        String str;
        String str2;
        String str3;
        String str4;
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof v1) {
            l0 l0Var = (l0) ((v1) obj2);
            String str5 = l0Var.f;
            String str6 = l0Var.e;
            String str7 = l0Var.d;
            String str8 = l0Var.f194327c;
            if (this.f194325a.equals(l0Var.f194325a) && this.f194326b.equals(l0Var.f194326b) && ((str = this.f194327c) != null ? str.equals(str8) : str8 == null) && ((str2 = this.d) != null ? str2.equals(str7) : str7 == null) && ((str3 = this.e) != null ? str3.equals(str6) : str6 == null) && ((str4 = this.f) != null ? str4.equals(str5) : str5 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f194325a.hashCode() ^ 1000003) * 1000003) ^ this.f194326b.hashCode()) * 1000003;
        String str = this.f194327c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.e;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("Application{identifier=");
        sb6.append(this.f194325a);
        sb6.append(", version=");
        sb6.append(this.f194326b);
        sb6.append(", displayVersion=");
        sb6.append(this.f194327c);
        sb6.append(", organization=null, installationUuid=");
        sb6.append(this.d);
        sb6.append(", developmentPlatform=");
        sb6.append(this.e);
        sb6.append(", developmentPlatformVersion=");
        return v0.a.i(sb6, this.f, "}");
    }
}
