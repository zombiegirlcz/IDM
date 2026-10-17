package com.revolut.retail.feature.api.custom_assets.models;

import com.revolut.core.error.data.model.ServerErrorException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/api/custom_assets/models/InvalidCustomAssetAttributesException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "feature_analytics_cycle_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvalidCustomAssetAttributesException extends RuntimeException {
    public InvalidCustomAssetAttributesException() {
        this(null);
    }

    public InvalidCustomAssetAttributesException(ServerErrorException serverErrorException) {
        super("Invalid custom asset attributes", serverErrorException);
    }
}
