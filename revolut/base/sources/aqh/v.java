package aqh;

import b9.w2;
import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.feature.wealth_discovery.impl.screener.screens.filter_calibrator.ScreenerFilterCalibratorScreenContract$Input;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSelectedFilter;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class v extends oki.h implements h {

    @NotNull
    public static final p Companion = new p();
    public final w2 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vph.o f8458p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final fkg.a f8459q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x8h.m f8460r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f8461s;

    public v(ScreenerFilterCalibratorScreenContract$Input inputData, n stateMapper, w2 screenerFilterProvider, vph.o selectedFilterReducer, fkg.a screenerInstrumentProvider, x8h.m etpProductAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(screenerFilterProvider, "screenerFilterProvider");
        Intrinsics.checkNotNullParameter(selectedFilterReducer, "selectedFilterReducer");
        Intrinsics.checkNotNullParameter(screenerInstrumentProvider, "screenerInstrumentProvider");
        Intrinsics.checkNotNullParameter(etpProductAvailabilityInteractor, "etpProductAvailabilityInteractor");
        this.o = screenerFilterProvider;
        this.f8458p = selectedFilterReducer;
        this.f8459q = screenerInstrumentProvider;
        this.f8460r = etpProductAvailabilityInteractor;
        this.f8461s = mra.d.b(this, new i(inputData.f96241a, inputData.f96242b, inputData.f96243c, inputData.d, inputData.e, null, null, true), stateMapper, null, false, 12);
    }

    @Override // yph.h
    public final void H(yph.j parcel, Pair updatedRange) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(updatedRange, "updatedRange");
        soh.f fVar = parcel.f315903b;
        zel.g gVar = parcel.f315902a;
        BigDecimal bigDecimal = fVar.f264838c;
        int iG = gc0.c.g(fVar.f264836a, bigDecimal);
        int iG2 = gc0.c.g(fVar.f264837b, bigDecimal);
        int iIntValue = ((Number) updatedRange.f186385a).intValue();
        int iIntValue2 = ((Number) updatedRange.f186386b).intValue();
        this.f8458p.getClass();
        H2(this.f8461s, new amh.j(this, vph.o.b(gVar, bigDecimal, iG, iG2, iIntValue, iIntValue2), 24));
    }

    @Override // yji.l
    public final void I1() {
        y yVar = this.f8461s;
        zel.g metric = ((i) ((j2) yVar.f22677a).getValue()).f8436a;
        zel.f instrumentGroup = ((i) ((j2) yVar.f22677a).getValue()).f8437b;
        w2 w2Var = this.o;
        w2Var.getClass();
        Intrinsics.checkNotNullParameter(metric, "metric");
        Intrinsics.checkNotNullParameter(instrumentGroup, "instrumentGroup");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Continuation continuation = null;
        yji.l.a1(this, nim.a.v(w2Var.P(zhm.u.c(metric), instrumentGroup, loadingStrategy), new pqh.l(metric)), null, null, new ap7.k(this, continuation, 7), 3);
        yji.l.a1(this, this.f8460r.a(), null, null, new a2g.q(this, continuation, 3), 3);
        yji.l.a1(this, vkm.q.Q(t1.d(yVar.B(new aqb.s(14)), 300L), new a0e.m(continuation, this, 25)), null, null, new akb.s(this, continuation, 10), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f8461s;
    }

    @Override // yph.h
    public final void r(yph.i option) {
        Object next;
        Intrinsics.checkNotNullParameter(option, "option");
        y yVar = this.f8461s;
        Iterator it8 = ((i) ((j2) yVar.f22677a).getValue()).f8438c.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (((ScreenerSelectedFilter) next).getF105167a() == option.f315900a) {
                    break;
                }
            }
        }
        ScreenerSelectedFilter screenerSelectedFilter = (ScreenerSelectedFilter) next;
        ScreenerSelectedFilter.Options options = screenerSelectedFilter instanceof ScreenerSelectedFilter.Options ? (ScreenerSelectedFilter.Options) screenerSelectedFilter : null;
        List list = options != null ? options.f105166b : null;
        zel.g gVar = option.f315900a;
        String str = option.f315901b;
        this.f8458p.getClass();
        H2(yVar, new o(this, vph.o.a(gVar, list, str), 0));
    }
}
