package y45;

import com.revolut.feature.credit.loan.api.LoanApi$Toggles;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class q implements l35.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f310815a;

    public q(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f310815a = featureToggleInteractor;
    }

    public final boolean a(b95.a product) {
        Intrinsics.checkNotNullParameter(product, "product");
        int i = p.f310814a[product.ordinal()];
        if (i == 1 || i == 2) {
            return ((jte.d) this.f310815a).c(LoanApi$Toggles.NewLoanRepaymentFlow.f70069c);
        }
        if (i == 3) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
