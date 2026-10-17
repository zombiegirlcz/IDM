package o25;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.models.CreditAccountType;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import ft3.q0;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.flow.Flow;
import n14.k;
import n1g.p;
import o17.x;
import yhm.m;
import yhm.o;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements a35.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kw3.a f221494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kw3.b f221495b;

    public i(kw3.a creditDiscoverContentInteractor, kw3.b creditDiscoverUiStateInteractor, e creditDiscoverAccountMapper) {
        Intrinsics.checkNotNullParameter(creditDiscoverContentInteractor, "creditDiscoverContentInteractor");
        Intrinsics.checkNotNullParameter(creditDiscoverUiStateInteractor, "creditDiscoverUiStateInteractor");
        Intrinsics.checkNotNullParameter(creditDiscoverAccountMapper, "creditDiscoverAccountMapper");
        this.f221494a = creditDiscoverContentInteractor;
        this.f221495b = creditDiscoverUiStateInteractor;
    }

    @Override // pfe.b
    public final Flow a(ProductAccountId accountId) throws Throwable {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        ProductAccountId.Payload payload = accountId.f89730b;
        if (!(payload instanceof CreditAccountType.EmptyState)) {
            payload = null;
        }
        CreditAccountType.EmptyState emptyState = (CreditAccountType.EmptyState) payload;
        if (emptyState == null) {
            try {
                m.Companion companion = m.INSTANCE;
                String str = accountId.f89729a;
                ProductAccountId.Payload payload2 = accountId.f89730b;
                throw new IllegalStateException("accountId id=" + str + " payloadType=" + (payload2 != null ? payload2.getClass().getName() : null) + " must contain " + o0.f186429a.b(CreditAccountType.EmptyState.class) + " payload");
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th10) {
                m.Companion companion2 = m.INSTANCE;
                Throwable thA = m.a(o.a(th10));
                if (thA != null) {
                    hx7.e.n(thA);
                }
                emptyState = null;
            }
        }
        if (emptyState == null) {
            return new go.g(new zfe.c(f0.f322471a, null), 2);
        }
        q0 q0Var = emptyState.f70627b;
        return new p(new t38.e(rd0.e.n(this.f221494a.a(q0Var.getF137852c(), q0Var.getF137851b(), w4l.h.f294642c), h0.f322473a), 24, this.f221495b.f190210a, new n8a.g(3, 1, null)), this, 24);
    }

    @Override // pfe.b
    public final Flow d(ProductAccountId accountId) throws Throwable {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        hx7.e.n(new IllegalStateException("CreditEmptyStateAccountDataSource: sectionsFlow is not supported for discover items"));
        return new go.g(f0.f322471a, 2);
    }

    public final Flow o(ProductAccountId accountId) throws Throwable {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        ProductAccountId.Payload payload = accountId.f89730b;
        CreditAccountType.EmptyState emptyState = null;
        CreditAccountType.EmptyState emptyState2 = (CreditAccountType.EmptyState) (!(payload instanceof CreditAccountType.EmptyState) ? null : payload);
        if (emptyState2 == null) {
            try {
                m.Companion companion = m.INSTANCE;
                throw new IllegalStateException("accountId id=" + accountId.f89729a + " payloadType=" + (payload != null ? payload.getClass().getName() : null) + " must contain " + o0.f186429a.b(CreditAccountType.EmptyState.class) + " payload");
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th10) {
                m.Companion companion2 = m.INSTANCE;
                Throwable thA = m.a(o.a(th10));
                if (thA != null) {
                    hx7.e.n(thA);
                }
            }
        } else {
            emptyState = emptyState2;
        }
        if (emptyState == null) {
            od0.i.Companion.getClass();
            return new go.g(new Data(od0.i.f224256b, null, false, 6, null), 2);
        }
        q0 q0Var = emptyState.f70627b;
        return k.p(boh.f.e(this.f221494a.a(q0Var.getF137852c(), q0Var.getF137851b(), w4l.h.f294642c), new x(this, 6)), new x(7));
    }
}
