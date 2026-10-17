package h41;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    @NotNull
    public static final a Companion = new a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f149276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f149277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f149278c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f149279g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f149280h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f149281j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f149282l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f149283m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f149284n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f149285p;

    public b(String sessionId, String androidId, int i, boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49, boolean z54, boolean z74, boolean z83) {
        Intrinsics.checkNotNullParameter("16.1.87", "protectionVersion");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(androidId, "androidId");
        this.f149276a = sessionId;
        this.f149277b = androidId;
        this.f149278c = i;
        this.d = z;
        this.e = z3;
        this.f = z4;
        this.f149279g = z6;
        this.f149280h = z11;
        this.i = z12;
        this.f149281j = z29;
        this.k = z31;
        this.f149282l = z41;
        this.f149283m = z49;
        this.f149284n = z54;
        this.o = z74;
        this.f149285p = z83;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f149276a, bVar.f149276a) && Intrinsics.f(this.f149277b, bVar.f149277b) && this.f149278c == bVar.f149278c && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f && this.f149279g == bVar.f149279g && this.f149280h == bVar.f149280h && this.i == bVar.i && this.f149281j == bVar.f149281j && this.k == bVar.k && this.f149282l == bVar.f149282l && this.f149283m == bVar.f149283m && this.f149284n == bVar.f149284n && this.o == bVar.o && this.f149285p == bVar.f149285p;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f149285p) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.b(this.f149278c, p.a.c(p.a.c(1542538395, 31, this.f149276a), 31, this.f149277b), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.f149279g), 31, this.f149280h), 31, this.i), 31, this.f149281j), 31, this.k), 31, this.f149282l), 31, this.f149283m), 31, this.f149284n), 31, this.o);
    }
}
