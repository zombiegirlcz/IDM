package pqg;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.vaults.impl.ui.money_flow.add_money.screen.AddMoneyScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AddMoneyScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(AddMoneyScreen addMoneyScreen, Continuation continuation) {
        super(2, continuation);
        this.v = addMoneyScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r rVarT2 = this.v.T2();
        String listId = model.f52613a;
        i0 i0Var = (i0) rVarT2;
        i0Var.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "ID_SAVINGS_INTEREST_GOT_IT_BUTTON") || Intrinsics.f(listId, "INTEREST_ESTIMATION_DIALOG_CTA_ID")) {
            j60.a.v(i0Var.D, false, null, 3);
        }
        return Unit.f186387a;
    }
}
