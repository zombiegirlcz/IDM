package com.fourthline.core.internal;

import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes23.dex */
public final class d0 extends r {
    private static final a M = new a(null);
    private static final IntRange N = kotlin.ranges.f.o(48, 59);
    private final IntRange A;
    private final IntRange B;
    private final IntRange C;
    private final IntRange D;
    private final IntRange E;
    private final int F;
    private final int G;
    private final IntRange H;
    private final IntRange I;
    private final IntRange J;
    private final IntRange K;
    private final String L;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final String f26300y;
    private final Lazy z;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(String mrzText) {
        super(mrzText);
        Intrinsics.checkNotNullParameter(mrzText, "mrzText");
        this.f26300y = mrzText;
        this.z = yhm.j.b(new k0(this, 0));
        this.A = kotlin.ranges.f.o(60, 90);
        this.B = kotlin.ranges.f.o(45, 48);
        this.C = kotlin.ranges.f.o(30, 36);
        this.D = kotlin.ranges.f.o(38, 44);
        this.E = new IntRange(37, 37, 1);
        int iMax = Math.max(n().e().c() + 1, 15);
        this.F = iMax;
        int i = C() ? 28 : 29;
        this.G = i;
        this.H = new IntRange(iMax, i, 1);
        this.I = new IntRange(36, 36, 1);
        this.J = new IntRange(44, 44, 1);
        this.K = new IntRange(59, 59, 1);
        this.L = b0.g(kotlin.text.d0.t0(mrzText, new IntRange(5, 30, 1))) + kotlin.text.d0.t0(mrzText, new IntRange(31, 36, 1)) + kotlin.text.d0.t0(mrzText, new IntRange(38, 44, 1)) + kotlin.text.d0.t0(mrzText, N);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c0 a(d0 d0Var) {
        return new c0(d0Var.f26300y, true);
    }

    @Override // com.fourthline.core.internal.r
    public boolean A() {
        return !b0.d(kotlin.text.d0.t0(this.f26300y, kotlin.ranges.f.o(0, 90)));
    }

    @Override // com.fourthline.core.internal.r
    public IntRange c() {
        return this.I;
    }

    @Override // com.fourthline.core.internal.r
    public IntRange d() {
        return this.C;
    }

    @Override // com.fourthline.core.internal.r
    public IntRange i() {
        return this.J;
    }

    @Override // com.fourthline.core.internal.r
    public IntRange j() {
        return this.D;
    }

    @Override // com.fourthline.core.internal.r
    public IntRange l() {
        return this.E;
    }

    @Override // com.fourthline.core.internal.r
    public n n() {
        return (n) this.z.getValue();
    }

    @Override // com.fourthline.core.internal.r
    public IntRange p() {
        return this.A;
    }

    @Override // com.fourthline.core.internal.r
    public IntRange r() {
        return this.B;
    }

    @Override // com.fourthline.core.internal.r
    public IntRange t() {
        return this.H;
    }

    @Override // com.fourthline.core.internal.r
    public String x() {
        return this.L;
    }

    @Override // com.fourthline.core.internal.r
    public IntRange z() {
        return this.K;
    }

    private final boolean C() {
        return Intrinsics.f(f(), "NLD") && Intrinsics.f(g(), "I");
    }
}
