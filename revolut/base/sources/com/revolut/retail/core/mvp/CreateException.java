package com.revolut.retail.core.mvp;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/retail/core/mvp/CreateException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "retail_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreateException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateException(String message, Throwable e) {
        super(message, e);
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(e, "e");
    }
}
