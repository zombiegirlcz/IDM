package uv5;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f283304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f283305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f283306c;
    public final String d;
    public final g e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f283307g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f283308h;

    public b(String symbol, String str, String str2, String str3, g gVar, d dVar, a aVar, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.f283304a = symbol;
        this.f283305b = str;
        this.f283306c = str2;
        this.d = str3;
        this.e = gVar;
        this.f = dVar;
        this.f283307g = aVar;
        this.f283308h = arrayList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f283304a, bVar.f283304a) && Intrinsics.f(this.f283305b, bVar.f283305b) && Intrinsics.f(this.f283306c, bVar.f283306c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f283307g, bVar.f283307g) && Intrinsics.f(this.f283308h, bVar.f283308h);
    }

    public final int hashCode() {
        int iHashCode = this.f283304a.hashCode() * 31;
        String str = this.f283305b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f283306c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        g gVar = this.e;
        int iHashCode5 = (iHashCode4 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        d dVar = this.f;
        int iHashCode6 = (iHashCode5 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        a aVar = this.f283307g;
        int iHashCode7 = (iHashCode6 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        List list = this.f283308h;
        return iHashCode7 + (list != null ? list.hashCode() : 0);
    }
}
