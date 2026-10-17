package com.revolut.retail.feature.esim.impl.repositories.exceptions;

import dj0.d;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/repositories/exceptions/InsufficientFundsException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InsufficientFundsException extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f100577a;

    public InsufficientFundsException() {
        this(null);
    }

    public InsufficientFundsException(d dVar) {
        this.f100577a = dVar;
    }
}
