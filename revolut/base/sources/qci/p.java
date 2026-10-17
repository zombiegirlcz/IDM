package qci;

import cli.y;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature_retail_user_declarations.transaction_countries.countries_selection.CountriesSelectionScreenContract$ModalStep;
import com.revolut.feature_retail_user_declarations.transaction_countries.countries_selection.TransactionCountriesScreen;
import com.revolut.feature_retail_user_declarations.transaction_countries.models.TransactionDestination;
import com.revolut.kompot.common.ModalDestination;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.a1;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class p extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TransactionCountriesScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(TransactionCountriesScreen transactionCountriesScreen, Continuation continuation) {
        super(2, continuation);
        this.v = transactionCountriesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        p pVar = new p(this.v, continuation);
        pVar.u = obj2;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        g gVarE3 = this.v.R2();
        String listId = model.f53304a;
        com.revolut.feature_retail_user_declarations.transaction_countries.countries_selection.a aVar2 = (com.revolut.feature_retail_user_declarations.transaction_countries.countries_selection.a) gVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        wi0.b bVarC = com.bumptech.glide.d.c(listId);
        y yVar = aVar2.f97762p;
        final Set setH1 = d0.h1(((c) ((j2) yVar.f22677a).getValue()).f244791a);
        Iterator it8 = setH1.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((TransactionDestination) next).f97773a, bVarC)) {
                break;
            }
        }
        final TransactionDestination transactionDestination = (TransactionDestination) next;
        if (transactionDestination != null) {
            final int i = 0;
            aVar2.H2(yVar, new Function1() { // from class: qci.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    c update = (c) obj3;
                    switch (i) {
                        case 0:
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            return c.a(update, a1.j(setH1, transactionDestination), null, 2);
                        default:
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            return c.a(update, a1.m(setH1, transactionDestination), null, 2);
                    }
                }
            });
        } else if (aVar2.o.f97760h) {
            oki.h.v2(aVar2.f97763q, new CountriesSelectionScreenContract$ModalStep.ExpectedAmount(bVarC), ModalDestination.Style.POPUP.f98311a);
        } else {
            final TransactionDestination transactionDestination2 = new TransactionDestination(bVarC, null, null);
            final int i2 = 1;
            aVar2.H2(yVar, new Function1() { // from class: qci.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    c update = (c) obj3;
                    switch (i2) {
                        case 0:
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            return c.a(update, a1.j(setH1, transactionDestination2), null, 2);
                        default:
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            return c.a(update, a1.m(setH1, transactionDestination2), null, 2);
                    }
                }
            });
        }
        return Unit.f186387a;
    }
}
