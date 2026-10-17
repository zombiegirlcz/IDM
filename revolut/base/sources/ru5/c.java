package ru5;

import com.revolut.feature.crypto_investments.api.navigation.CryptoInvestmentsFeatureConfig;
import com.revolut.feature.crypto_investments.impl.ui.screens.activity.ActivityScreen;
import com.revolut.feature.crypto_investments.impl.ui.screens.transaction_filter.TransactionFilterFlow;
import com.revolut.feature.crypto_investments.impl.ui.screens.transaction_filter.TransactionFilterFlowContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ActivityScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(ActivityScreen activityScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = activityScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            case 2:
                return new c(this.v, continuation, 2);
            default:
                return new c(this.v, continuation, 3);
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
        int i = this.u;
        ActivityScreen activityScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((z) activityScreen.T2()).x2(new rsl.c(23));
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                activityScreen.m2().onBackPressed();
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                z zVar = (z) activityScreen.T2();
                List list = ((j) zVar.t2()).f257420h;
                if (list == null) {
                    list = f0.f322471a;
                }
                zVar.f2(new TransactionFilterFlow(new TransactionFilterFlowContract$InputData(list, ((j) zVar.t2()).f257422l instanceof CryptoInvestmentsFeatureConfig.CurrencyMode.SingleCurrency)), ModalDestination.Style.POPUP.f98311a, new rrd.l(zVar, 9));
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((z) activityScreen.T2()).x2(new rsl.c(27));
                break;
        }
        return Unit.f186387a;
    }
}
