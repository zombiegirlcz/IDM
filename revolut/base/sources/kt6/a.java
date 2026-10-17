package kt6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0002\u0005\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b\u0010\u0010\u001bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\b\u0010\u0004R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004¨\u0006!"}, d2 = {"Lkt6/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "bin", "b", "h", "lastFour", "Lkt6/a$a;", "c", "Lkt6/a$a;", "()Lkt6/a$a;", "checks", "d", "g", "expiry", "e", "i", "scheme", "f", "j", "type", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "commercial", "brand", "countryName", "countryCode", "Companion", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("bin")
    private final String bin;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("lastFour")
    private final String lastFour;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @b("checks")
    private final C1075a checks;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @b("expiry")
    private final String expiry;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @b("scheme")
    private final String scheme;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @b("type")
    private final String type;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @b("commercial")
    private final Boolean commercial;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @b("brand")
    private final String brand;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @b("country")
    private final String countryName;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @b("countryCode")
    private final String countryCode;

    /* JADX INFO: renamed from: kt6.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\f\u0010\u0004¨\u0006\u000f"}, d2 = {"Lkt6/a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "avsLine1", "b", "avsPostal", "c", "cvv", "d", "threeds", "Companion", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1075a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @b("avsLine1")
        private final String avsLine1;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @b("avsPostal")
        private final String avsPostal;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @b("cvv")
        private final String cvv;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @b("threeds")
        private final String threeds;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAvsLine1() {
            return this.avsLine1;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getAvsPostal() {
            return this.avsPostal;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getCvv() {
            return this.cvv;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getThreeds() {
            return this.threeds;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C1075a)) {
                return false;
            }
            C1075a c1075a = (C1075a) obj2;
            return Intrinsics.f(this.avsLine1, c1075a.avsLine1) && Intrinsics.f(this.avsPostal, c1075a.avsPostal) && Intrinsics.f(this.cvv, c1075a.cvv) && Intrinsics.f(this.threeds, c1075a.threeds);
        }

        public final int hashCode() {
            String str = this.avsLine1;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.avsPostal;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.cvv;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.threeds;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBin() {
        return this.bin;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C1075a getChecks() {
        return this.checks;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getCommercial() {
        return this.commercial;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.bin, aVar.bin) && Intrinsics.f(this.lastFour, aVar.lastFour) && Intrinsics.f(this.checks, aVar.checks) && Intrinsics.f(this.expiry, aVar.expiry) && Intrinsics.f(this.scheme, aVar.scheme) && Intrinsics.f(this.type, aVar.type) && Intrinsics.f(this.commercial, aVar.commercial) && Intrinsics.f(this.brand, aVar.brand) && Intrinsics.f(this.countryName, aVar.countryName) && Intrinsics.f(this.countryCode, aVar.countryCode);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCountryName() {
        return this.countryName;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getExpiry() {
        return this.expiry;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getLastFour() {
        return this.lastFour;
    }

    public final int hashCode() {
        String str = this.bin;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lastFour;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        C1075a c1075a = this.checks;
        int iHashCode3 = (iHashCode2 + (c1075a == null ? 0 : c1075a.hashCode())) * 31;
        String str3 = this.expiry;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.scheme;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.type;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.commercial;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str6 = this.brand;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.countryName;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.countryCode;
        return iHashCode9 + (str8 != null ? str8.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getScheme() {
        return this.scheme;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
