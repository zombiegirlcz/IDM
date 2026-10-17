package ks6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f189256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f189257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f189258c;
    public final String d;
    public final String e;
    public final String f;

    public t(String id10, String name, String str, String str2, String str3, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f189256a = id10;
        this.f189257b = name;
        this.f189258c = z;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f189256a, tVar.f189256a) && Intrinsics.f(this.f189257b, tVar.f189257b) && this.f189258c == tVar.f189258c && Intrinsics.f(this.d, tVar.d) && Intrinsics.f(this.e, tVar.e) && Intrinsics.f(this.f, tVar.f);
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.c(this.f189256a.hashCode() * 31, 31, this.f189257b), 31, this.f189258c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
