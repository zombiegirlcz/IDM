package com.fourthline.core.internal;

import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes23.dex */
public final class h extends r {
    public static final a L = new a(null);
    private final Lazy A;
    private final IntRange B;
    private final IntRange C;
    private final IntRange D;
    private final IntRange E;
    private final String F;
    private final String G;
    private final String H;
    private final String I;
    private final String J;
    private final String K;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final String f26354y;
    private final n z;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String mrzText) {
        super(mrzText);
        Intrinsics.checkNotNullParameter(mrzText, "mrzText");
        this.f26354y = mrzText;
        this.z = new g(mrzText);
        this.A = yhm.j.b(new k0(this, 2));
        this.B = kotlin.ranges.f.o(63, 69);
        this.C = new IntRange(70, 70, 1);
        this.D = new IntRange(69, 69, 1);
        this.E = new IntRange(71, 71, 1);
        this.F = "FRA";
        this.G = "";
        this.H = "";
        this.I = "IDFRA" + b0.j(kotlin.text.d0.t0(mrzText, kotlin.ranges.f.o(5, 30))) + kotlin.text.d0.t0(mrzText, kotlin.ranges.f.o(30, 49)) + b0.j(kotlin.text.d0.t0(mrzText, kotlin.ranges.f.o(49, 63))) + e() + b() + m();
        this.J = b0.b(kotlin.text.a0.D(kotlin.text.d0.t0(mrzText, kotlin.ranges.f.o(49, 63)), "<<", "<", false));
        this.K = b0.b(kotlin.text.d0.t0(mrzText, kotlin.ranges.f.o(5, 30)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String a(h hVar) {
        return hVar.K + "<<" + hVar.J;
    }

    @Override // com.fourthline.core.internal.r
    public boolean A() {
        return (b0.d(kotlin.text.d0.t0(kotlin.text.d0.t0(this.f26354y, kotlin.ranges.f.o(0, 36)), kotlin.ranges.f.o(5, 30))) && b0.d(kotlin.text.d0.t0(kotlin.text.d0.t0(this.f26354y, kotlin.ranges.f.o(36, 72)), kotlin.ranges.f.o(13, 27)))) ? false : true;
    }

    @Override // com.fourthline.core.internal.r
    public IntRange c() {
        return this.D;
    }

    @Override // com.fourthline.core.internal.r
    public IntRange d() {
        return this.B;
    }

    @Override // com.fourthline.core.internal.r
    public String h() {
        return this.H;
    }

    @Override // com.fourthline.core.internal.r
    public String k() {
        return this.G;
    }

    @Override // com.fourthline.core.internal.r
    public IntRange l() {
        return this.C;
    }

    @Override // com.fourthline.core.internal.r
    public n n() {
        return this.z;
    }

    @Override // com.fourthline.core.internal.r
    public String q() {
        return (String) this.A.getValue();
    }

    @Override // com.fourthline.core.internal.r
    public String s() {
        return this.F;
    }

    @Override // com.fourthline.core.internal.r
    public String x() {
        return this.I;
    }

    @Override // com.fourthline.core.internal.r
    public IntRange z() {
        return this.E;
    }
}
