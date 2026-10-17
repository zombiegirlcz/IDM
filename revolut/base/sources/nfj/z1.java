package nfj;

import com.revolut.retail.feature.esim.impl.network.EsimSubscriptionsRefundQuoteService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class z1 {

    @NotNull
    public static final w1 Companion = new w1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimSubscriptionsRefundQuoteService f215080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kg.o f215081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ynj.i f215082c;

    public z1(EsimSubscriptionsRefundQuoteService service, kg.o gson, ynj.i defaultPollingDurationProvider) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(defaultPollingDurationProvider, "defaultPollingDurationProvider");
        this.f215080a = service;
        this.f215081b = gson;
        this.f215082c = defaultPollingDurationProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(nfj.z1 r7, java.lang.String r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof nfj.y1
            if (r0 == 0) goto L13
            r0 = r9
            nfj.y1 r0 = (nfj.y1) r0
            int r1 = r0.f215076x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f215076x = r1
            goto L18
        L13:
            nfj.y1 r0 = new nfj.y1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f215076x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r9)
            return r9
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.String r8 = r0.u
            yhm.o.b(r9)
            goto L48
        L38:
            yhm.o.b(r9)
            com.revolut.retail.feature.esim.impl.network.EsimSubscriptionsRefundQuoteService r9 = r7.f215080a
            r0.u = r8
            r0.f215076x = r4
            java.lang.Object r9 = r9.getSubscriptionsRefundQuote(r8, r0)
            if (r9 != r1) goto L48
            goto L83
        L48:
            retrofit2.Response r9 = (retrofit2.Response) r9
            ulm.u0 r2 = r9.headers()
            java.lang.String r4 = "X-Retry-Timeout"
            java.lang.String r2 = r2.a(r4)
            if (r2 == 0) goto L6b
            java.lang.Long r2 = kotlin.text.z.n(r2)
            if (r2 == 0) goto L6b
            long r4 = r2.longValue()
            long r4 = java.lang.Math.abs(r4)
            pkm.e r2 = pkm.e.SECONDS
            long r4 = kotlin.time.c.h(r4, r2)
            goto L73
        L6b:
            r2 = 60
            pkm.e r4 = pkm.e.SECONDS
            long r4 = kotlin.time.c.g(r2, r4)
        L73:
            gw.p r2 = new gw.p
            r6 = 0
            r2.<init>(r9, r7, r8, r6)
            r0.u = r6
            r0.f215076x = r3
            java.lang.Object r7 = skm.h2.c(r4, r2, r0)
            if (r7 != r1) goto L84
        L83:
            return r1
        L84:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: nfj.z1.a(nfj.z1, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, java.lang.String r6, dej.a2 r7, java.lang.String r8, java.lang.String r9, gim.c r10) {
        /*
            r4 = this;
            boolean r0 = r10 instanceof nfj.x1
            if (r0 == 0) goto L13
            r0 = r10
            nfj.x1 r0 = (nfj.x1) r0
            int r1 = r0.f215069w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f215069w = r1
            goto L18
        L13:
            nfj.x1 r0 = new nfj.x1
            r0.<init>(r4, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f215069w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r10)
            goto L4a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r10)
            lfj.t r10 = new lfj.t
            if (r7 == 0) goto L3b
            java.lang.String r7 = r7.getValue()
            goto L3c
        L3b:
            r7 = 0
        L3c:
            r10.<init>(r6, r7, r8, r9)
            r0.f215069w = r3
            com.revolut.retail.feature.esim.impl.network.EsimSubscriptionsRefundQuoteService r6 = r4.f215080a
            java.lang.Object r10 = r6.cancelSubscription(r5, r10, r0)
            if (r10 != r1) goto L4a
            return r1
        L4a:
            retrofit2.Response r10 = (retrofit2.Response) r10
            int r5 = r10.code()
            r6 = 202(0xca, float:2.83E-43)
            if (r5 != r6) goto L86
            ulm.u0 r5 = r10.headers()
            java.lang.String r6 = "Retry-After"
            java.lang.String r5 = r5.a(r6)
            if (r5 == 0) goto L75
            java.lang.Long r5 = kotlin.text.z.n(r5)
            if (r5 == 0) goto L75
            long r5 = r5.longValue()
            long r5 = java.lang.Math.abs(r5)
            pkm.e r7 = pkm.e.SECONDS
            long r5 = kotlin.time.c.h(r5, r7)
            goto L7b
        L75:
            ynj.i r5 = r4.f215082c
            long r5 = ynj.i.b(r5)
        L7b:
            dej.y1 r7 = new dej.y1
            kotlin.time.b r8 = new kotlin.time.b
            r8.<init>(r5)
            r7.<init>(r8)
            return r7
        L86:
            retrofit2.HttpException r5 = new retrofit2.HttpException
            r5.<init>(r10)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: nfj.z1.b(java.lang.String, java.lang.String, dej.a2, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }
}
