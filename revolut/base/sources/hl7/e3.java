package hl7;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class e3 {

    @NotNull
    public static final d3 Companion = new d3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f153074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f153075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f153076c;
    public final int d;
    public final int e;
    public final int f;

    public e3(int i, int i2, int i3, int i5, int i6, int i21) {
        this.f153074a = i;
        this.f153075b = i2;
        this.f153076c = i3;
        this.d = i5;
        this.e = i6;
        this.f = i21;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e3)) {
            return false;
        }
        e3 e3Var = (e3) obj2;
        return this.f153074a == e3Var.f153074a && this.f153075b == e3Var.f153075b && this.f153076c == e3Var.f153076c && this.d == e3Var.d && this.e == e3Var.e && this.f == e3Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + j6.a.b(this.e, j6.a.b(this.d, j6.a.b(this.f153076c, j6.a.b(this.f153075b, Integer.hashCode(this.f153074a) * 31, 31), 31), 31), 31);
    }

    public /* synthetic */ e3(int i, int i2, int i3, int i5, int i6, int i21, int i22) {
        if (63 != (i & 63)) {
            qlm.j1.f(c3.f153046a.getDescriptor(), i, 63);
            throw null;
        }
        this.f153074a = i2;
        this.f153075b = i3;
        this.f153076c = i5;
        this.d = i6;
        this.e = i21;
        this.f = i22;
    }
}
