package com.revolut.feature.defi.common.models.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/defi/common/models/domain/DeFiQuoteException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "feature_defi_common_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeFiQuoteException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeFiQuoteAmountLimitError f71702a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeFiQuoteException(DeFiQuoteAmountLimitError error, Throwable th10) {
        super("DeFi quote rejected: ".concat(error.getClass().getSimpleName()), th10);
        Intrinsics.checkNotNullParameter(error, "error");
        this.f71702a = error;
    }
}
