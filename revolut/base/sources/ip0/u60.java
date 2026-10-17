package ip0;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f166601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f166602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f166603c;
    public final int d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f166604g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f166605h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f166606j;
    public final float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f166607l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final View f166608m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f166609n;
    public final Integer o;

    public /* synthetic */ u60(int i, int i2, float f, int i3, boolean z, boolean z3, int i5, int i6, int i21, int i22, float f4, boolean z4, View view) {
        this(i, i2, f, i3, z, z3, i5, i6, i21, i22, f4, z4, view, false, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u60)) {
            return false;
        }
        u60 u60Var = (u60) obj2;
        return this.f166601a == u60Var.f166601a && this.f166602b == u60Var.f166602b && Float.compare(this.f166603c, u60Var.f166603c) == 0 && this.d == u60Var.d && this.e == u60Var.e && this.f == u60Var.f && this.f166604g == u60Var.f166604g && this.f166605h == u60Var.f166605h && this.i == u60Var.i && this.f166606j == u60Var.f166606j && Float.compare(this.k, u60Var.k) == 0 && this.f166607l == u60Var.f166607l && Intrinsics.f(this.f166608m, u60Var.f166608m) && this.f166609n == u60Var.f166609n && Intrinsics.f(this.o, u60Var.o);
    }

    public final int hashCode() {
        int iC = j6.a.c((this.f166608m.hashCode() + j6.a.c(m72.b.b(this.k, j6.a.b(this.f166606j, j6.a.b(this.i, j6.a.b(this.f166605h, j6.a.b(this.f166604g, j6.a.c(j6.a.c(j6.a.b(this.d, m72.b.b(this.f166603c, j6.a.b(this.f166602b, Integer.hashCode(this.f166601a) * 31, 31), 31), 31), 31, this.e), 31, this.f), 31), 31), 31), 31), 31), 31, this.f166607l)) * 31, 31, this.f166609n);
        Integer num = this.o;
        return iC + (num == null ? 0 : num.hashCode());
    }

    public u60(int i, int i2, float f, int i3, boolean z, boolean z3, int i5, int i6, int i21, int i22, float f4, boolean z4, View contentView, boolean z6, Integer num) {
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        this.f166601a = i;
        this.f166602b = i2;
        this.f166603c = f;
        this.d = i3;
        this.e = z;
        this.f = z3;
        this.f166604g = i5;
        this.f166605h = i6;
        this.i = i21;
        this.f166606j = i22;
        this.k = f4;
        this.f166607l = z4;
        this.f166608m = contentView;
        this.f166609n = z6;
        this.o = num;
    }
}
