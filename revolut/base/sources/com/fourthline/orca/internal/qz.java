package com.fourthline.orca.internal;

import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes23.dex */
public final class qz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qz f32561a = new qz();

    private qz() {
    }

    public final Pair a(String baseUrl) {
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        jg0 jg0Var = new jg0();
        mp1 block = new mp1(jg0Var, 22);
        Intrinsics.checkNotNullParameter(block, "block");
        zdm.a aVar = new zdm.a();
        aVar.f321604a = new nb.e(21);
        block.invoke(aVar);
        return new Pair(new io.ktor.client.engine.okhttp.a(aVar), jg0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(long j2, jg0 jg0Var, zdm.a create) {
        Intrinsics.checkNotNullParameter(create, "$this$create");
        lb.b block = new lb.b(j2, jg0Var);
        create.getClass();
        Intrinsics.checkNotNullParameter(block, "block");
        create.f321604a = new vdm.c(create.f321604a, block, 1);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(long j2, jg0 jg0Var, OkHttpClient.a config) {
        Intrinsics.checkNotNullParameter(config, "$this$config");
        rz rzVar = new rz();
        SSLSocketFactory socketFactory = rzVar.a().getSocketFactory();
        Intrinsics.checkNotNullExpressionValue(socketFactory, "getSocketFactory(...)");
        config.g(socketFactory, rzVar.b());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        config.d(j2, timeUnit);
        config.f(j2, timeUnit);
        config.h(j2, timeUnit);
        ulm.l0 eventListenerFactory = jg0Var.b();
        Intrinsics.checkNotNullParameter(eventListenerFactory, "eventListenerFactory");
        config.e = eventListenerFactory;
        return Unit.f186387a;
    }
}
