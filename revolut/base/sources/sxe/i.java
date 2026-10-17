package sxe;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.stored_method.flow.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f266474w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f266475x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.revolut.feature.topup_screen.impl.flows.stored_method.flow.b bVar, String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f266474w = str;
        this.f266475x = str2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new i(this.v, this.f266474w, this.f266475x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((i) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        if (r10 == r0) goto L25;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r9.u
            java.lang.String r6 = r9.f266474w
            com.revolut.feature.topup_screen.impl.flows.stored_method.flow.b r2 = r9.v
            r3 = 2
            r8 = 1
            if (r1 == 0) goto L20
            if (r1 == r8) goto L1c
            if (r1 != r3) goto L14
            yhm.o.b(r10)
            goto L6f
        L14:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1c:
            yhm.o.b(r10)
            goto L32
        L20:
            yhm.o.b(r10)
            xg6.l r10 = r2.f90799s
            ufm.n r10 = r10.d(r6)
            r9.u = r8
            java.lang.Object r10 = nim.a.b(r10, r9)
            if (r10 != r0) goto L32
            goto L6e
        L32:
            com.revolut.feature.external_accounts.api.model.RevokeUrlDataModel r10 = (com.revolut.feature.external_accounts.api.model.RevokeUrlDataModel) r10
            java.lang.String r1 = r10.f72233b
            qe6.d r10 = r10.f72232a
            qe6.d r4 = qe6.d.REDIRECT_NEEDED
            r7 = 0
            if (r10 != r4) goto L50
            if (r1 == 0) goto L50
            boolean r10 = kotlin.text.d0.W(r1)
            if (r10 == 0) goto L46
            goto L50
        L46:
            com.revolut.kompot.common.ExternalDestination$Browser r10 = new com.revolut.kompot.common.ExternalDestination$Browser
            r10.<init>(r1, r7)
            r2.C1(r10)
            r8 = 0
            goto L6f
        L50:
            u51.a r10 = r2.f90798r
            r9.u = r3
            r4 = r10
            e0f.r1 r4 = (e0f.r1) r4
            r4.getClass()
            dp4.p r2 = new dp4.p
            r3 = 8
            java.lang.String r5 = r9.f266475x
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.Object r10 = skm.e0.o(r2, r9)
            if (r10 != r0) goto L6a
            goto L6c
        L6a:
            kotlin.Unit r10 = kotlin.Unit.f186387a
        L6c:
            if (r10 != r0) goto L6f
        L6e:
            return r0
        L6f:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: sxe.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
