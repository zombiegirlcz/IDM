package zs9;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.payments.groups.impl.ui_new.customize.GroupCustomizationScreen;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ GroupCustomizationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(GroupCustomizationScreen groupCustomizationScreen, Continuation continuation) {
        super(2, continuation);
        this.v = groupCustomizationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.v, continuation);
        mVar.u = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r rVarI3 = this.v.T2();
        Intrinsics.h(model);
        z zVar = (z) rVarI3;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        int i = 2;
        Continuation continuation = null;
        if (Intrinsics.f(str, "GROUP_SMART_SETTLEMENT_TOGGLE_LIST_ID")) {
            zVar.f324853w.getClass();
            yji.l.j2(zVar, new ActionsBottomSheetController(wr9.e.a()), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
        } else if (Intrinsics.f(str, "ID_CURRENCY_ITEM")) {
            zVar.l2(new x(zVar, continuation, i), new yi5.b(26));
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.q("onRowItemClicked - Could not handle listId = ", str));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        }
        return Unit.f186387a;
    }
}
