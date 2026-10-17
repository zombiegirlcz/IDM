package com.revolut.feature.subaccount.api;

import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/subaccount/api/CreateSubaccountFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "<init>", "()V", "feature_subaccount_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreateSubaccountFeatureConfig extends KompotBridgeFeatureConfig {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final CreateSubaccountFeatureConfig f88927g = new CreateSubaccountFeatureConfig();

    private CreateSubaccountFeatureConfig() {
        super((ActivityAnimation) null, (ParcelableDestination) new CreateSubaccountScreenDestination(null), false, (Integer) null, 0, 61);
    }
}
