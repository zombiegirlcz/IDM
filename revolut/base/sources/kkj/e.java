package kkj;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.EsimMobilePlanMyNumbersScreen;
import ip0.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimMobilePlanMyNumbersScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(EsimMobilePlanMyNumbersScreen esimMobilePlanMyNumbersScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimMobilePlanMyNumbersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        y yVar = (y) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarE3 = this.v.d();
        ActionsView.Item item = yVar.f167226b;
        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.a aVar2 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.a) lVarE3;
        aVar2.K2(item.f58324n, item.f58316a);
        return Unit.f186387a;
    }
}
