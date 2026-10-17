package com.fourthline.orca.internal;

import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes23.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f35466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f35467c;
    private String d;
    private String e;
    private String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f35468g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f35469a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final List f35470b = zhm.v.k("ABW", "AFG", "AFI", "AGO", "AIA", "ALA", "ALB", "AND", "ANT", "ARE", "ARG", "ARM", "ASC", "ASM", "ATA", "ATB", "ATF", "ATG", "ATN", "AUS", "AUT", "AZE", "BDI", "BDS", "BEL", "BEN", "BES", "BFA", "BGD", "BGR", "BHR", "BHS", "BIH", "BLM", "BLR", "BLZ", "BMU", "BOL", "BRA", "BRB", "BRN", "BRU", "BTN", "BUR", "BVT", "BWA", "BYS", "CAF", "CAN", "CCK", "CDN", "CHE", "CHL", "CHN", "CIV", "CMR", "COD", "COG", "COK", "COL", "COM", "CPT", "CPV", "CRI", "CSK", "CTE", "CUB", "CUW", "CXR", "CYM", "CYP", "CZE", "DDR", "DEU", "DGA", "DHY", "DJI", "DMA", "DNK", "DOM", "DZA", "EAK", "EAT", "EAU", "EAZ", "ECU", "EGY", "ERI", "ESH", "ESP", "EST", "ETH", "FIN", "FJI", "FLK", "FRA", "FRO", "FSM", "FXX", "FYP", "FYR", "GAB", "GBA", "GBD", "GBG", "GBJ", "GBM", "GBN", "GBO", "GBP", "GBR", "GBS", "GBZ", "GCA", "GEL", "GEO", "GGY", "GHA", "GIB", "GIN", "GLP", "GMB", "GNB", "GNQ", "GRC", "GRD", "GRL", "GTM", "GUF", "GUM", "GUY", "HKG", "HKJ", "HMD", "HND", "HRV", "HTI", "HUN", "HVO", "IDN", "IMN", "IND", "INT", "IOT", "IRL", "IRN", "IRQ", "ISL", "ISR", "ITA", "JAM", "JEY", "JOR", "JPN", "JTN", "KAZ", "KEN", "KGZ", "KHM", "KIR", "KNA", "KOR", "KWT", "LAO", "LBN", "LBR", "LBY", "LCA", "LIE", "LKA", "LSO", "LTU", "LUX", "LVA", "MAC", "MAF", "MAL", "MAR", "MCO", "MDA", "MDG", "MDV", "MEX", "MHL", "MID", "MKD", "MLI", "MLT", "MMR", "MNE", "MNG", "MNP", "MOZ", "MRT", "MSR", "MTQ", "MUS", "MWI", "MYS", "MYT", "NAM", "NCL", "NER", "NFK", "NGA", "NHB", "NIC", "NIU", "NLD", "NOR", "NPL", "NRU", "NTZ", "NZL", "OMN", "PAK", "PAN", "PCI", "PCN", "PCZ", "PER", "PHI", "PHL", "PLW", "PNG", "POL", "PRI", "PRK", "PRT", "PRY", "PSE", "PUS", "PYF", "QAT", "RCA", "RCB", "RCH", "REU", "RHO", "RKS", "RMM", "RNR", "ROK", "ROM", "ROU", "RSM", "RSR", "RUS", "RWA", "SAU", "SCG", "SDN", "SEN", "SGP", "SGS", "SHN", "SJM", "SKM", "SLB", "SLE", "SLO", "SLV", "SME", "SMR", "SOM", "SPM", "SRB", "SSD", "STP", "SUN", "SUR", "SVK", "SVN", "SWE", "SWZ", "SXM", "SYC", "SYR", "TAA", "TCA", "TCD", "TGO", "THA", "TJK", "TKL", "TKM", "TLS", "TMN", "TMP", "TON", "TTO", "TUN", "TUR", "TUV", "TWN", "TZA", "UAP", "UGA", "UKR", "UMI", "UNA", "UNK", "UNO", "URY", "USA", "UZB", "VAT", "VCT", "VDR", "VEN", "VGB", "VIR", "VNM", "VUT", "WAG", "WAK", "WAL", "WAN", "WLF", "WSM", "XEC", "XKS", "XKX", "YEM", "YMD", "YUG", "ZAF", "ZAR", "ZMB", "ZRE", "ZWE");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f35471c = 8;

        private a() {
        }

        private final String b(String str) {
            return Intrinsics.f(str, "D") ? "DEU" : str;
        }

        public final boolean a(String country) {
            Intrinsics.checkNotNullParameter(country, "country");
            List list = f35470b;
            String strB = b(country);
            Locale ROOT = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String upperCase = strB.toUpperCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return list.contains(upperCase);
        }
    }

    public z(String str, Integer num, String str2, String str3, String str4, String str5, String str6) {
        this.f35465a = str;
        this.f35466b = num;
        this.f35467c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.f35468g = str6;
    }

    public final void a(Integer num) {
        this.f35466b = num;
    }

    public final void b(String str) {
        this.e = str;
    }

    public final String c() {
        return this.f;
    }

    public final void d(String str) {
        this.d = str;
    }

    public final void e(String str) {
        this.f35465a = str;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f35465a, zVar.f35465a) && Intrinsics.f(this.f35466b, zVar.f35466b) && Intrinsics.f(this.f35467c, zVar.f35467c) && Intrinsics.f(this.d, zVar.d) && Intrinsics.f(this.e, zVar.e) && Intrinsics.f(this.f, zVar.f) && Intrinsics.f(this.f35468g, zVar.f35468g);
    }

    public final void f(String str) {
        this.f35467c = str;
    }

    public final String g() {
        return this.f35468g;
    }

    public final String h() {
        return this.f35465a;
    }

    public int hashCode() {
        String str = this.f35465a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f35466b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f35467c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f35468g;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final Integer i() {
        return this.f35466b;
    }

    public final String j() {
        return this.f35467c;
    }

    public final boolean k() {
        Integer num = this.f35466b;
        return num != null && num.intValue() >= 0;
    }

    public final boolean l() {
        if (this.f35465a != null) {
            return !kotlin.text.d0.W(r0);
        }
        return false;
    }

    public final boolean m() {
        return l() && k() && f() && b() && d();
    }

    public String toString() {
        return "AddressBundle(street=" + this.f35465a + ", streetNumber=" + this.f35466b + ", streetNumberSuffix=" + this.f35467c + ", postalCode=" + this.d + ", city=" + this.e + ", countryCode=" + this.f + ", region=" + this.f35468g + ")";
    }

    public final String a() {
        return this.e;
    }

    public final boolean b() {
        if (this.e != null) {
            return !kotlin.text.d0.W(r0);
        }
        return false;
    }

    public final void c(String str) {
        this.f = str;
    }

    public final boolean d() {
        String str = this.f;
        if (str != null) {
            return a.f35469a.a(str);
        }
        return false;
    }

    public final String e() {
        return this.d;
    }

    public final boolean f() {
        String str = this.d;
        if (str != null) {
            return a(str);
        }
        return false;
    }

    private final boolean a(String str) {
        return new Regex("^[a-zA-Z0-9-\\s]{3,}+$").f(str) && !kotlin.text.d0.W(str);
    }

    public /* synthetic */ z(String str, Integer num, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6);
    }
}
