package com.fourthline.orca.internal;

import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ji0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f29923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f29924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ki0 f29925c;

    public /* synthetic */ ji0(long j2, long j3, ki0 ki0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, ki0Var);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ji0)) {
            return false;
        }
        ji0 ji0Var = (ji0) obj2;
        return Color.m1978equalsimpl0(this.f29923a, ji0Var.f29923a) && Color.m1978equalsimpl0(this.f29924b, ji0Var.f29924b) && Intrinsics.f(this.f29925c, ji0Var.f29925c);
    }

    public int hashCode() {
        return (((Color.m1984hashCodeimpl(this.f29923a) * 31) + Color.m1984hashCodeimpl(this.f29924b)) * 31) + this.f29925c.hashCode();
    }

    public String toString() {
        return "OrcaScanner(spinnerColor=" + Color.m1985toStringimpl(this.f29923a) + ", progressColor=" + Color.m1985toStringimpl(this.f29924b) + ", confirmation=" + this.f29925c + ")";
    }

    private ji0(long j2, long j3, ki0 confirmation) {
        Intrinsics.checkNotNullParameter(confirmation, "confirmation");
        this.f29923a = j2;
        this.f29924b = j3;
        this.f29925c = confirmation;
    }
}
