package com.fourthline.orca.internal;

import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public final class ki0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f30281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f30282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f30283c;

    public /* synthetic */ ki0(long j2, long j3, long j5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j5);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ki0)) {
            return false;
        }
        ki0 ki0Var = (ki0) obj2;
        return Color.m1978equalsimpl0(this.f30281a, ki0Var.f30281a) && Color.m1978equalsimpl0(this.f30282b, ki0Var.f30282b) && Color.m1978equalsimpl0(this.f30283c, ki0Var.f30283c);
    }

    public int hashCode() {
        return (((Color.m1984hashCodeimpl(this.f30281a) * 31) + Color.m1984hashCodeimpl(this.f30282b)) * 31) + Color.m1984hashCodeimpl(this.f30283c);
    }

    public String toString() {
        return "OrcaScannerConfirmation(textColor=" + Color.m1985toStringimpl(this.f30281a) + ", backgroundColor=" + Color.m1985toStringimpl(this.f30282b) + ", bulletListColor=" + Color.m1985toStringimpl(this.f30283c) + ")";
    }

    private ki0(long j2, long j3, long j5) {
        this.f30281a = j2;
        this.f30282b = j3;
        this.f30283c = j5;
    }
}
