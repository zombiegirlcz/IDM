package auc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class z0 {

    @NotNull
    public static final y0 Companion = new y0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f9801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f9802c;
    public final int d;

    public z0(double d, double d5, int i, String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f9800a = label;
        this.f9801b = d;
        this.f9802c = d5;
        this.d = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj2;
        return Intrinsics.f(this.f9800a, z0Var.f9800a) && Double.compare(this.f9801b, z0Var.f9801b) == 0 && Double.compare(this.f9802c, z0Var.f9802c) == 0 && this.d == z0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + m72.b.c(m72.b.c(this.f9800a.hashCode() * 31, this.f9801b, 31), this.f9802c, 31);
    }

    public /* synthetic */ z0(int i, String str, double d, double d5, int i2) {
        if (15 != (i & 15)) {
            j1.f(x0.f9798a.getDescriptor(), i, 15);
            throw null;
        }
        this.f9800a = str;
        this.f9801b = d;
        this.f9802c = d5;
        this.d = i2;
    }
}
