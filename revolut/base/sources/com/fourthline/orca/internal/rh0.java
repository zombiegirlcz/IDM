package com.fourthline.orca.internal;

import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public final class rh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f32733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f32734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f32735c;
    private final long d;
    private final long e;
    private final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f32736g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f32737h;
    private final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f32738j;

    public /* synthetic */ rh0(long j2, long j3, long j5, long j16, long j22, long j42, long j46, long j47, long j57, long j58, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j5, j16, j22, j42, j46, j47, j57, j58);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof rh0)) {
            return false;
        }
        rh0 rh0Var = (rh0) obj2;
        return Color.m1978equalsimpl0(this.f32733a, rh0Var.f32733a) && Color.m1978equalsimpl0(this.f32734b, rh0Var.f32734b) && Color.m1978equalsimpl0(this.f32735c, rh0Var.f32735c) && Color.m1978equalsimpl0(this.d, rh0Var.d) && Color.m1978equalsimpl0(this.e, rh0Var.e) && Color.m1978equalsimpl0(this.f, rh0Var.f) && Color.m1978equalsimpl0(this.f32736g, rh0Var.f32736g) && Color.m1978equalsimpl0(this.f32737h, rh0Var.f32737h) && Color.m1978equalsimpl0(this.i, rh0Var.i) && Color.m1978equalsimpl0(this.f32738j, rh0Var.f32738j);
    }

    public int hashCode() {
        return (((((((((((((((((Color.m1984hashCodeimpl(this.f32733a) * 31) + Color.m1984hashCodeimpl(this.f32734b)) * 31) + Color.m1984hashCodeimpl(this.f32735c)) * 31) + Color.m1984hashCodeimpl(this.d)) * 31) + Color.m1984hashCodeimpl(this.e)) * 31) + Color.m1984hashCodeimpl(this.f)) * 31) + Color.m1984hashCodeimpl(this.f32736g)) * 31) + Color.m1984hashCodeimpl(this.f32737h)) * 31) + Color.m1984hashCodeimpl(this.i)) * 31) + Color.m1984hashCodeimpl(this.f32738j);
    }

    public String toString() {
        return "OrcaInputField(textColor=" + Color.m1985toStringimpl(this.f32733a) + ", backgroundColor=" + Color.m1985toStringimpl(this.f32734b) + ", borderColor=" + Color.m1985toStringimpl(this.f32735c) + ", disabledTextColor=" + Color.m1985toStringimpl(this.d) + ", disabledBackgroundColor=" + Color.m1985toStringimpl(this.e) + ", disabledBorderColor=" + Color.m1985toStringimpl(this.f) + ", placeholderColor=" + Color.m1985toStringimpl(this.f32736g) + ", titleColor=" + Color.m1985toStringimpl(this.f32737h) + ", statusColor=" + Color.m1985toStringimpl(this.i) + ", errorColor=" + Color.m1985toStringimpl(this.f32738j) + ")";
    }

    private rh0(long j2, long j3, long j5, long j16, long j22, long j42, long j46, long j47, long j57, long j58) {
        this.f32733a = j2;
        this.f32734b = j3;
        this.f32735c = j5;
        this.d = j16;
        this.e = j22;
        this.f = j42;
        this.f32736g = j46;
        this.f32737h = j47;
        this.i = j57;
        this.f32738j = j58;
    }
}
