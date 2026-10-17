package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.MapPlainLoadingDelegate;

/* JADX INFO: loaded from: classes19.dex */
public final class f9 extends MapPlainLoadingDelegate.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f54148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f54149b;

    public f9(float f, float f4) {
        this.f54148a = f;
        this.f54149b = f4;
    }

    @Override // com.revolut.core.ui_kit.delegates.MapPlainLoadingDelegate.b
    public final float a() {
        return this.f54148a;
    }

    @Override // com.revolut.core.ui_kit.delegates.MapPlainLoadingDelegate.b
    public final float b() {
        return this.f54149b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f9)) {
            return false;
        }
        f9 f9Var = (f9) obj2;
        return Float.compare(this.f54148a, f9Var.f54148a) == 0 && Float.compare(this.f54149b, f9Var.f54149b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f54149b) + (Float.hashCode(this.f54148a) * 31);
    }
}
