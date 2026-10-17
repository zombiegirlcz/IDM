package k50;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final class p3 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j4 f181208w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(Object obj2, j4 j4Var, Continuation continuation) {
        super(1, continuation);
        this.v = obj2;
        this.f181208w = j4Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new p3(this.v, this.f181208w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((p3) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0099, code lost:
    
        if (r0.Z2(r15, r14) == r2) goto L40;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            k50.j4 r1 = r14.f181208w
            cli.y r0 = r1.f181140w0
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r14.u
            r4 = 2
            r5 = 1
            java.lang.Object r6 = r14.v
            r7 = 0
            if (r3 == 0) goto L2e
            if (r3 == r5) goto L21
            if (r3 != r4) goto L19
            yhm.o.b(r15)
            r13 = r14
            goto L9c
        L19:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L21:
            yhm.o.b(r15)     // Catch: java.lang.Exception -> L26 java.util.concurrent.CancellationException -> L2a
            goto L88
        L26:
            r0 = move-exception
            r15 = r0
            r13 = r14
            goto L7d
        L2a:
            r0 = move-exception
            r15 = r0
            r13 = r14
            goto L87
        L2e:
            yhm.o.b(r15)
            r15 = r6
            v20.m2$b r15 = (v20.m2.b) r15
            java.lang.String r11 = r15.getActionId()
            if (r11 == 0) goto L88
            java.lang.Object r15 = r0.f22677a
            vkm.j2 r15 = (vkm.j2) r15
            java.lang.Object r15 = r15.getValue()
            k50.h0 r15 = (k50.h0) r15
            java.util.UUID r10 = r15.f181079a
            if (r10 != 0) goto L49
            goto L88
        L49:
            d4m.a r15 = r1.O     // Catch: java.lang.Exception -> L77 java.util.concurrent.CancellationException -> L7a
            java.lang.Object r15 = r15.get()     // Catch: java.lang.Exception -> L77 java.util.concurrent.CancellationException -> L7a
            r8 = r15
            o50.b r8 = (o50.b) r8     // Catch: java.lang.Exception -> L77 java.util.concurrent.CancellationException -> L7a
            java.lang.Object r15 = r0.f22677a     // Catch: java.lang.Exception -> L77 java.util.concurrent.CancellationException -> L7a
            vkm.j2 r15 = (vkm.j2) r15     // Catch: java.lang.Exception -> L77 java.util.concurrent.CancellationException -> L7a
            java.lang.Object r15 = r15.getValue()     // Catch: java.lang.Exception -> L77 java.util.concurrent.CancellationException -> L7a
            k50.h0 r15 = (k50.h0) r15     // Catch: java.lang.Exception -> L77 java.util.concurrent.CancellationException -> L7a
            k50.m1 r15 = r15.d     // Catch: java.lang.Exception -> L77 java.util.concurrent.CancellationException -> L7a
            java.util.List r9 = r15.f181178a     // Catch: java.lang.Exception -> L77 java.util.concurrent.CancellationException -> L7a
            r15 = r6
            v20.m2$b r15 = (v20.m2.b) r15     // Catch: java.lang.Exception -> L77 java.util.concurrent.CancellationException -> L7a
            java.lang.String r12 = r15.getLabel()     // Catch: java.lang.Exception -> L77 java.util.concurrent.CancellationException -> L7a
            r14.u = r5     // Catch: java.lang.Exception -> L77 java.util.concurrent.CancellationException -> L7a
            r13 = r14
            java.lang.Object r15 = r8.a(r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> L71 java.util.concurrent.CancellationException -> L74
            if (r15 != r2) goto L89
            goto L9b
        L71:
            r0 = move-exception
        L72:
            r15 = r0
            goto L7d
        L74:
            r0 = move-exception
        L75:
            r15 = r0
            goto L87
        L77:
            r0 = move-exception
            r13 = r14
            goto L72
        L7a:
            r0 = move-exception
            r13 = r14
            goto L75
        L7d:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r3 = rd0.d.f253311a
            rd0.c r3 = rd0.c.WARNING
            rd0.d.a(r3, r7, r7, r15, r0)
            goto L89
        L87:
            throw r15
        L88:
            r13 = r14
        L89:
            v20.m2$b r6 = (v20.m2.b) r6
            java.lang.String r15 = r6.getDeeplink()
            if (r15 == 0) goto L9e
            k50.f0 r0 = r1.C
            r13.u = r4
            java.lang.Object r15 = r0.Z2(r15, r14)
            if (r15 != r2) goto L9c
        L9b:
            return r2
        L9c:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L9e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: k50.p3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
