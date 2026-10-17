package xta;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import rp0.p0;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends i implements Function2 {
    public String u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f308794w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Continuation continuation) {
        super(2, continuation);
        this.f308794w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.f308794w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((p0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(1:42)|(1:(1:(6:6|48|7|33|38|39)(2:11|12))(3:13|46|14))(5:18|49|19|(1:22)|31)|23|28|44|29|(4:32|33|38|39)|31) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0079, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007a, code lost:
    
        r1 = "handleDeeplink";
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r0 = r13.v
            r2 = 0
            java.lang.String r3 = "throwable"
            r4 = 2
            r5 = 1
            xta.d r6 = r13.f308794w
            if (r0 == 0) goto L2c
            if (r0 == r5) goto L23
            if (r0 != r4) goto L1b
            java.lang.String r1 = r13.u
            yhm.o.b(r14)     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> L8d
            goto L76
        L17:
            r0 = move-exception
        L18:
            r14 = r0
            goto L7c
        L1b:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L23:
            java.lang.String r5 = r13.u
            yhm.o.b(r14)     // Catch: java.lang.Exception -> L29 java.util.concurrent.CancellationException -> L5a
            goto L43
        L29:
            r0 = move-exception
        L2a:
            r14 = r0
            goto L49
        L2c:
            yhm.o.b(r14)
            java.lang.String r14 = "negativeRate"
            yta.b r0 = r6.f308797m     // Catch: java.lang.Exception -> L46 java.util.concurrent.CancellationException -> L5a
            pfm.f r0 = r0.a()     // Catch: java.lang.Exception -> L46 java.util.concurrent.CancellationException -> L5a
            r13.u = r14     // Catch: java.lang.Exception -> L46 java.util.concurrent.CancellationException -> L5a
            r13.v = r5     // Catch: java.lang.Exception -> L46 java.util.concurrent.CancellationException -> L5a
            java.lang.Object r0 = nim.a.a(r0, r13)     // Catch: java.lang.Exception -> L46 java.util.concurrent.CancellationException -> L5a
            if (r0 != r1) goto L42
            goto L73
        L42:
            r5 = r14
        L43:
            kotlin.Unit r14 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L29 java.util.concurrent.CancellationException -> L5a
            goto L5a
        L46:
            r0 = move-exception
            r5 = r14
            goto L2a
        L49:
            com.revolut.feature.rating.impl.extension.AppRatingException r0 = new com.revolut.feature.rating.impl.extension.AppRatingException
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r3)
            r0.<init>(r5, r14)
            zhm.h0 r14 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r5 = rd0.d.f253311a
            rd0.c r5 = rd0.c.ERROR
            rd0.d.a(r5, r2, r2, r0, r14)
        L5a:
            java.lang.String r14 = "handleDeeplink"
            wli.x r7 = r6.o     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L8d
            dqk.f r0 = r6.f308800q     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L8d
            r0.getClass()     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L8d
            java.lang.String r8 = "revolut://app/form/48001d04-56d2-447f-b51b-00457fc61dbc"
            r13.u = r14     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L8d
            r13.v = r4     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L8d
            r9 = 0
            r10 = 0
            r12 = 6
            r11 = r13
            java.lang.Object r0 = lg0.b.x1(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L8d
            if (r0 != r1) goto L74
        L73:
            return r1
        L74:
            r1 = r14
            r14 = r0
        L76:
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> L8d
            goto L8d
        L79:
            r0 = move-exception
            r1 = r14
            goto L18
        L7c:
            com.revolut.feature.rating.impl.extension.AppRatingException r0 = new com.revolut.feature.rating.impl.extension.AppRatingException
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r3)
            r0.<init>(r1, r14)
            zhm.h0 r14 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r2, r2, r0, r14)
        L8d:
            xta.d.Z2(r6)
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: xta.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
