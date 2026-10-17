package com.revolut.core.mobile_services.api.exceptions;

import jh0.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/core/mobile_services/api/exceptions/MsApiException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "mobile_services_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class MsApiException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f51387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f51388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StackTraceElement[] f51389c;
    public final String d;
    public final Throwable e;

    public MsApiException(b status, String str, StackTraceElement[] _stackTrace, String str2, Throwable th10) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(_stackTrace, "_stackTrace");
        this.f51387a = status;
        this.f51388b = str;
        this.f51389c = _stackTrace;
        this.d = str2;
        this.e = th10;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getF51387a() {
        return this.f51387a;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.e;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f51388b;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.d;
    }

    @Override // java.lang.Throwable
    public final StackTraceElement[] getStackTrace() {
        return this.f51389c;
    }
}
