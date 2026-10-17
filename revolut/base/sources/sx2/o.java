package sx2;

import com.revolut.feature.card_design.impl.card_design.carousel.CardDesignCarouselScreenContract$InputData;
import java.util.List;
import klf.a3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes21.dex */
public final class o extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f266318w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f266319x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_design.impl.card_design.carousel.e f266320y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i, com.revolut.feature.card_design.impl.card_design.carousel.e eVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f266320y = eVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                o oVar = new o(0, this.f266320y, continuation);
                oVar.f266318w = flowCollector;
                oVar.f266319x = obj3;
                return oVar.invokeSuspend(Unit.f186387a);
            default:
                o oVar2 = new o(1, this.f266320y, continuation);
                oVar2.f266318w = flowCollector;
                oVar2.f266319x = obj3;
                return oVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.card_design.impl.card_design.carousel.e eVar;
        efm.r rVarO2;
        Flow gVar;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f266318w;
                    vf0.h hVar = (vf0.h) this.f266319x;
                    hha.d dVar = (hha.d) hVar.f288433a;
                    h93.l0 l0Var = (h93.l0) hVar.f288434b;
                    List list = (List) hVar.f288435c;
                    od0.i iVar = (od0.i) hVar.d;
                    com.revolut.feature.card_design.impl.card_design.carousel.e eVar2 = this.f266320y;
                    CardDesignCarouselScreenContract$InputData cardDesignCarouselScreenContract$InputData = eVar2.o;
                    if (cardDesignCarouselScreenContract$InputData.f64682b == c93.e.PHYSICAL) {
                        rVarO2 = eVar2.f64708q.j(dVar, cardDesignCarouselScreenContract$InputData.f64683c, cardDesignCarouselScreenContract$InputData.d, cardDesignCarouselScreenContract$InputData.o, l0Var, (String) iVar.f224257a, cardDesignCarouselScreenContract$InputData.i, cardDesignCarouselScreenContract$InputData.f64684g, cardDesignCarouselScreenContract$InputData.f64694t, e93.o.DEFAULT, cardDesignCarouselScreenContract$InputData.v);
                        eVar = eVar2;
                    } else {
                        eVar = eVar2;
                        rVarO2 = eVar.O2(dVar, l0Var, (String) iVar.f224257a, false);
                    }
                    wkm.l lVarH = vkm.q.H(new qqj.g(l0Var, eVar, (Continuation) null, 13), nim.a.v(vkm.q.q(rd0.e.b(rVarO2)), new nyb.q(list, eVar, 20)));
                    this.f266318w = null;
                    this.f266319x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, lVarH, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f266318w;
                    h93.l0 l0Var2 = (h93.l0) this.f266319x;
                    com.revolut.feature.card_design.impl.card_design.carousel.e eVar3 = this.f266320y;
                    if (l0Var2 == null) {
                        l0Var2 = eVar3.o.d;
                    }
                    Continuation continuation = null;
                    if (l0Var2 == h93.l0.INDIA_GLOBAL) {
                        kx2.a aVar3 = eVar3.F;
                        gVar = vkm.q.Q(vkm.q.q(bla.b.b(aVar3.d, "revolut_card.multi_currency_card")), new a3(continuation, aVar3, 13));
                    } else {
                        gVar = new go.g(Boolean.FALSE, 2);
                    }
                    this.f266318w = null;
                    this.f266319x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, gVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
