package l5a;

import com.revolut.core.ui_kit.models.navbar.NavBarMessage;
import com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.PaymentsIntroScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PaymentsIntroScreen f192201w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(PaymentsIntroScreen paymentsIntroScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f192201w = paymentsIntroScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f192201w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            case 1:
                g gVar2 = new g(this.f192201w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
            case 2:
                g gVar3 = new g(this.f192201w, continuation, 2);
                gVar3.v = obj2;
                return gVar3;
            default:
                g gVar4 = new g(this.f192201w, continuation, 3);
                gVar4.v = obj2;
                return gVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((g) create((NavBarMessage) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PaymentsIntroScreen paymentsIntroScreen = this.f192201w;
        switch (i) {
            case 0:
                String listId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarE3 = paymentsIntroScreen.e3();
                Intrinsics.h(listId);
                com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.e eVar = (com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.e) oVarE3;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (listId.equals("ID_MENU_ITEM_NEW")) {
                    h5a.d dVar = eVar.f80200w;
                    c5a.n nVar = c5a.n.EMBEDDED;
                    dVar.getClass();
                    eVar.C1(h5a.d.a(nVar));
                } else if (listId.equals("ID_MENU_ITEM_SCHEDULED")) {
                    eVar.l2(new t(eVar, null, 0), new yi5.b(26));
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException(p.a.p("Menu Item (", listId, ") not supported"));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                break;
            case 1:
                String buttonId = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarE32 = paymentsIntroScreen.e3();
                Intrinsics.h(buttonId);
                com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.e eVar2 = (com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.e) oVarE32;
                eVar2.getClass();
                Intrinsics.checkNotNullParameter(buttonId, "buttonId");
                eVar2.f80199t.getClass();
                eVar2.C1(h3a.p.a(buttonId));
                break;
            case 2:
                NavBarMessage message = (NavBarMessage) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarE33 = paymentsIntroScreen.e3();
                Intrinsics.h(message);
                com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.e eVar3 = (com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.e) oVarE33;
                eVar3.getClass();
                Intrinsics.checkNotNullParameter(message, "message");
                eVar3.E.b3(message);
                break;
            default:
                NavBarMessage message2 = (NavBarMessage) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarE34 = paymentsIntroScreen.e3();
                Intrinsics.h(message2);
                com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.e eVar4 = (com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.e) oVarE34;
                eVar4.getClass();
                Intrinsics.checkNotNullParameter(message2, "message");
                eVar4.E.c3(message2);
                break;
        }
        return Unit.f186387a;
    }
}
