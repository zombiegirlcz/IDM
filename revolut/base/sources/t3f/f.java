package t3f;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ o v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(o oVar, Continuation continuation) {
        super(2, continuation);
        this.v = oVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        if (r13 == r9) goto L29;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            t3f.o r2 = r12.v
            vkm.j2 r8 = r2.f267780p
            fim.a r9 = fim.a.COROUTINE_SUSPENDED
            int r0 = r12.u
            r10 = 2
            r1 = 1
            r11 = 0
            if (r0 == 0) goto L2f
            if (r0 == r1) goto L24
            if (r0 != r10) goto L1c
            yhm.o.b(r13)     // Catch: java.lang.Throwable -> L19
            yhm.m r13 = (yhm.m) r13     // Catch: java.lang.Throwable -> L19
            java.lang.Object r13 = r13.f314193a     // Catch: java.lang.Throwable -> L19
            goto L7a
        L19:
            r0 = move-exception
            r13 = r0
            goto L88
        L1c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L24:
            yhm.o.b(r13)     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2b
            goto L3d
        L28:
            r0 = move-exception
            r13 = r0
            goto L91
        L2b:
            r0 = move-exception
            r13 = r0
            goto Laa
        L2f:
            yhm.o.b(r13)
            z3f.d r13 = r2.d     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2b
            r12.u = r1     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2b
            java.lang.Object r13 = r13.a(r12)     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2b
            if (r13 != r9) goto L3d
            goto L79
        L3d:
            e4f.c r13 = (e4f.c) r13     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2b
            boolean r13 = r13.b()
            if (r13 == 0) goto L59
            java.util.concurrent.CopyOnWriteArrayList r13 = rd0.d.f253311a
            rd0.c r0 = rd0.c.VERBOSE
            r4 = 0
            r5 = 16
            java.lang.String r1 = "TradingTransactionsLoader"
            java.lang.String r2 = "History loading skipped based on persisted synchronization state"
            r3 = 0
            rd0.d.b(r0, r1, r2, r3, r4, r5)
            yhm.m$a r13 = yhm.m.INSTANCE
            kotlin.Unit r13 = kotlin.Unit.f186387a
            goto L82
        L59:
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            r8.getClass()
            r8.g(r11, r13)
            java.lang.String r13 = "Trading transactions history loading"
            su0.c r0 = new su0.c     // Catch: java.lang.Throwable -> L19
            java.lang.Class<t3f.o> r3 = t3f.o.class
            java.lang.String r4 = "loadHistory"
            java.lang.String r5 = "loadHistory(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            r6 = 0
            r7 = 7
            r1 = 1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L19
            r12.u = r10     // Catch: java.lang.Throwable -> L19
            java.lang.Object r13 = t3f.o.d(r2, r13, r0, r12)     // Catch: java.lang.Throwable -> L19
            if (r13 != r9) goto L7a
        L79:
            return r9
        L7a:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r8.getClass()
            r8.g(r11, r0)
        L82:
            yhm.m r0 = new yhm.m
            r0.<init>(r13)
            return r0
        L88:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r8.getClass()
            r8.g(r11, r0)
            throw r13
        L91:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            java.lang.String r2 = "Failed to read trading transactions sync state"
            java.lang.String r3 = "TradingTransactionsLoader"
            rd0.d.a(r1, r3, r2, r13, r0)
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.n r13 = yhm.o.a(r13)
            yhm.m r0 = new yhm.m
            r0.<init>(r13)
            return r0
        Laa:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: t3f.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
