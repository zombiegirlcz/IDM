package com.revolut.feature.kyc.shared.exception;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/kyc/shared/exception/KycException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "feature_kyc_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class KycException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f77902b;

    public KycException(String str, Throwable th10) {
        super(str, th10);
        this.f77901a = str;
        this.f77902b = th10;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f77902b;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f77901a;
    }
}
