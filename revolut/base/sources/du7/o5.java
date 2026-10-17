package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class o5 {

    @NotNull
    public static final n5 Companion = new n5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f117800c;
    public final String d;
    public final y6 e;
    public final g6 f;

    public /* synthetic */ o5(int i, String str, String str2, String str3, String str4, y6 y6Var, g6 g6Var) {
        if (63 != (i & 63)) {
            qlm.j1.f(m5.f117774a.getDescriptor(), i, 63);
            throw null;
        }
        this.f117798a = str;
        this.f117799b = str2;
        this.f117800c = str3;
        this.d = str4;
        this.e = y6Var;
        this.f = g6Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o5)) {
            return false;
        }
        o5 o5Var = (o5) obj2;
        return Intrinsics.f(this.f117798a, o5Var.f117798a) && Intrinsics.f(this.f117799b, o5Var.f117799b) && Intrinsics.f(this.f117800c, o5Var.f117800c) && Intrinsics.f(this.d, o5Var.d) && Intrinsics.f(this.e, o5Var.e) && Intrinsics.f(this.f, o5Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.f117798a.hashCode() * 31;
        String str = this.f117799b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f117800c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        y6 y6Var = this.e;
        int iHashCode5 = (iHashCode4 + (y6Var == null ? 0 : y6Var.hashCode())) * 31;
        g6 g6Var = this.f;
        return iHashCode5 + (g6Var != null ? g6Var.hashCode() : 0);
    }
}
