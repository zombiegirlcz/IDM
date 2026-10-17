package com.revolut.core.error.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/core/error/data/model/UnknownApiError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "core_error_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UnknownApiError extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnknownApiError(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
