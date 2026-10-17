package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class gf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ea f28867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a81 f28868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final br0 f28869c;
    private final ea d;

    public gf0(ea background, a81 instructionText, br0 progress, ea closeButton) {
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(instructionText, "instructionText");
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        this.f28867a = background;
        this.f28868b = instructionText;
        this.f28869c = progress;
        this.d = closeButton;
    }

    public final ea a() {
        return this.f28867a;
    }

    public final ea b() {
        return this.d;
    }

    public final br0 c() {
        return this.f28869c;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof gf0)) {
            return false;
        }
        gf0 gf0Var = (gf0) obj2;
        return Intrinsics.f(this.f28867a, gf0Var.f28867a) && Intrinsics.f(this.f28868b, gf0Var.f28868b) && Intrinsics.f(this.f28869c, gf0Var.f28869c) && Intrinsics.f(this.d, gf0Var.d);
    }

    public int hashCode() {
        return (((((this.f28867a.hashCode() * 31) + this.f28868b.hashCode()) * 31) + this.f28869c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "NfcScannerElement(background=" + this.f28867a + ", instructionText=" + this.f28868b + ", progress=" + this.f28869c + ", closeButton=" + this.d + ")";
    }
}
