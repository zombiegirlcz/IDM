package cbh;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes9.dex */
public final class u implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f22846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f22847c;

    public /* synthetic */ u(FlowCollector flowCollector, y yVar, int i) {
        this.f22845a = i;
        this.f22846b = flowCollector;
        this.f22847c = yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            int r0 = r5.f22845a
            switch(r0) {
                case 0: goto L4b;
                default: goto L5;
            }
        L5:
            boolean r0 = r7 instanceof cbh.v
            if (r0 == 0) goto L18
            r0 = r7
            cbh.v r0 = (cbh.v) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.v = r1
            goto L1d
        L18:
            cbh.v r0 = new cbh.v
            r0.<init>(r5, r7)
        L1d:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r7)
            goto L48
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            yhm.o.b(r7)
            kotlin.Unit r6 = (kotlin.Unit) r6
            cbh.y r6 = r5.f22847c
            tzg.g r6 = r6.D
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r7 = r5.f22846b
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto L48
            goto L4a
        L48:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L4a:
            return r1
        L4b:
            boolean r0 = r7 instanceof cbh.t
            if (r0 == 0) goto L5e
            r0 = r7
            cbh.t r0 = (cbh.t) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L5e
            int r1 = r1 - r2
            r0.v = r1
            goto L63
        L5e:
            cbh.t r0 = new cbh.t
            r0.<init>(r5, r7)
        L63:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L7a
            if (r2 != r3) goto L72
            yhm.o.b(r7)
            goto L97
        L72:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L7a:
            yhm.o.b(r7)
            com.revolut.feature.wealth.api.domain.model.transactions.InvestTransaction r6 = (com.revolut.feature.wealth.api.domain.model.transactions.InvestTransaction) r6
            tzg.e r7 = new tzg.e
            cbh.y r2 = r5.f22847c
            com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter r2 = r2.I2()
            r4 = 100
            r7.<init>(r2, r4, r6)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r5.f22846b
            java.lang.Object r6 = r6.emit(r7, r0)
            if (r6 != r1) goto L97
            goto L99
        L97:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L99:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cbh.u.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
