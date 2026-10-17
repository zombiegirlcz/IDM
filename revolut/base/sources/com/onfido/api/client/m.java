package com.onfido.api.client;

import com.onfido.android.sdk.capture.internal.token.OnfidoTokenProvider;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes17.dex */
public abstract class m {
    public static final OnfidoAPI a(OnfidoTokenProvider tokenProvider, OnfidoFetcher onfidoFetcher, String str, String str2, Json json) {
        Intrinsics.checkNotNullParameter(tokenProvider, "tokenProvider");
        Intrinsics.checkNotNullParameter(onfidoFetcher, "onfidoFetcher");
        Intrinsics.checkNotNullParameter(json, "json");
        if (tokenProvider.provideToken().isDemoToken()) {
            return new zk.b(json);
        }
        OnfidoService onfidoService = (OnfidoService) onfidoFetcher.a(OnfidoService.class);
        b bVar = c.Companion;
        rlm.o json2 = e.f50133a;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(json2, "json");
        return new n(new r(tokenProvider, onfidoService), new f(onfidoService, false), new s(onfidoService), new f(onfidoService, false), new f(onfidoService, false), new f(onfidoService, false), new c(json2), new f(onfidoService), str, str2);
    }

    public static void b() {
        lmm.d.w1.log("E/OnfidoFetcher:Exception thrown while setting SSL socket factory");
    }
}
