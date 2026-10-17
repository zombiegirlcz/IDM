package com.revolut.core.ui_kit.models;

import aw0.j1;
import aw0.n4;
import aw0.o4;
import aw0.p4;
import aw0.s4;
import aw0.t4;
import com.revolut.core.ui_kit.internal.views.gaugechart.SegmentedGaugeChartView;
import com.revolut.core.ui_kit.models.h;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f58074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f58075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f58076c;
    public final j1 d;
    public final s4 e;
    public final n4 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o4 f58077g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t4 f58078h;

    public f(List segments, long j2, String str, j1 j1Var, s4 thresholdStrategy, n4 sortMode, o4 gaugeChartStyle) {
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(thresholdStrategy, "thresholdStrategy");
        Intrinsics.checkNotNullParameter(sortMode, "sortMode");
        Intrinsics.checkNotNullParameter(gaugeChartStyle, "gaugeChartStyle");
        this.f58074a = segments;
        this.f58075b = j2;
        this.f58076c = str;
        this.d = j1Var;
        this.e = thresholdStrategy;
        this.f = sortMode;
        this.f58077g = gaugeChartStyle;
        this.f58078h = t4.SEGMENTED;
    }

    @Override // com.revolut.core.ui_kit.models.h
    public final boolean a() {
        return false;
    }

    @Override // com.revolut.core.ui_kit.models.h
    public final o4 b() {
        return this.f58077g;
    }

    @Override // com.revolut.core.ui_kit.models.h
    public final t4 c() {
        return this.f58078h;
    }

    @Override // com.revolut.core.ui_kit.models.h
    public final boolean d() {
        return false;
    }

    @Override // com.revolut.core.ui_kit.models.h
    public final List e() {
        return this.f58074a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f58074a, fVar.f58074a) && this.f58075b == fVar.f58075b && Intrinsics.f(this.f58076c, fVar.f58076c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && this.f == fVar.f && this.f58077g == fVar.f58077g;
    }

    @Override // com.revolut.core.ui_kit.models.h
    public final long f() {
        return this.f58075b;
    }

    @Override // com.revolut.core.ui_kit.models.h
    public final String g() {
        return this.f58076c;
    }

    @Override // com.revolut.core.ui_kit.models.h
    public final n4 h() {
        return this.f;
    }

    public final int hashCode() {
        int iC = a0.d.c(this.f58074a.hashCode() * 31, 31, this.f58075b);
        String str = this.f58076c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        j1 j1Var = this.d;
        return Boolean.hashCode(false) + j6.a.c((this.f58077g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((iHashCode + (j1Var == null ? 0 : j1Var.hashCode())) * 31)) * 31)) * 31)) * 31, 31, false);
    }

    @Override // com.revolut.core.ui_kit.models.h
    public final s4 i() {
        return this.e;
    }

    public f(zhm.f0 f0Var) {
        p4 p4Var = new p4(0);
        SegmentedGaugeChartView.INSTANCE.getClass();
        this(f0Var, 0L, null, null, p4Var, SegmentedGaugeChartView.p0, o4.FULL_CIRCLE);
    }
}
