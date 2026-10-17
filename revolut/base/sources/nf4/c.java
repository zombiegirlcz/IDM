package nf4;

import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.CalculatorScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.a;
import d9.e1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CalculatorScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(CalculatorScreen calculatorScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = calculatorScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            default:
                return new c(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ArrayList arrayListU;
        cv3.a aVar;
        List list;
        int i = this.u;
        CalculatorScreen calculatorScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.c) calculatorScreen.d()).C2(a.C0474a.f68124a);
                break;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.c) calculatorScreen.d()).C2(a.b.f68125a);
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.c cVar = (com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.c) calculatorScreen.d();
                t tVar = (t) ((e) ((j2) cVar.f68132t.f22677a).getValue()).f214806b.getContent();
                if (tVar == null || (aVar = tVar.f214826a) == null || (list = aVar.e) == null) {
                    arrayListU = null;
                } else {
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(w.t(list2, 10));
                    Iterator it8 = list2.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(e1.q((dx4.e1) it8.next()));
                    }
                    arrayListU = w.u(arrayList);
                }
                if (!ue0.e.n(arrayListU)) {
                    cVar.C2(new h(arrayListU));
                }
                break;
        }
        return Unit.f186387a;
    }
}
