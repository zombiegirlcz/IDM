package yb;

/* JADX INFO: loaded from: classes.dex */
public final class m extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f312115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f312116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f312117c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f312118g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f312119h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f312120j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f312121l;

    public m(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f312115a = num;
        this.f312116b = str;
        this.f312117c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.f312118g = str6;
        this.f312119h = str7;
        this.i = str8;
        this.f312120j = str9;
        this.k = str10;
        this.f312121l = str11;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof a) {
            a aVar = (a) obj2;
            Integer num = this.f312115a;
            if (num != null ? num.equals(((m) aVar).f312115a) : ((m) aVar).f312115a == null) {
                String str = this.f312116b;
                if (str != null ? str.equals(((m) aVar).f312116b) : ((m) aVar).f312116b == null) {
                    String str2 = this.f312117c;
                    if (str2 != null ? str2.equals(((m) aVar).f312117c) : ((m) aVar).f312117c == null) {
                        String str3 = this.d;
                        if (str3 != null ? str3.equals(((m) aVar).d) : ((m) aVar).d == null) {
                            String str4 = this.e;
                            if (str4 != null ? str4.equals(((m) aVar).e) : ((m) aVar).e == null) {
                                String str5 = this.f;
                                if (str5 != null ? str5.equals(((m) aVar).f) : ((m) aVar).f == null) {
                                    String str6 = this.f312118g;
                                    if (str6 != null ? str6.equals(((m) aVar).f312118g) : ((m) aVar).f312118g == null) {
                                        String str7 = this.f312119h;
                                        if (str7 != null ? str7.equals(((m) aVar).f312119h) : ((m) aVar).f312119h == null) {
                                            String str8 = this.i;
                                            if (str8 != null ? str8.equals(((m) aVar).i) : ((m) aVar).i == null) {
                                                String str9 = this.f312120j;
                                                if (str9 != null ? str9.equals(((m) aVar).f312120j) : ((m) aVar).f312120j == null) {
                                                    String str10 = this.k;
                                                    if (str10 != null ? str10.equals(((m) aVar).k) : ((m) aVar).k == null) {
                                                        String str11 = this.f312121l;
                                                        if (str11 != null ? str11.equals(((m) aVar).f312121l) : ((m) aVar).f312121l == null) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f312115a;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f312116b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f312117c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f312118g;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f312119h;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.i;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f312120j;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.k;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f312121l;
        return (str11 != null ? str11.hashCode() : 0) ^ iHashCode11;
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb6.append(this.f312115a);
        sb6.append(", model=");
        sb6.append(this.f312116b);
        sb6.append(", hardware=");
        sb6.append(this.f312117c);
        sb6.append(", device=");
        sb6.append(this.d);
        sb6.append(", product=");
        sb6.append(this.e);
        sb6.append(", osBuild=");
        sb6.append(this.f);
        sb6.append(", manufacturer=");
        sb6.append(this.f312118g);
        sb6.append(", fingerprint=");
        sb6.append(this.f312119h);
        sb6.append(", locale=");
        sb6.append(this.i);
        sb6.append(", country=");
        sb6.append(this.f312120j);
        sb6.append(", mccMnc=");
        sb6.append(this.k);
        sb6.append(", applicationBuild=");
        return v0.a.i(sb6, this.f312121l, "}");
    }
}
