package com.fourthline.orca.internal;

import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public final class gi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f28895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f28896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f28897c;

    public /* synthetic */ gi0(long j2, long j3, long j5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j5);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof gi0)) {
            return false;
        }
        gi0 gi0Var = (gi0) obj2;
        return Color.m1978equalsimpl0(this.f28895a, gi0Var.f28895a) && Color.m1978equalsimpl0(this.f28896b, gi0Var.f28896b) && Color.m1978equalsimpl0(this.f28897c, gi0Var.f28897c);
    }

    public int hashCode() {
        return (((Color.m1984hashCodeimpl(this.f28895a) * 31) + Color.m1984hashCodeimpl(this.f28896b)) * 31) + Color.m1984hashCodeimpl(this.f28897c);
    }

    public String toString() {
        return "OrcaPopup(titleColor=" + Color.m1985toStringimpl(this.f28895a) + ", messageColor=" + Color.m1985toStringimpl(this.f28896b) + ", backgroundColor=" + Color.m1985toStringimpl(this.f28897c) + ")";
    }

    private gi0(long j2, long j3, long j5) {
        this.f28895a = j2;
        this.f28896b = j3;
        this.f28897c = j5;
    }
}
