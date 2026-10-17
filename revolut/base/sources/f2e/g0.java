package f2e;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class g0 {

    @NotNull
    public static final f0 Companion = new f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f131596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f131597b;

    public g0(double d, double d5) {
        this.f131596a = d;
        this.f131597b = d5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Double.compare(this.f131596a, g0Var.f131596a) == 0 && Double.compare(this.f131597b, g0Var.f131597b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f131597b) + (Double.hashCode(this.f131596a) * 31);
    }

    public /* synthetic */ g0(int i, double d, double d5) {
        if (3 != (i & 3)) {
            qlm.j1.f(e0.f131574a.getDescriptor(), i, 3);
            throw null;
        }
        this.f131596a = d;
        this.f131597b = d5;
    }
}
