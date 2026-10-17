package u9a;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.pix.impl.flow.automatico.screens.details.PixAutomaticoPaymentDetailsScreen;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import com.revolut.feature.transactions.api.navigation.TransactionDestination;
import com.revolut.feature.transactions.api.navigation.TransactionListDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tof.q6;
import tof.s9;
import tx0.g4;
import vkm.j2;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PixAutomaticoPaymentDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(PixAutomaticoPaymentDetailsScreen pixAutomaticoPaymentDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = pixAutomaticoPaymentDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarE3 = this.v.d();
        String listId = model.f52613a;
        com.revolut.feature.pix.impl.flow.automatico.screens.details.a aVar2 = (com.revolut.feature.pix.impl.flow.automatico.screens.details.a) nVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        int i = 0;
        Continuation continuation = null;
        switch (listId.hashCode()) {
            case -835800367:
                if (listId.equals("CANCEL_PAYMENT_POSITIVE_CTA_BUTTON_ID")) {
                    aVar2.n2(new q(1, aVar2, continuation), new g4(1, aVar2, com.revolut.feature.pix.impl.flow.automatico.screens.details.a.class, "showErrorDialog", "showErrorDialog(Ljava/lang/Throwable;)Z", 0, 8));
                }
                break;
            case -96433139:
                if (listId.equals("CANCEL_PAYMENT_NEGATIVE_CTA_BUTTON_ID")) {
                    j60.a.v(aVar2.f80617r, false, null, 3);
                }
                break;
            case 923687923:
                if (listId.equals("CANCEL_NEXT_PAYMENT_POSITIVE_CTA_BUTTON_ID")) {
                    aVar2.l2(new q(i, aVar2, continuation), new yi5.b(26));
                }
                break;
            case 1302063607:
                if (listId.equals("ID_ALL_TRANSACTIONS")) {
                    yhi.b bVar = yhi.b.SOLID;
                    g8a.k kVar = (g8a.k) ((m) ((j2) aVar2.f80620w.f22677a).getValue()).f278432a.getContent();
                    Set set = kVar != null ? kVar.o : null;
                    if (set == null) {
                        set = h0.f322473a;
                    }
                    aVar2.C1(u0.b(vhi.c.c(new TransactionListDestination(new TransactionListDestination.InputData((Clause) null, (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) new TransactionsListFilterType.ByTransactionsFilter(new s9(set), null, null, 6), (String) null, (AccountId) null, (rhf.h) null, (rhf.g) null, (TransactionDestination) null, (q6) null, (Set) null, (RecurringPaymentAccount) null, (RecurringPaymentFilter) null, false, 65519)), bVar, null, false, 12)));
                }
                break;
        }
        return Unit.f186387a;
    }
}
