package com.revolut.core.ui_kit.internal.views.fanchart;

import com.revolut.core.ui_kit.internal.views.fanchart.MultiTargetFanChartView;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends MultiTargetFanChartView.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f57016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f57017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f57018c;
    public final Clause d;
    public final boolean e;

    public d(float f, float f4, c pointStyle, Clause label, boolean z) {
        Intrinsics.checkNotNullParameter(pointStyle, "pointStyle");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f57016a = f;
        this.f57017b = f4;
        this.f57018c = pointStyle;
        this.d = label;
        this.e = z;
    }

    @Override // com.revolut.core.ui_kit.internal.views.fanchart.MultiTargetFanChartView.b
    public final Clause a() {
        return this.d;
    }

    @Override // com.revolut.core.ui_kit.internal.views.fanchart.MultiTargetFanChartView.b
    public final c b() {
        return this.f57018c;
    }

    @Override // com.revolut.core.ui_kit.internal.views.fanchart.MultiTargetFanChartView.b
    public final float c() {
        return this.f57016a;
    }

    @Override // com.revolut.core.ui_kit.internal.views.fanchart.MultiTargetFanChartView.b
    public final float d() {
        return this.f57017b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Float.compare(this.f57016a, dVar.f57016a) == 0 && Float.compare(this.f57017b, dVar.f57017b) == 0 && this.f57018c == dVar.f57018c && Intrinsics.f(this.d, dVar.d) && this.e == dVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + p.a.a((this.f57018c.hashCode() + m72.b.b(this.f57017b, Float.hashCode(this.f57016a) * 31, 31)) * 31, 31, this.d);
    }
}
