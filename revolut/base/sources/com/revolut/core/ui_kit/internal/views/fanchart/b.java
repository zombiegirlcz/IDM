package com.revolut.core.ui_kit.internal.views.fanchart;

import com.revolut.core.ui_kit.internal.views.fanchart.MultiTargetFanChartView;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends MultiTargetFanChartView.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f57013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f57014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f57015c;
    public final Clause d;

    public b(float f, float f4, c pointStyle, Clause label) {
        Intrinsics.checkNotNullParameter(pointStyle, "pointStyle");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f57013a = f;
        this.f57014b = f4;
        this.f57015c = pointStyle;
        this.d = label;
    }

    @Override // com.revolut.core.ui_kit.internal.views.fanchart.MultiTargetFanChartView.b
    public final Clause a() {
        return this.d;
    }

    @Override // com.revolut.core.ui_kit.internal.views.fanchart.MultiTargetFanChartView.b
    public final c b() {
        return this.f57015c;
    }

    @Override // com.revolut.core.ui_kit.internal.views.fanchart.MultiTargetFanChartView.b
    public final float c() {
        return this.f57013a;
    }

    @Override // com.revolut.core.ui_kit.internal.views.fanchart.MultiTargetFanChartView.b
    public final float d() {
        return this.f57014b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Float.compare(this.f57013a, bVar.f57013a) == 0 && Float.compare(this.f57014b, bVar.f57014b) == 0 && this.f57015c == bVar.f57015c && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f57015c.hashCode() + m72.b.b(this.f57014b, Float.hashCode(this.f57013a) * 31, 31)) * 31);
    }
}
