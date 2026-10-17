package lpa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f198962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f198963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f198964c;
    public final String d;
    public final String e;
    public final Long f;

    public b(String str, String str2, String str3, String str4, String str5, Long l2) {
        this.f198962a = str;
        this.f198963b = str2;
        this.f198964c = str3;
        this.d = str4;
        this.e = str5;
        this.f = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f198962a, bVar.f198962a) && Intrinsics.f(this.f198963b, bVar.f198963b) && Intrinsics.f(this.f198964c, bVar.f198964c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f);
    }

    public final int hashCode() {
        String str = this.f198962a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f198963b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f198964c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l2 = this.f;
        return iHashCode5 + (l2 != null ? l2.hashCode() : 0);
    }
}
