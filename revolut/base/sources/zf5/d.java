package zf5;

import cli.y;
import com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangeFees;
import com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangeFeesMode;
import com.revolut.feature.crypto.exchange.fees.impl.ui.CryptoExchangeFeesController;
import com.revolut.feature.crypto.exchange.fees.impl.ui.CryptoExchangeFeesControllerContract$PagerItem;
import com.revolut.retail.core.navigation.FinishCommand;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CryptoExchangeFeesController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(CryptoExchangeFeesController cryptoExchangeFeesController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cryptoExchangeFeesController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        hha.d dVar;
        CryptoExchangeFees cryptoExchangeFees;
        List list;
        Object next2;
        int i = this.u;
        CryptoExchangeFeesController cryptoExchangeFeesController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cryptoExchangeFeesController.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.crypto.exchange.fees.impl.ui.c cVar = (com.revolut.feature.crypto.exchange.fees.impl.ui.c) cryptoExchangeFeesController.d();
                y yVar = cVar.v;
                Continuation continuation = null;
                if (cVar.f70841p instanceof CryptoExchangeFeesMode.TradeMore) {
                    cVar.C1(u0.b(new FinishCommand(41053, null, null, 6)));
                } else {
                    Iterator it8 = ((g) ((j2) yVar.f22677a).getValue()).f321866b.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            next = it8.next();
                            if (Intrinsics.f(((CryptoExchangeFeesControllerContract$PagerItem) next).getF94249a(), ((g) ((j2) yVar.f22677a).getValue()).f321867c)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    CryptoExchangeFeesControllerContract$PagerItem cryptoExchangeFeesControllerContract$PagerItem = (CryptoExchangeFeesControllerContract$PagerItem) next;
                    CryptoExchangeFeesControllerContract$PagerItem.Details details = cryptoExchangeFeesControllerContract$PagerItem instanceof CryptoExchangeFeesControllerContract$PagerItem.Details ? (CryptoExchangeFeesControllerContract$PagerItem.Details) cryptoExchangeFeesControllerContract$PagerItem : null;
                    if (details == null || (cryptoExchangeFees = details.f70837a) == null || (list = cryptoExchangeFees.f70809a) == null) {
                        dVar = null;
                    } else {
                        Iterator it9 = list.iterator();
                        if (it9.hasNext()) {
                            next2 = it9.next();
                            if (it9.hasNext()) {
                                int i2 = ((hha.d) next2).f152294m;
                                do {
                                    Object next3 = it9.next();
                                    int i3 = ((hha.d) next3).f152294m;
                                    if (i2 < i3) {
                                        next2 = next3;
                                        i2 = i3;
                                    }
                                } while (it9.hasNext());
                            }
                        } else {
                            next2 = null;
                        }
                        dVar = (hha.d) next2;
                    }
                    if (dVar != null) {
                        cVar.n2(new zah.f(cVar, dVar, continuation, 2), new whi.b(6));
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
