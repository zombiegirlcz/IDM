package af2;

import com.revolut.feature.apm.upi.api.UpiFeatureConfig;
import com.revolut.feature.apm.upi.impl.flow.UpiTransferFlow;
import com.revolut.feature.apm.upi.impl.flow.UpiTransferFlowContract$InputData;
import com.revolut.feature.apm.upi.impl.flow.UpiTransferFlowContract$Recipient;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h {
    public final UpiTransferFlow a(UpiFeatureConfig.Destination.Transfer transferData) {
        UpiTransferFlowContract$InputData upiTransferFlowContract$InputData;
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        UpiFeatureConfig.Destination.Transfer.InputData inputData = transferData.f62940a;
        if (inputData instanceof UpiFeatureConfig.Destination.Transfer.InputData.ToAlias) {
            UpiFeatureConfig.Destination.Transfer.InputData.ToAlias toAlias = (UpiFeatureConfig.Destination.Transfer.InputData.ToAlias) inputData;
            upiTransferFlowContract$InputData = new UpiTransferFlowContract$InputData(new UpiTransferFlowContract$Recipient.Alias(toAlias.f62943a, toAlias.f62944b, toAlias.f62946g), toAlias.f62945c, toAlias.d, transferData.f62941b, toAlias.e, toAlias.f, toAlias.f62947h, transferData.d, transferData.f62942c, 8);
        } else if (inputData instanceof UpiFeatureConfig.Destination.Transfer.InputData.ToBeneficiary) {
            upiTransferFlowContract$InputData = new UpiTransferFlowContract$InputData(new UpiTransferFlowContract$Recipient.BankBeneficiary(((UpiFeatureConfig.Destination.Transfer.InputData.ToBeneficiary) inputData).f62948a), null, null, transferData.f62941b, null, null, null, transferData.d, transferData.f62942c, 462);
        } else {
            if (!(inputData instanceof UpiFeatureConfig.Destination.Transfer.InputData.ToMerchant)) {
                throw new NoWhenBranchMatchedException();
            }
            UpiFeatureConfig.Destination.Transfer.InputData.ToMerchant toMerchant = (UpiFeatureConfig.Destination.Transfer.InputData.ToMerchant) inputData;
            upiTransferFlowContract$InputData = new UpiTransferFlowContract$InputData(new UpiTransferFlowContract$Recipient.UpiMerchant(toMerchant.f62949a, toMerchant.f), toMerchant.f62950b, toMerchant.f62951c, transferData.f62941b, toMerchant.d, toMerchant.e, toMerchant.f62952g, transferData.d, transferData.f62942c, 8);
        }
        return new UpiTransferFlow(upiTransferFlowContract$InputData);
    }
}
