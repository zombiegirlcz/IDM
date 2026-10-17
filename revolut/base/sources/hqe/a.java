package hqe;

import akd.s;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.data.model.Data;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.teen.accounts.api.model.TeenAccountPayload;
import com.revolut.feature.transactions.api.navigation.TransactionDestination;
import com.revolut.feature.transactions.api.navigation.TransactionListDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import hp3.r;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import sfe.a0;
import tof.hc;
import tof.i7;
import tof.q6;
import tof.ua;
import vkm.q;
import yhm.m;
import zh9.u0;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.y0;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements pfe.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.b f154665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f154666b;

    public a(wsg.b newWalletsInteractor, o teenProductAccountsSourceDelegate) {
        Intrinsics.checkNotNullParameter(newWalletsInteractor, "newWalletsInteractor");
        Intrinsics.checkNotNullParameter(teenProductAccountsSourceDelegate, "teenProductAccountsSourceDelegate");
        this.f154665a = newWalletsInteractor;
        this.f154666b = teenProductAccountsSourceDelegate;
    }

    public static ssi.n o(i7 i7Var, List list, ProductAccountId productAccountId) {
        return new ssi.n(i7Var, null, null, list, new TransactionListDestination(new TransactionListDestination.InputData((Clause) null, (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) new TransactionsListFilterType.ByTransactionsFilter(i7Var, null, null, 6), (String) null, (AccountId) null, (rhf.h) null, rhf.g.TEEN_HOME, (TransactionDestination) null, (q6) null, (Set) null, (RecurringPaymentAccount) null, (RecurringPaymentFilter) null, false, 65263)), null, null, new ProductAccountDescriptor$Value.Main(productAccountId, ProductId.TEEN), null, 870);
    }

    @Override // pfe.b
    public final Flow b(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        ProductAccountId.Payload payload = accountId.f89730b;
        TeenAccountPayload teenAccountPayload = payload instanceof TeenAccountPayload ? (TeenAccountPayload) payload : null;
        if (teenAccountPayload == null) {
            return null;
        }
        if (teenAccountPayload instanceof TeenAccountPayload.Pocket) {
            TeenAccountPayload.Pocket pocket = (TeenAccountPayload.Pocket) teenAccountPayload;
            String str = pocket.f90327c;
            return new go.g(new Data(o(new ua(str), u.c(new hc(pocket.f90326b, str)), accountId), null, false, 6, null), 2);
        }
        if (teenAccountPayload instanceof TeenAccountPayload.AllAccounts) {
            return nim.a.v(this.f154665a.b(w4l.h.f294642c), new hm3.b(this, (TeenAccountPayload.AllAccounts) teenAccountPayload, accountId, 18));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // pfe.b
    public final Flow d(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return new go.g(f0.f322471a, 2);
    }

    @Override // pfe.b
    public final Object i(ProductAccountId productAccountId, gim.c cVar) {
        return a0.f262402a;
    }

    @Override // pfe.b
    public final Flow m(ProductAccountId accountId) throws Throwable {
        Object objA;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        try {
            m.Companion companion = yhm.m.INSTANCE;
            ProductAccountId.Payload payload = accountId.f89730b;
            Intrinsics.i(payload, "null cannot be cast to non-null type com.revolut.feature.teen.accounts.api.model.TeenAccountPayload");
            objA = (TeenAccountPayload) payload;
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
        if (objA instanceof yhm.n) {
            objA = null;
        }
        TeenAccountPayload payload2 = (TeenAccountPayload) objA;
        if (payload2 == null) {
            return null;
        }
        o oVar = this.f154666b;
        wsg.b bVar = oVar.f154689a;
        xqe.b bVar2 = oVar.f154690b;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(payload2, "payload");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        int i = 29;
        int i2 = 2;
        if (payload2 instanceof TeenAccountPayload.Pocket) {
            TeenAccountPayload.Pocket pocket = (TeenAccountPayload.Pocket) payload2;
            String value = pocket.f90325a;
            Intrinsics.checkNotNullParameter(value, "value");
            Flow flowE = boh.f.e(bVar.d(pocket.f90326b, loadingStrategy), new k(oVar, i2));
            h0 h0Var = h0.f322473a;
            return nim.a.v(u0.i(rd0.e.n(flowE, h0Var), rd0.e.n(bVar2.a(value, loadingStrategy), h0Var), new ahe.l(oVar.f.k(), 5)), new g31.e(oVar, i, accountId, pocket));
        }
        if (!(payload2 instanceof TeenAccountPayload.AllAccounts)) {
            throw new NoWhenBranchMatchedException();
        }
        TeenAccountPayload.AllAccounts allAccounts = (TeenAccountPayload.AllAccounts) payload2;
        String value2 = allAccounts.f90322a;
        Intrinsics.checkNotNullParameter(value2, "value");
        Flow flowE2 = boh.f.e(bVar.d(allAccounts.f90323b, loadingStrategy), new k(oVar, i2));
        h0 h0Var2 = h0.f322473a;
        return nim.a.v(boh.f.e(u0.i(rd0.e.n(flowE2, h0Var2), rd0.e.n(bVar2.a(value2, loadingStrategy), h0Var2), q.q(nim.a.v(bVar.e(w4l.j.f294644c), new r(i)))), new j(oVar, value2, 0)), new hm3.b(oVar, accountId, 19));
    }

    @Override // pfe.b
    public final Object n(ProductAccountId productAccountId, gim.c cVar) {
        String str;
        ProductAccountId.Payload payload = productAccountId.f89730b;
        TeenAccountPayload teenAccountPayload = payload instanceof TeenAccountPayload ? (TeenAccountPayload) payload : null;
        if (teenAccountPayload == null) {
            return null;
        }
        if (teenAccountPayload instanceof TeenAccountPayload.AllAccounts) {
            str = ((TeenAccountPayload.AllAccounts) teenAccountPayload).f90322a;
        } else {
            if (!(teenAccountPayload instanceof TeenAccountPayload.Pocket)) {
                throw new NoWhenBranchMatchedException();
            }
            str = ((TeenAccountPayload.Pocket) teenAccountPayload).f90325a;
        }
        return new SlotContext(s.TEEN, y0.b(str));
    }
}
