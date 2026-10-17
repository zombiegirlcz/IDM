package vpk;

import com.revolut.retail.feature.ratedetails.impl.network.RatesPlotApiService;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public epk.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f291244w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f291245x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ p f291246y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(g gVar, p pVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f291245x = gVar;
        this.f291246y = pVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.f291245x, this.f291246y, continuation, 0);
            default:
                return new n(this.f291245x, this.f291246y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((n) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        epk.b range;
        c cVar;
        Object lineChartMidRates;
        epk.b range2;
        Object candlesticksChartMidRates;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.f291244w;
                g gVar = this.f291245x;
                if (i == 0) {
                    yhm.o.b(obj2);
                    range = io3.h.S(gVar.f291230b);
                    p pVar = this.f291246y;
                    RatesPlotApiService ratesPlotApiService = pVar.f291248a;
                    String strD = cp5.d.d(gVar.f291229a);
                    String strA = range.a();
                    String strD2 = io3.h.d(range);
                    e eVar = gVar.e;
                    String strName = eVar != null ? eVar.name() : null;
                    b bVar = c.Companion;
                    apk.a aVar2 = pVar.f291249b;
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(aVar2, "<this>");
                    int i2 = a.f291227a[aVar2.ordinal()];
                    if (i2 == 1) {
                        cVar = c.FULL_RANGE;
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        cVar = c.SINCE_PREVIOUS_EOD;
                    }
                    String strA2 = cVar.a();
                    this.v = range;
                    this.f291244w = 1;
                    lineChartMidRates = ratesPlotApiService.getLineChartMidRates(strD, strA, strD2, "LINE", strName, strA2, this);
                    if (lineChartMidRates == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    epk.b bVar2 = this.v;
                    yhm.o.b(obj2);
                    range = bVar2;
                    lineChartMidRates = obj2;
                }
                rpk.e eVar2 = (rpk.e) lineChartMidRates;
                Pair ccPair = gVar.f291229a;
                Intrinsics.checkNotNullParameter(eVar2, "<this>");
                Intrinsics.checkNotNullParameter(ccPair, "ccPair");
                Intrinsics.checkNotNullParameter(range, "range");
                xi0.b bVar3 = (xi0.b) ccPair.f186385a;
                xi0.b bVar4 = (xi0.b) ccPair.f186386b;
                qta.f fVarF = vc.o.F(range);
                List<rpk.f> points = eVar2.getPoints();
                ArrayList arrayList = new ArrayList(zhm.w.t(points, 10));
                for (rpk.f fVar : points) {
                    arrayList.add(new Pair(Long.valueOf(fVar.getStart()), Double.valueOf(fVar.getRate())));
                }
                return new qta.d(eVar2.getPreviousRangeCloseRate(), bVar3, bVar4, fVarF, arrayList);
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.f291244w;
                g gVar2 = this.f291245x;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    range2 = io3.h.S(gVar2.f291230b);
                    RatesPlotApiService ratesPlotApiService2 = this.f291246y.f291248a;
                    String strD3 = cp5.d.d(gVar2.f291229a);
                    String strA3 = range2.a();
                    String strD4 = io3.h.d(range2);
                    this.v = range2;
                    this.f291244w = 1;
                    candlesticksChartMidRates = ratesPlotApiService2.getCandlesticksChartMidRates(strD3, strA3, strD4, "CANDLESTICK", this);
                    if (candlesticksChartMidRates == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    epk.b bVar5 = this.v;
                    yhm.o.b(obj2);
                    range2 = bVar5;
                    candlesticksChartMidRates = obj2;
                }
                rpk.d dVar = (rpk.d) candlesticksChartMidRates;
                Pair ccPair2 = gVar2.f291229a;
                Intrinsics.checkNotNullParameter(dVar, "<this>");
                Intrinsics.checkNotNullParameter(ccPair2, "ccPair");
                Intrinsics.checkNotNullParameter(range2, "range");
                xi0.b bVar6 = (xi0.b) ccPair2.f186385a;
                xi0.b bVar7 = (xi0.b) ccPair2.f186386b;
                qta.f fVarF2 = vc.o.F(range2);
                List<rpk.c> points2 = dVar.getPoints();
                ArrayList arrayList2 = new ArrayList(zhm.w.t(points2, 10));
                for (rpk.c cVar2 : points2) {
                    arrayList2.add(new Pair(Long.valueOf(cVar2.getStart()), Double.valueOf(cVar2.getOpen())));
                }
                return new qta.d(dVar.getPreviousRangeCloseRate(), bVar6, bVar7, fVarF2, arrayList2);
        }
    }
}
