package jvc;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.security_hub.api.R$string;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import com.revolut.feature.transactions.api.navigation.TransactionDestination;
import com.revolut.feature.transactions.api.navigation.TransactionListDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import java.util.Set;
import jsl.t0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tof.q6;
import tof.u9;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.security_hub.impl.ui.security_hub.c f178817b;

    public /* synthetic */ c0(com.revolut.feature.security_hub.impl.ui.security_hub.c cVar, int i) {
        this.f178816a = i;
        this.f178817b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f178816a) {
            case 0:
                i update = (i) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return i.a(update, false, null, null, null, null, null, ((jla.h) this.f178817b.u.f257629a).d("security_hub.card_connections", null) == bla.c.ENABLED, null, null, false, null, 65279);
            case 1:
                Intrinsics.checkNotNullParameter((dii.g) obj2, "it");
                com.revolut.feature.security_hub.impl.ui.security_hub.c cVar = this.f178817b;
                cVar.n2(new t0(cVar, (Continuation) null, 5), new whi.b(6));
                return Unit.f186387a;
            default:
                qa7.b it8 = (qa7.b) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (!(it8 instanceof qa7.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f178817b.C1(new TransactionListDestination(new TransactionListDestination.InputData((Clause) new TextLocalisedClause(R$string.security_hub_home_hidden_transactions_title, null, null, 14), (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) new TransactionsListFilterType.ByTransactionsFilter(new u9(true), null, null, 6), (String) null, (AccountId) null, (rhf.h) null, (rhf.g) null, (TransactionDestination) null, (q6) null, (Set) null, (RecurringPaymentAccount) null, (RecurringPaymentFilter) null, false, 49134)));
                return Unit.f186387a;
        }
    }
}
