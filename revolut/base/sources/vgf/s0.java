package vgf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class s0 extends gim.i implements Function1 {
    public com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a f289132w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f289133x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a aVar, Object obj2, Continuation continuation) {
        super(1, continuation);
        this.f289132w = aVar;
        this.f289133x = obj2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new s0(this.f289132w, this.f289133x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((s0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
    
        if (com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a.I2(r0, r1, r11) == r6) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0099, code lost:
    
        if (r1 == r6) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ad, code lost:
    
        if (r1 == r6) goto L37;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a r0 = r11.f289132w
            vgf.e1 r1 = r0.f91941y
            fim.a r6 = fim.a.COROUTINE_SUSPENDED
            int r2 = r11.v
            r3 = 4
            r5 = 3
            r7 = 2
            r8 = 1
            if (r2 == 0) goto L36
            if (r2 == r8) goto L32
            if (r2 == r7) goto L2e
            if (r2 == r5) goto L26
            if (r2 != r3) goto L1e
            com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a r0 = r11.u
            yhm.o.b(r12)
            r1 = r12
            goto Lb0
        L1e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L26:
            com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a r0 = r11.u
            yhm.o.b(r12)
            r1 = r12
            goto L9c
        L2e:
            yhm.o.b(r12)
            goto L8c
        L32:
            yhm.o.b(r12)
            return r12
        L36:
            yhm.o.b(r12)
            com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.TransactionsScreenContract$InputData r2 = r0.B
            com.revolut.feature.transactions.api.navigation.TransactionDestination r2 = r2.f91927c
            boolean r9 = r2 instanceof com.revolut.feature.transactions.api.navigation.TransactionDestination.Deeplink
            java.lang.Object r10 = r11.f289133x
            if (r9 == 0) goto L70
            wli.x r0 = r0.C
            com.revolut.feature.transactions.api.navigation.TransactionDestination$Deeplink r2 = (com.revolut.feature.transactions.api.navigation.TransactionDestination.Deeplink) r2
            android.net.Uri r1 = r2.f91983a
            tof.a3 r10 = (tof.a3) r10
            java.lang.String r2 = r10.f272581b
            android.net.Uri$Builder r1 = r1.buildUpon()
            android.net.Uri$Builder r1 = r1.appendPath(r2)
            android.net.Uri r1 = r1.build()
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r11.v = r8
            r2 = 0
            r3 = 0
            r5 = 6
            r4 = r11
            java.lang.Object r0 = lg0.b.x1(r0, r1, r2, r3, r4, r5)
            if (r0 != r6) goto L6f
            goto Laf
        L6f:
            return r0
        L70:
            boolean r2 = r2 instanceof com.revolut.feature.transactions.api.navigation.TransactionDestination.Details
            if (r2 == 0) goto La3
            g8i.a r2 = r0.I
            boolean r2 = r2.a()
            if (r2 == 0) goto L8f
            com.revolut.feature.unified_transactions.models.UnifiedTransaction$Standard r1 = new com.revolut.feature.unified_transactions.models.UnifiedTransaction$Standard
            tof.a3 r10 = (tof.a3) r10
            r1.<init>(r10)
            r11.v = r7
            java.lang.Object r0 = com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a.I2(r0, r1, r11)
            if (r0 != r6) goto L8c
            goto Laf
        L8c:
            kotlin.Unit r0 = kotlin.Unit.f186387a
            return r0
        L8f:
            tof.a3 r10 = (tof.a3) r10
            r11.u = r0
            r11.v = r5
            java.lang.Object r1 = r1.c(r10, r11)
            if (r1 != r6) goto L9c
            goto Laf
        L9c:
            aii.u r1 = (aii.u) r1
            aii.n r0 = r0.C1(r1)
            return r0
        La3:
            tof.a3 r10 = (tof.a3) r10
            r11.u = r0
            r11.v = r3
            java.lang.Object r1 = r1.c(r10, r11)
            if (r1 != r6) goto Lb0
        Laf:
            return r6
        Lb0:
            aii.u r1 = (aii.u) r1
            aii.n r0 = r0.C1(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vgf.s0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
