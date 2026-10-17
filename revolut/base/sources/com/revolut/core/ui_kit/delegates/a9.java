package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.MapPlainDelegate;

/* JADX INFO: loaded from: classes19.dex */
public final class a9 extends MapPlainDelegate.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f53670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f53671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f53672c;

    public a9(double d, double d5, float f) {
        this.f53670a = f;
        this.f53671b = d;
        this.f53672c = d5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a9)) {
            return false;
        }
        a9 a9Var = (a9) obj2;
        return Float.compare(this.f53670a, a9Var.f53670a) == 0 && Double.compare(this.f53671b, a9Var.f53671b) == 0 && Double.compare(this.f53672c, a9Var.f53672c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f53672c) + m72.b.c(Float.hashCode(this.f53670a) * 31, this.f53671b, 31);
    }

    public /* synthetic */ a9(double d, double d5) {
        this(d, d5, 14.0f);
    }
}
