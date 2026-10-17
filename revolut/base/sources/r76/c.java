package r76;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f252021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f252022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f252023c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f252024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f252025h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f252026j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f252027l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f252028m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f252029n;
    public final String o;

    public /* synthetic */ c(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        if (32767 != (i & 32767)) {
            j1.f(a.f252020a.getDescriptor(), i, 32767);
            throw null;
        }
        this.f252021a = str;
        this.f252022b = str2;
        this.f252023c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.f252024g = str7;
        this.f252025h = str8;
        this.i = str9;
        this.f252026j = str10;
        this.k = str11;
        this.f252027l = str12;
        this.f252028m = str13;
        this.f252029n = str14;
        this.o = str15;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f252021a, cVar.f252021a) && Intrinsics.f(this.f252022b, cVar.f252022b) && Intrinsics.f(this.f252023c, cVar.f252023c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f252024g, cVar.f252024g) && Intrinsics.f(this.f252025h, cVar.f252025h) && Intrinsics.f(this.i, cVar.i) && Intrinsics.f(this.f252026j, cVar.f252026j) && Intrinsics.f(this.k, cVar.k) && Intrinsics.f(this.f252027l, cVar.f252027l) && Intrinsics.f(this.f252028m, cVar.f252028m) && Intrinsics.f(this.f252029n, cVar.f252029n) && Intrinsics.f(this.o, cVar.o);
    }

    public final int hashCode() {
        int iHashCode = this.f252021a.hashCode() * 31;
        String str = this.f252022b;
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f252023c), 31, this.d), 31, this.e), 31, this.f), 31, this.f252024g), 31, this.f252025h), 31, this.i), 31, this.f252026j), 31, this.k), 31, this.f252027l), 31, this.f252028m);
        String str2 = this.f252029n;
        int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.o;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
