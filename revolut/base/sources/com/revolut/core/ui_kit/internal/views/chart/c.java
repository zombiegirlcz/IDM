package com.revolut.core.ui_kit.internal.views.chart;

import android.graphics.RectF;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f56761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f56762b;

    public c(Clause label, RectF bounds) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        this.f56761a = label;
        this.f56762b = bounds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f56761a, cVar.f56761a) && Intrinsics.f(this.f56762b, cVar.f56762b);
    }

    public final int hashCode() {
        return this.f56762b.hashCode() + (this.f56761a.hashCode() * 31);
    }
}
