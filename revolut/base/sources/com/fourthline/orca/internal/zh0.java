package com.fourthline.orca.internal;

import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public final class zh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f35586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f35587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f35588c;
    private final long d;
    private final long e;

    public /* synthetic */ zh0(long j2, long j3, long j5, long j16, long j22, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j5, j16, j22);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zh0)) {
            return false;
        }
        zh0 zh0Var = (zh0) obj2;
        return Color.m1978equalsimpl0(this.f35586a, zh0Var.f35586a) && Color.m1978equalsimpl0(this.f35587b, zh0Var.f35587b) && Color.m1978equalsimpl0(this.f35588c, zh0Var.f35588c) && Color.m1978equalsimpl0(this.d, zh0Var.d) && Color.m1978equalsimpl0(this.e, zh0Var.e);
    }

    public int hashCode() {
        return (((((((Color.m1984hashCodeimpl(this.f35586a) * 31) + Color.m1984hashCodeimpl(this.f35587b)) * 31) + Color.m1984hashCodeimpl(this.f35588c)) * 31) + Color.m1984hashCodeimpl(this.d)) * 31) + Color.m1984hashCodeimpl(this.e);
    }

    public String toString() {
        return "OrcaNfcScanner(backgroundColor=" + Color.m1985toStringimpl(this.f35586a) + ", scannerInstructionTextColor=" + Color.m1985toStringimpl(this.f35587b) + ", progressColor=" + Color.m1985toStringimpl(this.f35588c) + ", emptyProgressColor=" + Color.m1985toStringimpl(this.d) + ", closeButtonColor=" + Color.m1985toStringimpl(this.e) + ")";
    }

    private zh0(long j2, long j3, long j5, long j16, long j22) {
        this.f35586a = j2;
        this.f35587b = j3;
        this.f35588c = j5;
        this.d = j16;
        this.e = j22;
    }
}
