package com.fourthline.orca.internal;

import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public final class vg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f34354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f34355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f34356c;

    public /* synthetic */ vg0(long j2, long j3, long j5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j5);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof vg0)) {
            return false;
        }
        vg0 vg0Var = (vg0) obj2;
        return Color.m1978equalsimpl0(this.f34354a, vg0Var.f34354a) && Color.m1978equalsimpl0(this.f34355b, vg0Var.f34355b) && Color.m1978equalsimpl0(this.f34356c, vg0Var.f34356c);
    }

    public int hashCode() {
        return (((Color.m1984hashCodeimpl(this.f34354a) * 31) + Color.m1984hashCodeimpl(this.f34355b)) * 31) + Color.m1984hashCodeimpl(this.f34356c);
    }

    public String toString() {
        return "OrcaBox(backgroundColor=" + Color.m1985toStringimpl(this.f34354a) + ", borderColor=" + Color.m1985toStringimpl(this.f34355b) + ", titleColor=" + Color.m1985toStringimpl(this.f34356c) + ")";
    }

    private vg0(long j2, long j3, long j5) {
        this.f34354a = j2;
        this.f34355b = j3;
        this.f34356c = j5;
    }
}
