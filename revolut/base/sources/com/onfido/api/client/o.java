package com.onfido.api.client;

import com.onfido.api.client.token.InternalToken;
import com.onfido.api.client.token.TokenProvider;
import com.onfido.api.client.token.sdk.InternalSDKToken;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Response;
import ulm.i1;
import ulm.j1;
import ulm.y0;

/* JADX INFO: loaded from: classes17.dex */
public final class o implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TokenProvider f50146a;

    public o(TokenProvider tokenProvider) {
        Intrinsics.checkNotNullParameter(tokenProvider, "tokenProvider");
        this.f50146a = tokenProvider;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(y0 chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        zlm.h hVar = (zlm.h) chain;
        i1 i1VarB = hVar.e.b();
        InternalToken internalTokenProvideToken = this.f50146a.provideToken();
        if (internalTokenProvideToken instanceof InternalSDKToken) {
            String appId = internalTokenProvideToken.getAppId();
            if (appId == null) {
                appId = "";
            }
            i1VarB.a("Application-Id", appId);
            i1VarB.a("Authorization", "Bearer " + internalTokenProvideToken.getTokenValue());
        } else {
            i1VarB.a("Authorization", "Token token=" + internalTokenProvideToken.getTokenValue());
        }
        return hVar.b(new j1(i1VarB));
    }
}
