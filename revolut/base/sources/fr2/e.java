package fr2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f137378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f137379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f137380c;
    public final String d;
    public final aal.b e;
    public final String f;

    public e(String title, String subtitle, String str, String str2, aal.b bVar, String str3) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f137378a = title;
        this.f137379b = subtitle;
        this.f137380c = str;
        this.d = str2;
        this.e = bVar;
        this.f = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f137378a, eVar.f137378a) && Intrinsics.f(this.f137379b, eVar.f137379b) && Intrinsics.f(this.f137380c, eVar.f137380c) && Intrinsics.f(this.d, eVar.d) && this.e == eVar.e && Intrinsics.f(this.f, eVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f137378a.hashCode() * 31, 31, this.f137379b);
        String str = this.f137380c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        aal.b bVar = this.e;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str3 = this.f;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
