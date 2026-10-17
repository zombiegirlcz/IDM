package wie;

import com.revolut.feature.credit.models.CreditAccountType;
import com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import she.g;
import zfe.e;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements rie.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f297884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f297885b;

    public a(g productAccountDestinationResolver, e newAccountDestinationResolver) {
        Intrinsics.checkNotNullParameter(productAccountDestinationResolver, "productAccountDestinationResolver");
        Intrinsics.checkNotNullParameter(newAccountDestinationResolver, "newAccountDestinationResolver");
        this.f297884a = productAccountDestinationResolver;
        this.f297885b = newAccountDestinationResolver;
    }

    public static ProductAccountDescriptor$Value.Main d(CreditAccountType creditAccountType) {
        ProductAccountId productAccountIdC;
        if (creditAccountType instanceof CreditAccountType.PayLater) {
            String facilityId = ((CreditAccountType.PayLater) creditAccountType).f70632b;
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            productAccountIdC = new ProductAccountId(facilityId, new CreditAccountType.PayLater(facilityId));
        } else if (creditAccountType instanceof CreditAccountType.CreditCard) {
            productAccountIdC = com.revolut.feature.credit.models.a.b(((CreditAccountType.CreditCard) creditAccountType).f70624b);
        } else if (creditAccountType instanceof CreditAccountType.Loan) {
            String loanId = ((CreditAccountType.Loan) creditAccountType).f70629b;
            Intrinsics.checkNotNullParameter(loanId, "loanId");
            productAccountIdC = new ProductAccountId(loanId, new CreditAccountType.Loan(loanId));
        } else if (creditAccountType instanceof CreditAccountType.Application) {
            CreditAccountType.Application application = (CreditAccountType.Application) creditAccountType;
            productAccountIdC = com.revolut.feature.credit.models.a.a(application.f70621b, application.f70622c);
        } else {
            if (!(creditAccountType instanceof CreditAccountType.EmptyState)) {
                if (creditAccountType instanceof CreditAccountType.Overdraft) {
                    throw new IllegalStateException("Overdraft has no product-account home destination");
                }
                throw new NoWhenBranchMatchedException();
            }
            productAccountIdC = com.revolut.feature.credit.models.a.c(((CreditAccountType.EmptyState) creditAccountType).f70627b);
        }
        return new ProductAccountDescriptor$Value.Main(productAccountIdC, ProductId.CREDIT);
    }

    public final Object c(CreditAccountType creditAccountType, TabAccountsInitialPayload.Action action, gim.c cVar) {
        return this.f297884a.c(d(creditAccountType), action, cVar);
    }
}
