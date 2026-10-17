package mrc;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.salary_switch.impl.ui.mexico.screen.status.SalarySwitchStatusController;
import com.revolut.feature.shared.help_centre.api.main.SharedHelpDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SalarySwitchStatusController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(SalarySwitchStatusController salarySwitchStatusController, Continuation continuation) {
        super(2, continuation);
        this.v = salarySwitchStatusController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsChevronDelegate.Model model = (CellDetailsChevronDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        b bVarD3 = this.v.d();
        String listId = model.f51822a;
        l lVar = (l) bVarD3;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "GET_HELP_ITEM_ID")) {
            lVar.C1(new SharedHelpDestination((SharedHelpDestination.InputData) null, 3));
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.q("Unknown list id ", listId));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        }
        return Unit.f186387a;
    }
}
