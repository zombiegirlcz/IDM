package jr;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class t1 {

    @NotNull
    public static final s1 Companion = new s1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f177845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f177846b;

    public /* synthetic */ t1(int i, boolean z, double d) {
        if (1 != (i & 1)) {
            qlm.j1.f(r1.f177835a.getDescriptor(), i, 1);
            throw null;
        }
        this.f177845a = z;
        if ((i & 2) == 0) {
            this.f177846b = 100.0d;
        } else {
            this.f177846b = d;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj2;
        return this.f177845a == t1Var.f177845a && Double.compare(this.f177846b, t1Var.f177846b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f177846b) + (Boolean.hashCode(this.f177845a) * 31);
    }
}
