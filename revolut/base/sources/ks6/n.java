package ks6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u0000  2\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b\u0010\u0010\u001bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\b\u0010\u0004R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004¨\u0006!"}, d2 = {"Lks6/n;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "bin", "b", "h", "lastFour", "Lks6/m;", "c", "Lks6/m;", "()Lks6/m;", "checks", "d", "g", "expiry", "e", "i", "scheme", "f", "j", "type", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "commercial", "brand", "countryName", "countryCode", "Companion", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("bin")
    private final String bin;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("lastFour")
    private final String lastFour;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("checks")
    private final m checks;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("expiry")
    private final String expiry;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("scheme")
    private final String scheme;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("type")
    private final String type;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("commercial")
    private final Boolean commercial;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("brand")
    private final String brand;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("countryName")
    private final String countryName;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("countryCode")
    private final String countryCode;

    public n(String str, String str2, m mVar, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8) {
        this.bin = str;
        this.lastFour = str2;
        this.checks = mVar;
        this.expiry = str3;
        this.scheme = str4;
        this.type = str5;
        this.commercial = bool;
        this.brand = str6;
        this.countryName = str7;
        this.countryCode = str8;
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
    public final m getChecks() {
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
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.bin, nVar.bin) && Intrinsics.f(this.lastFour, nVar.lastFour) && Intrinsics.f(this.checks, nVar.checks) && Intrinsics.f(this.expiry, nVar.expiry) && Intrinsics.f(this.scheme, nVar.scheme) && Intrinsics.f(this.type, nVar.type) && Intrinsics.f(this.commercial, nVar.commercial) && Intrinsics.f(this.brand, nVar.brand) && Intrinsics.f(this.countryName, nVar.countryName) && Intrinsics.f(this.countryCode, nVar.countryCode);
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
        m mVar = this.checks;
        int iHashCode3 = (iHashCode2 + (mVar == null ? 0 : mVar.hashCode())) * 31;
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
