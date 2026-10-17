package com.revolut.feature.tab.crypto.api.navigation;

import com.revolut.feature.tab.crypto.api.navigation.CryptoSettingsInputData;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tab/crypto/api/navigation/TabCryptoKompotFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "CryptoSettingsConfig", "Lcom/revolut/feature/tab/crypto/api/navigation/TabCryptoKompotFeatureConfig$CryptoSettingsConfig;", "feature_tab_crypto_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TabCryptoKompotFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/crypto/api/navigation/TabCryptoKompotFeatureConfig$CryptoSettingsConfig;", "Lcom/revolut/feature/tab/crypto/api/navigation/TabCryptoKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_tab_crypto_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CryptoSettingsConfig extends TabCryptoKompotFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CryptoSettingsInputData f89780g;

        public CryptoSettingsConfig() {
            this(null);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CryptoSettingsConfig) && Intrinsics.f(this.f89780g, ((CryptoSettingsConfig) obj2).f89780g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            CryptoSettingsInputData cryptoSettingsInputData = this.f89780g;
            if (cryptoSettingsInputData == null) {
                return 0;
            }
            return cryptoSettingsInputData.hashCode();
        }

        public CryptoSettingsConfig(CryptoSettingsInputData.OpenSpareChangeAtTop openSpareChangeAtTop) {
            super(null, new CryptoSettingsDestination(openSpareChangeAtTop), false, null, 0, 44);
            this.f89780g = openSpareChangeAtTop;
        }
    }
}
