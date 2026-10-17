package io.ktor.client.engine.okhttp;

import aem.e1;
import aem.z0;
import io.ktor.utils.io.h0;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import oem.f;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import skm.b1;
import skm.c2;
import skm.d0;
import skm.e0;
import skm.g1;
import skm.h1;
import skm.s;
import skm.z;
import ulm.f0;
import ydm.d;
import ydm.e;
import yhm.j;
import zdm.b;

/* JADX INFO: loaded from: classes23.dex */
public final class a extends d {

    @NotNull
    private static final b Companion = new b();
    public static final Lazy i = j.b(new vdm.d(1));
    public final zdm.a d;
    public final Set e;
    public final CoroutineContext f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CoroutineContext f163023g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f163024h;

    public a(zdm.a config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.d = config;
        e[] elements = {z0.f3801a, eem.a.f125240a, dem.a.f113717a};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.e = kotlin.collections.d.y0(elements);
        h0 supplier = new h0(1, this, a.class, "createOkHttpClient", "createOkHttpClient(Lio/ktor/client/plugins/HttpTimeoutConfig;)Lokhttp3/OkHttpClient;", 0, 3);
        nb.e close = new nb.e(22);
        Intrinsics.checkNotNullParameter(supplier, "supplier");
        Intrinsics.checkNotNullParameter(close, "close");
        Map mapSynchronizedMap = Collections.synchronizedMap(new oem.j(supplier, close));
        Intrinsics.checkNotNullExpressionValue(mapSynchronizedMap, "synchronizedMap(...)");
        this.f163024h = mapSynchronizedMap;
        CoroutineContext coroutineContextD = kotlin.coroutines.e.d(new c2(e0.t(super.getF74819h())), new f(z.f264021a));
        this.f = coroutineContextD;
        this.f163023g = super.getF74819h().plus(coroutineContextD);
        e0.B(b1.f263958a, super.getF74819h(), d0.ATOMIC, new wem.a(this, (Continuation) null, 2));
    }

    public static final OkHttpClient d(a aVar, aem.b1 b1Var) {
        zdm.a aVar2 = aVar.d;
        aVar2.getClass();
        Companion.getClass();
        OkHttpClient.a aVarA = ((OkHttpClient) i.getValue()).a();
        f0 dispatcher = new f0();
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        aVarA.f226070a = dispatcher;
        aVar2.f321604a.invoke(aVarA);
        if (b1Var != null) {
            Long l2 = b1Var.f3696b;
            if (l2 != null) {
                long jLongValue = l2.longValue();
                Logger logger = e1.f3713a;
                if (jLongValue == Long.MAX_VALUE) {
                    jLongValue = 0;
                }
                aVarA.d(jLongValue, TimeUnit.MILLISECONDS);
            }
            Long l3 = b1Var.f3697c;
            if (l3 != null) {
                long jLongValue2 = l3.longValue();
                Logger logger2 = e1.f3713a;
                long j2 = jLongValue2 == Long.MAX_VALUE ? 0L : jLongValue2;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                aVarA.f(j2, timeUnit);
                aVarA.h(jLongValue2 != Long.MAX_VALUE ? jLongValue2 : 0L, timeUnit);
            }
        }
        return new OkHttpClient(aVarA);
    }

    @Override // ydm.d, io.ktor.client.engine.HttpClientEngine
    public final Set N3() {
        return this.e;
    }

    @Override // ydm.d, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        CoroutineContext.Element element = this.f.get(g1.f263979a);
        Intrinsics.i(element, "null cannot be cast to non-null type kotlinx.coroutines.CompletableJob");
        ((h1) ((s) element)).h0();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(fem.e r18, gim.c r19) {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.okhttp.a.f(fem.e, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(okhttp3.OkHttpClient r17, ulm.j1 r18, kotlin.coroutines.CoroutineContext r19, fem.e r20, gim.c r21) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.okhttp.a.g(okhttp3.OkHttpClient, ulm.j1, kotlin.coroutines.CoroutineContext, fem.e, gim.c):java.lang.Object");
    }

    @Override // ydm.d, kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public final CoroutineContext getF74819h() {
        return this.f163023g;
    }
}
