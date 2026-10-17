package srd;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends gim.i implements Function2 {
    public q u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f265175w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f265176x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f265177y;
    public final /* synthetic */ q z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(q qVar, Continuation continuation) {
        super(2, continuation);
        this.z = qVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.z, continuation);
        mVar.f265177y = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        if (srd.q.I2(r5, r7, r6) == r0) goto L28;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f265177y
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f265176x
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L2f
            if (r1 == r3) goto L25
            if (r1 != r2) goto L1d
            srd.q r0 = r6.u
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L19 java.util.concurrent.CancellationException -> L1b
            goto L71
        L19:
            r7 = move-exception
            goto L76
        L1b:
            r7 = move-exception
            goto L82
        L1d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L25:
            int r1 = r6.f265175w
            int r3 = r6.v
            srd.q r5 = r6.u
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L19 java.util.concurrent.CancellationException -> L1b
            goto L50
        L2f:
            yhm.o.b(r7)
            srd.q r5 = r6.z
            yhm.m$a r7 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L19 java.util.concurrent.CancellationException -> L1b
            rik.e r7 = new rik.e     // Catch: java.lang.Throwable -> L19 java.util.concurrent.CancellationException -> L1b
            r1 = 27
            r7.<init>(r5, r4, r1)     // Catch: java.lang.Throwable -> L19 java.util.concurrent.CancellationException -> L1b
            r6.f265177y = r4     // Catch: java.lang.Throwable -> L19 java.util.concurrent.CancellationException -> L1b
            r6.u = r5     // Catch: java.lang.Throwable -> L19 java.util.concurrent.CancellationException -> L1b
            r1 = 0
            r6.v = r1     // Catch: java.lang.Throwable -> L19 java.util.concurrent.CancellationException -> L1b
            r6.f265175w = r1     // Catch: java.lang.Throwable -> L19 java.util.concurrent.CancellationException -> L1b
            r6.f265176x = r3     // Catch: java.lang.Throwable -> L19 java.util.concurrent.CancellationException -> L1b
            java.lang.Object r7 = r5.p2(r6, r7)     // Catch: java.lang.Throwable -> L19 java.util.concurrent.CancellationException -> L1b
            if (r7 != r0) goto L4f
            goto L70
        L4f:
            r3 = r1
        L50:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L19 java.util.concurrent.CancellationException -> L1b
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L19 java.util.concurrent.CancellationException -> L1b
            if (r7 == 0) goto L5e
            srd.e$a r7 = srd.e.a.f265169a     // Catch: java.lang.Throwable -> L19 java.util.concurrent.CancellationException -> L1b
            r5.C2(r7)     // Catch: java.lang.Throwable -> L19 java.util.concurrent.CancellationException -> L1b
            goto L71
        L5e:
            int r7 = com.revolut.feature.spending_analytics.api.R$string.analytics_total_wealth_custom_assets_error_remove     // Catch: java.lang.Throwable -> L19 java.util.concurrent.CancellationException -> L1b
            r6.f265177y = r4     // Catch: java.lang.Throwable -> L19 java.util.concurrent.CancellationException -> L1b
            r6.u = r4     // Catch: java.lang.Throwable -> L19 java.util.concurrent.CancellationException -> L1b
            r6.v = r3     // Catch: java.lang.Throwable -> L19 java.util.concurrent.CancellationException -> L1b
            r6.f265175w = r1     // Catch: java.lang.Throwable -> L19 java.util.concurrent.CancellationException -> L1b
            r6.f265176x = r2     // Catch: java.lang.Throwable -> L19 java.util.concurrent.CancellationException -> L1b
            java.lang.Object r7 = srd.q.I2(r5, r7, r6)     // Catch: java.lang.Throwable -> L19 java.util.concurrent.CancellationException -> L1b
            if (r7 != r0) goto L71
        L70:
            return r0
        L71:
            kotlin.Unit r7 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L19 java.util.concurrent.CancellationException -> L1b
            yhm.m$a r0 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L19 java.util.concurrent.CancellationException -> L1b
            goto L7c
        L76:
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.n r7 = yhm.o.a(r7)
        L7c:
            yhm.m r0 = new yhm.m
            r0.<init>(r7)
            return r0
        L82:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: srd.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
