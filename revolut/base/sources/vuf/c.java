package vuf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f292347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f292348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f292349c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f292350g;

    public c(String id10, String code, String type, String str, String str2, String str3, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f292347a = id10;
        this.f292348b = code;
        this.f292349c = type;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.f292350g = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f292347a, cVar.f292347a) && Intrinsics.f(this.f292348b, cVar.f292348b) && Intrinsics.f(this.f292349c, cVar.f292349c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && this.f292350g == cVar.f292350g;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f292347a.hashCode() * 31, 31, this.f292348b), 31, this.f292349c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return Boolean.hashCode(this.f292350g) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}
