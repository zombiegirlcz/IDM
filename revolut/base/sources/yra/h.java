package yra;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.push_to_card.impl.ui.amount.PushToCardTransferAmountScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PushToCardTransferAmountScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(PushToCardTransferAmountScreen pushToCardTransferAmountScreen, Continuation continuation) {
        super(2, continuation);
        this.v = pushToCardTransferAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVarJ3 = this.v.T2();
        String note = textData.f52598b.toString();
        x xVar = (x) pVarJ3;
        xVar.getClass();
        Intrinsics.checkNotNullParameter(note, "note");
        o oVar = ((j) xVar.t2()).e;
        if (oVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        xVar.x2(new xwd.o(xVar, 26, note, oVar));
        return Unit.f186387a;
    }
}
