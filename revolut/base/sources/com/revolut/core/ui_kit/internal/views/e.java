package com.revolut.core.ui_kit.internal.views;

import com.revolut.core.ui_kit.internal.views.LinearGaugeChartView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f56922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f56923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f56924c;
    public final boolean d;
    public final LinearGaugeChartView.b e;

    public e(List segments, float f, float f4, boolean z, LinearGaugeChartView.b selectionMode) {
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(selectionMode, "selectionMode");
        this.f56922a = segments;
        this.f56923b = f;
        this.f56924c = f4;
        this.d = z;
        this.e = selectionMode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f56922a, eVar.f56922a) && Float.compare(this.f56923b, eVar.f56923b) == 0 && Float.compare(this.f56924c, eVar.f56924c) == 0 && this.d == eVar.d && Intrinsics.f(this.e, eVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.c(m72.b.b(this.f56924c, m72.b.b(this.f56923b, this.f56922a.hashCode() * 31, 31), 31), 31, this.d);
    }

    public /* synthetic */ e(List list, boolean z, int i) {
        this(list, (i & 2) != 0 ? 8.0f : 24.0f, (i & 4) != 0 ? 2.0f : 6.0f, (i & 8) != 0 ? false : z, LinearGaugeChartView.b.a.f56250a);
    }
}
