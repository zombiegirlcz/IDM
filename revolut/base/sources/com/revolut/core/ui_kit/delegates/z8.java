package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.MapPlainDelegate;

/* JADX INFO: loaded from: classes19.dex */
public final class z8 extends MapPlainDelegate.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f55681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f55682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f55683c;
    public final double d;

    public z8(double d, double d5, double d6, double d10) {
        this.f55681a = d;
        this.f55682b = d5;
        this.f55683c = d6;
        this.d = d10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z8)) {
            return false;
        }
        z8 z8Var = (z8) obj2;
        return Double.compare(this.f55681a, z8Var.f55681a) == 0 && Double.compare(this.f55682b, z8Var.f55682b) == 0 && Double.compare(this.f55683c, z8Var.f55683c) == 0 && Double.compare(this.d, z8Var.d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.d) + m72.b.c(m72.b.c(Double.hashCode(this.f55681a) * 31, this.f55682b, 31), this.f55683c, 31);
    }
}
