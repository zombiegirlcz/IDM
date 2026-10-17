package aug;

import com.revolut.retail.trading.core.domain.account_closure.AccountClosureBackendRequested;
import com.revolut.retail.trading.core.domain.account_closure.AccountClosureStatus;
import java.time.Instant;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import wel.e;
import wel.i;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f9819b;

    public /* synthetic */ a(d dVar, int i) {
        this.f9818a = i;
        this.f9819b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f9818a) {
            case 0:
                e portfolio = (e) obj2;
                Intrinsics.checkNotNullParameter(portfolio, "portfolio");
                DateTime dateTime = portfolio.f296823j;
                Instant instantOfEpochMilli = dateTime != null ? Instant.ofEpochMilli(dateTime.getMillis()) : null;
                d dVar = this.f9819b;
                xtg.e eVar = dVar.f9824a;
                i iVar = portfolio.f296819b;
                String portfolioId = portfolio.f296818a;
                int i = b.f9820a[iVar.ordinal()];
                if (i == 1) {
                    return zi0.c.j(new AccountClosureStatus.AccountClosed(instantOfEpochMilli));
                }
                if (i == 2 || i == 3) {
                    eVar.getClass();
                    Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                    return nim.a.w(eVar.f.f(portfolioId, true), new as9.a(dVar, portfolio, 7));
                }
                if (i != 4 && i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                eVar.getClass();
                Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                return nim.a.w(eVar.f308819h.f(portfolioId, false), new a(dVar, 1));
            default:
                AccountClosureBackendRequested backendRequestedAccountClosure = (AccountClosureBackendRequested) obj2;
                Intrinsics.checkNotNullParameter(backendRequestedAccountClosure, "backendRequestedAccountClosure");
                this.f9819b.getClass();
                return backendRequestedAccountClosure.f104483a ? new AccountClosureStatus.BackendRequestedAccountClosure(backendRequestedAccountClosure.f104484b) : AccountClosureStatus.NoAccountClosure.f104506a;
        }
    }
}
