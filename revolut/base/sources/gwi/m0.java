package gwi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class m0 {

    @NotNull
    public static final l0 Companion = new l0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f147456c;
    public final boolean d;
    public final Long e;
    public final Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f147457g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f147458h;
    public final jo3.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final jo3.a f147459j;
    public final j0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g0 f147460l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f147461m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f147462n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f147463p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f147464q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f147465r;

    public /* synthetic */ m0(int i, String str, String str2, boolean z, boolean z3, Long l2, Long l3, Long l4, String str3, jo3.a aVar, jo3.a aVar2, j0 j0Var, g0 g0Var, String str4, String str5, String str6, String str7, String str8, String str9) {
        if (258047 != (i & 258047)) {
            qlm.j1.f(k0.f147435a.getDescriptor(), i, 258047);
            throw null;
        }
        this.f147454a = str;
        this.f147455b = str2;
        this.f147456c = z;
        this.d = z3;
        this.e = l2;
        this.f = l3;
        this.f147457g = l4;
        this.f147458h = str3;
        this.i = aVar;
        this.f147459j = aVar2;
        this.k = j0Var;
        this.f147460l = g0Var;
        if ((i & 4096) == 0) {
            this.f147461m = null;
        } else {
            this.f147461m = str4;
        }
        this.f147462n = str5;
        this.o = str6;
        this.f147463p = str7;
        this.f147464q = str8;
        this.f147465r = str9;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.f147454a, m0Var.f147454a) && Intrinsics.f(this.f147455b, m0Var.f147455b) && this.f147456c == m0Var.f147456c && this.d == m0Var.d && Intrinsics.f(this.e, m0Var.e) && Intrinsics.f(this.f, m0Var.f) && Intrinsics.f(this.f147457g, m0Var.f147457g) && Intrinsics.f(this.f147458h, m0Var.f147458h) && Intrinsics.f(this.i, m0Var.i) && Intrinsics.f(this.f147459j, m0Var.f147459j) && Intrinsics.f(this.k, m0Var.k) && Intrinsics.f(this.f147460l, m0Var.f147460l) && Intrinsics.f(this.f147461m, m0Var.f147461m) && Intrinsics.f(this.f147462n, m0Var.f147462n) && Intrinsics.f(this.o, m0Var.o) && Intrinsics.f(this.f147463p, m0Var.f147463p) && Intrinsics.f(this.f147464q, m0Var.f147464q) && Intrinsics.f(this.f147465r, m0Var.f147465r);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(p.a.c(this.f147454a.hashCode() * 31, 31, this.f147455b), 31, this.f147456c), 31, this.d);
        Long l2 = this.e;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f147457g;
        int iC2 = p.a.c((iHashCode2 + (l4 == null ? 0 : l4.hashCode())) * 31, 31, this.f147458h);
        jo3.a aVar = this.i;
        int iHashCode3 = (iC2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        jo3.a aVar2 = this.f147459j;
        int iHashCode4 = (iHashCode3 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        j0 j0Var = this.k;
        int iHashCode5 = (iHashCode4 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        g0 g0Var = this.f147460l;
        int iHashCode6 = (iHashCode5 + (g0Var == null ? 0 : g0Var.hashCode())) * 31;
        String str = this.f147461m;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f147462n;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.o;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f147463p;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f147464q;
        return this.f147465r.hashCode() + ((iHashCode10 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    public m0(String id10, String type, boolean z, boolean z3, Long l2, Long l3, Long l4, String style, jo3.a aVar, jo3.a aVar2, j0 j0Var, g0 g0Var, String str, String str2, String str3, String str4, String str5, String status) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f147454a = id10;
        this.f147455b = type;
        this.f147456c = z;
        this.d = z3;
        this.e = l2;
        this.f = l3;
        this.f147457g = l4;
        this.f147458h = style;
        this.i = aVar;
        this.f147459j = aVar2;
        this.k = j0Var;
        this.f147460l = g0Var;
        this.f147461m = str;
        this.f147462n = str2;
        this.o = str3;
        this.f147463p = str4;
        this.f147464q = str5;
        this.f147465r = status;
    }
}
