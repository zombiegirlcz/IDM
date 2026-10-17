package com.revolut.feature.crypto.gift.asset.api.model;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/crypto/gift/asset/api/model/CryptoGiftAssetError;", "", "NotAvailable", "InvalidRequest", "AlreadyClaimed", "Lcom/revolut/feature/crypto/gift/asset/api/model/CryptoGiftAssetError$AlreadyClaimed;", "Lcom/revolut/feature/crypto/gift/asset/api/model/CryptoGiftAssetError$InvalidRequest;", "Lcom/revolut/feature/crypto/gift/asset/api/model/CryptoGiftAssetError$NotAvailable;", "feature_crypto_gift_asset_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CryptoGiftAssetError extends Throwable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/crypto/gift/asset/api/model/CryptoGiftAssetError$AlreadyClaimed;", "Lcom/revolut/feature/crypto/gift/asset/api/model/CryptoGiftAssetError;", "feature_crypto_gift_asset_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AlreadyClaimed extends CryptoGiftAssetError {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/crypto/gift/asset/api/model/CryptoGiftAssetError$InvalidRequest;", "Lcom/revolut/feature/crypto/gift/asset/api/model/CryptoGiftAssetError;", "feature_crypto_gift_asset_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class InvalidRequest extends CryptoGiftAssetError {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/crypto/gift/asset/api/model/CryptoGiftAssetError$NotAvailable;", "Lcom/revolut/feature/crypto/gift/asset/api/model/CryptoGiftAssetError;", "feature_crypto_gift_asset_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NotAvailable extends CryptoGiftAssetError {
    }
}
