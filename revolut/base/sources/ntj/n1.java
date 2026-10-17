package ntj;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class n1 {

    @NotNull
    public static final m1 Companion = new m1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f219105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f219106b;

    public n1(int i, int i2) {
        this.f219105a = i;
        this.f219106b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj2;
        return this.f219105a == n1Var.f219105a && this.f219106b == n1Var.f219106b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f219106b) + (Integer.hashCode(this.f219105a) * 31);
    }

    public /* synthetic */ n1(int i, int i2, int i3) {
        if (3 != (i & 3)) {
            qlm.j1.f(l1.f219096a.getDescriptor(), i, 3);
            throw null;
        }
        this.f219105a = i2;
        this.f219106b = i3;
    }
}
