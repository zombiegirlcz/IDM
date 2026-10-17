package com.fourthline.orca.internal;

import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public final class ug0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f34086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f34087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f34088c;
    private final long d;
    private final long e;

    public /* synthetic */ ug0(long j2, long j3, long j5, long j16, long j22, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j5, j16, j22);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ug0)) {
            return false;
        }
        ug0 ug0Var = (ug0) obj2;
        return Color.m1978equalsimpl0(this.f34086a, ug0Var.f34086a) && Color.m1978equalsimpl0(this.f34087b, ug0Var.f34087b) && Color.m1978equalsimpl0(this.f34088c, ug0Var.f34088c) && Color.m1978equalsimpl0(this.d, ug0Var.d) && Color.m1978equalsimpl0(this.e, ug0Var.e);
    }

    public int hashCode() {
        return (((((((Color.m1984hashCodeimpl(this.f34086a) * 31) + Color.m1984hashCodeimpl(this.f34087b)) * 31) + Color.m1984hashCodeimpl(this.f34088c)) * 31) + Color.m1984hashCodeimpl(this.d)) * 31) + Color.m1984hashCodeimpl(this.e);
    }

    public String toString() {
        return "OrcaAnimationColors(primary=" + Color.m1985toStringimpl(this.f34086a) + ", success=" + Color.m1985toStringimpl(this.f34087b) + ", danger=" + Color.m1985toStringimpl(this.f34088c) + ", warning=" + Color.m1985toStringimpl(this.d) + ", caution=" + Color.m1985toStringimpl(this.e) + ")";
    }

    private ug0(long j2, long j3, long j5, long j16, long j22) {
        this.f34086a = j2;
        this.f34087b = j3;
        this.f34088c = j5;
        this.d = j16;
        this.e = j22;
    }
}
