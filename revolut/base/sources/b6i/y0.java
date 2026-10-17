package b6i;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature_move_money.impl.amount.MoveMoneyAmountScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class y0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ MoveMoneyAmountScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(MoveMoneyAmountScreen moveMoneyAmountScreen, Continuation continuation) {
        super(2, continuation);
        this.v = moveMoneyAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        y0 y0Var = new y0(this.v, continuation);
        y0Var.u = obj2;
        return y0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((y0) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarD = this.v.d();
        String text = textData.f52598b.toString();
        com.revolut.feature_move_money.impl.amount.c cVar = (com.revolut.feature_move_money.impl.amount.c) nVarD;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        cVar.H2(cVar.Y, new b58.f(cVar, text, 9));
        return Unit.f186387a;
    }
}
