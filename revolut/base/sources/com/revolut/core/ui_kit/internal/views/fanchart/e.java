package com.revolut.core.ui_kit.internal.views.fanchart;

import com.revolut.core.ui_kit.internal.views.fanchart.MultiTargetFanChartView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends MultiTargetFanChartView.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f57019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f57020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f57021c;
    public final MoneyClause d;

    public e(float f, float f4, c pointStyle, MoneyClause label) {
        Intrinsics.checkNotNullParameter(pointStyle, "pointStyle");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f57019a = f;
        this.f57020b = f4;
        this.f57021c = pointStyle;
        this.d = label;
    }

    @Override // com.revolut.core.ui_kit.internal.views.fanchart.MultiTargetFanChartView.b
    public final Clause a() {
        return this.d;
    }

    @Override // com.revolut.core.ui_kit.internal.views.fanchart.MultiTargetFanChartView.b
    public final c b() {
        return this.f57021c;
    }

    @Override // com.revolut.core.ui_kit.internal.views.fanchart.MultiTargetFanChartView.b
    public final float c() {
        return this.f57019a;
    }

    @Override // com.revolut.core.ui_kit.internal.views.fanchart.MultiTargetFanChartView.b
    public final float d() {
        return this.f57020b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Float.compare(this.f57019a, eVar.f57019a) == 0 && Float.compare(this.f57020b, eVar.f57020b) == 0 && this.f57021c == eVar.f57021c && this.d.equals(eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f57021c.hashCode() + m72.b.b(this.f57020b, Float.hashCode(this.f57019a) * 31, 31)) * 31);
    }
}
