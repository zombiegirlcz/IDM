package bef;

import dj0.d;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14815c;
    public final d d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f14816g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f14817h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f14818j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f14819l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f14820m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f14821n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f14822p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f14823q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f14824r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f14825s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f14826t;
    public final String u;
    public final String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f14827w;

    public a() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554431);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f14813a, aVar.f14813a) && Intrinsics.f(this.f14814b, aVar.f14814b) && Intrinsics.f(this.f14815c, aVar.f14815c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f14816g, aVar.f14816g) && Intrinsics.f(this.f14817h, aVar.f14817h) && Intrinsics.f(this.i, aVar.i) && Intrinsics.f(this.f14818j, aVar.f14818j) && Intrinsics.f(this.k, aVar.k) && Intrinsics.f(this.f14819l, aVar.f14819l) && Intrinsics.f(this.f14820m, aVar.f14820m) && Intrinsics.f(this.f14821n, aVar.f14821n) && Intrinsics.f(this.o, aVar.o) && Intrinsics.f(this.f14822p, aVar.f14822p) && Intrinsics.f(this.f14823q, aVar.f14823q) && Intrinsics.f(this.f14824r, aVar.f14824r) && Intrinsics.f(this.f14825s, aVar.f14825s) && Intrinsics.f(this.f14826t, aVar.f14826t) && Intrinsics.f(this.u, aVar.u) && Intrinsics.f(this.v, aVar.v) && Intrinsics.f(this.f14827w, aVar.f14827w);
    }

    public final int hashCode() {
        String str = this.f14813a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 961;
        String str2 = this.f14814b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f14815c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        d dVar = this.d;
        int iHashCode4 = (iHashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f14816g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f14817h;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.i;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f14818j;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.k;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f14819l;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f14820m;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f14821n;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.o;
        int iHashCode15 = (iHashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f14822p;
        int iHashCode16 = (iHashCode15 + (str15 == null ? 0 : str15.hashCode())) * 961;
        String str16 = this.f14823q;
        int iHashCode17 = (iHashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.f14824r;
        int iHashCode18 = (iHashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.f14825s;
        int iHashCode19 = (iHashCode18 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.f14826t;
        int iHashCode20 = (iHashCode19 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.u;
        int iHashCode21 = (iHashCode20 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.v;
        int iHashCode22 = (iHashCode21 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.f14827w;
        return iHashCode22 + (str22 != null ? str22.hashCode() : 0);
    }

    public a(String str, String str2, String str3, d dVar, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, int i) {
        String str23 = (i & 1) != 0 ? null : str;
        String str24 = (i & 4) != 0 ? null : str2;
        String str25 = (i & 8) != 0 ? null : str3;
        d dVar2 = (i & 16) != 0 ? null : dVar;
        String str26 = (i & 32) != 0 ? null : str4;
        String str27 = (i & 64) != 0 ? null : str5;
        String str28 = (i & 128) != 0 ? null : str6;
        String str29 = (i & 256) != 0 ? null : str7;
        String str30 = (i & 512) != 0 ? null : str8;
        String str31 = (i & 1024) != 0 ? null : str9;
        String str32 = (i & 2048) != 0 ? null : str10;
        String str33 = (i & 4096) != 0 ? null : str11;
        String str34 = (i & 8192) != 0 ? null : str12;
        String str35 = (i & 16384) != 0 ? null : str13;
        String str36 = (i & 32768) != 0 ? null : str14;
        String str37 = (i & 65536) != 0 ? null : str15;
        String str38 = (i & 262144) != 0 ? null : str16;
        String str39 = (i & 524288) != 0 ? null : str17;
        String str40 = (i & PKIFailureInfo.badCertTemplate) != 0 ? null : str18;
        String str41 = (i & PKIFailureInfo.badSenderNonce) != 0 ? null : str19;
        String str42 = (i & 4194304) != 0 ? null : str20;
        String str43 = (i & 8388608) != 0 ? null : str21;
        String str44 = (i & 16777216) != 0 ? null : str22;
        this.f14813a = str23;
        this.f14814b = str24;
        this.f14815c = str25;
        this.d = dVar2;
        this.e = str26;
        this.f = str27;
        this.f14816g = str28;
        this.f14817h = str29;
        this.i = str30;
        this.f14818j = str31;
        this.k = str32;
        this.f14819l = str33;
        this.f14820m = str34;
        this.f14821n = str35;
        this.o = str36;
        this.f14822p = str37;
        this.f14823q = str38;
        this.f14824r = str39;
        this.f14825s = str40;
        this.f14826t = str41;
        this.u = str42;
        this.v = str43;
        this.f14827w = str44;
    }
}
