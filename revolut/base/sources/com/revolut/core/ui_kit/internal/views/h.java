package com.revolut.core.ui_kit.internal.views;

import com.revolut.core.ui_kit.internal.views.ScratchView;

/* JADX INFO: loaded from: classes19.dex */
public final class h extends ScratchView.a.AbstractC0434a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f57206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f57207b;

    public h(float f, float f4) {
        this.f57206a = f;
        this.f57207b = f4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Float.compare(this.f57206a, hVar.f57206a) == 0 && Float.compare(this.f57207b, hVar.f57207b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f57207b) + (Float.hashCode(this.f57206a) * 31);
    }
}
