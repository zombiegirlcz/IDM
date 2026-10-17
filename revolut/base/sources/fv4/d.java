package fv4;

import com.revolut.feature.credit.card.impl.ui.statement.details.CreditCardStatementDetailsScreen;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CreditCardStatementDetailsScreen f138322w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(CreditCardStatementDetailsScreen creditCardStatementDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f138322w = creditCardStatementDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f138322w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f138322w, continuation, 1);
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
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objA;
        int i = this.u;
        CreditCardStatementDetailsScreen creditCardStatementDetailsScreen = this.f138322w;
        switch (i) {
            case 0:
                String tabId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarE3 = creditCardStatementDetailsScreen.e3();
                Intrinsics.h(tabId);
                com.revolut.feature.credit.card.impl.ui.statement.details.a aVar2 = (com.revolut.feature.credit.card.impl.ui.statement.details.a) nVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(tabId, "tabId");
                aVar2.H2(aVar2.f69664s, new f9g.l(tabId, 22));
                return Unit.f186387a;
            default:
                String itemId = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarE32 = creditCardStatementDetailsScreen.e3();
                Intrinsics.h(itemId);
                com.revolut.feature.credit.card.impl.ui.statement.details.a aVar4 = (com.revolut.feature.credit.card.impl.ui.statement.details.a) nVarE32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                if (itemId.equals("id_credit_card_statement_details_menu_item_download")) {
                    try {
                        m.Companion companion = yhm.m.INSTANCE;
                        aVar4.C2(new i(aVar4.I2().f290263a));
                        objA = Unit.f186387a;
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable th10) {
                        m.Companion companion2 = yhm.m.INSTANCE;
                        objA = yhm.o.a(th10);
                    }
                    Throwable thA = yhm.m.a(objA);
                    if (thA != null) {
                        hx7.e.n(thA);
                    }
                    break;
                }
                return Unit.f186387a;
        }
    }
}
