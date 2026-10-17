package hyl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f156920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f156921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f156922c;
    public final a d;
    public final String e;
    public final a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f156923g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f156924h;

    public n(String id10, String title, String titleTrailingIcon, a titleTrailingIconColor, String str, a aVar, String str2, a aVar2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(titleTrailingIcon, "titleTrailingIcon");
        Intrinsics.checkNotNullParameter(titleTrailingIconColor, "titleTrailingIconColor");
        this.f156920a = id10;
        this.f156921b = title;
        this.f156922c = titleTrailingIcon;
        this.d = titleTrailingIconColor;
        this.e = str;
        this.f = aVar;
        this.f156923g = str2;
        this.f156924h = aVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f156920a, nVar.f156920a) && Intrinsics.f(this.f156921b, nVar.f156921b) && Intrinsics.f(this.f156922c, nVar.f156922c) && this.d == nVar.d && Intrinsics.f(this.e, nVar.e) && this.f == nVar.f && Intrinsics.f(this.f156923g, nVar.f156923g) && this.f156924h == nVar.f156924h;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + p.a.c(p.a.c(this.f156920a.hashCode() * 31, 31, this.f156921b), 31, this.f156922c)) * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        a aVar = this.f;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str2 = this.f156923g;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        a aVar2 = this.f156924h;
        return iHashCode4 + (aVar2 != null ? aVar2.hashCode() : 0);
    }
}
