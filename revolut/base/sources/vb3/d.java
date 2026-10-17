package vb3;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.cash_topup.impl.ui.details.CashTopUpDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vb3.l;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CashTopUpDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CashTopUpDetailsScreen cashTopUpDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cashTopUpDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ActionsView.Item item = (ActionsView.Item) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        String str = item.f58316a;
        int iHashCode = str.hashCode();
        CashTopUpDetailsScreen cashTopUpDetailsScreen = this.v;
        switch (iHashCode) {
            case -890353425:
                if (str.equals("ACTION_ID_DEPOSIT_CASH")) {
                    s sVar = (s) cashTopUpDetailsScreen.T2();
                    sVar.v2(new h(((g) sVar.t2()).f287381a.f));
                }
                break;
            case -609449699:
                if (str.equals("ACTION_ID_SELECT_LOCATION")) {
                    s sVar2 = (s) cashTopUpDetailsScreen.T2();
                    sVar2.v2(new k(((g) sVar2.t2()).f287381a.f));
                }
                break;
            case -167870023:
                if (str.equals("ACTION_ID_SHOW_BARCODE")) {
                    ((s) cashTopUpDetailsScreen.T2()).v2(l.a.f287387a);
                }
                break;
            case 2102494577:
                if (str.equals("navigate")) {
                    s sVar3 = (s) cashTopUpDetailsScreen.T2();
                    sVar3.v2(new i(((g) sVar3.t2()).f287381a));
                }
                break;
        }
        return Unit.f186387a;
    }
}
