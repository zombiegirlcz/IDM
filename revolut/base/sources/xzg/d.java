package xzg;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f309976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f309977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f309978c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f309979g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f309980h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f309981j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f309982l;

    public d(String key, String title, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, o assetType) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f309976a = key;
        this.f309977b = assetType;
        this.f309978c = title;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.f309979g = str4;
        this.f309980h = str5;
        this.i = list;
        this.f309981j = list2;
        this.k = str6;
        this.f309982l = str7;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f309976a, dVar.f309976a) && this.f309977b == dVar.f309977b && Intrinsics.f(this.f309978c, dVar.f309978c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f) && Intrinsics.f(this.f309979g, dVar.f309979g) && Intrinsics.f(this.f309980h, dVar.f309980h) && Intrinsics.f(this.i, dVar.i) && Intrinsics.f(this.f309981j, dVar.f309981j) && Intrinsics.f(this.k, dVar.k) && Intrinsics.f(this.f309982l, dVar.f309982l);
    }

    public final int hashCode() {
        int iC = p.a.c((this.f309977b.hashCode() + (this.f309976a.hashCode() * 31)) * 31, 31, this.f309978c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f309979g;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f309980h;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List list = this.i;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f309981j;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str6 = this.k;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f309982l;
        return iHashCode8 + (str7 != null ? str7.hashCode() : 0);
    }
}
