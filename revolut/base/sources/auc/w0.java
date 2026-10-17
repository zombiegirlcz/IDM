package auc;

import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class w0 {

    @NotNull
    public static final v0 Companion = new v0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f9794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f9795b;

    public w0(double d, double d5) {
        this.f9794a = d;
        this.f9795b = d5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj2;
        return Double.compare(this.f9794a, w0Var.f9794a) == 0 && Double.compare(this.f9795b, w0Var.f9795b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f9795b) + (Double.hashCode(this.f9794a) * 31);
    }

    public /* synthetic */ w0(int i, double d, double d5) {
        if (3 != (i & 3)) {
            j1.f(u0.f9792a.getDescriptor(), i, 3);
            throw null;
        }
        this.f9794a = d;
        this.f9795b = d5;
    }
}
