package q5a;

import android.content.Context;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferLaunchType;
import com.revolut.feature.payments.who_to_transfer.api.navigation.RecipientSelectionFeatureConfig;
import com.revolut.feature.payments.who_to_transfer.api.navigation.RecipientSelectionInputData;
import com.revolut.feature.payments.who_to_transfer.api.navigation.RecipientSelectionType;
import com.revolut.feature.payments.who_to_transfer.api.who_to_transfer.navigation.WhoToTransferFeatureConfig;
import com.revolut.feature.payments.who_to_transfer.api.who_to_transfer.navigation.WhoToTransferScreenMode;
import com.revolut.feature.transfer.core.models.SourceAccount;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.retail.core.flow.FlowExtras;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import g3a.h;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import zhm.d0;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof WhoToTransferFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        TransferFlowType jointAccountFlow;
        RecipientSelectionType transfer;
        com.revolut.feature.payments.who_to_transfer.api.navigation.a aVar;
        RecipientSelectionType transfer2;
        WhoToTransferFeatureConfig config = (WhoToTransferFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (!(config instanceof WhoToTransferFeatureConfig.Transfer)) {
            throw new NoWhenBranchMatchedException();
        }
        WhoToTransferFeatureConfig.Transfer transfer3 = (WhoToTransferFeatureConfig.Transfer) config;
        AccountId accountId = transfer3.f80053g;
        WhoToTransferScreenMode whoToTransferScreenMode = transfer3.f80050a;
        h hVar = transfer3.f80052c;
        FlowExtras flowExtras = transfer3.e;
        Intrinsics.i(whoToTransferScreenMode, "null cannot be cast to non-null type com.revolut.feature.payments.who_to_transfer.api.who_to_transfer.navigation.WhoToTransferScreenMode.PredefinedFilter");
        WhoToTransferScreenMode.PredefinedFilter predefinedFilter = (WhoToTransferScreenMode.PredefinedFilter) whoToTransferScreenMode;
        Set setI1 = d0.i1(predefinedFilter.f80054a);
        boolean z = setI1.size() > 1;
        boolean z3 = predefinedFilter.f80055b;
        WhoToTransferLaunchType whoToTransferLaunchType = transfer3.f80051b;
        if (whoToTransferLaunchType instanceof WhoToTransferLaunchType.Freelancer) {
            jointAccountFlow = new TransferFlowType.Pro(null);
        } else {
            if (!(whoToTransferLaunchType instanceof WhoToTransferLaunchType.LiteApp) && !(whoToTransferLaunchType instanceof WhoToTransferLaunchType.FullApp)) {
                throw new NoWhenBranchMatchedException();
            }
            if (transfer3.f) {
                jointAccountFlow = TransferFlowType.Crypto.f92256b;
            } else if (accountId instanceof AccountId.Joint) {
                jointAccountFlow = new TransferFlowType.JointAccountFlow((AccountId.Joint) accountId, null);
            } else {
                if (!(accountId instanceof AccountId.Personal)) {
                    throw new NoWhenBranchMatchedException();
                }
                jointAccountFlow = TransferFlowType.Default.f92257b;
            }
        }
        TransferMoneyPocket transferMoneyPocket = transfer3.d;
        if (transferMoneyPocket == null) {
            transferMoneyPocket = new TransferMoneyPocket(null, new SourceAccount.Pocket(null, null, accountId, 2), 1);
        }
        if (z3) {
            transfer = new RecipientSelectionType.Transfer(jointAccountFlow, com.revolut.feature.payments.who_to_transfer.api.navigation.a.SCHEDULE, transferMoneyPocket, flowExtras);
        } else {
            int[] iArr = a.f242334a;
            int i = iArr[hVar.ordinal()];
            if (i != 1) {
                if (i != 2 && i != 3 && i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                int i2 = iArr[hVar.ordinal()];
                if (i2 == 1 || i2 == 2) {
                    aVar = com.revolut.feature.payments.who_to_transfer.api.navigation.a.SEND;
                } else if (i2 == 3) {
                    aVar = com.revolut.feature.payments.who_to_transfer.api.navigation.a.REQUEST;
                } else {
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar = com.revolut.feature.payments.who_to_transfer.api.navigation.a.SCHEDULE;
                }
                transfer2 = new RecipientSelectionType.Transfer(jointAccountFlow, aVar, transferMoneyPocket, flowExtras);
                navigator.c(new FeatureCommand(new RecipientSelectionFeatureConfig("", new RecipientSelectionInputData(null, z, false, setI1, null, null, transfer2, null, 177))));
            }
            transfer = RecipientSelectionType.Default.f80020a;
        }
        transfer2 = transfer;
        navigator.c(new FeatureCommand(new RecipientSelectionFeatureConfig("", new RecipientSelectionInputData(null, z, false, setI1, null, null, transfer2, null, 177))));
    }
}
