package uyl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f284459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f284460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f284461c;
    public final i d;
    public final Boolean e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v01.b f284462g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f284463h;
    public final Integer i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Integer f284464j;
    public final Boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Boolean f284465l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Boolean f284466m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Boolean f284467n;

    public h(String str, Integer num, Boolean bool, i iVar, Boolean bool2, String str2, v01.b bVar, String str3, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6) {
        this.f284459a = str;
        this.f284460b = num;
        this.f284461c = bool;
        this.d = iVar;
        this.e = bool2;
        this.f = str2;
        this.f284462g = bVar;
        this.f284463h = str3;
        this.i = num2;
        this.f284464j = num3;
        this.k = bool3;
        this.f284465l = bool4;
        this.f284466m = bool5;
        this.f284467n = bool6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f284459a, hVar.f284459a) && Intrinsics.f(this.f284460b, hVar.f284460b) && Intrinsics.f(this.f284461c, hVar.f284461c) && this.d == hVar.d && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f) && Intrinsics.f(this.f284462g, hVar.f284462g) && Intrinsics.f(this.f284463h, hVar.f284463h) && Intrinsics.f(this.i, hVar.i) && Intrinsics.f(this.f284464j, hVar.f284464j) && Intrinsics.f(this.k, hVar.k) && Intrinsics.f(this.f284465l, hVar.f284465l) && Intrinsics.f(this.f284466m, hVar.f284466m) && Intrinsics.f(this.f284467n, hVar.f284467n);
    }

    public final int hashCode() {
        String str = this.f284459a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f284460b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 961;
        Boolean bool = this.f284461c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 29791;
        i iVar = this.d;
        int iHashCode4 = (iHashCode3 + (iVar == null ? 0 : iVar.hashCode())) * 961;
        Boolean bool2 = this.e;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        v01.b bVar = this.f284462g;
        int iHashCode7 = (iHashCode6 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str3 = this.f284463h;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.i;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f284464j;
        int iHashCode10 = (iHashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool3 = this.k;
        int iHashCode11 = (iHashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f284465l;
        int iHashCode12 = (iHashCode11 + (bool4 == null ? 0 : bool4.hashCode())) * 961;
        Boolean bool5 = this.f284466m;
        int iHashCode13 = (iHashCode12 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.f284467n;
        return iHashCode13 + (bool6 != null ? bool6.hashCode() : 0);
    }
}
