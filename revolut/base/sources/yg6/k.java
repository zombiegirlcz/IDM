package yg6;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.feature.external_accounts.api.model.LinkedAccountPayload;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.pocket_details.api.R$string;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.transactions.api.navigation.TransactionDestination;
import com.revolut.feature.transactions.api.navigation.TransactionListDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import oqk.g0;
import org.jmrtd.lds.LDSFile;
import sfe.z;
import tof.i7;
import tof.q6;
import tof.u9;
import tof.ua;
import vkm.v1;
import xec.c0;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements pfe.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ssi.o f313552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.n f313553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oe6.a f313554c;
    public final h d;
    public final usc.a e;

    public k(ssi.o transactionsWidgetUiModel, a accessExpiredWidgetMapper, b accessExpiringWidgetMapper, c confirmLinkedAccountWidgetMapper, wsg.n walletInteractor, oe6.a externalInstitutionsInteractor, h linkedAccountDataMapper, r transactionFilterProvider, usc.a accountSwitchInteractor) {
        Intrinsics.checkNotNullParameter(transactionsWidgetUiModel, "transactionsWidgetUiModel");
        Intrinsics.checkNotNullParameter(accessExpiredWidgetMapper, "accessExpiredWidgetMapper");
        Intrinsics.checkNotNullParameter(accessExpiringWidgetMapper, "accessExpiringWidgetMapper");
        Intrinsics.checkNotNullParameter(confirmLinkedAccountWidgetMapper, "confirmLinkedAccountWidgetMapper");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(externalInstitutionsInteractor, "externalInstitutionsInteractor");
        Intrinsics.checkNotNullParameter(linkedAccountDataMapper, "linkedAccountDataMapper");
        Intrinsics.checkNotNullParameter(transactionFilterProvider, "transactionFilterProvider");
        Intrinsics.checkNotNullParameter(accountSwitchInteractor, "accountSwitchInteractor");
        this.f313552a = transactionsWidgetUiModel;
        this.f313553b = walletInteractor;
        this.f313554c = externalInstitutionsInteractor;
        this.d = linkedAccountDataMapper;
        this.e = accountSwitchInteractor;
    }

    @Override // pfe.b
    public final Flow d(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        ProductAccountId.Payload payload = accountId.f89730b;
        String str = accountId.f89729a;
        LinkedAccountPayload linkedAccountPayload = payload instanceof LinkedAccountPayload ? (LinkedAccountPayload) payload : null;
        String str2 = linkedAccountPayload != null ? linkedAccountPayload.f72220a : null;
        String str3 = linkedAccountPayload != null ? linkedAccountPayload.f72221b : null;
        if (str3 == null) {
            str3 = "";
        }
        i7.c cVar = i7.Companion;
        i7[] i7VarArr = {new u9(false), new ua(str)};
        cVar.getClass();
        return new t38.e(rd0.e.b(((g0) this.f313552a).d(zi0.c.P(new ssi.n(i7.c.a(i7VarArr), null, null, zhm.u.c(new tof.t(str, 1)), new TransactionListDestination(new TransactionListDestination.InputData((Clause) new TextLocalisedClause(R$string.revolut_accounts_home_transactions_title, null, null, 14), (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) new TransactionsListFilterType.ByAccounts(new ProductAccountDescriptor$Value.Main(accountId, ProductId.LINKED), (TransactionContext) null), (String) null, (AccountId) null, (rhf.h) null, (rhf.g) null, (TransactionDestination) null, (q6) null, (Set) null, (RecurringPaymentAccount) null, (RecurringPaymentFilter) null, false, 65518)), null, null, null, null, 998), false, null, 3), false)), 24, rd0.e.b(((xg6.j) this.f313554c).j(w4l.h.f294642c)), new j(str2, linkedAccountPayload, this, str3, null));
    }

    @Override // pfe.b
    public final Object i(ProductAccountId productAccountId, gim.c cVar) {
        HomeFeedWidgetContext.Linked.Companion companion = HomeFeedWidgetContext.Linked.INSTANCE;
        String pocketId = productAccountId.f89729a;
        ProductAccountId.Payload payload = productAccountId.f89730b;
        LinkedAccountPayload linkedAccountPayload = payload instanceof LinkedAccountPayload ? (LinkedAccountPayload) payload : null;
        String str = linkedAccountPayload != null ? linkedAccountPayload.f72221b : null;
        companion.getClass();
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        return new z(new HomeFeedWidgetContext.Linked(null, pocketId, str, 1, null));
    }

    @Override // pfe.b
    public final Flow m(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        io3.i iVar = io3.i.EXTERNAL;
        wsg.n nVar = this.f313553b;
        w4l.h hVar = w4l.h.f294642c;
        akg.n nVarV = nim.a.v(rd0.e.b(osg.b.g(nVar, hVar, null, null, iVar, null, null, null, LDSFile.EF_DG4_TAG)), new ye1.m(17));
        xg6.j jVar = (xg6.j) this.f313554c;
        vkm.d dVarB = rd0.e.b(jVar.i(hVar, oe6.b.f224551a));
        vkm.d dVarB2 = rd0.e.b(jVar.j(hVar));
        return nim.a.v(nim.a.u(new y83.d((Continuation) null, this, 23), u0.m(u0.i(nVarV, dVarB, dVarB2), new v1(new c0(this.e, null, 3)))), new cia.b(accountId, 10));
    }

    @Override // pfe.b
    public final Object n(ProductAccountId productAccountId, gim.c cVar) {
        return new SlotContext(akd.s.LINKED);
    }
}
