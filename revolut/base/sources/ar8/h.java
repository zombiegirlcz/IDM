package ar8;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.junior_transfer.impl.ui.flow.block_transfer.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.junior_transfer.impl.ui.flow.block_transfer.a aVar, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new h(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((h) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        if (com.revolut.feature.junior_transfer.impl.ui.flow.block_transfer.a.I2(r6, (com.revolut.feature.junior_transfer.api.navigation.JuniorBlockInboundTransferNavigation$Mode.Block) r1, r5) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (com.revolut.feature.junior_transfer.impl.ui.flow.block_transfer.a.J2(r6, (com.revolut.feature.junior_transfer.api.navigation.JuniorBlockInboundTransferNavigation$Mode.Unblock) r1, r5) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        return r0;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.u
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L15:
            yhm.o.b(r6)
            goto L55
        L19:
            yhm.o.b(r6)
            com.revolut.feature.junior_transfer.impl.ui.flow.block_transfer.a r6 = r5.v
            ar8.c r1 = r6.o
            com.revolut.feature.junior_transfer.api.navigation.JuniorBlockInboundTransferNavigation$Mode r1 = r1.f8528b
            boolean r4 = r1 instanceof com.revolut.feature.junior_transfer.api.navigation.JuniorBlockInboundTransferNavigation$Mode.Block
            if (r4 == 0) goto L31
            com.revolut.feature.junior_transfer.api.navigation.JuniorBlockInboundTransferNavigation$Mode$Block r1 = (com.revolut.feature.junior_transfer.api.navigation.JuniorBlockInboundTransferNavigation$Mode.Block) r1
            r5.u = r3
            java.lang.Object r6 = com.revolut.feature.junior_transfer.impl.ui.flow.block_transfer.a.I2(r6, r1, r5)
            if (r6 != r0) goto L55
            goto L3f
        L31:
            boolean r3 = r1 instanceof com.revolut.feature.junior_transfer.api.navigation.JuniorBlockInboundTransferNavigation$Mode.Unblock
            if (r3 == 0) goto L40
            com.revolut.feature.junior_transfer.api.navigation.JuniorBlockInboundTransferNavigation$Mode$Unblock r1 = (com.revolut.feature.junior_transfer.api.navigation.JuniorBlockInboundTransferNavigation$Mode.Unblock) r1
            r5.u = r2
            java.lang.Object r6 = com.revolut.feature.junior_transfer.impl.ui.flow.block_transfer.a.J2(r6, r1, r5)
            if (r6 != r0) goto L55
        L3f:
            return r0
        L40:
            boolean r6 = r1 instanceof com.revolut.feature.junior_transfer.api.navigation.JuniorBlockInboundTransferNavigation$Mode.Informational
            if (r6 == 0) goto L58
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unexpected result for informational event"
            r6.<init>(r0)
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            r2 = 0
            rd0.d.a(r1, r2, r2, r6, r0)
        L55:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L58:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ar8.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
