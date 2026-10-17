package xel;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f304705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f304706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f304707c;
    public final String d;
    public final String e;
    public final Boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f304708g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f304709h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f304710j;

    public c(wi0.b countryCode, String key, String name, String str, String str2, Boolean bool, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f304705a = countryCode;
        this.f304706b = key;
        this.f304707c = name;
        this.d = str;
        this.e = str2;
        this.f = bool;
        this.f304708g = str3;
        this.f304709h = str4;
        this.i = str5;
        this.f304710j = str6;
    }

    public static c a(c cVar, String str) {
        wi0.b countryCode = cVar.f304705a;
        String key = cVar.f304706b;
        String name = cVar.f304707c;
        String str2 = cVar.d;
        String str3 = cVar.e;
        Boolean bool = cVar.f;
        String str4 = cVar.f304708g;
        String str5 = cVar.f304709h;
        String str6 = cVar.f304710j;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(name, "name");
        return new c(countryCode, key, name, str2, str3, bool, str4, str5, str, str6);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f304705a, cVar.f304705a) && Intrinsics.f(this.f304706b, cVar.f304706b) && Intrinsics.f(this.f304707c, cVar.f304707c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f304708g, cVar.f304708g) && Intrinsics.f(this.f304709h, cVar.f304709h) && Intrinsics.f(this.i, cVar.i) && Intrinsics.f(this.f304710j, cVar.f304710j);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f304705a.f297794a.hashCode() * 31, 31, this.f304706b), 31, this.f304707c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.f304708g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f304709h;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f304710j;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }
}
