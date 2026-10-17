package w5d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f295100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f295101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f295102c;
    public final String d;
    public final String e;
    public final Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f295103g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Float f295104h;
    public final Float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f295105j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f295106l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Long f295107m;

    public a(String id10, boolean z, String str, String str2, String str3, Long l2, String str4, Float f, Float f4, String str5, String ownerId, String str6, Long l3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        this.f295100a = id10;
        this.f295101b = z;
        this.f295102c = str;
        this.d = str2;
        this.e = str3;
        this.f = l2;
        this.f295103g = str4;
        this.f295104h = f;
        this.i = f4;
        this.f295105j = str5;
        this.k = ownerId;
        this.f295106l = str6;
        this.f295107m = l3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f295100a, aVar.f295100a) && this.f295101b == aVar.f295101b && Intrinsics.f(this.f295102c, aVar.f295102c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f295103g, aVar.f295103g) && Intrinsics.f(this.f295104h, aVar.f295104h) && Intrinsics.f(this.i, aVar.i) && Intrinsics.f(this.f295105j, aVar.f295105j) && Intrinsics.f(this.k, aVar.k) && Intrinsics.f(this.f295106l, aVar.f295106l) && Intrinsics.f(this.f295107m, aVar.f295107m);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f295100a.hashCode() * 31, 31, this.f295101b);
        String str = this.f295102c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.f;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str4 = this.f295103g;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Float f = this.f295104h;
        int iHashCode6 = (iHashCode5 + (f == null ? 0 : f.hashCode())) * 31;
        Float f4 = this.i;
        int iHashCode7 = (iHashCode6 + (f4 == null ? 0 : f4.hashCode())) * 31;
        String str5 = this.f295105j;
        int iC2 = p.a.c((iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.k);
        String str6 = this.f295106l;
        int iHashCode8 = (iC2 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l3 = this.f295107m;
        return iHashCode8 + (l3 != null ? l3.hashCode() : 0);
    }
}
