package vvc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f292508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f292509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f292510c;
    public final String d;
    public final String e;
    public final boolean f;

    public g() {
        this(0);
    }

    public static g a(g gVar, f fVar, p pVar, boolean z, String str, String str2, int i) {
        if ((i & 1) != 0) {
            fVar = gVar.f292508a;
        }
        f fVar2 = fVar;
        if ((i & 2) != 0) {
            pVar = gVar.f292509b;
        }
        p pVar2 = pVar;
        if ((i & 4) != 0) {
            z = gVar.f292510c;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            str = gVar.d;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            str2 = gVar.e;
        }
        String str4 = str2;
        boolean z4 = (i & 32) != 0 ? gVar.f : true;
        gVar.getClass();
        return new g(fVar2, pVar2, z3, str3, str4, z4);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f292508a, gVar.f292508a) && Intrinsics.f(this.f292509b, gVar.f292509b) && this.f292510c == gVar.f292510c && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && this.f == gVar.f;
    }

    public final int hashCode() {
        f fVar = this.f292508a;
        int iHashCode = (fVar == null ? 0 : fVar.hashCode()) * 31;
        p pVar = this.f292509b;
        int iC = j6.a.c((iHashCode + (pVar == null ? 0 : pVar.hashCode())) * 31, 31, this.f292510c);
        String str = this.d;
        int iHashCode2 = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public /* synthetic */ g(int i) {
        this(null, null, false, null, null, false);
    }

    public g(f fVar, p pVar, boolean z, String str, String str2, boolean z3) {
        this.f292508a = fVar;
        this.f292509b = pVar;
        this.f292510c = z;
        this.d = str;
        this.e = str2;
        this.f = z3;
    }
}
