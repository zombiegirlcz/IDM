package cd4;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2.list.CreditLinkedAccountsV2ListScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CreditLinkedAccountsV2ListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CreditLinkedAccountsV2ListScreen creditLinkedAccountsV2ListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = creditLinkedAccountsV2ListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVarI3 = this.v.T2();
        String listId = model.f52613a;
        j60.a aVar2 = ((k) iVarI3).f23181p;
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "ID_WHY_IN_THE_LIST_GOT_IT")) {
            j60.a.v(aVar2, false, null, 3);
        } else {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "NoBankPopupScreenModel", j6.a.q("Can't support this buttonClick ", listId), null, h0Var);
            j60.a.v(aVar2, false, null, 3);
        }
        return Unit.f186387a;
    }
}
