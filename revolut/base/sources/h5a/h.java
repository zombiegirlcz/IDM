package h5a;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ j v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, Continuation continuation) {
        super(2, continuation);
        this.v = jVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        if (r9 != r0) goto L24;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r8.u
            r2 = 3
            r3 = 2
            r4 = 1
            h5a.j r5 = r8.v
            if (r1 == 0) goto L25
            if (r1 == r4) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            yhm.o.b(r9)
            goto L74
        L15:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1d:
            yhm.o.b(r9)
            goto L6b
        L21:
            yhm.o.b(r9)
            goto L31
        L25:
            yhm.o.b(r9)
            r8.u = r4
            java.lang.Object r9 = h5a.j.a(r5, r8)
            if (r9 != r0) goto L31
            goto L73
        L31:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L3a
            goto L7c
        L3a:
            com.revolut.domain.interactors.transactions.a r9 = r5.f149523a
            tof.q6[] r1 = new tof.q6[r4]
            tof.i1 r6 = tof.i1.f272794a
            r7 = 0
            r1[r7] = r6
            mjf.b0 r9 = (mjf.b0) r9
            efm.r r9 = r9.m(r1)
            h3d.a r1 = new h3d.a
            r6 = 16
            r1.<init>(r6)
            h35.c r6 = new h35.c
            r6.<init>(r4, r1)
            efm.r r9 = r9.filter(r6)
            efm.d0 r9 = r9.firstOrError()
            java.lang.String r1 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r1)
            r8.u = r3
            java.lang.Object r9 = nim.a.b(r9, r8)
            if (r9 != r0) goto L6b
            goto L73
        L6b:
            r8.u = r2
            java.lang.Object r9 = h5a.j.a(r5, r8)
            if (r9 != r0) goto L74
        L73:
            return r0
        L74:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L7f
        L7c:
            com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.b$a r9 = com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.b.a.f80194a
            return r9
        L7f:
            l5a.n r9 = new l5a.n
            l5a.k r0 = l5a.k.CONTENT
            r9.<init>(r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: h5a.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
