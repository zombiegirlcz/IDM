package o0j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f221237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f221238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f221239c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f221240g;

    public j(String firstName, String str, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        this.f221237a = firstName;
        this.f221238b = str;
        this.f221239c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.f221240g = str6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f221237a, jVar.f221237a) && Intrinsics.f(this.f221238b, jVar.f221238b) && Intrinsics.f(this.f221239c, jVar.f221239c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f) && Intrinsics.f(this.f221240g, jVar.f221240g);
    }

    public final int hashCode() {
        int iHashCode = this.f221237a.hashCode() * 31;
        String str = this.f221238b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f221239c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f221240g;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }
}
