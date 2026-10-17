package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class f51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r10 f28342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r10 f28343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r10 f28344c;

    public f51(r10 mask, r10 overlay, r10 successOverlay) {
        Intrinsics.checkNotNullParameter(mask, "mask");
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        Intrinsics.checkNotNullParameter(successOverlay, "successOverlay");
        this.f28342a = mask;
        this.f28343b = overlay;
        this.f28344c = successOverlay;
    }

    public final r10 a() {
        return this.f28342a;
    }

    public final r10 b() {
        return this.f28343b;
    }

    public final r10 c() {
        return this.f28344c;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f51)) {
            return false;
        }
        f51 f51Var = (f51) obj2;
        return this.f28342a == f51Var.f28342a && this.f28343b == f51Var.f28343b && this.f28344c == f51Var.f28344c;
    }

    public int hashCode() {
        return (((this.f28342a.hashCode() * 31) + this.f28343b.hashCode()) * 31) + this.f28344c.hashCode();
    }

    public String toString() {
        return "StepMaskKeys(mask=" + this.f28342a + ", overlay=" + this.f28343b + ", successOverlay=" + this.f28344c + ")";
    }
}
