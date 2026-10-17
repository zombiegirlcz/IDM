package com.onfido.hosted.web.module.externallink;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"Lcom/onfido/hosted/web/module/externallink/HostedWebModuleExternalLinkRepositoryImpl;", "Lcom/onfido/hosted/web/module/externallink/HostedWebModuleExternalLinkRepository;", "Lokhttp3/OkHttpClient;", "okHttpClient", "<init>", "(Lokhttp3/OkHttpClient;)V", "Ljava/net/URL;", "url", "Lyhm/m;", "Lcom/onfido/hosted/web/module/externallink/HostedWebModuleExternalLinkResult;", "fetchExternalLink-gIAlu-s", "(Ljava/net/URL;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchExternalLink", "Lokhttp3/OkHttpClient;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class HostedWebModuleExternalLinkRepositoryImpl implements HostedWebModuleExternalLinkRepository {

    @NotNull
    private final OkHttpClient okHttpClient;

    public HostedWebModuleExternalLinkRepositoryImpl(@NotNull OkHttpClient okHttpClient) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        this.okHttpClient = okHttpClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onfido.hosted.web.module.externallink.HostedWebModuleExternalLinkRepository
    /* JADX INFO: renamed from: fetchExternalLink-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo3744fetchExternalLinkgIAlus(@org.jetbrains.annotations.NotNull java.net.URL r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super yhm.m<? extends com.onfido.hosted.web.module.externallink.HostedWebModuleExternalLinkResult>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.onfido.hosted.web.module.externallink.HostedWebModuleExternalLinkRepositoryImpl$fetchExternalLink$1
            if (r0 == 0) goto L13
            r0 = r8
            com.onfido.hosted.web.module.externallink.HostedWebModuleExternalLinkRepositoryImpl$fetchExternalLink$1 r0 = (com.onfido.hosted.web.module.externallink.HostedWebModuleExternalLinkRepositoryImpl$fetchExternalLink$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.onfido.hosted.web.module.externallink.HostedWebModuleExternalLinkRepositoryImpl$fetchExternalLink$1 r0 = new com.onfido.hosted.web.module.externallink.HostedWebModuleExternalLinkRepositoryImpl$fetchExternalLink$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r7 = r0.L$1
            java.net.URL r7 = (java.net.URL) r7
            java.lang.Object r7 = r0.L$0
            com.onfido.hosted.web.module.externallink.HostedWebModuleExternalLinkRepositoryImpl r7 = (com.onfido.hosted.web.module.externallink.HostedWebModuleExternalLinkRepositoryImpl) r7
            yhm.o.b(r8)
            goto L98
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            yhm.o.b(r8)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r3
            skm.l r8 = new skm.l
            kotlin.coroutines.Continuation r2 = fim.h.b(r0)
            r8.<init>(r3, r2)
            r8.u()
            ulm.i1 r2 = new ulm.i1
            r2.<init>()
            java.lang.String r3 = "url"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r3)
            ulm.w0 r4 = ulm.x0.Companion
            java.lang.String r7 = r7.toString()
            java.lang.String r5 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r5)
            r4.getClass()
            ulm.x0 r7 = ulm.w0.c(r7)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r3)
            r2.f281089a = r7
            ulm.j1 r7 = new ulm.j1
            r7.<init>(r2)
            okhttp3.OkHttpClient r2 = access$getOkHttpClient$p(r6)
            ylm.q r7 = r2.b(r7)
            com.onfido.hosted.web.module.externallink.HostedWebModuleExternalLinkRepositoryImpl$fetchExternalLink$2$1 r2 = new com.onfido.hosted.web.module.externallink.HostedWebModuleExternalLinkRepositoryImpl$fetchExternalLink$2$1
            r2.<init>()
            com.google.firebase.perf.network.FirebasePerfOkHttpClient.enqueue(r7, r2)
            com.onfido.hosted.web.module.externallink.HostedWebModuleExternalLinkRepositoryImpl$fetchExternalLink$2$2 r7 = new com.onfido.hosted.web.module.externallink.HostedWebModuleExternalLinkRepositoryImpl$fetchExternalLink$2$2
            r7.<init>(r6)
            r8.r(r7)
            java.lang.Object r8 = r8.t()
            if (r8 != r1) goto L95
            java.lang.String r7 = "frame"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r7)
        L95:
            if (r8 != r1) goto L98
            return r1
        L98:
            yhm.m r8 = (yhm.m) r8
            java.lang.Object r7 = r8.f314193a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onfido.hosted.web.module.externallink.HostedWebModuleExternalLinkRepositoryImpl.mo3744fetchExternalLinkgIAlus(java.net.URL, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
