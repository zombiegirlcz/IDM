package com.revolut.core.ui_kit.internal.views;

import com.revolut.core.ui_kit.internal.views.ScratchView;

/* JADX INFO: loaded from: classes19.dex */
public final class j extends ScratchView.a.AbstractC0434a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f57217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f57218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f57219c;
    public final float d;

    public j(float f, float f4, float f5, float f6) {
        this.f57217a = f;
        this.f57218b = f4;
        this.f57219c = f5;
        this.d = f6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Float.compare(this.f57217a, jVar.f57217a) == 0 && Float.compare(this.f57218b, jVar.f57218b) == 0 && Float.compare(this.f57219c, jVar.f57219c) == 0 && Float.compare(this.d, jVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + m72.b.b(this.f57219c, m72.b.b(this.f57218b, Float.hashCode(this.f57217a) * 31, 31), 31);
    }
}
