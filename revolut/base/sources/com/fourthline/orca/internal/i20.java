package com.fourthline.orca.internal;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public final class i20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f29481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f29482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f29483c;

    public /* synthetic */ i20(boolean z, long j2, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, j2, f);
    }

    public final long a() {
        return this.f29482b;
    }

    public final boolean b() {
        return this.f29481a;
    }

    public final float c() {
        return this.f29483c;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i20)) {
            return false;
        }
        i20 i20Var = (i20) obj2;
        return this.f29481a == i20Var.f29481a && Color.m1978equalsimpl0(this.f29482b, i20Var.f29482b) && Dp.m3299equalsimpl0(this.f29483c, i20Var.f29483c);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f29481a) * 31) + Color.m1984hashCodeimpl(this.f29482b)) * 31) + Dp.m3300hashCodeimpl(this.f29483c);
    }

    public String toString() {
        return "IndicatorSettings(showIndicator=" + this.f29481a + ", color=" + Color.m1985toStringimpl(this.f29482b) + ", width=" + Dp.m3301toStringimpl(this.f29483c) + ")";
    }

    private i20(boolean z, long j2, float f) {
        this.f29481a = z;
        this.f29482b = j2;
        this.f29483c = f;
    }

    public /* synthetic */ i20(boolean z, long j2, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? Color.INSTANCE.m1987getBlack0d7_KjU() : j2, (i & 4) != 0 ? Dp.m3297constructorimpl(4) : f, null);
    }
}
