package b6i;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature_move_money.api.model.OrderMode;
import com.revolut.feature_move_money.impl.amount.MoveAmountScreenContract$ModalStep;
import com.revolut.feature_move_money.impl.amount.MoveAmountScreenContract$OrderContext;
import com.revolut.feature_move_money.impl.amount.MoveMoneyAmountScreen;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class w0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ MoveMoneyAmountScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(MoveMoneyAmountScreen moveMoneyAmountScreen, Continuation continuation) {
        super(2, continuation);
        this.v = moveMoneyAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        w0 w0Var = new w0(this.v, continuation);
        w0Var.u = obj2;
        return w0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((w0) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        FlowStep limitOrderSettings;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarD = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature_move_money.impl.amount.c cVar = (com.revolut.feature_move_money.impl.amount.c) nVarD;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        if (Intrinsics.f(str, "ORDER_STOP_LIMIT_OPTIONS_LIST_ID")) {
            OrderMode orderMode = cVar.Q2().f12787h;
            if (orderMode instanceof OrderMode.Threshold) {
                OrderMode.Threshold threshold = (OrderMode.Threshold) orderMode;
                BigDecimal bigDecimal = threshold.e;
                Pair pairA = com.revolut.feature_move_money.api.model.c.a(threshold);
                MoveAmountScreenContract$OrderContext moveAmountScreenContract$OrderContext = new MoveAmountScreenContract$OrderContext(threshold.d, (xi0.b) pairA.f186385a, (xi0.b) pairA.f186386b);
                int i = a0.f[threshold.f97231a.ordinal()];
                if (i == 1) {
                    String plainString = bigDecimal.toPlainString();
                    Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
                    limitOrderSettings = new MoveAmountScreenContract$ModalStep.LimitOrderSettings(moveAmountScreenContract$OrderContext, plainString);
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String plainString2 = bigDecimal.toPlainString();
                    Intrinsics.checkNotNullExpressionValue(plainString2, "toPlainString(...)");
                    limitOrderSettings = new MoveAmountScreenContract$ModalStep.StopOrderSettings(moveAmountScreenContract$OrderContext, plainString2);
                }
                oki.h.v2(cVar.X, limitOrderSettings, ModalDestination.Style.FULLSCREEN_FADE.f98307a);
            } else {
                if (!(orderMode instanceof OrderMode.Scheduling) && !(orderMode instanceof OrderMode.Market) && !(orderMode instanceof OrderMode.Automation)) {
                    throw new NoWhenBranchMatchedException();
                }
                hx7.e.n(new IllegalStateException("Unsupported value action for order mode " + orderMode));
            }
        } else {
            hx7.e.n(new IllegalArgumentException(j6.a.q("Unknown element was clicked ", str)));
        }
        return Unit.f186387a;
    }
}
