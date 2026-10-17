package yeg;

import cli.y;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.sorting.TravelHotelsSortingOptionSelectorScreenContract$InputData;
import efm.r;
import i9g.e0;
import i9g.f0;
import i9g.h0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import yji.l;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends oki.h implements d {
    public final TravelHotelsSortingOptionSelectorScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h0 f312930p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f312931q;

    public g(h stateMapper, TravelHotelsSortingOptionSelectorScreenContract$InputData inputData, h0 travelSearchParamsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(travelSearchParamsInteractor, "travelSearchParamsInteractor");
        this.o = inputData;
        this.f312930p = travelSearchParamsInteractor;
        this.f312931q = mra.d.b(this, new b(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        ffi.a aVar = this.o.f94068a;
        h0 h0Var = this.f312930p;
        Continuation continuation = null;
        l.a1(this, rd0.e.b(h0Var.i(aVar)), null, null, new e(this, continuation, 0), 3);
        r map = h0Var.h().map(new f0(3, new e0(2)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        l.a1(this, rd0.e.b(map), null, null, new e(this, continuation, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f312931q;
    }
}
