package wrd;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class p extends gim.i implements Function2 {
    public Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f299564w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ s f299565x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s sVar, Continuation continuation) {
        super(2, continuation);
        this.f299565x = sVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        p pVar = new p(this.f299565x, continuation);
        pVar.f299564w = obj2;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0099 A[PHI: r1
      0x0099: PHI (r1v3 java.lang.Object) = (r1v2 java.lang.Object), (r1v2 java.lang.Object), (r1v17 java.lang.Object) binds: [B:30:0x007c, B:32:0x0096, B:10:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f299564w
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.v
            r2 = 3
            r3 = 2
            r4 = 1
            wrd.s r5 = r7.f299565x
            r6 = 0
            if (r1 == 0) goto L39
            if (r1 == r4) goto L2c
            if (r1 == r3) goto L25
            if (r1 != r2) goto L1d
            java.lang.Object r0 = r7.u
            yhm.o.b(r8)
            goto Laf
        L1d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L25:
            java.lang.Object r1 = r7.u
            yhm.o.b(r8)
            goto L99
        L2c:
            java.lang.Object r1 = r7.u
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L36
            goto L5d
        L34:
            r8 = move-exception
            goto L73
        L36:
            r8 = move-exception
            goto Lb6
        L39:
            yhm.o.b(r8)
            yhm.m$a r8 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L36
            tsj.g r8 = r5.f299570p     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L36
            cli.y r1 = r5.f299571q     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L36
            java.lang.Object r1 = r1.f22677a     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L36
            vkm.j2 r1 = (vkm.j2) r1     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L36
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L36
            wrd.a r1 = (wrd.a) r1     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L36
            com.revolut.retail.feature.api.custom_assets.models.CustomAsset r1 = r1.f299549a     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L36
            java.lang.String r1 = r1.f99216a     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L36
            r7.f299564w = r6     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L36
            r7.u = r6     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L36
            r7.v = r4     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L36
            java.lang.Object r8 = r8.h(r1, r7)     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L36
            if (r8 != r0) goto L5d
            goto Lad
        L5d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L36
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L36
            if (r8 == 0) goto L6b
            kotlin.Unit r8 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L36
            yhm.m$a r1 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L36
        L69:
            r1 = r8
            goto L7a
        L6b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L36
            java.lang.String r1 = "Unsuccessful operation"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L36
            throw r8     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L36
        L73:
            yhm.m$a r1 = yhm.m.INSTANCE
            yhm.n r8 = yhm.o.a(r8)
            goto L69
        L7a:
            boolean r8 = r1 instanceof yhm.n
            if (r8 != 0) goto L99
            r8 = r1
            kotlin.Unit r8 = (kotlin.Unit) r8
            aii.o r8 = r5.l1()
            com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.a$a r4 = com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.a.C0550a.f87988b
            r8.M0(r4)
            int r8 = com.revolut.feature.spending_analytics.api.R$string.analytics_total_wealth_custom_assets_tooltip_current_value_updated
            r7.f299564w = r6
            r7.u = r1
            r7.v = r3
            java.lang.Object r8 = wrd.s.J2(r5, r8, r7)
            if (r8 != r0) goto L99
            goto Lad
        L99:
            java.lang.Throwable r8 = yhm.m.a(r1)
            if (r8 == 0) goto Lb0
            int r8 = com.revolut.feature.spending_analytics.api.R$string.analytics_total_wealth_custom_assets_error_update
            r7.f299564w = r6
            r7.u = r1
            r7.v = r2
            java.lang.Object r8 = wrd.s.I2(r5, r8, r7)
            if (r8 != r0) goto Lae
        Lad:
            return r0
        Lae:
            r0 = r1
        Laf:
            r1 = r0
        Lb0:
            yhm.m r8 = new yhm.m
            r8.<init>(r1)
            return r8
        Lb6:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: wrd.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
