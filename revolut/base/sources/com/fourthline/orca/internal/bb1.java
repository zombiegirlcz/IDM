package com.fourthline.orca.internal;

import androidx.compose.ui.graphics.Color;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class bb1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f27089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f27090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f27091c;

    public /* synthetic */ bb1(boolean z, long j2, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, j2, function1);
    }

    public final Function1 a() {
        return this.f27091c;
    }

    public final long b() {
        return this.f27090b;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof bb1)) {
            return false;
        }
        bb1 bb1Var = (bb1) obj2;
        return this.f27089a == bb1Var.f27089a && Color.m1978equalsimpl0(this.f27090b, bb1Var.f27090b) && Intrinsics.f(this.f27091c, bb1Var.f27091c);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f27089a) * 31) + Color.m1984hashCodeimpl(this.f27090b)) * 31) + this.f27091c.hashCode();
    }

    public String toString() {
        return "TopBarButtonState(enabled=" + this.f27089a + ", tint=" + Color.m1985toStringimpl(this.f27090b) + ", onClick=" + this.f27091c + ")";
    }

    private bb1(boolean z, long j2, Function1 onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f27089a = z;
        this.f27090b = j2;
        this.f27091c = onClick;
    }
}
