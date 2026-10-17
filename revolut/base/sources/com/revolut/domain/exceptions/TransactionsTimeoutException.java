package com.revolut.domain.exceptions;

import com.revolut.core.extensions.rx.BreadcrumbException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/domain/exceptions/TransactionsTimeoutException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransactionsTimeoutException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f60259b;

    public TransactionsTimeoutException(String str, BreadcrumbException breadcrumbException) {
        super(str, breadcrumbException);
        this.f60258a = str;
        this.f60259b = breadcrumbException;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f60259b;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f60258a;
    }
}
