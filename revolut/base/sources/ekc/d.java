package ekc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f126978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f126979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f126980c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f126981g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f126982h;
    public final b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f126983j;
    public final String k;

    public d(String str, c cVar, String logoUrl, String backgroundImageUrl, String title, String description, String str2, String deepLink, b bVar, Long l2, String str3) {
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        Intrinsics.checkNotNullParameter(backgroundImageUrl, "backgroundImageUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        this.f126978a = str;
        this.f126979b = cVar;
        this.f126980c = logoUrl;
        this.d = backgroundImageUrl;
        this.e = title;
        this.f = description;
        this.f126981g = str2;
        this.f126982h = deepLink;
        this.i = bVar;
        this.f126983j = l2;
        this.k = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f126978a, dVar.f126978a) && this.f126979b == dVar.f126979b && Intrinsics.f(this.f126980c, dVar.f126980c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f) && Intrinsics.f(this.f126981g, dVar.f126981g) && Intrinsics.f(this.f126982h, dVar.f126982h) && this.i == dVar.i && Intrinsics.f(this.f126983j, dVar.f126983j) && Intrinsics.f(this.k, dVar.k);
    }

    public final int hashCode() {
        String str = this.f126978a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        c cVar = this.f126979b;
        int iC = p.a.c(p.a.c(p.a.c(p.a.c((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31, 31, this.f126980c), 31, this.d), 31, this.e), 31, this.f);
        String str2 = this.f126981g;
        int iC2 = p.a.c((iC + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f126982h);
        b bVar = this.i;
        int iHashCode2 = (iC2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Long l2 = this.f126983j;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str3 = this.k;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
