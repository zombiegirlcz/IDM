package a3j;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.shared.beneficiary.api.navigation.BeneficiaryCreationKompotFinishMode;
import com.revolut.retail.feature.beneficiary.api.navigation.BankBeneficiaryDetailsDestination;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationDestination;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationKompotInputData;
import com.revolut.retail.feature.beneficiary.impl.ui.bank_beneficiary_details.BankBeneficiaryDetailsScreen;
import com.revolut.retail.feature.beneficiary.impl.ui.bank_beneficiary_details.BankBeneficiaryDetailsScreenContract$InputData;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.BeneficiaryCreationFlow;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x2j.a f1166a;

    public a(x2j.a destinationTransformer) {
        Intrinsics.checkNotNullParameter(destinationTransformer, "destinationTransformer");
        this.f1166a = destinationTransformer;
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof com.revolut.retail.feature.beneficiary.api.navigation.a) {
            com.revolut.retail.feature.beneficiary.api.navigation.a aVar = (com.revolut.retail.feature.beneficiary.api.navigation.a) descriptor;
            return aVar.a(new BeneficiaryCreationFlow(new BeneficiaryCreationKompotInputData(BeneficiaryCreationKompotFinishMode.KompotResult.f86048a, aVar.b())));
        }
        super.c(descriptor);
        return null;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof BankBeneficiaryDetailsDestination) {
            BankBeneficiaryDetailsDestination bankBeneficiaryDetailsDestination = (BankBeneficiaryDetailsDestination) destination;
            return new BankBeneficiaryDetailsScreen(new BankBeneficiaryDetailsScreenContract$InputData(bankBeneficiaryDetailsDestination.getF99619a(), bankBeneficiaryDetailsDestination.getF99620b(), bankBeneficiaryDetailsDestination.getF99621c()));
        }
        if (!(destination instanceof BeneficiaryCreationDestination)) {
            return null;
        }
        BeneficiaryCreationDestination beneficiaryCreationDestination = (BeneficiaryCreationDestination) destination;
        this.f1166a.a(beneficiaryCreationDestination);
        return new BeneficiaryCreationFlow(new BeneficiaryCreationKompotInputData(beneficiaryCreationDestination.getF99622a(), beneficiaryCreationDestination.getF99623b()));
    }
}
