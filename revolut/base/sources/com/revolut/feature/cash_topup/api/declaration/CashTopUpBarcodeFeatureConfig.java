package com.revolut.feature.cash_topup.api.declaration;

import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/cash_topup/api/declaration/CashTopUpBarcodeFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "<init>", "()V", "feature_cash_topup_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CashTopUpBarcodeFeatureConfig extends KompotBridgeFeatureConfig {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final CashTopUpBarcodeFeatureConfig f65578g = new CashTopUpBarcodeFeatureConfig();

    private CashTopUpBarcodeFeatureConfig() {
        super((ActivityAnimation) null, (ParcelableDestination) CashTopUpBarcodeDestination.f65577a, false, (Integer) null, 0, 61);
    }
}
