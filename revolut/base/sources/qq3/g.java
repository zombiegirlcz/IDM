package qq3;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements sp3.a {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f248469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xq3.c f248470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rq3.d f248471c;
    public final rq3.e d;

    public g(h dataMonitoringMediator, xq3.c clientMonitoringInteractor, rq3.d clientMonitoringConfigurationMapper, rq3.e dataMonitoringResultMapper) {
        Intrinsics.checkNotNullParameter(dataMonitoringMediator, "dataMonitoringMediator");
        Intrinsics.checkNotNullParameter(clientMonitoringInteractor, "clientMonitoringInteractor");
        Intrinsics.checkNotNullParameter(clientMonitoringConfigurationMapper, "clientMonitoringConfigurationMapper");
        Intrinsics.checkNotNullParameter(dataMonitoringResultMapper, "dataMonitoringResultMapper");
        this.f248469a = dataMonitoringMediator;
        this.f248470b = clientMonitoringInteractor;
        this.f248471c = clientMonitoringConfigurationMapper;
        this.d = dataMonitoringResultMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(bs3.i r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof qq3.b
            if (r0 == 0) goto L13
            r0 = r8
            qq3.b r0 = (qq3.b) r0
            int r1 = r0.f248460w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f248460w = r1
            goto L18
        L13:
            qq3.b r0 = new qq3.b
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f248460w
            java.lang.String r3 = "CreditDataMonitoringFacade"
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L2a
            goto L63
        L2a:
            r7 = move-exception
            goto L5a
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            yhm.o.b(r8)
            bs3.g r8 = r7.f18041c
            bs3.g r2 = bs3.g.INCOGNIA
            if (r8 != r2) goto L66
            com.revolut.feature_credit_data_monitoring_sdk_proxy.incognia.IncogniaCustomEvent r8 = new com.revolut.feature_credit_data_monitoring_sdk_proxy.incognia.IncogniaCustomEvent
            java.lang.String r2 = r7.f18039a
            java.util.Map r7 = r7.f18040b
            r8.<init>(r2, r7)
            qc0.e1 r7 = new qc0.e1     // Catch: java.lang.Throwable -> L2a
            r2 = 21
            r7.<init>(r6, r8, r5, r2)     // Catch: java.lang.Throwable -> L2a
            skm.p0 r8 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L2a
            elm.f r8 = elm.f.f127540b     // Catch: java.lang.Throwable -> L2a
            r0.f248460w = r4     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r7 = skm.e0.J(r8, r7, r0)     // Catch: java.lang.Throwable -> L2a
            if (r7 != r1) goto L63
            return r1
        L5a:
            zhm.h0 r8 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            rd0.d.a(r0, r3, r5, r7, r8)
        L63:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L66:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            bs3.g r7 = r7.f18041c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ClientMonitoringProviderType: "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = " is not supported for custom events"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            zhm.h0 r7 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            rd0.d.a(r0, r3, r5, r8, r7)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: qq3.g.a(bs3.i, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b3, code lost:
    
        if (skm.e0.J(r13, r7, r0) != r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r12, gim.c r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qq3.g.b(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a4, code lost:
    
        if (r4.collect(r12, r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r12, java.lang.String r13, java.util.Set r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r12 instanceof qq3.d
            if (r0 == 0) goto L13
            r0 = r12
            qq3.d r0 = (qq3.d) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            qq3.d r0 = new qq3.d
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.z
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.B
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4d
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            yhm.o.b(r12)     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            goto La7
        L2c:
            r12 = move-exception
            goto Lac
        L2f:
            r12 = move-exception
            goto Lbe
        L32:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3a:
            int r13 = r0.f248466y
            int r14 = r0.f248465x
            int r2 = r0.f248464w
            qq3.g r6 = r0.v
            java.lang.String r7 = r0.u
            yhm.o.b(r12)     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            r10 = r2
            r2 = r13
            r13 = r7
            r7 = r6
            r6 = r10
            goto L75
        L4d:
            yhm.o.b(r12)
            yhm.m$a r12 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            qq3.h r12 = r11.f248469a     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            r0.u = r13     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            r0.v = r11     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            r2 = 0
            r0.f248464w = r2     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            r0.f248465x = r2     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            r0.f248466y = r2     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            r0.B = r4     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            qq3.i r12 = (qq3.i) r12     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            r12.getClass()     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            pn2.c r6 = new pn2.c     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            r6.<init>(r12, r14, r5)     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            vkm.f r12 = vkm.q.m(r6)     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            if (r12 != r1) goto L72
            goto La6
        L72:
            r7 = r11
            r14 = r2
            r6 = r14
        L75:
            kotlinx.coroutines.flow.Flow r12 = (kotlinx.coroutines.flow.Flow) r12     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            kotlinx.coroutines.flow.Flow r12 = com.google.crypto.tink.shaded.protobuf.t1.E(r12)     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            rq3.e r8 = r7.d     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            qna.n r9 = new qna.n     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            r9.<init>(r12, r8, r4)     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            aj6.u r12 = new aj6.u     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            r4 = 3
            r12.<init>(r4, r4, r5)     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            vkm.y r4 = new vkm.y     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            r4.<init>(r9, r12)     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            pkf.d1 r12 = new pkf.d1     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            r8 = 25
            r12.<init>(r7, r13, r8)     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            r0.u = r5     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            r0.v = r5     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            r0.f248464w = r6     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            r0.f248465x = r14     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            r0.f248466y = r2     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            r0.B = r3     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            java.lang.Object r12 = r4.collect(r12, r0)     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            if (r12 != r1) goto La7
        La6:
            return r1
        La7:
            kotlin.Unit r12 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            yhm.m$a r13 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            goto Lb2
        Lac:
            yhm.m$a r13 = yhm.m.INSTANCE
            yhm.n r12 = yhm.o.a(r12)
        Lb2:
            java.lang.Throwable r12 = yhm.m.a(r12)
            if (r12 == 0) goto Lbb
            hx7.e.n(r12)
        Lbb:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        Lbe:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: qq3.g.c(gim.c, java.lang.String, java.util.Set):java.lang.Object");
    }
}
