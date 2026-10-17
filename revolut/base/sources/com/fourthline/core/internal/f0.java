package com.fourthline.core.internal;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes23.dex */
public final class f0 extends r {
    private final IntRange A;
    private final IntRange B;
    private final IntRange C;
    private final IntRange D;
    private final IntRange E;
    private final IntRange F;
    private final IntRange G;
    private final IntRange H;
    private final IntRange I;
    private final String J;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final String f26351y;
    private final Lazy z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(String mrzText) {
        super(mrzText);
        Intrinsics.checkNotNullParameter(mrzText, "mrzText");
        this.f26351y = mrzText;
        this.z = yhm.j.b(new k0(this, 1));
        this.A = kotlin.ranges.f.o(5, 36);
        this.B = kotlin.ranges.f.o(46, 49);
        this.C = kotlin.ranges.f.o(49, 55);
        this.D = kotlin.ranges.f.o(57, 63);
        this.E = new IntRange(56, 56, 1);
        this.F = new IntRange(Math.max(n().e().c() + 1, 64), 70, 1);
        this.G = new IntRange(55, 55, 1);
        this.H = new IntRange(63, 63, 1);
        this.I = new IntRange(71, 71, 1);
        this.J = b0.g(kotlin.text.d0.t0(mrzText, kotlin.ranges.f.o(36, 46))) + e() + b() + k() + h() + kotlin.text.d0.t0(mrzText, kotlin.ranges.f.o(64, 71));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e0 a(f0 f0Var) {
        return new e0(f0Var.f26351y, true);
    }

    @Override // com.fourthline.core.internal.r
    public boolean A() {
        return !b0.d(kotlin.text.d0.t0(this.f26351y, kotlin.ranges.f.o(0, 36)));
    }

    @Override // com.fourthline.core.internal.r
    public IntRange c() {
        return this.G;
    }

    @Override // com.fourthline.core.internal.r
    public IntRange d() {
        return this.C;
    }

    @Override // com.fourthline.core.internal.r
    public IntRange i() {
        return this.H;
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
        return this.F;
    }

    @Override // com.fourthline.core.internal.r
    public String x() {
        return this.J;
    }

    @Override // com.fourthline.core.internal.r
    public IntRange z() {
        return this.I;
    }
}
