package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class x implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aw0.y1 f55546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.l2 f55547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.f2 f55548c;
    public final aw0.e2 d;
    public final aw0.m2 e;

    public x(aw0.y1 data, aw0.l2 performanceStyle, aw0.f2 comparisonStyle, aw0.e2 colorMode) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(performanceStyle, "performanceStyle");
        Intrinsics.checkNotNullParameter(comparisonStyle, "comparisonStyle");
        Intrinsics.checkNotNullParameter(colorMode, "colorMode");
        this.f55546a = data;
        this.f55547b = performanceStyle;
        this.f55548c = comparisonStyle;
        this.d = colorMode;
        int i = R$attr.uikit_colorForeground;
        this.e = new aw0.m2(performanceStyle, new Color.Solid(i), new Color.Solid(i), new Color.ModifiedColor(new Color.Solid(i), 0.5f), comparisonStyle, colorMode, false, false);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f55546a, xVar.f55546a) && this.f55547b == xVar.f55547b && this.f55548c == xVar.f55548c && this.d == xVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f55548c.hashCode() + ((this.f55547b.hashCode() + (this.f55546a.hashCode() * 31)) * 31)) * 31);
    }

    public /* synthetic */ x(aw0.y1 y1Var, aw0.l2 l2Var, aw0.f2 f2Var) {
        this(y1Var, l2Var, f2Var, aw0.e2.MONOCHROMATIC);
    }
}
