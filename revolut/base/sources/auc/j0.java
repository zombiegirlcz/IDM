package auc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class j0 {

    @NotNull
    public static final i0 Companion = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f9737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f9738c;
    public final int d;

    public j0(double d, double d5, int i, String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f9736a = label;
        this.f9737b = d;
        this.f9738c = d5;
        this.d = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f9736a, j0Var.f9736a) && Double.compare(this.f9737b, j0Var.f9737b) == 0 && Double.compare(this.f9738c, j0Var.f9738c) == 0 && this.d == j0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + m72.b.c(m72.b.c(this.f9736a.hashCode() * 31, this.f9737b, 31), this.f9738c, 31);
    }

    public /* synthetic */ j0(int i, String str, double d, double d5, int i2) {
        if (15 != (i & 15)) {
            j1.f(h0.f9731a.getDescriptor(), i, 15);
            throw null;
        }
        this.f9736a = str;
        this.f9737b = d;
        this.f9738c = d5;
        this.d = i2;
    }
}
