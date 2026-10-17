package zcj;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f321275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f321276c;
    public final String d;
    public final g e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f321277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f321278h;

    public d(String symbol, String str, String str2, String str3, g gVar, e eVar, a aVar, List list) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.f321274a = symbol;
        this.f321275b = str;
        this.f321276c = str2;
        this.d = str3;
        this.e = gVar;
        this.f = eVar;
        this.f321277g = aVar;
        this.f321278h = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f321274a, dVar.f321274a) && Intrinsics.f(this.f321275b, dVar.f321275b) && Intrinsics.f(this.f321276c, dVar.f321276c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f) && Intrinsics.f(this.f321277g, dVar.f321277g) && Intrinsics.f(this.f321278h, dVar.f321278h);
    }

    public final int hashCode() {
        int iHashCode = this.f321274a.hashCode() * 31;
        String str = this.f321275b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f321276c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        g gVar = this.e;
        int iHashCode5 = (iHashCode4 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        e eVar = this.f;
        int iHashCode6 = (iHashCode5 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        a aVar = this.f321277g;
        int iHashCode7 = (iHashCode6 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        List list = this.f321278h;
        return iHashCode7 + (list != null ? list.hashCode() : 0);
    }
}
