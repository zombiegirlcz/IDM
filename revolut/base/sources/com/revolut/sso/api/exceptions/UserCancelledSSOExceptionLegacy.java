package com.revolut.sso.api.exceptions;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yhm.d;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/sso/api/exceptions/UserCancelledSSOExceptionLegacy;", "Ljava/util/concurrent/CancellationException;", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class UserCancelledSSOExceptionLegacy extends CancellationException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserCancelledSSOExceptionLegacy(String url2) {
        super("SSO authentication was cancelled (" + url2 + ")");
        Intrinsics.checkNotNullParameter(url2, "url");
    }
}
