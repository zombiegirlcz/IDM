package pqc;

import amh.n;
import cli.y;
import com.revolut.feature.salary_switch.impl.models.v2.CounterpartiesResult;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.bank_list.BankListScreen;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.bank_list.BankListScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ BankListScreen f238717w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(BankListScreen bankListScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f238717w = bankListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f238717w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f238717w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        String str = (String) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(str, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        BankListScreen bankListScreen = this.f238717w;
        switch (i) {
            case 0:
                String query = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVarE3 = bankListScreen.d();
                Intrinsics.h(query);
                com.revolut.feature.salary_switch.impl.ui.brazil.screen.bank_list.a aVar2 = (com.revolut.feature.salary_switch.impl.ui.brazil.screen.bank_list.a) iVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                y yVar = aVar2.f85283r;
                CounterpartiesResult counterpartiesResult = (CounterpartiesResult) ((g) ((j2) yVar.f22677a).getValue()).f238718a.getContent();
                List list = counterpartiesResult != null ? counterpartiesResult.f85238b : null;
                if (list == null) {
                    list = f0.f322471a;
                }
                aVar2.H2(yVar, new n(com.revolut.feature.salary_switch.impl.ui.brazil.screen.bank_list.a.I2(query, list), query, 9));
                break;
            default:
                String listId = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVarE32 = bankListScreen.d();
                Intrinsics.h(listId);
                com.revolut.feature.salary_switch.impl.ui.brazil.screen.bank_list.a aVar4 = (com.revolut.feature.salary_switch.impl.ui.brazil.screen.bank_list.a) iVarE32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (listId.equals("BANK_LIST_MENU_HELP_ID")) {
                    oki.h.v2(aVar4.f85284s, BankListScreenContract$ModalStep.Help.f85280a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                break;
        }
        return Unit.f186387a;
    }
}
