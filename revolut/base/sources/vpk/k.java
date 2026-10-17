package vpk;

import com.revolut.retail.feature.ratedetails.impl.network.RatesPlotApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public epk.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f291237w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f291238x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ p f291239y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(g gVar, p pVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f291238x = gVar;
        this.f291239y = pVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f291238x, this.f291239y, continuation, 0);
            default:
                return new k(this.f291238x, this.f291239y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((k) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        epk.a aVar;
        epk.a aVar2;
        switch (this.u) {
            case 0:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i = this.f291237w;
                g gVar = this.f291238x;
                if (i == 0) {
                    yhm.o.b(obj2);
                    epk.b bVarS = io3.h.S(gVar.f291230b);
                    epk.a aVarC = io3.h.c(bVarS);
                    RatesPlotApiService ratesPlotApiService = this.f291239y.f291248a;
                    String strD = cp5.d.d(gVar.f291229a);
                    String strA = bVarS.a();
                    String strA2 = aVarC.a();
                    this.v = aVarC;
                    this.f291237w = 1;
                    obj2 = ratesPlotApiService.getCandlesticksChartMidRates(strD, strA, strA2, "CANDLESTICK", this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                    aVar = aVarC;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = this.v;
                    yhm.o.b(obj2);
                }
                return vc.o.E((rpk.d) obj2, gVar.f291229a, gVar.f, aVar);
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.f291237w;
                g gVar2 = this.f291238x;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    epk.b bVarS2 = io3.h.S(gVar2.f291230b);
                    epk.a aVarC2 = io3.h.c(bVarS2);
                    RatesPlotApiService ratesPlotApiService2 = this.f291239y.f291248a;
                    String strD2 = cp5.d.d(gVar2.f291229a);
                    String strA3 = bVarS2.a();
                    String strA4 = aVarC2.a();
                    this.v = aVarC2;
                    this.f291237w = 1;
                    obj2 = ratesPlotApiService2.getCandlesticksChartMidRates(strD2, strA3, strA4, "CANDLESTICK", this);
                    if (obj2 == aVar4) {
                        return aVar4;
                    }
                    aVar2 = aVarC2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = this.v;
                    yhm.o.b(obj2);
                }
                return vc.o.E((rpk.d) obj2, gVar2.f291229a, gVar2.f, aVar2);
        }
    }
}
