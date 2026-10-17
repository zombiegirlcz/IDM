package com.revolut.feature.security_hub.impl.ui.flow;

import com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends gim.i implements Function1 {
    public OutboundTransactionLimit u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f85557w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ m f85558x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f85559y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CoroutineScope coroutineScope, m mVar, String str, boolean z, Continuation continuation) {
        super(1, continuation);
        this.f85557w = coroutineScope;
        this.f85558x = mVar;
        this.f85559y = str;
        this.z = z;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d(this.f85557w, this.f85558x, this.f85559y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0089, code lost:
    
        if (r10 == r1) goto L28;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r0 = r9.v
            com.revolut.feature.security_hub.impl.ui.flow.m r2 = r9.f85558x
            r3 = 2
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L25
            if (r0 == r4) goto L1e
            if (r0 != r3) goto L16
            com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimit r0 = r9.u
            yhm.o.b(r10)
            goto L8c
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1e:
            yhm.o.b(r10)     // Catch: java.lang.Throwable -> L22
            goto L69
        L22:
            r0 = move-exception
            r10 = r0
            goto L6e
        L25:
            yhm.o.b(r10)
            java.lang.String r10 = r9.f85559y
            boolean r0 = r9.z
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L22
            wtc.k r6 = r2.C     // Catch: java.lang.Throwable -> L22
            wtc.n r6 = (wtc.n) r6     // Catch: java.lang.Throwable -> L22
            r6.getClass()     // Catch: java.lang.Throwable -> L22
            java.lang.String r7 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r7)     // Catch: java.lang.Throwable -> L22
            cuc.u r6 = r6.f299887a     // Catch: java.lang.Throwable -> L22
            w4l.i r7 = w4l.i.f294643c     // Catch: java.lang.Throwable -> L22
            cuc.z r6 = (cuc.z) r6     // Catch: java.lang.Throwable -> L22
            r6.getClass()     // Catch: java.lang.Throwable -> L22
            java.lang.String r8 = "loadingStrategy"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r8)     // Catch: java.lang.Throwable -> L22
            x4l.c r6 = r6.e     // Catch: java.lang.Throwable -> L22
            kotlin.Unit r8 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L22
            vkm.d r6 = r6.b(r8, r7)     // Catch: java.lang.Throwable -> L22
            a31.i r7 = new a31.i     // Catch: java.lang.Throwable -> L22
            r8 = 20
            r7.<init>(r10, r0, r8)     // Catch: java.lang.Throwable -> L22
            akg.n r10 = nim.a.v(r6, r7)     // Catch: java.lang.Throwable -> L22
            r0 = 3
            jhi.b r10 = mo3.a.g(r10, r5, r5, r0)     // Catch: java.lang.Throwable -> L22
            r9.v = r4     // Catch: java.lang.Throwable -> L22
            java.lang.Object r10 = vkm.q.x(r10, r9)     // Catch: java.lang.Throwable -> L22
            if (r10 != r1) goto L69
            goto L8b
        L69:
            com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimit r10 = (com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimit) r10     // Catch: java.lang.Throwable -> L22
            yhm.m$a r0 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L22
            goto L74
        L6e:
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.n r10 = yhm.o.a(r10)
        L74:
            boolean r0 = r10 instanceof yhm.n
            if (r0 == 0) goto L79
            goto L7a
        L79:
            r5 = r10
        L7a:
            r0 = r5
            com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimit r0 = (com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimit) r0
            if (r0 == 0) goto L95
            buc.g r10 = r2.D
            r9.u = r0
            r9.v = r3
            java.lang.Object r10 = r10.a(r9)
            if (r10 != r1) goto L8c
        L8b:
            return r1
        L8c:
            com.revolut.feature.security_hub.impl.ui.LimitType r10 = (com.revolut.feature.security_hub.impl.ui.LimitType) r10
            com.revolut.feature.security_hub.impl.ui.flow.SecurityHubFlowContract$Step$TransactionsLimitChange r1 = new com.revolut.feature.security_hub.impl.ui.flow.SecurityHubFlowContract$Step$TransactionsLimitChange
            r1.<init>(r0, r10)
        L93:
            r4 = r1
            goto L98
        L95:
            com.revolut.feature.security_hub.impl.ui.flow.SecurityHubFlowContract$Step$TransactionsLimit r1 = com.revolut.feature.security_hub.impl.ui.flow.SecurityHubFlowContract$Step.TransactionsLimit.f85545a
            goto L93
        L98:
            yki.a r3 = r2.N
            com.revolut.kompot.navigable.TransitionAnimation$FADE r6 = com.revolut.kompot.navigable.TransitionAnimation.FADE.f98392a
            r7 = 0
            r8 = 8
            r5 = 0
            oki.h.t2(r2, r3, r4, r5, r6, r7, r8)
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.security_hub.impl.ui.flow.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
