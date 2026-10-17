package yp0;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f315730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f315731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f315732c;
    public final int d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f315733g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f315734h;
    public final int i;

    public h0(View view, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f315730a = view;
        this.f315731b = i;
        this.f315732c = i2;
        this.d = i3;
        this.e = i5;
        this.f = i6;
        this.f315733g = i21;
        this.f315734h = i22;
        this.i = i32;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f315730a, h0Var.f315730a) && this.f315731b == h0Var.f315731b && this.f315732c == h0Var.f315732c && this.d == h0Var.d && this.e == h0Var.e && this.f == h0Var.f && this.f315733g == h0Var.f315733g && this.f315734h == h0Var.f315734h && this.i == h0Var.i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + j6.a.b(this.f315734h, j6.a.b(this.f315733g, j6.a.b(this.f, j6.a.b(this.e, j6.a.b(this.d, j6.a.b(this.f315732c, j6.a.b(this.f315731b, this.f315730a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
    }
}
