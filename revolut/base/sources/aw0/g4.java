package aw0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g4 extends com.revolut.core.ui_kit.models.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f10321c;
    public final j1 d;
    public final List e;
    public final o4 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n4 f10322g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t4 f10323h;

    public g4(List segments, long j2, xi0.b segmentsTotalCurrency, j1 j1Var, List alwaysVisibleSegmentsIds, o4 gaugeChartStyle) {
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(segmentsTotalCurrency, "segmentsTotalCurrency");
        Intrinsics.checkNotNullParameter(alwaysVisibleSegmentsIds, "alwaysVisibleSegmentsIds");
        Intrinsics.checkNotNullParameter(gaugeChartStyle, "gaugeChartStyle");
        this.f10319a = segments;
        this.f10320b = j2;
        this.f10321c = segmentsTotalCurrency;
        this.d = j1Var;
        this.e = alwaysVisibleSegmentsIds;
        this.f = gaugeChartStyle;
        this.f10322g = n4.NO_SORT;
        this.f10323h = t4.PROGRESS;
    }

    @Override // com.revolut.core.ui_kit.models.h
    public final boolean a() {
        return false;
    }

    @Override // com.revolut.core.ui_kit.models.h
    public final o4 b() {
        return this.f;
    }

    @Override // com.revolut.core.ui_kit.models.h
    public final t4 c() {
        return this.f10323h;
    }

    @Override // com.revolut.core.ui_kit.models.h
    public final boolean d() {
        return false;
    }

    @Override // com.revolut.core.ui_kit.models.h
    public final List e() {
        return this.f10319a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g4)) {
            return false;
        }
        g4 g4Var = (g4) obj2;
        return Intrinsics.f(this.f10319a, g4Var.f10319a) && this.f10320b == g4Var.f10320b && Intrinsics.f(this.f10321c, g4Var.f10321c) && Intrinsics.f(this.d, g4Var.d) && Intrinsics.f(this.e, g4Var.e) && this.f == g4Var.f;
    }

    @Override // com.revolut.core.ui_kit.models.h
    public final long f() {
        return this.f10320b;
    }

    @Override // com.revolut.core.ui_kit.models.h
    public final String g() {
        return null;
    }

    @Override // com.revolut.core.ui_kit.models.h
    public final n4 h() {
        return this.f10322g;
    }

    public final int hashCode() {
        int iJ = h30.l.j(this.f10321c, a0.d.c(this.f10319a.hashCode() * 31, 31, this.f10320b), 31);
        j1 j1Var = this.d;
        return Boolean.hashCode(false) + ((this.f.hashCode() + p.a.d((iJ + (j1Var == null ? 0 : j1Var.hashCode())) * 31, 31, this.e)) * 31);
    }

    @Override // com.revolut.core.ui_kit.models.h
    public final s4 i() {
        return new q4(this.e);
    }
}
