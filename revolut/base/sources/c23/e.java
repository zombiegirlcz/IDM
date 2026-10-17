package c23;

import com.revolut.feature.card_order_new.impl.kompot.CardOrderFlowContract$State;
import com.revolut.feature.card_order_new.impl.kompot.CardOrderFlowContract$Step;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o23.x;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20611a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_order_new.impl.kompot.c f20612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CardOrderFlowContract$Step f20613c;

    public /* synthetic */ e(CardOrderFlowContract$Step cardOrderFlowContract$Step, com.revolut.feature.card_order_new.impl.kompot.c cVar) {
        this.f20613c = cardOrderFlowContract$Step;
        this.f20612b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f20611a) {
            case 0:
                com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.a result = (com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.a) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                boolean z = result instanceof x23.k;
                CardOrderFlowContract$Step cardOrderFlowContract$Step = this.f20613c;
                com.revolut.feature.card_order_new.impl.kompot.c cVar = this.f20612b;
                if (z) {
                    CardOrderFlowContract$Step.CardPersonalisation cardPersonalisation = (CardOrderFlowContract$Step.CardPersonalisation) cardOrderFlowContract$Step;
                    if (cardPersonalisation.f65072c) {
                        cVar.I2();
                    } else {
                        cVar.L2(CardOrderFlowContract$State.a((CardOrderFlowContract$State) cVar.A2().f98429a, null, null, ((x23.k) result).f302482a, null, null, null, null, null, null, null, 16777087));
                        cVar.E2(cVar.U2(cardPersonalisation.f65070a), true, null, false);
                    }
                } else if (result instanceof a.b) {
                    CardOrderFlowContract$Step.CardPersonalisation cardPersonalisation2 = (CardOrderFlowContract$Step.CardPersonalisation) cardOrderFlowContract$Step;
                    if (cardPersonalisation2.f65072c) {
                        cVar.I2();
                    } else {
                        cVar.E2(cVar.U2(cardPersonalisation2.f65070a), true, null, false);
                    }
                } else {
                    if (!(result instanceof a.C0463a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar.I2();
                }
                return Unit.f186387a;
            default:
                x result2 = (x) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                boolean z3 = result2.d;
                com.revolut.feature.card_order_new.impl.kompot.c cVar2 = this.f20612b;
                if (z3) {
                    cVar2.Z2();
                } else {
                    cVar2.l2(new a1a.c(28, cVar2, ((CardOrderFlowContract$Step.ChangeDeliveryAddress) this.f20613c).f65073a, result2, result2.f221475c, (Continuation) null), new yi5.b(26));
                }
                return Unit.f186387a;
        }
    }

    public /* synthetic */ e(com.revolut.feature.card_order_new.impl.kompot.c cVar, CardOrderFlowContract$Step cardOrderFlowContract$Step) {
        this.f20612b = cVar;
        this.f20613c = cardOrderFlowContract$Step;
    }
}
