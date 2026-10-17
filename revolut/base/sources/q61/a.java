package q61;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f242441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f242442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f242443c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f242444g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f242445h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f242446j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f242447l;

    /* JADX WARN: Illegal instructions before constructor call */
    public a() {
        String str = null;
        this(str, str, 4095);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f242441a, aVar.f242441a) && Intrinsics.f(this.f242442b, aVar.f242442b) && Intrinsics.f(this.f242443c, aVar.f242443c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f242444g, aVar.f242444g) && Intrinsics.f(this.f242445h, aVar.f242445h) && Intrinsics.f(this.i, aVar.i) && Intrinsics.f(this.f242446j, aVar.f242446j) && Intrinsics.f(this.k, aVar.k) && Intrinsics.f(this.f242447l, aVar.f242447l);
    }

    public final int hashCode() {
        String str = this.f242441a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f242442b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f242443c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f242444g;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f242445h;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.i;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f242446j;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.k;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f242447l;
        return iHashCode11 + (str12 != null ? str12.hashCode() : 0);
    }

    public /* synthetic */ a(String str, String str2, int i) {
        this(null, null, null, null, null, null, null, (i & 128) != 0 ? null : str, (i & 256) != 0 ? null : str2, null, null, null);
    }

    public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.f242441a = str;
        this.f242442b = str2;
        this.f242443c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.f242444g = str7;
        this.f242445h = str8;
        this.i = str9;
        this.f242446j = str10;
        this.k = str11;
        this.f242447l = str12;
    }
}
