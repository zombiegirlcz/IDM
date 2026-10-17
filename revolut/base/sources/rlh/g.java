package rlh;

import com.revolut.feature.trading.api.FeatureTradingApi$Toggles$EtfInstrumentsCollectionsRedesign;
import com.revolut.feature.wealth.api.declaration.InstrumentsCollectionDestination;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.InstrumentsCollectionType;
import com.revolut.feature.wealth.ui.api.navigation.trade.WealthTradeRedesignDestination;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.i implements Function1 {
    public j u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f255054w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, Continuation continuation) {
        super(1, continuation);
        this.f255054w = jVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new g(this.f255054w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((g) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        j jVar;
        j jVar2;
        KompotDestination instrumentsCollectionDestination;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            jVar = this.f255054w;
            if (((jte.d) jVar.o).c(FeatureTradingApi$Toggles$EtfInstrumentsCollectionsRedesign.f91203c)) {
                instrumentsCollectionDestination = new InstrumentsCollectionDestination(InstrumentsCollectionType.Etfs.f95284a);
                return jVar.C1(instrumentsCollectionDestination);
            }
            nlh.b bVar = jVar.f255059p;
            sih.b bVar2 = sih.b.ETFs;
            this.u = jVar;
            this.v = 1;
            bVar.getClass();
            WealthTradeRedesignDestination wealthTradeRedesignDestinationA = nlh.b.a(bVar2);
            if (wealthTradeRedesignDestinationA == aVar) {
                return aVar;
            }
            jVar2 = jVar;
            obj2 = wealthTradeRedesignDestinationA;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar2 = this.u;
            yhm.o.b(obj2);
        }
        j jVar3 = jVar2;
        instrumentsCollectionDestination = (KompotDestination) obj2;
        jVar = jVar3;
        return jVar.C1(instrumentsCollectionDestination);
    }
}
