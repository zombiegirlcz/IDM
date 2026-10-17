package jr;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class x1 {

    @NotNull
    public static final w1 Companion = new w1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f177866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f177867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f177868c;
    public final int d;
    public final int e;

    public /* synthetic */ x1(int i, int i2, int i3, int i5, boolean z, float f) {
        if (1 != (i & 1)) {
            qlm.j1.f(v1.f177857a.getDescriptor(), i, 1);
            throw null;
        }
        this.f177866a = z;
        this.f177867b = (i & 2) == 0 ? 4 : i2;
        if ((i & 4) == 0) {
            this.f177868c = 0.05f;
        } else {
            this.f177868c = f;
        }
        if ((i & 8) == 0) {
            this.d = 5;
        } else {
            this.d = i3;
        }
        if ((i & 16) == 0) {
            this.e = 32;
        } else {
            this.e = i5;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj2;
        return this.f177866a == x1Var.f177866a && this.f177867b == x1Var.f177867b && Float.compare(this.f177868c, x1Var.f177868c) == 0 && this.d == x1Var.d && this.e == x1Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + j6.a.b(this.d, m72.b.b(this.f177868c, j6.a.b(this.f177867b, Boolean.hashCode(this.f177866a) * 31, 31), 31), 31);
    }
}
