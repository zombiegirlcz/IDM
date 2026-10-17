package com.fourthline.orca.internal;

import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class bh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f27117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f27118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final xg0 f27119c;
    private final li0 d;
    private final vg0 e;
    private final qh0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final rh0 f27120g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final gi0 f27121h;
    private final ji0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final zh0 f27122j;
    private final ph0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f27123l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f27124m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f27125n;
    private final long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final long f27126p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final long f27127q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final long f27128r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ug0 f27129s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f27130t;
    private final boolean u;

    public /* synthetic */ bh0(long j2, long j3, xg0 xg0Var, li0 li0Var, vg0 vg0Var, qh0 qh0Var, rh0 rh0Var, gi0 gi0Var, ji0 ji0Var, zh0 zh0Var, ph0 ph0Var, long j5, long j16, long j22, long j42, long j46, long j47, long j57, ug0 ug0Var, long j58, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, xg0Var, li0Var, vg0Var, qh0Var, rh0Var, gi0Var, ji0Var, zh0Var, ph0Var, j5, j16, j22, j42, j46, j47, j57, ug0Var, j58, z);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof bh0)) {
            return false;
        }
        bh0 bh0Var = (bh0) obj2;
        return Color.m1978equalsimpl0(this.f27117a, bh0Var.f27117a) && Color.m1978equalsimpl0(this.f27118b, bh0Var.f27118b) && Intrinsics.f(this.f27119c, bh0Var.f27119c) && Intrinsics.f(this.d, bh0Var.d) && Intrinsics.f(this.e, bh0Var.e) && Intrinsics.f(this.f, bh0Var.f) && Intrinsics.f(this.f27120g, bh0Var.f27120g) && Intrinsics.f(this.f27121h, bh0Var.f27121h) && Intrinsics.f(this.i, bh0Var.i) && Intrinsics.f(this.f27122j, bh0Var.f27122j) && Intrinsics.f(this.k, bh0Var.k) && Color.m1978equalsimpl0(this.f27123l, bh0Var.f27123l) && Color.m1978equalsimpl0(this.f27124m, bh0Var.f27124m) && Color.m1978equalsimpl0(this.f27125n, bh0Var.f27125n) && Color.m1978equalsimpl0(this.o, bh0Var.o) && Color.m1978equalsimpl0(this.f27126p, bh0Var.f27126p) && Color.m1978equalsimpl0(this.f27127q, bh0Var.f27127q) && Color.m1978equalsimpl0(this.f27128r, bh0Var.f27128r) && Intrinsics.f(this.f27129s, bh0Var.f27129s) && Color.m1978equalsimpl0(this.f27130t, bh0Var.f27130t) && this.u == bh0Var.u;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((Color.m1984hashCodeimpl(this.f27117a) * 31) + Color.m1984hashCodeimpl(this.f27118b)) * 31) + this.f27119c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.f27120g.hashCode()) * 31) + this.f27121h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.f27122j.hashCode()) * 31) + this.k.hashCode()) * 31) + Color.m1984hashCodeimpl(this.f27123l)) * 31) + Color.m1984hashCodeimpl(this.f27124m)) * 31) + Color.m1984hashCodeimpl(this.f27125n)) * 31) + Color.m1984hashCodeimpl(this.o)) * 31) + Color.m1984hashCodeimpl(this.f27126p)) * 31) + Color.m1984hashCodeimpl(this.f27127q)) * 31) + Color.m1984hashCodeimpl(this.f27128r)) * 31) + this.f27129s.hashCode()) * 31) + Color.m1984hashCodeimpl(this.f27130t)) * 31) + Boolean.hashCode(this.u);
    }

    public String toString() {
        return "OrcaColors(primary=" + Color.m1985toStringimpl(this.f27117a) + ", accent=" + Color.m1985toStringimpl(this.f27118b) + ", buttons=" + this.f27119c + ", screen=" + this.d + ", box=" + this.e + ", hint=" + this.f + ", inputField=" + this.f27120g + ", popup=" + this.f27121h + ", scanner=" + this.i + ", nfcScanner=" + this.f27122j + ", graphic=" + this.k + ", animationQuaternary=" + Color.m1985toStringimpl(this.f27123l) + ", scannerOverlay=" + Color.m1985toStringimpl(this.f27124m) + ", scannerBackground=" + Color.m1985toStringimpl(this.f27125n) + ", maskCornersSuccess=" + Color.m1985toStringimpl(this.o) + ", maskCornersWarning=" + Color.m1985toStringimpl(this.f27126p) + ", spinnerBackgroundColor=" + Color.m1985toStringimpl(this.f27127q) + ", iconColor=" + Color.m1985toStringimpl(this.f27128r) + ", animationColors=" + this.f27129s + ", pagerDotUnselectedColor=" + Color.m1985toStringimpl(this.f27130t) + ", isLight=" + this.u + ")";
    }

    private bh0(long j2, long j3, xg0 buttons, li0 screen, vg0 box, qh0 hint, rh0 inputField, gi0 popup, ji0 scanner, zh0 nfcScanner, ph0 graphic, long j5, long j16, long j22, long j42, long j46, long j47, long j57, ug0 animationColors, long j58, boolean z) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(box, "box");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(inputField, "inputField");
        Intrinsics.checkNotNullParameter(popup, "popup");
        Intrinsics.checkNotNullParameter(scanner, "scanner");
        Intrinsics.checkNotNullParameter(nfcScanner, "nfcScanner");
        Intrinsics.checkNotNullParameter(graphic, "graphic");
        Intrinsics.checkNotNullParameter(animationColors, "animationColors");
        this.f27117a = j2;
        this.f27118b = j3;
        this.f27119c = buttons;
        this.d = screen;
        this.e = box;
        this.f = hint;
        this.f27120g = inputField;
        this.f27121h = popup;
        this.i = scanner;
        this.f27122j = nfcScanner;
        this.k = graphic;
        this.f27123l = j5;
        this.f27124m = j16;
        this.f27125n = j22;
        this.o = j42;
        this.f27126p = j46;
        this.f27127q = j47;
        this.f27128r = j57;
        this.f27129s = animationColors;
        this.f27130t = j58;
        this.u = z;
    }
}
