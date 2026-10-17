package nv4;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class v extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.statement.export.b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.revolut.feature.credit.card.impl.ui.statement.export.b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new v(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((v) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        if (r7 == r0) goto L17;
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
            com.revolut.feature.credit.card.impl.ui.statement.export.b r3 = r6.v
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r2) goto L12
            yhm.o.b(r7)
            goto L51
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            yhm.o.b(r7)
            goto L3c
        L1e:
            yhm.o.b(r7)
            cli.y r7 = r3.f69703t
            java.lang.Object r7 = r7.f22677a
            vkm.j2 r7 = (vkm.j2) r7
            java.lang.Object r7 = r7.getValue()
            nv4.i r7 = (nv4.i) r7
            java.time.LocalDate r7 = r7.f219464a
            if (r7 == 0) goto L70
            nv4.h r1 = nv4.h.EXCEL
            r6.u = r4
            java.lang.Object r7 = com.revolut.feature.credit.card.impl.ui.statement.export.b.I2(r3, r7, r1, r6)
            if (r7 != r0) goto L3c
            goto L50
        L3c:
            nv4.g r7 = (nv4.g) r7
            java.lang.String r7 = r7.f219463b
            hk0.a r1 = r3.f69701r
            com.revolut.core.model.FileExtension$Csv r5 = com.revolut.core.model.FileExtension.Csv.f51401b
            ufm.n r7 = r1.b(r7, r4, r5)
            r6.u = r2
            java.lang.Object r7 = nim.a.b(r7, r6)
            if (r7 != r0) goto L51
        L50:
            return r0
        L51:
            java.io.File r7 = (java.io.File) r7
            an4.e r0 = r3.f69699p
            kotlin.jvm.internal.Intrinsics.h(r7)
            r0.getClass()
            java.lang.String r1 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            com.revolut.kompot.bridge.navigation.BridgeDestination r1 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            n0e.b r0 = r0.f6557a
            com.revolut.retail.core.navigation.ActivityNavigateCommand r7 = r0.a(r7)
            r1.<init>(r7)
            aii.n r7 = r3.C1(r1)
            return r7
        L70:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: nv4.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
