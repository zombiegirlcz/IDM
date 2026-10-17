package kk9;

import com.revolut.feature.pay_later.impl.ui.repayamount.PayLaterRepayAmountScreen;
import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import kk9.d;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PayLaterRepayAmountScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(PayLaterRepayAmountScreen payLaterRepayAmountScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = payLaterRepayAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
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

    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PayLaterRepayAmountScreen payLaterRepayAmountScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                payLaterRepayAmountScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j jVar = (j) payLaterRepayAmountScreen.c0.getValue();
                Object tag2 = payLaterRepayAmountScreen.i3().getTag();
                n nVar = (n) jVar;
                nVar.getClass();
                if (tag2 instanceof e) {
                    nVar.l2(new kb7.c(nVar, (e) tag2, null, 13), new yi5.b(26));
                } else if (tag2 instanceof d.a) {
                    nVar.C1(new InitTopUpDestination(TopUpConfig.Companion.c(TopUpConfig.INSTANCE, null, null, null, null, 31)));
                }
                break;
        }
        return Unit.f186387a;
    }
}
