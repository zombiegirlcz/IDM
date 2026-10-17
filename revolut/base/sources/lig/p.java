package lig;

import cli.y;
import com.revolut.feature.travel.miles.impl.ui.screen.search.location_picker.TravelMilesFlightLocationPickerScreenContract$InputData;
import java.lang.reflect.Type;
import kkf.x5;
import klf.w1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lfg.g0;
import skm.a2;
import vfg.r;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class p extends oki.h implements l {
    public final TravelMilesFlightLocationPickerScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r f195521p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vfg.k f195522q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vfg.p f195523r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a2 f195524s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f195525t;

    public p(bof.r stateMapper, TravelMilesFlightLocationPickerScreenContract$InputData inputData, r travelMilesSearchInteractor, vfg.k airportsPagingInteractor, vfg.p recentSearchInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(travelMilesSearchInteractor, "travelMilesSearchInteractor");
        Intrinsics.checkNotNullParameter(airportsPagingInteractor, "airportsPagingInteractor");
        Intrinsics.checkNotNullParameter(recentSearchInteractor, "recentSearchInteractor");
        this.o = inputData;
        this.f195521p = travelMilesSearchInteractor;
        this.f195522q = airportsPagingInteractor;
        this.f195523r = recentSearchInteractor;
        this.f195525t = mra.d.b(this, new g(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        r rVar = this.f195521p;
        rVar.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        g0 g0Var = rVar.f288635a;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Continuation continuation = null;
        yji.l.a1(this, rd0.e.b(g0Var.f194888g.e(Unit.f186387a, loadingStrategy)), null, null, new o(this, continuation, 0), 3);
        efm.r rVarHide = this.f195522q.f288626c.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        yji.l.a1(this, rd0.e.b(rVarHide), null, null, new o(this, continuation, 1), 3);
        ue0.c cVar = ((lfg.l) this.f195523r.f288633b).f194906a;
        Type TYPE = lfg.l.f194905c;
        Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
        yji.l.a1(this, rd0.e.e(new vkm.y(new w1(2, 7, continuation), new x5(cVar.C0("RECENT_LOCATION_SEARCHES_KEY", TYPE), 28)), h0.f322473a, new im2.b(3, 11, continuation)), null, null, new o(this, continuation, 2), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f195525t;
    }
}
