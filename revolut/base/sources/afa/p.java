package afa;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.bank_account_switching.api.navigation.BankAccountSwitchingDestination;
import com.revolut.feature.bank_account_switching.api.navigation.BankAccountSwitchingFlowInputData;
import com.revolut.feature.pockets.impl.ui.pockets_list.PocketsListScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class p extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PocketsListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(PocketsListScreen pocketsListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = pocketsListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        p pVar = new p(this.v, continuation);
        pVar.u = obj2;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVarF3 = this.v.R2();
        String listId = model.f53228a;
        Object obj3 = model.u;
        com.revolut.feature.pockets.impl.ui.pockets_list.c cVar = (com.revolut.feature.pockets.impl.ui.pockets_list.c) hVarF3;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (obj3 instanceof d0) {
            int i = 0;
            if (kotlin.text.a0.H(listId, "POCKET_", false)) {
                d0 d0Var = (d0) obj3;
                cVar.C2(new hda.b(d0Var.f3981a, d0Var.f3982b, false));
            } else if (kotlin.text.a0.H(listId, "EXPANDABLE_GROUP_", false)) {
                cVar.H2(cVar.D, new s(((d0) obj3).f3981a, i));
            }
        } else if (obj3 instanceof mn2.a) {
            cVar.C1(new BankAccountSwitchingDestination(new BankAccountSwitchingFlowInputData.RequestList((mn2.a) obj3)));
        } else if (obj3 instanceof rfb.a) {
            cVar.C1(u0.b(u0.f(((rfb.a) obj3).f253749b)));
        } else {
            hx7.e.n(new IllegalStateException("Unhandled row click parcel: " + obj3 + " for listId: " + listId));
        }
        return Unit.f186387a;
    }
}
