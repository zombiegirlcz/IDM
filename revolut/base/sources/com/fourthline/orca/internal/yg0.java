package com.fourthline.orca.internal;

import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public final class yg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f35296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f35297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f35298c;
    private final long d;
    private final long e;

    public /* synthetic */ yg0(long j2, long j3, long j5, long j16, long j22, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j5, j16, j22);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof yg0)) {
            return false;
        }
        yg0 yg0Var = (yg0) obj2;
        return Color.m1978equalsimpl0(this.f35296a, yg0Var.f35296a) && Color.m1978equalsimpl0(this.f35297b, yg0Var.f35297b) && Color.m1978equalsimpl0(this.f35298c, yg0Var.f35298c) && Color.m1978equalsimpl0(this.d, yg0Var.d) && Color.m1978equalsimpl0(this.e, yg0Var.e);
    }

    public int hashCode() {
        return (((((((Color.m1984hashCodeimpl(this.f35296a) * 31) + Color.m1984hashCodeimpl(this.f35297b)) * 31) + Color.m1984hashCodeimpl(this.f35298c)) * 31) + Color.m1984hashCodeimpl(this.d)) * 31) + Color.m1984hashCodeimpl(this.e);
    }

    public String toString() {
        return "OrcaCell(backgroundColor=" + Color.m1985toStringimpl(this.f35296a) + ", textColor=" + Color.m1985toStringimpl(this.f35297b) + ", iconColor=" + Color.m1985toStringimpl(this.f35298c) + ", borderColor=" + Color.m1985toStringimpl(this.d) + ", dividerColor=" + Color.m1985toStringimpl(this.e) + ")";
    }

    private yg0(long j2, long j3, long j5, long j16, long j22) {
        this.f35296a = j2;
        this.f35297b = j3;
        this.f35298c = j5;
        this.d = j16;
        this.e = j22;
    }
}
