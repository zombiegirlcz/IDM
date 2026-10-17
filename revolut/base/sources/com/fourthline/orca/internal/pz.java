package com.fourthline.orca.internal;

import io.ktor.client.engine.HttpClientEngine;
import io.ktor.client.engine.cio.CIO;
import io.ktor.client.engine.cio.CIOEngineConfig;
import io.ktor.network.tls.TLSConfigBuilder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class pz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pz f32080a = new pz();

    private pz() {
    }

    public final HttpClientEngine a(String baseUrl) {
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        final rz rzVar = new rz();
        return CIO.INSTANCE.create(new Function1() { // from class: com.fourthline.orca.internal.jr1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return pz.a(rzVar, (CIOEngineConfig) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(final rz rzVar, CIOEngineConfig create) {
        Intrinsics.checkNotNullParameter(create, "$this$create");
        create.https(new Function1() { // from class: com.fourthline.orca.internal.kr1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return pz.a(rzVar, (TLSConfigBuilder) obj2);
            }
        });
        create.getEndpoint().setConnectTimeout(60000L);
        create.getEndpoint().setSocketTimeout(60000L);
        create.setRequestTimeout(60000L);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(rz rzVar, TLSConfigBuilder https) {
        Intrinsics.checkNotNullParameter(https, "$this$https");
        https.setTrustManager(rzVar.b());
        return Unit.f186387a;
    }
}
