package hh0;

import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f152221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f152222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f152223c;
    public final String d;
    public final boolean e;
    public final Uri f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f152224g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f152225h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Integer f152226j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f152227l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f152228m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f152229n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Uri f152230p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f152231q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f152232r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f152233s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List f152234t;
    public final boolean u;
    public final List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f152235w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final List f152236x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f152237y;
    public final List z;

    public a(boolean z, Integer num, Long l2, String str, boolean z3, Uri uri2, String str2, Integer num2, String str3, Integer num3, String str4, String str5, String str6, boolean z4, String str7, Uri uri3, String str8, boolean z6, String str9, List list, boolean z11, List list2, String str10, List list3, String str11, List list4) {
        this.f152221a = z;
        this.f152222b = num;
        this.f152223c = l2;
        this.d = str;
        this.e = z3;
        this.f = uri2;
        this.f152224g = str2;
        this.f152225h = num2;
        this.i = str3;
        this.f152226j = num3;
        this.k = str4;
        this.f152227l = str5;
        this.f152228m = str6;
        this.f152229n = z4;
        this.o = str7;
        this.f152230p = uri3;
        this.f152231q = str8;
        this.f152232r = z6;
        this.f152233s = str9;
        this.f152234t = list;
        this.u = z11;
        this.v = list2;
        this.f152235w = str10;
        this.f152236x = list3;
        this.f152237y = str11;
        this.z = list4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f152221a == aVar.f152221a && Intrinsics.f(this.f152222b, aVar.f152222b) && Intrinsics.f(this.f152223c, aVar.f152223c) && Intrinsics.f(this.d, aVar.d) && this.e == aVar.e && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f152224g, aVar.f152224g) && Intrinsics.f(this.f152225h, aVar.f152225h) && Intrinsics.f(this.i, aVar.i) && Intrinsics.f(this.f152226j, aVar.f152226j) && Intrinsics.f(this.k, aVar.k) && Intrinsics.f(this.f152227l, aVar.f152227l) && Intrinsics.f(this.f152228m, aVar.f152228m) && this.f152229n == aVar.f152229n && Intrinsics.f(this.o, aVar.o) && Intrinsics.f(this.f152230p, aVar.f152230p) && Intrinsics.f(this.f152231q, aVar.f152231q) && this.f152232r == aVar.f152232r && Intrinsics.f(this.f152233s, aVar.f152233s) && Intrinsics.f(this.f152234t, aVar.f152234t) && this.u == aVar.u && Intrinsics.f(this.v, aVar.v) && Intrinsics.f(this.f152235w, aVar.f152235w) && Intrinsics.f(this.f152236x, aVar.f152236x) && Intrinsics.f(this.f152237y, aVar.f152237y) && Intrinsics.f(this.z, aVar.z);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f152221a) * 31;
        Integer num = this.f152222b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l2 = this.f152223c;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.d;
        int iC = j6.a.c((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        Uri uri2 = this.f;
        int iHashCode4 = (iC + (uri2 == null ? 0 : uri2.hashCode())) * 31;
        String str2 = this.f152224g;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.f152225h;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.i;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.f152226j;
        int iHashCode8 = (iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.k;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f152227l;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f152228m;
        int iC2 = j6.a.c((iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.f152229n);
        String str7 = this.o;
        int iHashCode11 = (iC2 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Uri uri3 = this.f152230p;
        int iHashCode12 = (iHashCode11 + (uri3 == null ? 0 : uri3.hashCode())) * 31;
        String str8 = this.f152231q;
        int iC3 = j6.a.c((iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31, 31, this.f152232r);
        String str9 = this.f152233s;
        int iHashCode13 = (iC3 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List list = this.f152234t;
        int iC4 = j6.a.c((iHashCode13 + (list == null ? 0 : list.hashCode())) * 31, 31, this.u);
        List list2 = this.v;
        int iHashCode14 = (iC4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str10 = this.f152235w;
        int iHashCode15 = (iHashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        List list3 = this.f152236x;
        int iHashCode16 = (iHashCode15 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str11 = this.f152237y;
        int iHashCode17 = (iHashCode16 + (str11 == null ? 0 : str11.hashCode())) * 31;
        List list4 = this.z;
        return iHashCode17 + (list4 != null ? list4.hashCode() : 0);
    }
}
