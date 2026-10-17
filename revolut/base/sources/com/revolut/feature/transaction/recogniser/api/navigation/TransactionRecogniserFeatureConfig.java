package com.revolut.feature.transaction.recogniser.api.navigation;

import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/transaction/recogniser/api/navigation/TransactionRecogniserFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "feature_transaction_recogniser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransactionRecogniserFeatureConfig extends KompotBridgeFeatureConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionRecogniserFeatureConfig(TransactionRecogniserDestination destination) {
        super((ActivityAnimation) null, (ParcelableDestination) destination, false, (Integer) null, 0, 61);
        Intrinsics.checkNotNullParameter(destination, "destination");
    }
}
