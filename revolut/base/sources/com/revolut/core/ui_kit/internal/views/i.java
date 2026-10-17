package com.revolut.core.ui_kit.internal.views;

import com.revolut.core.ui_kit.internal.views.ScratchView;

/* JADX INFO: loaded from: classes19.dex */
public final class i extends ScratchView.a.AbstractC0434a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f57208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f57209b;

    public i(float f, float f4) {
        this.f57208a = f;
        this.f57209b = f4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Float.compare(this.f57208a, iVar.f57208a) == 0 && Float.compare(this.f57209b, iVar.f57209b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f57209b) + (Float.hashCode(this.f57208a) * 31);
    }
}
