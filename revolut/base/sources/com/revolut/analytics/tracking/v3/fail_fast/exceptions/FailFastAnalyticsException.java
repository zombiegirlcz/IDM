package com.revolut.analytics.tracking.v3.fail_fast.exceptions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/analytics/tracking/v3/fail_fast/exceptions/FailFastAnalyticsException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class FailFastAnalyticsException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FailFastAnalyticsException(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
