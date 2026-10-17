package com.revolut.feature.in_app_calls;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/in_app_calls/CallModuleNotAvailableException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "feature_in_app_calls_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CallModuleNotAvailableException extends IllegalStateException {
    public CallModuleNotAvailableException() {
        this(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallModuleNotAvailableException(int i) {
        super("Call feature is being installed. You'll be notified when ready.");
        Intrinsics.checkNotNullParameter("Call feature is being installed. You'll be notified when ready.", "message");
    }
}
