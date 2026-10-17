package wr3;

import com.revolut.feature.credit.application.api.CreditApplicationApi$Toggles;
import ft3.j1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements aq3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f299513a;

    public b(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f299513a = featureToggleInteractor;
    }

    public final boolean a(j1 productType) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        int i = a.f299512a[productType.ordinal()];
        gte.a aVar = this.f299513a;
        switch (i) {
            case 1:
                return ((jte.d) aVar).c(CreditApplicationApi$Toggles.CreditApplicationMortgageHomeScreen.f66182c);
            case 2:
                return ((jte.d) aVar).c(CreditApplicationApi$Toggles.CreditApplicationMortgageRefinancingHomeScreen.f66183c);
            case 3:
                return ((jte.d) aVar).c(CreditApplicationApi$Toggles.CreditApplicationCreditCardHomeScreen.f66180c);
            case 4:
                return ((jte.d) aVar).c(CreditApplicationApi$Toggles.CreditApplicationLoanHomeScreen.f66181c);
            case 5:
            case 6:
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
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
