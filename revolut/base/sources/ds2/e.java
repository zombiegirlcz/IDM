package ds2;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.ContentUser;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.details.BlockedMerchantDetailsScreen;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.details.BlockedMerchantDetailsScreenContract$InputData;
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
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BlockedMerchantDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BlockedMerchantDetailsScreen blockedMerchantDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = blockedMerchantDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVarG3 = this.v.T2();
        Intrinsics.h(model);
        i iVar = (i) gVarG3;
        iVar.getClass();
        j60.a aVar2 = iVar.f117183r;
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52613a;
        int iHashCode = str.hashCode();
        if (iHashCode != 166043471) {
            if (iHashCode != 1778746639) {
                if (iHashCode == 2086174325 && str.equals("CANCEL_UNBLOCK_MERCHANT_LIST_ID")) {
                    j60.a.v(aVar2, false, null, 3);
                }
            } else if (str.equals("CONFIRM_UNBLOCK_MERCHANT_LIST_ID")) {
                iVar.l2(new cq6.k(iVar, null, 29), new yi5.b(26));
                j60.a.v(aVar2, false, null, 3);
            }
        } else if (str.equals("ID_SEE_ALL_TRANSACTIONS_ITEM")) {
            nr2.a aVar3 = iVar.f117185t;
            BlockedMerchantDetailsScreenContract$InputData blockedMerchantDetailsScreenContract$InputData = iVar.f117181p;
            kr2.e eVar = blockedMerchantDetailsScreenContract$InputData.f64250b;
            ContentUser contentUser = blockedMerchantDetailsScreenContract$InputData.f64249a;
            ContentUser.Junior junior = contentUser instanceof ContentUser.Junior ? (ContentUser.Junior) contentUser : null;
            iVar.C1(new TransactionListDestination(new TransactionListDestination.InputData((Clause) null, (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) new TransactionsListFilterType.ByTransactionsFilter(((xr2.a) aVar3).a(eVar, junior != null ? junior.f64235b : null), null, null, 6), (String) null, (AccountId) null, (rhf.h) null, (rhf.g) null, (TransactionDestination) null, (q6) null, (Set) null, (RecurringPaymentAccount) null, (RecurringPaymentFilter) null, false, 65519)));
        }
        return Unit.f186387a;
    }
}
