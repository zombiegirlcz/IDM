package com.fourthline.orca.internal;

import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public final class ph0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f31964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f31965b;

    public /* synthetic */ ph0(long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ph0)) {
            return false;
        }
        ph0 ph0Var = (ph0) obj2;
        return Color.m1978equalsimpl0(this.f31964a, ph0Var.f31964a) && Color.m1978equalsimpl0(this.f31965b, ph0Var.f31965b);
    }

    public int hashCode() {
        return (Color.m1984hashCodeimpl(this.f31964a) * 31) + Color.m1984hashCodeimpl(this.f31965b);
    }

    public String toString() {
        return "OrcaGraphic(backgroundColor=" + Color.m1985toStringimpl(this.f31964a) + ", primaryColor=" + Color.m1985toStringimpl(this.f31965b) + ")";
    }

    private ph0(long j2, long j3) {
        this.f31964a = j2;
        this.f31965b = j3;
    }
}
