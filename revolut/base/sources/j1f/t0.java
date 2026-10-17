package j1f;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class t0 {

    @NotNull
    public static final s0 Companion = new s0();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Lazy[] f170429j = {null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new q0(0)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f170432c;
    public final String d;
    public final String e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p0 f170433g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f170434h;
    public final String i;

    public t0(int i, String str, String str2, String str3, String str4, String str5, List list, p0 p0Var, String str6, String str7) {
        if (31 != (i & 31)) {
            j1.f(r0.f170427a.getDescriptor(), i, 31);
            throw null;
        }
        this.f170430a = str;
        this.f170431b = str2;
        this.f170432c = str3;
        this.d = str4;
        this.e = str5;
        if ((i & 32) == 0) {
            this.f = zhm.f0.f322471a;
        } else {
            this.f = list;
        }
        if ((i & 64) == 0) {
            this.f170433g = null;
        } else {
            this.f170433g = p0Var;
        }
        if ((i & 128) == 0) {
            this.f170434h = null;
        } else {
            this.f170434h = str6;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str7;
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
        return Intrinsics.f(this.f170430a, t0Var.f170430a) && Intrinsics.f(this.f170431b, t0Var.f170431b) && Intrinsics.f(this.f170432c, t0Var.f170432c) && Intrinsics.f(this.d, t0Var.d) && Intrinsics.f(this.e, t0Var.e) && Intrinsics.f(this.f, t0Var.f) && Intrinsics.f(this.f170433g, t0Var.f170433g) && Intrinsics.f(this.f170434h, t0Var.f170434h) && Intrinsics.f(this.i, t0Var.i);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(p.a.c(p.a.c(p.a.c(this.f170430a.hashCode() * 31, 31, this.f170431b), 31, this.f170432c), 31, this.d), 31, this.e), 31, this.f);
        p0 p0Var = this.f170433g;
        int iHashCode = (iD + (p0Var == null ? 0 : p0Var.hashCode())) * 31;
        String str = this.f170434h;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
