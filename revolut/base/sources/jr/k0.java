package jr;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class k0 {

    @NotNull
    public static final j0 Companion = new j0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f177797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f177798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f177799c;

    public /* synthetic */ k0(int i, int i2, int i3, boolean z) {
        if (7 != (i & 7)) {
            qlm.j1.f(i0.f177794a.getDescriptor(), i, 7);
            throw null;
        }
        this.f177797a = z;
        this.f177798b = i2;
        this.f177799c = i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return this.f177797a == k0Var.f177797a && this.f177798b == k0Var.f177798b && this.f177799c == k0Var.f177799c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f177799c) + j6.a.b(this.f177798b, Boolean.hashCode(this.f177797a) * 31, 31);
    }
}
