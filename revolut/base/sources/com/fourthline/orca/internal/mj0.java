package com.fourthline.orca.internal;

import androidx.compose.ui.graphics.Color;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class mj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f31200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f31201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f31202c;
    private final vz0 d;
    private final Color e;
    private final Color f;

    public /* synthetic */ mj0(boolean z, boolean z3, float f, vz0 vz0Var, Color color, Color color2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z3, f, vz0Var, color, color2);
    }

    public final Color a() {
        return this.e;
    }

    public final Color b() {
        return this.f;
    }

    public final float c() {
        return this.f31202c;
    }

    public final vz0 d() {
        return this.d;
    }

    public final boolean e() {
        return this.f31201b;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof mj0)) {
            return false;
        }
        mj0 mj0Var = (mj0) obj2;
        return this.f31200a == mj0Var.f31200a && this.f31201b == mj0Var.f31201b && Float.compare(this.f31202c, mj0Var.f31202c) == 0 && Intrinsics.f(this.d, mj0Var.d) && Intrinsics.f(this.e, mj0Var.e) && Intrinsics.f(this.f, mj0Var.f);
    }

    public final boolean f() {
        return this.f31200a;
    }

    public int hashCode() {
        int iHashCode = ((((((Boolean.hashCode(this.f31200a) * 31) + Boolean.hashCode(this.f31201b)) * 31) + Float.hashCode(this.f31202c)) * 31) + this.d.hashCode()) * 31;
        Color color = this.e;
        int iM1984hashCodeimpl = (iHashCode + (color == null ? 0 : Color.m1984hashCodeimpl(color.getValue()))) * 31;
        Color color2 = this.f;
        return iM1984hashCodeimpl + (color2 != null ? Color.m1984hashCodeimpl(color2.getValue()) : 0);
    }

    public String toString() {
        return "OverlaySettings(showGradientAtTop=" + this.f31200a + ", showGradientAtBottom=" + this.f31201b + ", overlayPercentage=" + this.f31202c + ", paddings=" + this.d + ", gradientFillColor=" + this.e + ", gradientTransparentColor=" + this.f + ")";
    }

    private mj0(boolean z, boolean z3, float f, vz0 paddings, Color color, Color color2) {
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.f31200a = z;
        this.f31201b = z3;
        this.f31202c = f;
        this.d = paddings;
        this.e = color;
        this.f = color2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ mj0(boolean z, boolean z3, float f, vz0 vz0Var, Color color, Color color2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z4 = (i & 1) != 0 ? false : z;
        boolean z6 = (i & 2) != 0 ? true : z3;
        float f4 = (i & 4) != 0 ? 0.3f : f;
        vz0 vz0Var2 = (i & 8) != 0 ? new vz0(BitmapDescriptorFactory.HUE_RED, 1, null) : vz0Var;
        Color color3 = (i & 16) != 0 ? null : color;
        this(z4, z6, f4, vz0Var2, color3, (i & 32) == 0 ? color2 : null, null);
    }
}
