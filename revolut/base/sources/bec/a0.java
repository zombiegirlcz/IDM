package bec;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.revolutpay.api.shared.navigation.PayWithAnyControllerDescriptor$InputData;
import com.revolut.feature.revolutpay.shared.ui.pay_with_any.PayWithAnyContract$ModalStep;
import com.revolut.feature.revolutpay.shared.ui.pay_with_any.PayWithAnyScreen;
import com.revolut.kompot.common.ModalDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PayWithAnyScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(PayWithAnyScreen payWithAnyScreen, Continuation continuation) {
        super(2, continuation);
        this.v = payWithAnyScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a0 a0Var = new a0(this.v, continuation);
        a0Var.u = obj2;
        return a0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a0) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarE3 = this.v.d();
        String listId = model.f52613a;
        com.revolut.feature.revolutpay.shared.ui.pay_with_any.a aVar2 = (com.revolut.feature.revolutpay.shared.ui.pay_with_any.a) qVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "SEE_ALL_ITEM_ID")) {
            PayWithAnyControllerDescriptor$InputData payWithAnyControllerDescriptor$InputData = aVar2.f84726r;
            int i = j0.f14791a[payWithAnyControllerDescriptor$InputData.i.ordinal()];
            if (i == 1 || i == 2) {
                IllegalStateException illegalStateException = new IllegalStateException("See all button shouldn't be visible in " + payWithAnyControllerDescriptor$InputData.i + " mode");
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                oki.h.v2(aVar2.f84729w, PayWithAnyContract$ModalStep.PayWithAnyFullList.f84723a, ModalDestination.Style.POPUP.f98311a);
            }
        }
        return Unit.f186387a;
    }
}
