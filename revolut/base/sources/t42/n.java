package t42;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.TransferAmountScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class n extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TransferAmountScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(TransferAmountScreen transferAmountScreen, Continuation continuation) {
        super(2, continuation);
        this.v = transferAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n nVar = new n(this.v, continuation);
        nVar.u = obj2;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVarF3 = this.v.R2();
        String note = textData.f52598b.toString();
        com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c cVar = (com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c) hVarF3;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(note, "note");
        cVar.H2(cVar.G, new r(cVar, note, 1));
        return Unit.f186387a;
    }
}
