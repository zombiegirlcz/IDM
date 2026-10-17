package nt9;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.payments.groups.impl.ui_new.group_creation.GroupCreationScreen;
import com.revolut.feature.payments.groups.impl.ui_new.group_creation.GroupCreationScreenContract$ModalSteps;
import com.revolut.kompot.common.ModalDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ GroupCreationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(GroupCreationScreen groupCreationScreen, Continuation continuation) {
        super(2, continuation);
        this.v = groupCreationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.payments.groups.impl.ui_new.group_creation.b bVar = (com.revolut.feature.payments.groups.impl.ui_new.group_creation.b) iVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        if (Intrinsics.f(str, "GROUP_SMART_SETTLEMENT_TOGGLE_LIST_ID")) {
            oki.h.v2(bVar.v, GroupCreationScreenContract$ModalSteps.SmartSettlementInfo.f79480a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else {
            Continuation continuation = null;
            if (Intrinsics.f(str, "ID_CURRENCY_ITEM")) {
                bVar.l2(new n(bVar, continuation, 0), new yi5.b(26));
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.q("onRowItemClicked - Could not handle listId = ", str));
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
            }
        }
        return Unit.f186387a;
    }
}
