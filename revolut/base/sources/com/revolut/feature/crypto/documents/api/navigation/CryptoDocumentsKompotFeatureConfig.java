package com.revolut.feature.crypto.documents.api.navigation;

import com.revolut.feature.crypto.documents.api.navigation.destinations.CryptoDocumentsDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/documents/api/navigation/CryptoDocumentsKompotFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "CryptoDocuments", "Lcom/revolut/feature/crypto/documents/api/navigation/CryptoDocumentsKompotFeatureConfig$CryptoDocuments;", "feature_crypto_documents_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CryptoDocumentsKompotFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/documents/api/navigation/CryptoDocumentsKompotFeatureConfig$CryptoDocuments;", "Lcom/revolut/feature/crypto/documents/api/navigation/CryptoDocumentsKompotFeatureConfig;", "<init>", "()V", "feature_crypto_documents_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CryptoDocuments extends CryptoDocumentsKompotFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final CryptoDocuments f70783g = new CryptoDocuments();

        private CryptoDocuments() {
            super(null, CryptoDocumentsDestination.f70784a, false, null, 0, 44);
        }
    }
}
