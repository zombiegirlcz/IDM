package i06;

import cli.y;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.customer_present.tips.impl.screen.tips_management.TipsManagementScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TipsManagementScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TipsManagementScreen tipsManagementScreen, Continuation continuation) {
        super(2, continuation);
        this.v = tipsManagementScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarE3 = this.v.d();
        String listId = model.f52708a;
        q qVar = (q) jVarE3;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "RATES_EDIT_SUBHEADER_LIST_ID")) {
            y yVar = qVar.f157307r;
            if (!((g) ((j2) yVar.f22677a).getValue()).f157292c) {
                qVar.H2(yVar, new m(qVar, 1));
            }
        }
        return Unit.f186387a;
    }
}
