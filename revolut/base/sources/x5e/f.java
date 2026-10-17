package x5e;

import a5e.l;
import cli.g;
import cli.y;
import kotlin.jvm.internal.Intrinsics;
import kxk.o;
import oki.h;
import v4e.f0;
import v4e.m;
import v4e.p;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends h implements dli.b {
    public final a5e.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f302945p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f302946q;

    public f(o stateMapper, a5e.b underlyingAssetsWidgetControllerModelExtension, m assetsPerformanceChartWidgetControllerModel) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(underlyingAssetsWidgetControllerModelExtension, "underlyingAssetsWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(assetsPerformanceChartWidgetControllerModel, "assetsPerformanceChartWidgetControllerModel");
        this.o = underlyingAssetsWidgetControllerModelExtension;
        this.f302945p = assetsPerformanceChartWidgetControllerModel;
        this.f302946q = mra.d.b(this, new c((a5e.f) ((j2) ((l) underlyingAssetsWidgetControllerModelExtension).o.f22677a).getValue(), (p) ((j2) ((f0) assetsPerformanceChartWidgetControllerModel).f286048r.f22677a).getValue()), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, (j2) ((l) this.o).o.f22677a, null, new e(this, null, 0), 3);
        yji.l.b1(this, (j2) ((f0) this.f302945p).f286048r.f22677a, null, new e(this, null, 1), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f302946q;
    }
}
