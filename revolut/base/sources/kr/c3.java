package kr;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class c3 {

    @NotNull
    public static final b3 Companion = new b3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f188471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f188472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f188473c;
    public final int d;
    public final int e;

    public c3(int i, int i2, int i3, int i5, int i6) {
        this.f188471a = i;
        this.f188472b = i2;
        this.f188473c = i3;
        this.d = i5;
        this.e = i6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c3)) {
            return false;
        }
        c3 c3Var = (c3) obj2;
        return this.f188471a == c3Var.f188471a && this.f188472b == c3Var.f188472b && this.f188473c == c3Var.f188473c && this.d == c3Var.d && this.e == c3Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + j6.a.b(this.d, j6.a.b(this.f188473c, j6.a.b(this.f188472b, Integer.hashCode(this.f188471a) * 31, 31), 31), 31);
    }

    public /* synthetic */ c3(int i, int i2, int i3, int i5, int i6, int i21) {
        if (31 != (i & 31)) {
            qlm.j1.f(a3.f188458a.getDescriptor(), i, 31);
            throw null;
        }
        this.f188471a = i2;
        this.f188472b = i3;
        this.f188473c = i5;
        this.d = i6;
        this.e = i21;
    }
}
