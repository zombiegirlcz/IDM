package com.fourthline.orca.internal;

import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public final class qh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f32431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f32432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f32433c;

    public /* synthetic */ qh0(long j2, long j3, long j5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j5);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof qh0)) {
            return false;
        }
        qh0 qh0Var = (qh0) obj2;
        return Color.m1978equalsimpl0(this.f32431a, qh0Var.f32431a) && Color.m1978equalsimpl0(this.f32432b, qh0Var.f32432b) && Color.m1978equalsimpl0(this.f32433c, qh0Var.f32433c);
    }

    public int hashCode() {
        return (((Color.m1984hashCodeimpl(this.f32431a) * 31) + Color.m1984hashCodeimpl(this.f32432b)) * 31) + Color.m1984hashCodeimpl(this.f32433c);
    }

    public String toString() {
        return "OrcaHint(textColor=" + Color.m1985toStringimpl(this.f32431a) + ", backgroundColor=" + Color.m1985toStringimpl(this.f32432b) + ", borderColor=" + Color.m1985toStringimpl(this.f32433c) + ")";
    }

    private qh0(long j2, long j3, long j5) {
        this.f32431a = j2;
        this.f32432b = j3;
        this.f32433c = j5;
    }
}
