package qeg;

import cli.y;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.picker.TravelHotelsFilterOptionsPickerScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import qa9.r;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends oki.h implements h {
    public final TravelHotelsFilterOptionsPickerScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i9g.c f245156p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final meg.h f245157q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f245158r;

    public j(k stateMapper, TravelHotelsFilterOptionsPickerScreenContract$InputData inputData, i9g.c filtersInteractor, meg.h reducer) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(filtersInteractor, "filtersInteractor");
        Intrinsics.checkNotNullParameter(reducer, "reducer");
        this.o = inputData;
        this.f245156p = filtersInteractor;
        this.f245157q = reducer;
        this.f245158r = mra.d.b(this, new e(0), stateMapper, null, true, 4);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, rd0.e.n(rd0.e.b(nim.a.w(this.f245156p.a(), new r(this, 27))), h0.f322473a), null, null, new qc3.c(this, null, 10), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f245158r;
    }
}
