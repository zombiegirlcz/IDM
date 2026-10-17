package u25;

import akd.s;
import au.c0;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.models.CreditAccountType;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import ft3.w;
import g25.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.time.b;
import kotlinx.coroutines.flow.Flow;
import sfe.z;
import tx0.p4;
import vkm.q;
import vkm.q0;
import vkm.y;
import w4l.k;
import x15.r;
import y45.n;
import y45.o;
import yhm.m;
import zh9.u0;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y45.i f276555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l35.b f276556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w25.a f276557c;
    public final w25.h d;
    public final y45.h e;
    public final n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f276558g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p f276559h;
    public final o25.i i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final vie.h f276560j;

    public i(y45.i loanProductInteractor, l35.b loanInteractor, w25.a loanAccountItemMapper, w25.h loanSectionsItemMapper, y45.h loanProductFeatureTogglesInteractor, n mortgageProductFeatureTogglesInteractor, o refinancingMortgageProductFeatureTogglesInteractor, p creditApplicationAccountMapper, o25.i emptyStateDataSource, vie.h tabCreditAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(loanProductInteractor, "loanProductInteractor");
        Intrinsics.checkNotNullParameter(loanInteractor, "loanInteractor");
        Intrinsics.checkNotNullParameter(loanAccountItemMapper, "loanAccountItemMapper");
        Intrinsics.checkNotNullParameter(loanSectionsItemMapper, "loanSectionsItemMapper");
        Intrinsics.checkNotNullParameter(loanProductFeatureTogglesInteractor, "loanProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(mortgageProductFeatureTogglesInteractor, "mortgageProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(refinancingMortgageProductFeatureTogglesInteractor, "refinancingMortgageProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(creditApplicationAccountMapper, "creditApplicationAccountMapper");
        Intrinsics.checkNotNullParameter(emptyStateDataSource, "emptyStateDataSource");
        Intrinsics.checkNotNullParameter(tabCreditAvailabilityInteractor, "tabCreditAvailabilityInteractor");
        this.f276555a = loanProductInteractor;
        this.f276556b = loanInteractor;
        this.f276557c = loanAccountItemMapper;
        this.d = loanSectionsItemMapper;
        this.e = loanProductFeatureTogglesInteractor;
        this.f = mortgageProductFeatureTogglesInteractor;
        this.f276558g = refinancingMortgageProductFeatureTogglesInteractor;
        this.f276559h = creditApplicationAccountMapper;
        this.i = emptyStateDataSource;
        this.f276560j = tabCreditAvailabilityInteractor;
    }

    @Override // pfe.b
    public final Flow d(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return new tse.c(rd0.e.b(kli.a.h(this.f276555a.a(accountId.f89729a, w4l.h.f294642c), l35.b.e(this.f276556b, accountId.f89729a))), this, 9);
    }

    @Override // a35.i
    public final Flow e(List products, List applicationAccounts) {
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(applicationAccounts, "applicationAccounts");
        return nim.a.v(this.i.o(com.revolut.feature.credit.models.a.c(w.INSTANCE)), new toh.h(this, 8, products, applicationAccounts));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // pfe.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.revolut.feature.tab.accounts.models.ProductAccountId r10, kotlin.coroutines.Continuation r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u25.i.f(com.revolut.feature.tab.accounts.models.ProductAccountId, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // pfe.b
    public final Object i(ProductAccountId productAccountId, gim.c cVar) {
        HomeFeedWidgetContext.Loan.Companion companion = HomeFeedWidgetContext.Loan.INSTANCE;
        String loanId = productAccountId.f89729a;
        companion.getClass();
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        return new z(new HomeFeedWidgetContext.Loan(null, loanId, 1, null));
    }

    @Override // a35.i
    public final vkm.f k(k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Continuation continuation = null;
        Flow flowH = xam.a.h(new c0(continuation, this, loadingStrategy, 25), l());
        tc6.d dVar = new tc6.d(3, 16, continuation);
        h0 h0Var = h0.f322473a;
        y yVarE = rd0.e.e(flowH, h0Var, dVar);
        r rVar = r.f302298a;
        q0 q0VarN = rd0.e.n(n14.k.s(yVarE, rVar), h0Var);
        Data data = new Data(rVar, null, false, 6, null);
        b.Companion companion = kotlin.time.b.INSTANCE;
        return zi0.c.M(q0VarN, data, kotlin.time.c.h(1000L, pkm.e.MILLISECONDS), "LoanProduct");
    }

    @Override // a35.i
    public final Flow l() {
        return nim.a.v(u0.i(this.e.j(), this.f.j(), this.f276558g.j()), new u21.b(11));
    }

    @Override // pfe.b
    public final Flow m(ProductAccountId accountId) throws Throwable {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        ProductAccountId.Payload payload = accountId.f89730b;
        CreditAccountType.Loan loan = null;
        if (!(payload instanceof CreditAccountType.Loan)) {
            payload = null;
        }
        CreditAccountType.Loan loan2 = (CreditAccountType.Loan) payload;
        if (loan2 == null) {
            try {
                m.Companion companion = m.INSTANCE;
                String str = accountId.f89729a;
                ProductAccountId.Payload payload2 = accountId.f89730b;
                throw new IllegalStateException("accountId id=" + str + " payloadType=" + (payload2 != null ? payload2.getClass().getName() : null) + " must contain " + o0.f186429a.b(CreditAccountType.Loan.class) + " payload");
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th10) {
                m.Companion companion2 = m.INSTANCE;
                Throwable thA = m.a(yhm.o.a(th10));
                if (thA != null) {
                    hx7.e.n(thA);
                }
            }
        } else {
            loan = loan2;
        }
        if (loan == null) {
            return new go.g(new Data(null, null, false, 7, null), 2);
        }
        efm.r map = nim.a.w(this.f276555a.a(loan.f70629b, w4l.i.f294643c), new e(1, 0, w25.a.class, this.f276557c, "mapToProductHome", "mapToProductHome(Lcom/revolut/feature/credit/loan/api/models/rev10/Loan;)Lcom/revolut/feature/tab/accounts/api/model/ProductAccount$ValueItem;")).map(new u21.a(12, new p4(loan, 17)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return rd0.e.n(rd0.e.b(map), h0.f322473a);
    }

    @Override // pfe.b
    public final Object n(ProductAccountId productAccountId, gim.c cVar) throws Throwable {
        String str;
        ProductAccountId.Payload payload = productAccountId.f89730b;
        if (!(payload instanceof CreditAccountType.Loan)) {
            payload = null;
        }
        CreditAccountType.Loan loan = (CreditAccountType.Loan) payload;
        if (loan == null) {
            try {
                m.Companion companion = m.INSTANCE;
                String str2 = productAccountId.f89729a;
                ProductAccountId.Payload payload2 = productAccountId.f89730b;
                throw new IllegalStateException("accountId id=" + str2 + " payloadType=" + (payload2 != null ? payload2.getClass().getName() : null) + " must contain " + o0.f186429a.b(CreditAccountType.Loan.class) + " payload");
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th10) {
                m.Companion companion2 = m.INSTANCE;
                Throwable thA = m.a(yhm.o.a(th10));
                if (thA != null) {
                    hx7.e.n(thA);
                }
                loan = null;
            }
        }
        if (loan == null || (str = loan.f70629b) == null) {
            return null;
        }
        return new SlotContext(s.LOAN, y0.b(str));
    }

    public final ArrayList o(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(this.f276559h.d((x15.e) it8.next()));
        }
        return arrayList2;
    }

    public final Flow p() {
        y45.h hVar = this.e;
        return rd0.e.e(boh.f.e(u0.l(q.q(nim.a.v(hVar.m(), new y25.d(23))), q.q(nim.a.v(hVar.m(), new y25.d(21))), q.q(nim.a.v(hVar.m(), new y25.d(22))), this.f.d(), this.f276558g.d()), new p4(this, 18)), h0.f322473a, new tc6.d(3, 17, null));
    }
}
