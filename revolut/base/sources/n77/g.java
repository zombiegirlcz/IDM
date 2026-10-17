package n77;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f213017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f213018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f213019c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f213020g;

    public g(int i, h type, String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f213017a = i;
        this.f213018b = type;
        this.f213019c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.f213020g = str5;
    }

    public final String a() {
        return this.f213020g;
    }

    public final String b() {
        return this.f;
    }

    public final String c() {
        return this.f213019c;
    }

    public final int d() {
        return this.f213017a;
    }

    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f213017a == gVar.f213017a && this.f213018b == gVar.f213018b && Intrinsics.f(this.f213019c, gVar.f213019c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f) && Intrinsics.f(this.f213020g, gVar.f213020g);
    }

    public final String f() {
        return this.d;
    }

    public final h g() {
        return this.f213018b;
    }

    public final int hashCode() {
        int iHashCode = (this.f213018b.hashCode() + (Integer.hashCode(this.f213017a) * 31)) * 31;
        String str = this.f213019c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f213020g;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public /* synthetic */ g(int i, h hVar, String str, String str2, String str3, String str4, String str5, int i2) {
        this(i, hVar, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : str5);
    }
}
