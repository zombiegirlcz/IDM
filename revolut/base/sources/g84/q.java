package g84;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class q extends gim.i implements Function1 {
    public final /* synthetic */ int u = 1;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.i f141270w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ gim.i f141271x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Long f141272y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.i iVar, Function1 function1, Long l2, Continuation continuation) {
        super(1, continuation);
        this.f141270w = iVar;
        this.f141271x = (gim.i) function1;
        this.f141272y = l2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r3v0, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new q((Function1) this.f141271x, this.f141272y, this.f141270w, continuation);
            default:
                return new q(this.f141270w, (Function1) this.f141271x, this.f141272y, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((q) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v1, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r4v1, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            int r0 = r9.u
            switch(r0) {
                case 0: goto L35;
                default: goto L5;
            }
        L5:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r9.v
            r2 = 1
            if (r1 == 0) goto L1a
            if (r1 != r2) goto L12
            yhm.o.b(r10)
            goto L32
        L12:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1a:
            yhm.o.b(r10)
            g84.q r10 = new g84.q
            java.lang.Long r1 = r9.f141272y
            r3 = 0
            gim.i r4 = r9.f141271x
            com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.i r5 = r9.f141270w
            r10.<init>(r4, r1, r5, r3)
            r9.v = r2
            java.lang.Object r10 = r5.p2(r9, r10)
            if (r10 != r0) goto L32
            goto L34
        L32:
            kotlin.Unit r0 = kotlin.Unit.f186387a
        L34:
            return r0
        L35:
            com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.i r0 = r9.f141270w
            g84.e r1 = r0.f67384q
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r9.v
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L63
            if (r3 == r7) goto L5f
            if (r3 == r6) goto L5b
            if (r3 == r5) goto L57
            if (r3 != r4) goto L4f
            yhm.o.b(r10)
            goto L9d
        L4f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L57:
            yhm.o.b(r10)
            goto L92
        L5b:
            yhm.o.b(r10)
            goto L84
        L5f:
            yhm.o.b(r10)
            goto L71
        L63:
            yhm.o.b(r10)
            r9.v = r7
            gim.i r10 = r9.f141271x
            java.lang.Object r10 = r10.invoke(r9)
            if (r10 != r2) goto L71
            goto L9f
        L71:
            java.lang.Long r10 = r9.f141272y
            if (r10 == 0) goto L87
            long r7 = r10.longValue()
            r9.v = r6
            g84.m r1 = (g84.m) r1
            java.lang.Object r10 = r1.a(r7, r9)
            if (r10 != r2) goto L84
            goto L9f
        L84:
            it3.d r10 = (it3.d) r10
            goto L94
        L87:
            r9.v = r5
            g84.m r1 = (g84.m) r1
            java.lang.Object r10 = r1.b(r9)
            if (r10 != r2) goto L92
            goto L9f
        L92:
            it3.d r10 = (it3.d) r10
        L94:
            r9.v = r4
            java.lang.Object r10 = c84.t.N2(r0, r10, r9, r6)
            if (r10 != r2) goto L9d
            goto L9f
        L9d:
            kotlin.Unit r2 = kotlin.Unit.f186387a
        L9f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g84.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(Function1 function1, Long l2, com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.i iVar, Continuation continuation) {
        super(1, continuation);
        this.f141271x = (gim.i) function1;
        this.f141272y = l2;
        this.f141270w = iVar;
    }
}
