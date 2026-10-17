package vgf;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.TransactionsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class o extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TransactionsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(TransactionsScreen transactionsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = transactionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        o oVar = new o(this.v, continuation);
        oVar.u = obj2;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        u uVarR2 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a aVar2 = (com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a) uVarR2;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        j60.a.v(aVar2.z, true, null, 2);
        Object obj3 = model.i;
        uhf.i iVar = obj3 instanceof uhf.i ? (uhf.i) obj3 : null;
        if (iVar != null) {
            aVar2.n2(new r0(aVar2, iVar, null), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
