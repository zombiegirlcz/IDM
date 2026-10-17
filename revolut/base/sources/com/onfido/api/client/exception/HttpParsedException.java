package com.onfido.api.client.exception;

import com.onfido.api.client.data.ErrorData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/api/client/exception/HttpParsedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class HttpParsedException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ErrorData f50134a;

    public HttpParsedException(ErrorData errorData) {
        Intrinsics.checkNotNullParameter(errorData, "errorData");
        this.f50134a = errorData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof HttpParsedException) && Intrinsics.f(this.f50134a, ((HttpParsedException) obj2).f50134a);
    }

    public final int hashCode() {
        return this.f50134a.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "HttpParsedException(errorData=" + this.f50134a + ")";
    }
}
