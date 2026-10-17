package sjf;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends i implements Function2 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        if (r13 == r0) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r12.u
            r2 = 2
            r3 = 1
            sjf.e r4 = r12.v
            r5 = 0
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            yhm.o.b(r13)
            goto L57
        L13:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1b:
            yhm.o.b(r13)
            goto L34
        L1f:
            yhm.o.b(r13)
            kotlin.time.b$a r13 = kotlin.time.b.INSTANCE
            r13 = 3
            pkm.e r1 = pkm.e.SECONDS
            long r6 = kotlin.time.c.g(r13, r1)
            r12.u = r3
            java.lang.Object r13 = skm.k0.c(r6, r12)
            if (r13 != r0) goto L34
            goto L56
        L34:
            tif.d r13 = r4.e
            tif.q r13 = (tif.q) r13
            r13.getClass()
            java.lang.String r1 = "priority"
            com.revolut.domain.interactors.transactions.Priority$STANDARD r3 = com.revolut.domain.interactors.transactions.Priority.STANDARD.f60263b
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)
            uif.g r1 = r13.e
            tif.k r6 = new tif.k
            r7 = 0
            r6.<init>(r13, r5, r5, r7)
            ufm.n r13 = r1.f(r3, r6)
            r12.u = r2
            java.lang.Object r13 = nim.a.b(r13, r12)
            if (r13 != r0) goto L57
        L56:
            return r0
        L57:
            java.lang.Integer r13 = (java.lang.Integer) r13
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r6 = rd0.c.DEBUG
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Transactions count from database: "
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r8 = r0.toString()
            r10 = 0
            r11 = 16
            java.lang.String r7 = "TransactionsPerformanceTracker"
            r9 = 0
            rd0.d.b(r6, r7, r8, r9, r10, r11)
            vkm.j2 r0 = r4.f
            kotlin.jvm.internal.Intrinsics.h(r13)
            r0.getClass()
            r0.g(r5, r13)
            ue0.c r0 = r4.d
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            kotlin.reflect.KType r2 = kotlin.jvm.internal.o0.b(r1)
            kotlin.reflect.KType r1 = kotlin.jvm.internal.o0.a(r1)
            kotlin.jvm.internal.p0 r3 = kotlin.jvm.internal.o0.f186429a
            kotlin.reflect.KType r1 = r3.h(r2, r1)
            java.lang.reflect.Type r1 = wim.z.d(r1)
            java.lang.String r2 = "TRANSACTIONS_COUNT"
            r0.G(r13, r2, r1)
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: sjf.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
