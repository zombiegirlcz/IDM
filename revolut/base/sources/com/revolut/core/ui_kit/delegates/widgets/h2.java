package com.revolut.core.ui_kit.delegates.widgets;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f55368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g2 f55369b;

    public h2(long j2, g2 barColor) {
        Intrinsics.checkNotNullParameter(barColor, "barColor");
        this.f55368a = j2;
        this.f55369b = barColor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj2;
        return this.f55368a == h2Var.f55368a && this.f55369b == h2Var.f55369b;
    }

    public final int hashCode() {
        return this.f55369b.hashCode() + (Long.hashCode(this.f55368a) * 31);
    }
}
