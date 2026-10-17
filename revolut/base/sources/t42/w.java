package t42;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final class w extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c cVar, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new w(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((w) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        if (((c52.r) r1).m3(r7, r6) == r0) goto L20;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.u
            r2 = 2
            r3 = 1
            com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c r4 = r6.v
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            yhm.o.b(r7)
            goto L58
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            yhm.o.b(r7)
            goto L3d
        L1e:
            yhm.o.b(r7)
            com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.b r7 = r4.o
            r6.u = r3
            com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.TransferAmountContract$InputData r1 = r7.f62438a
            boolean r3 = r1 instanceof com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.TransferAmountContract$InputData.NewTransfer
            if (r3 == 0) goto L32
            com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.TransferAmountContract$InputData$NewTransfer r1 = (com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.TransferAmountContract$InputData.NewTransfer) r1
            java.lang.Object r7 = r7.a(r1, r6)
            goto L3a
        L32:
            boolean r7 = r1 instanceof com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.TransferAmountContract$InputData.WithTransferData
            if (r7 == 0) goto L5b
            com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.TransferAmountContract$InputData$WithTransferData r1 = (com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.TransferAmountContract$InputData.WithTransferData) r1
            com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferData r7 = r1.f62432g
        L3a:
            if (r7 != r0) goto L3d
            goto L57
        L3d:
            com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferData r7 = (com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferData) r7
            cli.y r1 = r4.G
            sx8.a r3 = new sx8.a
            r5 = 21
            r3.<init>(r7, r5)
            r4.H2(r1, r3)
            c52.c r1 = r4.f62445r
            r6.u = r2
            c52.r r1 = (c52.r) r1
            java.lang.Object r7 = r1.m3(r7, r6)
            if (r7 != r0) goto L58
        L57:
            return r0
        L58:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L5b:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: t42.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
