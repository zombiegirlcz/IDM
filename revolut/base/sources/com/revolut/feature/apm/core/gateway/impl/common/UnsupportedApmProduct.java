package com.revolut.feature.apm.core.gateway.impl.common;

import dx1.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/core/gateway/impl/common/UnsupportedApmProduct;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "feature_apm_core_gateway_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UnsupportedApmProduct extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnsupportedApmProduct(String provider, a product) {
        super("Check that you registered " + provider + " for: " + product);
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(product, "product");
    }
}
