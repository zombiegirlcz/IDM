package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class g4 {

    @NotNull
    public static final f4 Companion = new f4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f124554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f124555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f124556c;
    public final Double d;
    public final Double e;

    public g4(double d, double d5, double d6, Double d10, Double d15) {
        this.f124554a = d;
        this.f124555b = d5;
        this.f124556c = d6;
        this.d = d10;
        this.e = d15;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g4)) {
            return false;
        }
        g4 g4Var = (g4) obj2;
        return Double.compare(this.f124554a, g4Var.f124554a) == 0 && Double.compare(this.f124555b, g4Var.f124555b) == 0 && Double.compare(this.f124556c, g4Var.f124556c) == 0 && Intrinsics.f(this.d, g4Var.d) && Intrinsics.f(this.e, g4Var.e);
    }

    public final int hashCode() {
        int iC = m72.b.c(m72.b.c(Double.hashCode(this.f124554a) * 31, this.f124555b, 31), this.f124556c, 31);
        Double d = this.d;
        int iHashCode = (iC + (d == null ? 0 : d.hashCode())) * 31;
        Double d5 = this.e;
        return iHashCode + (d5 != null ? d5.hashCode() : 0);
    }

    public /* synthetic */ g4(int i, double d, double d5, double d6, Double d10, Double d15) {
        if (31 != (i & 31)) {
            qlm.j1.f(e4.f124538a.getDescriptor(), i, 31);
            throw null;
        }
        this.f124554a = d;
        this.f124555b = d5;
        this.f124556c = d6;
        this.d = d10;
        this.e = d15;
    }
}
