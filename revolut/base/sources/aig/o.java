package aig;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ FullScreenStateDelegate.Model u;
    public final /* synthetic */ com.revolut.feature.travel.miles.impl.ui.screen.home.e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(FullScreenStateDelegate.Model model, com.revolut.feature.travel.miles.impl.ui.screen.home.e eVar, Continuation continuation) {
        super(2, continuation);
        this.u = model;
        this.v = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new o(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        String str = this.u.f52373a;
        int iHashCode = str.hashCode();
        com.revolut.feature.travel.miles.impl.ui.screen.home.e eVar = this.v;
        if (iHashCode != -1002327340) {
            if (iHashCode != -410760727) {
                if (iHashCode == 174505988 && str.equals("ERROR_COMBINED_ITEM_ID")) {
                    eVar.v.a();
                    eVar.f94356w.a();
                    eVar.f94357x.a();
                }
            } else if (str.equals("ERROR_AIRLINES_AND_ACCOUNTS_ITEM_ID")) {
                eVar.v.a();
                eVar.f94356w.a();
            }
        } else if (str.equals("ERROR_TRANSACTIONS_ITEM_ID")) {
            eVar.f94357x.a();
        }
        return Unit.f186387a;
    }
}
