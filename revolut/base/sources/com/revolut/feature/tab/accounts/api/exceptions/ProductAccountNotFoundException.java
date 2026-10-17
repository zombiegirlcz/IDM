package com.revolut.feature.tab.accounts.api.exceptions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/exceptions/ProductAccountNotFoundException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProductAccountNotFoundException extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f89461a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductAccountNotFoundException(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
        this.f89461a = message;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f89461a;
    }
}
