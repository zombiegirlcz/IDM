package com.onfido.android.sdk.capture.utils;

import cl.c;
import com.onfido.api.client.token.InternalToken;
import com.onfido.api.client.token.Token;
import com.onfido.api.client.token.sdk.InternalSDKToken;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"mapToInternalToken", "Lcom/onfido/api/client/token/InternalToken;", "Lcom/onfido/api/client/token/Token;", "onfido-capture-sdk-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TokenExtensionsKt {
    @NotNull
    public static final InternalToken mapToInternalToken(@NotNull Token token) {
        Intrinsics.checkNotNullParameter(token, "<this>");
        return token instanceof c ? new InternalSDKToken(token.f50152a, token.f50153b, new dl.a()) : new InternalToken(token.f50152a, token.f50153b) { // from class: com.onfido.android.sdk.capture.utils.TokenExtensionsKt.mapToInternalToken.1
            /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
            @org.jetbrains.annotations.NotNull
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.String buildUrl() {
                /*
                    r2 = this;
                    java.lang.String r0 = r2.getTokenValue()
                    com.onfido.api.client.token.sdk.model.InternalSDKTokenPayload r0 = com.onfido.api.client.token.sdk.model.InternalSDKTokenPayload.parseSDKTokenPayload(r0)
                    if (r0 == 0) goto L21
                    java.lang.String r1 = r0.getBaseUrl()
                    if (r1 == 0) goto L19
                    int r1 = r1.length()
                    if (r1 != 0) goto L17
                    goto L19
                L17:
                    r1 = 0
                    goto L1a
                L19:
                    r1 = 1
                L1a:
                    if (r1 != 0) goto L21
                    java.lang.String r0 = r0.getBaseUrl()
                    goto L23
                L21:
                    java.lang.String r0 = "https://api.onfido.com"
                L23:
                    java.lang.String r1 = "createApiUrl(...)"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.utils.TokenExtensionsKt.AnonymousClass1.buildUrl():java.lang.String");
            }
        };
    }
}
