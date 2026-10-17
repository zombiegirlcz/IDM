package wj7;

import com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.CFACInsuranceExpenseDetailsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public interface m extends dli.b, zki.h {
    static void C0(m mVar, nj7.a configuration) {
        com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.b bVar = (com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.b) mVar;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        oki.h.v2(bVar.u, new CFACInsuranceExpenseDetailsScreenContract$ModalStep.BottomSheet(configuration, null), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }
}
