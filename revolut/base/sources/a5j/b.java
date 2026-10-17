package a5j;

import com.revolut.domain.models.beneficiary.BeneficiaryVerification;
import com.revolut.domain.models.beneficiary.ConfirmationResult;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationKompotInputData;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.BeneficiaryCreationFlowContract$CopState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    public static String a(BeneficiaryCreationKompotInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        BeneficiaryCreationKompotInputData.CreationConfiguration creationConfiguration = inputData.f99625b;
        if (creationConfiguration instanceof BeneficiaryCreationKompotInputData.CreationConfiguration.Edit) {
            return ((BeneficiaryCreationKompotInputData.CreationConfiguration.Edit) creationConfiguration).f99637a.f132329a;
        }
        return null;
    }

    public static BeneficiaryCreationFlowContract$CopState b(ConfirmationResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        String str = result.f60302a;
        return new BeneficiaryCreationFlowContract$CopState(str != null ? new BeneficiaryVerification(str, result.f60303b) : null);
    }
}
