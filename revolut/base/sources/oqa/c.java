package oqa;

import android.content.Context;
import com.revolut.feature.push_to_card.api.data.CardOwner;
import com.revolut.feature.push_to_card.api.feature_config.PushToCardCardTransferFeatureConfig;
import com.revolut.feature.push_to_card.api.navigation.PushToCardTransferBridgeFeatureConfig;
import com.revolut.feature.push_to_card.api.navigation.PushToCardTransferInputData;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.jvm.internal.Intrinsics;
import sri.m;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof PushToCardCardTransferFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        PushToCardCardTransferFeatureConfig config = (PushToCardCardTransferFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        PushToCardTransferInputData.Companion companion = PushToCardTransferInputData.INSTANCE;
        CardOwner cardOwner = config.f81499a;
        TransferFlowType transferFlowType = config.f81500b;
        if (transferFlowType == null) {
            transferFlowType = TransferFlowType.Default.f92257b;
        }
        TransferMoneyPocket transferMoneyPocket = config.f81501c;
        if (transferMoneyPocket == null) {
            transferMoneyPocket = new TransferMoneyPocket(null, null, 3);
        }
        navigator.c(new FeatureCommand(new PushToCardTransferBridgeFeatureConfig(PushToCardTransferInputData.Companion.a(companion, cardOwner, transferMoneyPocket, transferFlowType, 24))));
    }
}
