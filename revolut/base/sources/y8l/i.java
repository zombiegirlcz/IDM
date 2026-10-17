package y8l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f311687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f311688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f311689c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f311690g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f311691h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f311692j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f311693l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f311694m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f311695n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f311696p;

    public i(String str, j type, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f311687a = str;
        this.f311688b = type;
        this.f311689c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.f311690g = str6;
        this.f311691h = str7;
        this.i = str8;
        this.f311692j = str9;
        this.k = str10;
        this.f311693l = str11;
        this.f311694m = str12;
        this.f311695n = str13;
        this.o = str14;
        this.f311696p = str15;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f311687a, iVar.f311687a) && this.f311688b == iVar.f311688b && Intrinsics.f(this.f311689c, iVar.f311689c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f311690g, iVar.f311690g) && Intrinsics.f(this.f311691h, iVar.f311691h) && Intrinsics.f(this.i, iVar.i) && Intrinsics.f(this.f311692j, iVar.f311692j) && Intrinsics.f(this.k, iVar.k) && Intrinsics.f(this.f311693l, iVar.f311693l) && Intrinsics.f(this.f311694m, iVar.f311694m) && Intrinsics.f(this.f311695n, iVar.f311695n) && Intrinsics.f(this.o, iVar.o) && Intrinsics.f(this.f311696p, iVar.f311696p);
    }

    public final int hashCode() {
        String str = this.f311687a;
        int iHashCode = (this.f311688b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.f311689c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f311690g;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f311691h;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.i;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f311692j;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.k;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f311693l;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f311694m;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f311695n;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.o;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f311696p;
        return iHashCode14 + (str15 != null ? str15.hashCode() : 0);
    }
}
