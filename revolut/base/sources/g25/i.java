package g25;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.api.CreditApplicationApi$Toggles;
import com.revolut.feature.credit.models.CreditAccountType;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import et6.u1;
import ft3.j1;
import ft3.q0;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.flow.Flow;
import yhm.m;
import zhm.f0;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements a35.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uvl.c f139893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f139894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aq3.a f139895c;
    public final vie.i d;

    public i(uvl.c creditApplicationAccountInteractor, p creditApplicationAccountMapper, s creditApplicationDashboardItemMapper, aq3.a creditApplicationChecklistAvailabilityProvider, o25.e creditDiscoverAccountMapper, vie.i tabCreditPreferencesInteractor) {
        Intrinsics.checkNotNullParameter(creditApplicationAccountInteractor, "creditApplicationAccountInteractor");
        Intrinsics.checkNotNullParameter(creditApplicationAccountMapper, "creditApplicationAccountMapper");
        Intrinsics.checkNotNullParameter(creditApplicationDashboardItemMapper, "creditApplicationDashboardItemMapper");
        Intrinsics.checkNotNullParameter(creditApplicationChecklistAvailabilityProvider, "creditApplicationChecklistAvailabilityProvider");
        Intrinsics.checkNotNullParameter(creditDiscoverAccountMapper, "creditDiscoverAccountMapper");
        Intrinsics.checkNotNullParameter(tabCreditPreferencesInteractor, "tabCreditPreferencesInteractor");
        this.f139893a = creditApplicationAccountInteractor;
        this.f139894b = creditApplicationAccountMapper;
        this.f139895c = creditApplicationChecklistAvailabilityProvider;
        this.d = tabCreditPreferencesInteractor;
    }

    @Override // pfe.b
    public final Flow d(ProductAccountId accountId) throws Throwable {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        boolean zO = o(accountId);
        ProductAccountId.Payload payload = accountId.f89730b;
        w4l.i iVar = w4l.i.f294643c;
        uvl.c cVar = this.f139893a;
        if (!zO) {
            return new u1(cVar.u(iVar), this, 18);
        }
        CreditAccountType.Application application = null;
        CreditAccountType.Application application2 = (CreditAccountType.Application) (!(payload instanceof CreditAccountType.Application) ? null : payload);
        if (application2 == null) {
            try {
                m.Companion companion = yhm.m.INSTANCE;
                throw new IllegalStateException("accountId id=" + accountId.f89729a + " payloadType=" + (payload != null ? payload.getClass().getName() : null) + " must contain " + o0.f186429a.b(CreditAccountType.Application.class) + " payload");
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th10) {
                m.Companion companion2 = yhm.m.INSTANCE;
                Throwable thA = yhm.m.a(yhm.o.a(th10));
                if (thA != null) {
                    hx7.e.n(thA);
                }
            }
        } else {
            application = application2;
        }
        if (application == null) {
            return new go.g(f0.f322471a, 2);
        }
        return ((wr3.b) this.f139895c).a(application.f70622c.getF137852c()) ? new u1(nim.a.v(new g0c.e(cVar.t(iVar), this, application, 15), new g1k.k(4)), this, 17) : new go.g(f0.f322471a, 2);
    }

    @Override // pfe.b
    public final Object f(ProductAccountId productAccountId, Continuation continuation) {
        return nie.e.f215688a;
    }

    @Override // pfe.b
    public final Flow m(ProductAccountId accountId) throws Throwable {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        ProductAccountId.Payload payload = accountId.f89730b;
        CreditAccountType.Application application = null;
        if (!(payload instanceof CreditAccountType.Application)) {
            payload = null;
        }
        CreditAccountType.Application application2 = (CreditAccountType.Application) payload;
        if (application2 == null) {
            try {
                m.Companion companion = yhm.m.INSTANCE;
                String str = accountId.f89729a;
                ProductAccountId.Payload payload2 = accountId.f89730b;
                throw new IllegalStateException("accountId id=" + str + " payloadType=" + (payload2 != null ? payload2.getClass().getName() : null) + " must contain " + o0.f186429a.b(CreditAccountType.Application.class) + " payload");
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th10) {
                m.Companion companion2 = yhm.m.INSTANCE;
                Throwable thA = yhm.m.a(yhm.o.a(th10));
                if (thA != null) {
                    hx7.e.n(thA);
                }
            }
        } else {
            application = application2;
        }
        if (application == null) {
            return new go.g(new Data(null, null, false, 7, null), 2);
        }
        int i = 15;
        return rd0.e.n(nim.a.v(new g0c.e(this.f139893a.t(w4l.i.f294643c), this, application, i), new g1.b(this, i)), h0.f322473a);
    }

    @Override // pfe.b
    public final Object n(ProductAccountId productAccountId, gim.c cVar) throws Throwable {
        String str;
        boolean zO = o(productAccountId);
        ProductAccountId.Payload payload = productAccountId.f89730b;
        if (!zO) {
            return null;
        }
        CreditAccountType.Application application = (CreditAccountType.Application) (!(payload instanceof CreditAccountType.Application) ? null : payload);
        if (application == null) {
            try {
                m.Companion companion = yhm.m.INSTANCE;
                throw new IllegalStateException("accountId id=" + productAccountId.f89729a + " payloadType=" + (payload != null ? payload.getClass().getName() : null) + " must contain " + o0.f186429a.b(CreditAccountType.Application.class) + " payload");
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th10) {
                m.Companion companion2 = yhm.m.INSTANCE;
                Throwable thA = yhm.m.a(yhm.o.a(th10));
                if (thA != null) {
                    hx7.e.n(thA);
                }
                application = null;
            }
        }
        if (application == null || (str = application.f70621b) == null) {
            return null;
        }
        return new SlotContext(akd.s.CREDIT_APPLICATION, y0.b(str));
    }

    public final boolean o(ProductAccountId accountId) {
        q0 q0Var;
        gte.a aVar = ((wr3.b) this.f139895c).f299513a;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        ProductAccountId.Payload payload = accountId.f89730b;
        j1 j1VarE2 = null;
        CreditAccountType.Application application = payload instanceof CreditAccountType.Application ? (CreditAccountType.Application) payload : null;
        if (application != null && (q0Var = application.f70622c) != null) {
            j1VarE2 = q0Var.getF137852c();
        }
        switch (j1VarE2 == null ? -1 : wr3.a.f299512a[j1VarE2.ordinal()]) {
            case -1:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                return false;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return ((jte.d) aVar).c(CreditApplicationApi$Toggles.CreditMortgageOnboardingChecklist.f66188c);
            case 2:
                return ((jte.d) aVar).c(CreditApplicationApi$Toggles.CreditMortgageRefinancingOnboardingChecklist.f66189c);
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
        }
    }
}
