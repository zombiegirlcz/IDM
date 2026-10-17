package com.revolut.core.network.exceptions;

import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/core/network/exceptions/HandledNetworkException;", "Ljava/io/IOException;", "core_network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class HandledNetworkException extends IOException {
    public HandledNetworkException() {
        this((String) null, 3);
    }

    public HandledNetworkException(String str, int i) {
        super((i & 1) != 0 ? null : str, null);
    }

    public HandledNetworkException(String str, NetworkException networkException) {
        super(str, networkException);
    }
}
