package n77;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f213014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f213015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f213016c;
    public final String d;
    public final String e;

    public f(String ref2, String symbol, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.f213014a = ref2;
        this.f213015b = symbol;
        this.f213016c = str;
        this.d = str2;
        this.e = str3;
    }

    public final String a() {
        return this.f213016c;
    }

    public final String b() {
        return this.e;
    }

    public final String c() {
        return this.f213014a;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.f213015b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f213014a, fVar.f213014a) && Intrinsics.f(this.f213015b, fVar.f213015b) && Intrinsics.f(this.f213016c, fVar.f213016c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f213014a.hashCode() * 31, 31, this.f213015b);
        String str = this.f213016c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
