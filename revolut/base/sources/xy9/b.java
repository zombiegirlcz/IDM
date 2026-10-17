package xy9;

import com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType;
import com.revolut.feature.shared.beneficiary.api.navigation.BeneficiaryCreationKompotFinishMode;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.feature.transfer.models.ScannedBillDetails;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationDestination;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationKompotInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends ry9.b {
    @Override // ry9.b
    public final boolean Z2(SendFromClipboardType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (!(type instanceof SendFromClipboardType.BankTransferFields)) {
            return false;
        }
        SendFromClipboardType.BankTransferFields bankTransferFields = (SendFromClipboardType.BankTransferFields) type;
        A2(new BeneficiaryCreationDestination(new BeneficiaryCreationKompotFinishMode.NavigateToTransfer.Default((TransferMoneyPocket) null, (ScannedBillDetails) null, (String) null, 15), new BeneficiaryCreationKompotInputData.CreationConfiguration.DefaultCreation(bankTransferFields.f79698c, bankTransferFields.d, bankTransferFields.f79697b, null, bankTransferFields.f79696a, null, null, 104)));
        return true;
    }
}
