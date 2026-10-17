package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class z1 {

    @NotNull
    public static final y1 Companion = new y1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f295088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f295089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f295090c;
    public final w1 d;
    public final c2 e;

    public /* synthetic */ z1(int i, String str, String str2, String str3, w1 w1Var, c2 c2Var) {
        if (31 != (i & 31)) {
            qlm.j1.f(x1.f295065a.getDescriptor(), i, 31);
            throw null;
        }
        this.f295088a = str;
        this.f295089b = str2;
        this.f295090c = str3;
        this.d = w1Var;
        this.e = c2Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj2;
        return Intrinsics.f(this.f295088a, z1Var.f295088a) && Intrinsics.f(this.f295089b, z1Var.f295089b) && Intrinsics.f(this.f295090c, z1Var.f295090c) && Intrinsics.f(this.d, z1Var.d) && Intrinsics.f(this.e, z1Var.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f295088a.hashCode() * 31, 31, this.f295089b);
        String str = this.f295090c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        w1 w1Var = this.d;
        int iHashCode2 = (iHashCode + (w1Var == null ? 0 : w1Var.hashCode())) * 31;
        c2 c2Var = this.e;
        return iHashCode2 + (c2Var != null ? c2Var.hashCode() : 0);
    }

    public z1(String type, String title, String str, w1 w1Var, c2 c2Var) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f295088a = type;
        this.f295089b = title;
        this.f295090c = str;
        this.d = w1Var;
        this.e = c2Var;
    }
}
