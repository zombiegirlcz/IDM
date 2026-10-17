package m15;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.credit.help.api.navigation.CreditHelpNavigationDestination;
import com.revolut.feature.credit.help.api.navigation.FinancialDifficultiesNavigationDestination;
import com.revolut.feature.credit.help.api.navigation.self_service.ForbearanceSelfServiceInputData;
import com.revolut.feature.credit.help.impl.ui.financial_difficulties.legacy.FinancialDifficultiesScreen;
import com.revolut.feature.credit.help.impl.ui.financial_difficulties.legacy.FinancialDifficultiesScreenContract$InputData;
import com.revolut.feature.credit.help.impl.ui.financial_difficulties.self_service.FinancialDifficultiesController;
import com.revolut.feature.credit.help.impl.ui.financial_difficulties.self_service.FinancialDifficultiesControllerContract$InputData;
import com.revolut.kompot.common.flow.WrapperFlowImpl;
import ft3.j1;
import gc0.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ux4.j;
import ux4.k;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements ohi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f201235a = 0;

    @Override // nhi.f
    public final g c(e descriptor) {
        j jVar;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof h15.a)) {
            return null;
        }
        h15.a aVar = (h15.a) descriptor;
        ForbearanceSelfServiceInputData forbearanceSelfServiceInputData = aVar.f148462a;
        String str = forbearanceSelfServiceInputData.f70006b;
        j1 j1Var = forbearanceSelfServiceInputData.f70005a;
        int i = h15.b.f148463a[j1Var.ordinal()];
        if (i == 1) {
            jVar = j.LOAN;
        } else {
            if (i != 2) {
                throw new IllegalStateException(("Self service forbearance is not yet supported for " + j1Var + " product").toString());
            }
            jVar = j.CREDIT_CARD;
        }
        WrapperFlowImpl wrapperFlowImplB = c.b(new FinancialDifficultiesController(new FinancialDifficultiesControllerContract$InputData(new k(str, jVar))), new aab.b(23));
        wrapperFlowImplB.j2(new a(wrapperFlowImplB, 0));
        return aVar.a(wrapperFlowImplB);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        CreditHelpNavigationDestination creditHelpNavigationDestination = destination instanceof CreditHelpNavigationDestination ? (CreditHelpNavigationDestination) destination : null;
        if (creditHelpNavigationDestination == null) {
            return null;
        }
        if (creditHelpNavigationDestination instanceof FinancialDifficultiesNavigationDestination) {
            return new FinancialDifficultiesScreen(new FinancialDifficultiesScreenContract$InputData(((FinancialDifficultiesNavigationDestination) creditHelpNavigationDestination).f70004a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
