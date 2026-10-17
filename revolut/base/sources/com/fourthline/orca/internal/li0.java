package com.fourthline.orca.internal;

import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class li0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f30632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f30633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f30634c;
    private final long d;
    private final long e;
    private final zg0 f;

    public /* synthetic */ li0(long j2, long j3, long j5, long j16, long j22, zg0 zg0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j5, j16, j22, zg0Var);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof li0)) {
            return false;
        }
        li0 li0Var = (li0) obj2;
        return Color.m1978equalsimpl0(this.f30632a, li0Var.f30632a) && Color.m1978equalsimpl0(this.f30633b, li0Var.f30633b) && Color.m1978equalsimpl0(this.f30634c, li0Var.f30634c) && Color.m1978equalsimpl0(this.d, li0Var.d) && Color.m1978equalsimpl0(this.e, li0Var.e) && Intrinsics.f(this.f, li0Var.f);
    }

    public int hashCode() {
        return (((((((((Color.m1984hashCodeimpl(this.f30632a) * 31) + Color.m1984hashCodeimpl(this.f30633b)) * 31) + Color.m1984hashCodeimpl(this.f30634c)) * 31) + Color.m1984hashCodeimpl(this.d)) * 31) + Color.m1984hashCodeimpl(this.e)) * 31) + this.f.hashCode();
    }

    public String toString() {
        return "OrcaScreen(backgroundColor=" + Color.m1985toStringimpl(this.f30632a) + ", headerColor=" + Color.m1985toStringimpl(this.f30633b) + ", titleColor=" + Color.m1985toStringimpl(this.f30634c) + ", messageColor=" + Color.m1985toStringimpl(this.d) + ", dividerColor=" + Color.m1985toStringimpl(this.e) + ", tableCells=" + this.f + ")";
    }

    private li0(long j2, long j3, long j5, long j16, long j22, zg0 tableCells) {
        Intrinsics.checkNotNullParameter(tableCells, "tableCells");
        this.f30632a = j2;
        this.f30633b = j3;
        this.f30634c = j5;
        this.d = j16;
        this.e = j22;
        this.f = tableCells;
    }
}
