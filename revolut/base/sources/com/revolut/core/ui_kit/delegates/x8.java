package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.MapDelegate;

/* JADX INFO: loaded from: classes19.dex */
public final class x8 extends MapDelegate.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f55597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f55598b;

    public x8(double d, double d5) {
        this.f55597a = d;
        this.f55598b = d5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x8)) {
            return false;
        }
        x8 x8Var = (x8) obj2;
        return Double.compare(this.f55597a, x8Var.f55597a) == 0 && Double.compare(this.f55598b, x8Var.f55598b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f55598b) + (Double.hashCode(this.f55597a) * 31);
    }
}
