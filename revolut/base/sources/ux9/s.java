package ux9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class s implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f283947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f283948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f283949c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f283950g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f283951h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final do3.b f283952j;
    public final jq9.b k;

    public /* synthetic */ s(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, do3.b bVar, jq9.b bVar2) {
        this(str, str2, str3, str4, str5, str6, str7, str8, null, bVar, bVar2);
    }

    @Override // ux9.t
    public final jq9.b b() {
        return this.k;
    }

    public final String c() {
        return this.f283948b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f283947a, sVar.f283947a) && Intrinsics.f(this.f283948b, sVar.f283948b) && Intrinsics.f(this.f283949c, sVar.f283949c) && Intrinsics.f(this.d, sVar.d) && Intrinsics.f(this.e, sVar.e) && Intrinsics.f(this.f, sVar.f) && Intrinsics.f(this.f283950g, sVar.f283950g) && Intrinsics.f(this.f283951h, sVar.f283951h) && Intrinsics.f(this.i, sVar.i) && this.f283952j == sVar.f283952j && Intrinsics.f(this.k, sVar.k);
    }

    public final int hashCode() {
        String str = this.f283947a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f283948b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f283949c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f283950g;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f283951h;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.i;
        return Long.hashCode(0L) + j6.a.b(0, (this.k.hashCode() + ((this.f283952j.hashCode() + ((iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31)) * 31)) * 31, 31);
    }

    public s(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, do3.b appMode, jq9.b paymentItem) {
        Intrinsics.checkNotNullParameter(appMode, "appMode");
        Intrinsics.checkNotNullParameter(paymentItem, "paymentItem");
        this.f283947a = str;
        this.f283948b = str2;
        this.f283949c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.f283950g = str7;
        this.f283951h = str8;
        this.i = str9;
        this.f283952j = appMode;
        this.k = paymentItem;
    }
}
