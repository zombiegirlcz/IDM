package ie;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f160512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f160513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f160514c;

    public c(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f160512a = str;
        this.f160513b = str2;
        this.f160514c = str3;
    }

    public final boolean equals(Object obj2) {
        String str;
        String str2;
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof c) {
            c cVar = (c) obj2;
            String str3 = cVar.f160514c;
            String str4 = cVar.f160513b;
            if (this.f160512a.equals(cVar.f160512a) && ((str = this.f160513b) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f160514c) != null ? str2.equals(str3) : str3 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f160512a.hashCode() ^ 1000003) * 1000003;
        String str = this.f160513b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f160514c;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb6.append(this.f160512a);
        sb6.append(", firebaseInstallationId=");
        sb6.append(this.f160513b);
        sb6.append(", firebaseAuthenticationToken=");
        return v0.a.i(sb6, this.f160514c, "}");
    }
}
