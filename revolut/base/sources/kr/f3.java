package kr;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class f3 {

    @NotNull
    public static final e3 Companion = new e3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f188495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f188496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f188497c;
    public final int d;

    public f3(int i, int i2, int i3, int i5) {
        this.f188495a = i;
        this.f188496b = i2;
        this.f188497c = i3;
        this.d = i5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f3)) {
            return false;
        }
        f3 f3Var = (f3) obj2;
        return this.f188495a == f3Var.f188495a && this.f188496b == f3Var.f188496b && this.f188497c == f3Var.f188497c && this.d == f3Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + j6.a.b(this.f188497c, j6.a.b(this.f188496b, Integer.hashCode(this.f188495a) * 31, 31), 31);
    }

    public /* synthetic */ f3(int i, int i2, int i3, int i5, int i6) {
        if (15 != (i & 15)) {
            qlm.j1.f(d3.f188480a.getDescriptor(), i, 15);
            throw null;
        }
        this.f188495a = i2;
        this.f188496b = i3;
        this.f188497c = i5;
        this.d = i6;
    }
}
