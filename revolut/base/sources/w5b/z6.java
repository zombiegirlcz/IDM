package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class z6 {

    @NotNull
    public static final y6 Companion = new y6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f295093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f295094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t6 f295095c;
    public final c7 d;
    public final k6 e;
    public final h6 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h6 f295096g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f295097h;
    public final f7 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o7 f295098j;

    public /* synthetic */ z6(int i, String str, String str2, t6 t6Var, c7 c7Var, k6 k6Var, h6 h6Var, h6 h6Var2, String str3, f7 f7Var, o7 o7Var) {
        if (1023 != (i & 1023)) {
            qlm.j1.f(x6.f295074a.getDescriptor(), i, 1023);
            throw null;
        }
        this.f295093a = str;
        this.f295094b = str2;
        this.f295095c = t6Var;
        this.d = c7Var;
        this.e = k6Var;
        this.f = h6Var;
        this.f295096g = h6Var2;
        this.f295097h = str3;
        this.i = f7Var;
        this.f295098j = o7Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z6)) {
            return false;
        }
        z6 z6Var = (z6) obj2;
        return Intrinsics.f(this.f295093a, z6Var.f295093a) && Intrinsics.f(this.f295094b, z6Var.f295094b) && Intrinsics.f(this.f295095c, z6Var.f295095c) && Intrinsics.f(this.d, z6Var.d) && Intrinsics.f(this.e, z6Var.e) && Intrinsics.f(this.f, z6Var.f) && Intrinsics.f(this.f295096g, z6Var.f295096g) && Intrinsics.f(this.f295097h, z6Var.f295097h) && Intrinsics.f(this.i, z6Var.i) && Intrinsics.f(this.f295098j, z6Var.f295098j);
    }

    public final int hashCode() {
        int iHashCode = this.f295093a.hashCode() * 31;
        String str = this.f295094b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        t6 t6Var = this.f295095c;
        int iHashCode3 = (iHashCode2 + (t6Var == null ? 0 : t6Var.hashCode())) * 31;
        c7 c7Var = this.d;
        int iHashCode4 = (iHashCode3 + (c7Var == null ? 0 : c7Var.hashCode())) * 31;
        k6 k6Var = this.e;
        int iHashCode5 = (iHashCode4 + (k6Var == null ? 0 : k6Var.hashCode())) * 31;
        h6 h6Var = this.f;
        int iHashCode6 = (iHashCode5 + (h6Var == null ? 0 : h6Var.hashCode())) * 31;
        h6 h6Var2 = this.f295096g;
        int iHashCode7 = (iHashCode6 + (h6Var2 == null ? 0 : h6Var2.hashCode())) * 31;
        String str2 = this.f295097h;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        f7 f7Var = this.i;
        int iHashCode9 = (iHashCode8 + (f7Var == null ? 0 : f7Var.hashCode())) * 31;
        o7 o7Var = this.f295098j;
        return iHashCode9 + (o7Var != null ? o7Var.hashCode() : 0);
    }

    public z6(String title, String str, t6 t6Var, c7 c7Var, k6 k6Var, h6 h6Var, h6 h6Var2, String str2, f7 f7Var, o7 o7Var) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f295093a = title;
        this.f295094b = str;
        this.f295095c = t6Var;
        this.d = c7Var;
        this.e = k6Var;
        this.f = h6Var;
        this.f295096g = h6Var2;
        this.f295097h = str2;
        this.i = f7Var;
        this.f295098j = o7Var;
    }
}
