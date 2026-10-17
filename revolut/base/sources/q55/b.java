package q55;

import com.revolut.feature.credit.models.CreditAccountType;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import m35.g;
import pfe.i;
import pkg.e;
import w4l.h;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f242293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y45.i f242294b;

    public b(g loanDisclaimerFooterMapper, y45.i loanProductInteractor) {
        Intrinsics.checkNotNullParameter(loanDisclaimerFooterMapper, "loanDisclaimerFooterMapper");
        Intrinsics.checkNotNullParameter(loanProductInteractor, "loanProductInteractor");
        this.f242293a = loanDisclaimerFooterMapper;
        this.f242294b = loanProductInteractor;
    }

    @Override // pfe.i
    public final Flow t(ProductAccountDescriptor$Value descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        ProductAccountId.Payload payload = descriptor.getF89728b().f89730b;
        CreditAccountType.Loan loan = payload instanceof CreditAccountType.Loan ? (CreditAccountType.Loan) payload : null;
        if (loan == null) {
            return new go.g(f0.f322471a, 2);
        }
        return new e(rd0.e.b(m70.a.g(this.f242294b.a(loan.f70629b, h.f294642c), null, null, 3)), this, 9);
    }
}
