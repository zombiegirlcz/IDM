package nxa;

import java.time.Instant;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class t0 {

    @NotNull
    public static final h0 Companion = new h0();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Lazy[] f220525p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f220526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f220527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f220528c;
    public final String d;
    public final String e;
    public final g0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Instant f220529g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f220530h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final pwa.n f220531j;
    public final o0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l0 f220532l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l0 f220533m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Boolean f220534n;
    public final String o;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f220525p = new Lazy[]{null, yhm.j.c(kVar, new nwf.b(3)), null, null, null, null, null, null, yhm.j.c(kVar, new nwf.b(4)), null, null, null, null, null, null};
    }

    public /* synthetic */ t0(int i, String str, i0 i0Var, String str2, String str3, String str4, g0 g0Var, Instant instant, int i2, List list, pwa.n nVar, o0 o0Var, l0 l0Var, l0 l0Var2, Boolean bool, String str5) {
        if (8191 != (i & 8191)) {
            j1.f(d0.f220492a.getDescriptor(), i, 8191);
            throw null;
        }
        this.f220526a = str;
        this.f220527b = i0Var;
        this.f220528c = str2;
        this.d = str3;
        this.e = str4;
        this.f = g0Var;
        this.f220529g = instant;
        this.f220530h = i2;
        this.i = list;
        this.f220531j = nVar;
        this.k = o0Var;
        this.f220532l = l0Var;
        this.f220533m = l0Var2;
        if ((i & 8192) == 0) {
            this.f220534n = null;
        } else {
            this.f220534n = bool;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = str5;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj2;
        return Intrinsics.f(this.f220526a, t0Var.f220526a) && this.f220527b == t0Var.f220527b && Intrinsics.f(this.f220528c, t0Var.f220528c) && Intrinsics.f(this.d, t0Var.d) && Intrinsics.f(this.e, t0Var.e) && Intrinsics.f(this.f, t0Var.f) && Intrinsics.f(this.f220529g, t0Var.f220529g) && this.f220530h == t0Var.f220530h && Intrinsics.f(this.i, t0Var.i) && this.f220531j == t0Var.f220531j && Intrinsics.f(this.k, t0Var.k) && Intrinsics.f(this.f220532l, t0Var.f220532l) && Intrinsics.f(this.f220533m, t0Var.f220533m) && Intrinsics.f(this.f220534n, t0Var.f220534n) && Intrinsics.f(this.o, t0Var.o);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c((this.f220527b.hashCode() + (this.f220526a.hashCode() * 31)) * 31, 31, this.f220528c), 31, this.d), 31, this.e);
        g0 g0Var = this.f;
        int iHashCode = (iC + (g0Var == null ? 0 : g0Var.hashCode())) * 31;
        Instant instant = this.f220529g;
        int iD = p.a.d(j6.a.b(this.f220530h, (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31, 31), 31, this.i);
        pwa.n nVar = this.f220531j;
        int iHashCode2 = (iD + (nVar == null ? 0 : nVar.hashCode())) * 31;
        o0 o0Var = this.k;
        int iHashCode3 = (iHashCode2 + (o0Var == null ? 0 : o0Var.hashCode())) * 31;
        l0 l0Var = this.f220532l;
        int iHashCode4 = (iHashCode3 + (l0Var == null ? 0 : l0Var.hashCode())) * 31;
        l0 l0Var2 = this.f220533m;
        int iHashCode5 = (iHashCode4 + (l0Var2 == null ? 0 : l0Var2.hashCode())) * 31;
        Boolean bool = this.f220534n;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.o;
        return iHashCode6 + (str != null ? str.hashCode() : 0);
    }

    public t0(String title, i0 status, String imageUrl, String termsUrl, String riskDisclosureUrl, g0 g0Var, Instant instant, int i, List steps, pwa.n nVar, o0 o0Var, l0 l0Var, l0 l0Var2, Boolean bool, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(termsUrl, "termsUrl");
        Intrinsics.checkNotNullParameter(riskDisclosureUrl, "riskDisclosureUrl");
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.f220526a = title;
        this.f220527b = status;
        this.f220528c = imageUrl;
        this.d = termsUrl;
        this.e = riskDisclosureUrl;
        this.f = g0Var;
        this.f220529g = instant;
        this.f220530h = i;
        this.i = steps;
        this.f220531j = nVar;
        this.k = o0Var;
        this.f220532l = l0Var;
        this.f220533m = l0Var2;
        this.f220534n = bool;
        this.o = str;
    }
}
