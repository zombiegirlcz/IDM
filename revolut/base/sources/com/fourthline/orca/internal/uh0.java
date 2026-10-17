package com.fourthline.orca.internal;

import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public final class uh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f34092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f34093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f34094c;
    private final float d;
    private final float e;
    private final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f34095g;

    public /* synthetic */ uh0(float f, float f4, float f5, float f6, float f32, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f4, f5, f6, f32);
    }

    public final float a() {
        return this.e;
    }

    public final float b() {
        return this.f34093b;
    }

    public final float c() {
        return this.f34094c;
    }

    public final float d() {
        return this.f34095g;
    }

    public final float e() {
        return this.f;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof uh0)) {
            return false;
        }
        uh0 uh0Var = (uh0) obj2;
        return Dp.m3299equalsimpl0(this.f34092a, uh0Var.f34092a) && Dp.m3299equalsimpl0(this.f34093b, uh0Var.f34093b) && Dp.m3299equalsimpl0(this.f34094c, uh0Var.f34094c) && Dp.m3299equalsimpl0(this.d, uh0Var.d) && Dp.m3299equalsimpl0(this.e, uh0Var.e);
    }

    public final float f() {
        return this.f34092a;
    }

    public int hashCode() {
        return (((((((Dp.m3300hashCodeimpl(this.f34092a) * 31) + Dp.m3300hashCodeimpl(this.f34093b)) * 31) + Dp.m3300hashCodeimpl(this.f34094c)) * 31) + Dp.m3300hashCodeimpl(this.d)) * 31) + Dp.m3300hashCodeimpl(this.e);
    }

    public String toString() {
        return "OrcaLayouts(viewMargins=" + Dp.m3301toStringimpl(this.f34092a) + ", cornerRadius=" + Dp.m3301toStringimpl(this.f34093b) + ", popupCornerRadius=" + Dp.m3301toStringimpl(this.f34094c) + ", primaryButtonCornerRadius=" + Dp.m3301toStringimpl(this.d) + ", borderWidth=" + Dp.m3301toStringimpl(this.e) + ")";
    }

    private uh0(float f, float f4, float f5, float f6, float f32) {
        this.f34092a = f;
        this.f34093b = f4;
        this.f34094c = f5;
        this.d = f6;
        this.e = f32;
        this.f = Dp.m3297constructorimpl(48);
        this.f34095g = Dp.m3297constructorimpl(32);
    }
}
