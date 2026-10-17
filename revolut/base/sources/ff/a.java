package ff;

import a5h.g;

/* JADX INFO: loaded from: classes17.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f134676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f134677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f134678c;
    public final b d;
    public final d e;

    public a(String str, String str2, String str3, b bVar, d dVar) {
        this.f134676a = str;
        this.f134677b = str2;
        this.f134678c = str3;
        this.d = bVar;
        this.e = dVar;
    }

    public static g a() {
        return new g();
    }

    public final b b() {
        return this.d;
    }

    public final String c() {
        return this.f134677b;
    }

    public final String d() {
        return this.f134678c;
    }

    public final d e() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof a) {
            a aVar = (a) obj2;
            d dVar = aVar.e;
            b bVar = aVar.d;
            String str = aVar.f134678c;
            String str2 = aVar.f134677b;
            String str3 = aVar.f134676a;
            String str4 = this.f134676a;
            if (str4 != null ? str4.equals(str3) : str3 == null) {
                String str5 = this.f134677b;
                if (str5 != null ? str5.equals(str2) : str2 == null) {
                    String str6 = this.f134678c;
                    if (str6 != null ? str6.equals(str) : str == null) {
                        b bVar2 = this.d;
                        if (bVar2 != null ? bVar2.equals(bVar) : bVar == null) {
                            d dVar2 = this.e;
                            if (dVar2 != null ? dVar2.equals(dVar) : dVar == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f134676a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f134677b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f134678c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        b bVar = this.d;
        int iHashCode4 = (iHashCode3 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        d dVar = this.e;
        return (dVar != null ? dVar.hashCode() : 0) ^ iHashCode4;
    }

    public final String toString() {
        return "InstallationResponse{uri=" + this.f134676a + ", fid=" + this.f134677b + ", refreshToken=" + this.f134678c + ", authToken=" + this.d + ", responseCode=" + this.e + "}";
    }
}
