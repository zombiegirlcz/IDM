package pij;

import com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreenContract$OutputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ EsimSubscriptionsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(EsimSubscriptionsScreen esimSubscriptionsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = esimSubscriptionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m(this.v, continuation, 0);
            case 1:
                return new m(this.v, continuation, 1);
            case 2:
                return new m(this.v, continuation, 2);
            default:
                return new m(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((m) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((m) create((com.revolut.core.ui_kit.delegates.t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((m) create((com.revolut.core.ui_kit.delegates.t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((m) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        EsimSubscriptionsScreen esimSubscriptionsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                esimSubscriptionsScreen.m2().onBackPressed();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar = (com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b) esimSubscriptionsScreen.R2();
                bVar.getClass();
                bVar.l2(new b1(bVar, null, 1), new yi5.b(26));
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b) esimSubscriptionsScreen.R2()).C2(EsimSubscriptionsScreenContract$OutputData.EnableEsimClicked.f101046a);
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b) esimSubscriptionsScreen.R2()).C2(EsimSubscriptionsScreenContract$OutputData.HelpClicked.f101050a);
                break;
        }
        return Unit.f186387a;
    }
}
