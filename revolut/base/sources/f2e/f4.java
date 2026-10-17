package f2e;

import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class f4 {

    @NotNull
    public static final e4 Companion = new e4();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Lazy[] f131585m = {null, null, null, null, null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new i(22)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f131588c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f131589g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f131590h;
    public final no3.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f131591j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f131592l;

    public /* synthetic */ f4(int i, String str, String str2, String str3, String str4, String str5, String str6, int i2, String str7, no3.b bVar, Map map, String str8, String str9) {
        if (1271 != (i & 1271)) {
            qlm.j1.f(d4.f131569a.getDescriptor(), i, 1271);
            throw null;
        }
        this.f131586a = str;
        this.f131587b = str2;
        this.f131588c = str3;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        this.e = str5;
        this.f = str6;
        this.f131589g = i2;
        this.f131590h = str7;
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = bVar;
        }
        if ((i & 512) == 0) {
            this.f131591j = null;
        } else {
            this.f131591j = map;
        }
        this.k = str8;
        this.f131592l = (i & 2048) == 0 ? "UNKNOWN" : str9;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f4)) {
            return false;
        }
        f4 f4Var = (f4) obj2;
        return Intrinsics.f(this.f131586a, f4Var.f131586a) && Intrinsics.f(this.f131587b, f4Var.f131587b) && Intrinsics.f(this.f131588c, f4Var.f131588c) && Intrinsics.f(this.d, f4Var.d) && Intrinsics.f(this.e, f4Var.e) && Intrinsics.f(this.f, f4Var.f) && this.f131589g == f4Var.f131589g && Intrinsics.f(this.f131590h, f4Var.f131590h) && Intrinsics.f(this.i, f4Var.i) && Intrinsics.f(this.f131591j, f4Var.f131591j) && Intrinsics.f(this.k, f4Var.k) && Intrinsics.f(this.f131592l, f4Var.f131592l);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f131586a.hashCode() * 31, 31, this.f131587b), 31, this.f131588c);
        String str = this.d;
        int iC2 = p.a.c(j6.a.b(this.f131589g, p.a.c(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f), 31), 31, this.f131590h);
        no3.b bVar = this.i;
        int iHashCode = (iC2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Map map = this.f131591j;
        return this.f131592l.hashCode() + p.a.c((iHashCode + (map != null ? map.hashCode() : 0)) * 31, 31, this.k);
    }
}
