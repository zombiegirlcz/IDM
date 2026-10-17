package t89;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f268864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f268865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f268866c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f268867g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f268868h;

    public d(String firstName, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        this.f268864a = firstName;
        this.f268865b = str;
        this.f268866c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.f268867g = str6;
        this.f268868h = str7;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f268864a, dVar.f268864a) && Intrinsics.f(this.f268865b, dVar.f268865b) && Intrinsics.f(this.f268866c, dVar.f268866c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f) && Intrinsics.f(this.f268867g, dVar.f268867g) && Intrinsics.f(this.f268868h, dVar.f268868h);
    }

    public final int hashCode() {
        int iHashCode = this.f268864a.hashCode() * 31;
        String str = this.f268865b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f268866c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f268867g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f268868h;
        return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
    }
}
