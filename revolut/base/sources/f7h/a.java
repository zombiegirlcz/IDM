package f7h;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import xzg.o;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f132611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f132612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f132613c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f132614g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f132615h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f132616j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f132617l;

    public a(String key, String title, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, o assetType) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f132611a = key;
        this.f132612b = assetType;
        this.f132613c = title;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.f132614g = str4;
        this.f132615h = str5;
        this.i = str6;
        this.f132616j = list;
        this.k = list2;
        this.f132617l = str7;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f132611a, aVar.f132611a) && this.f132612b == aVar.f132612b && Intrinsics.f(this.f132613c, aVar.f132613c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f132614g, aVar.f132614g) && Intrinsics.f(this.f132615h, aVar.f132615h) && Intrinsics.f(this.i, aVar.i) && Intrinsics.f(this.f132616j, aVar.f132616j) && Intrinsics.f(this.k, aVar.k) && Intrinsics.f(this.f132617l, aVar.f132617l);
    }

    public final int hashCode() {
        int iC = p.a.c((this.f132612b.hashCode() + (this.f132611a.hashCode() * 31)) * 31, 31, this.f132613c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f132614g;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f132615h;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List list = this.f132616j;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.k;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str7 = this.f132617l;
        return iHashCode8 + (str7 != null ? str7.hashCode() : 0);
    }
}
