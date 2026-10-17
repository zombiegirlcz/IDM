package com.revolut.core.ui_kit.models;

import aw0.h4;
import aw0.n4;
import aw0.o4;
import aw0.r4;
import aw0.s4;
import aw0.t4;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g extends h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f58080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f58081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f58082c;
    public final PercentageClause.Format d;
    public final h4 e;
    public final n4 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o4 f58083g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t4 f58084h;

    public g(ArrayList segments, long j2, String str, PercentageClause.Format legendPercentageFormat, h4 legendLabelPlacement, n4 sortMode, o4 gaugeChartStyle) {
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(legendPercentageFormat, "legendPercentageFormat");
        Intrinsics.checkNotNullParameter(legendLabelPlacement, "legendLabelPlacement");
        Intrinsics.checkNotNullParameter(sortMode, "sortMode");
        Intrinsics.checkNotNullParameter(gaugeChartStyle, "gaugeChartStyle");
        this.f58080a = segments;
        this.f58081b = j2;
        this.f58082c = str;
        this.d = legendPercentageFormat;
        this.e = legendLabelPlacement;
        this.f = sortMode;
        this.f58083g = gaugeChartStyle;
        this.f58084h = t4.SEGMENTED;
    }

    @Override // com.revolut.core.ui_kit.models.h
    public final boolean a() {
        return false;
    }

    @Override // com.revolut.core.ui_kit.models.h
    public final o4 b() {
        return this.f58083g;
    }

    @Override // com.revolut.core.ui_kit.models.h
    public final t4 c() {
        return this.f58084h;
    }

    @Override // com.revolut.core.ui_kit.models.h
    public final boolean d() {
        return true;
    }

    @Override // com.revolut.core.ui_kit.models.h
    public final List e() {
        return this.f58080a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f58080a.equals(gVar.f58080a) && this.f58081b == gVar.f58081b && Intrinsics.f(this.f58082c, gVar.f58082c) && Intrinsics.f(this.d, gVar.d) && this.e == gVar.e && this.f == gVar.f && this.f58083g == gVar.f58083g;
    }

    @Override // com.revolut.core.ui_kit.models.h
    public final long f() {
        return this.f58081b;
    }

    @Override // com.revolut.core.ui_kit.models.h
    public final String g() {
        return this.f58082c;
    }

    @Override // com.revolut.core.ui_kit.models.h
    public final n4 h() {
        return this.f;
    }

    public final int hashCode() {
        int iC = a0.d.c(this.f58080a.hashCode() * 31, 31, this.f58081b);
        String str = this.f58082c;
        return Boolean.hashCode(false) + ((this.f58083g.hashCode() + j6.a.c((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31, 31, true)) * 31);
    }

    @Override // com.revolut.core.ui_kit.models.h
    public final s4 i() {
        return r4.f10512a;
    }
}
