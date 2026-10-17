package qg5;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.crypto.gift.asset.impl.data.network.CryptoGiftAssetService;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import pg5.i;
import pti.s;
import re0.d;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements mg5.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoGiftAssetService f245651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f245652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final re0.c f245653c;

    public c(CryptoGiftAssetService service, j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f245651a = service;
        d dVar = new d(memoryCache, storage);
        this.f245652b = dVar;
        qc7.c cVar = new qc7.c(28);
        qc8.a aVar = new qc8.a(17);
        qc8.a aVar2 = new qc8.a(18);
        s sVar = new s(this, null, 4);
        Type type = new TypeToken<i>() { // from class: com.revolut.feature.crypto.gift.asset.impl.data.repository.CryptoGiftAssetRepositoryImpl$special$$inlined$invoke$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        this.f245653c = new re0.c(dVar, cVar, type, aVar, aVar2, sVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(qg5.c r4, kotlin.jvm.functions.Function1 r5, gim.c r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof qg5.b
            if (r0 == 0) goto L16
            r0 = r6
            qg5.b r0 = (qg5.b) r0
            int r1 = r0.f245650w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f245650w = r1
            goto L1b
        L16:
            qg5.b r0 = new qg5.b
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f245650w
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r6)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L98
            return r6
        L2a:
            r5 = move-exception
            goto L41
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            yhm.o.b(r6)
            r0.f245650w = r3     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L98
            java.lang.Object r4 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L98
            if (r4 != r1) goto L40
            return r1
        L40:
            return r4
        L41:
            boolean r6 = r5 instanceof retrofit2.HttpException
            if (r6 == 0) goto L97
            r6 = r5
            retrofit2.HttpException r6 = (retrofit2.HttpException) r6
            int r6 = r6.code()
            r0 = 400(0x190, float:5.6E-43)
            java.lang.String r1 = "cause"
            if (r6 == r0) goto L84
            r0 = 403(0x193, float:5.65E-43)
            if (r6 == r0) goto L65
            r4 = 409(0x199, float:5.73E-43)
            if (r6 == r4) goto L5b
            goto L97
        L5b:
            com.revolut.feature.crypto.gift.asset.api.model.CryptoGiftAssetError$AlreadyClaimed r4 = new com.revolut.feature.crypto.gift.asset.api.model.CryptoGiftAssetError$AlreadyClaimed
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
            r4.<init>(r5)
        L63:
            r5 = r4
            goto L8d
        L65:
            re0.d r4 = r4.f245652b
            r4.getClass()
            java.lang.String r6 = "key"
            java.lang.String r0 = "CACHE_KEY_CRYPTO_GIFTED_ASSETS"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r6)
            ne0.j r6 = r4.f253484a
            r6.remove(r0)
            ue0.c r4 = r4.f253485b
            r4.I0(r0)
            com.revolut.feature.crypto.gift.asset.api.model.CryptoGiftAssetError$NotAvailable r4 = new com.revolut.feature.crypto.gift.asset.api.model.CryptoGiftAssetError$NotAvailable
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
            r4.<init>(r5)
            goto L63
        L84:
            com.revolut.feature.crypto.gift.asset.api.model.CryptoGiftAssetError$InvalidRequest r4 = new com.revolut.feature.crypto.gift.asset.api.model.CryptoGiftAssetError$InvalidRequest
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
            r4.<init>(r5)
            goto L63
        L8d:
            zhm.h0 r4 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r6 = rd0.d.f253311a
            rd0.c r6 = rd0.c.ERROR
            r0 = 0
            rd0.d.a(r6, r0, r0, r5, r4)
        L97:
            throw r5
        L98:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: qg5.c.a(qg5.c, kotlin.jvm.functions.Function1, gim.c):java.lang.Object");
    }
}
