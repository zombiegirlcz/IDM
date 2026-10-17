package f2e;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class u1 {

    @NotNull
    public static final t1 Companion = new t1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f131723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f131724b;

    public u1(double d, double d5) {
        this.f131723a = d;
        this.f131724b = d5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj2;
        return Double.compare(this.f131723a, u1Var.f131723a) == 0 && Double.compare(this.f131724b, u1Var.f131724b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f131724b) + (Double.hashCode(this.f131723a) * 31);
    }

    public /* synthetic */ u1(int i, double d, double d5) {
        if (3 != (i & 3)) {
            qlm.j1.f(s1.f131710a.getDescriptor(), i, 3);
            throw null;
        }
        this.f131723a = d;
        this.f131724b = d5;
    }
}
