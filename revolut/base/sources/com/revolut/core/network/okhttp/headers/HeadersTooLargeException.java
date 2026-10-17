package com.revolut.core.network.okhttp.headers;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ulm.j1;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/core/network/okhttp/headers/HeadersTooLargeException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "core_network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HeadersTooLargeException extends RuntimeException {
    /* JADX WARN: Illegal instructions before constructor call */
    public HeadersTooLargeException(j1 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        String[] strArr = request.f281097c.f281142a;
        long length = strArr.length * 2;
        for (String str : strArr) {
            length += (long) str.length();
        }
        super("Headers size is too large. Actual: " + length + ", recommended: 52428. Request URL: " + request.f281095a);
    }
}
