package com.revolut.core.ui_kit.internal.views;

import com.revolut.core.ui_kit.internal.views.LinearGaugeChartView;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends LinearGaugeChartView.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f56942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f56943b;

    public f(int i, int i2) {
        this.f56942a = i;
        this.f56943b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f56942a == fVar.f56942a && this.f56943b == fVar.f56943b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f56943b) + (Integer.hashCode(this.f56942a) * 31);
    }
}
