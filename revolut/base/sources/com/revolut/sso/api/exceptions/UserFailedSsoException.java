package com.revolut.sso.api.exceptions;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/sso/api/exceptions/UserFailedSsoException;", "Ljava/io/IOException;", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UserFailedSsoException extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserFailedSsoException(String message) {
        super("SSO authentication was failed (" + message + ")");
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
