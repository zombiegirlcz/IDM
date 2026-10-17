package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.MapPlainLoadingDelegate;

/* JADX INFO: loaded from: classes19.dex */
public final class g9 extends MapPlainLoadingDelegate.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f54207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f54208b;

    public g9(float f, float f4) {
        this.f54207a = f;
        this.f54208b = f4;
    }

    @Override // com.revolut.core.ui_kit.delegates.MapPlainLoadingDelegate.b
    public final float a() {
        return this.f54207a;
    }

    @Override // com.revolut.core.ui_kit.delegates.MapPlainLoadingDelegate.b
    public final float b() {
        return this.f54208b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g9)) {
            return false;
        }
        g9 g9Var = (g9) obj2;
        return Float.compare(this.f54207a, g9Var.f54207a) == 0 && Float.compare(this.f54208b, g9Var.f54208b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f54208b) + (Float.hashCode(this.f54207a) * 31);
    }
}
