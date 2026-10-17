package gh8;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.junior_graduation.impl.ui.screen.identification.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.revolut.feature.junior_graduation.impl.ui.screen.identification.a aVar, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new m(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((m) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (skm.k0.c(r5, r7) == r0) goto L21;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.u
            r2 = 0
            com.revolut.feature.junior_graduation.impl.ui.screen.identification.a r3 = r7.v
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L1f
            if (r1 == r5) goto L1b
            if (r1 != r4) goto L13
            yhm.o.b(r8)
            goto L63
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            yhm.o.b(r8)
            goto L49
        L1f:
            yhm.o.b(r8)
            kye.e r8 = r3.f76943r
            r7.u = r5
            r8.getClass()
            od0.a r1 = od0.a.f224253a
            boolean r1 = od0.a.e()
            if (r1 == 0) goto L44
            skm.p0 r1 = skm.p0.f264001a
            elm.f r1 = elm.f.f127540b
            og8.a r6 = new og8.a
            r6.<init>(r8, r2, r5)
            java.lang.Object r8 = skm.e0.J(r1, r6, r7)
            if (r8 != r0) goto L41
            goto L46
        L41:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            goto L46
        L44:
            kotlin.Unit r8 = kotlin.Unit.f186387a
        L46:
            if (r8 != r0) goto L49
            goto L62
        L49:
            com.revolut.retail.core.navigation.CollapseApplicationCommand r8 = com.revolut.retail.core.navigation.CollapseApplicationCommand.f98628a
            com.revolut.kompot.bridge.navigation.BridgeDestination r8 = zh9.u0.b(r8)
            r3.C1(r8)
            kotlin.time.b$a r8 = kotlin.time.b.INSTANCE
            pkm.e r8 = pkm.e.SECONDS
            long r5 = kotlin.time.c.g(r5, r8)
            r7.u = r4
            java.lang.Object r8 = skm.k0.c(r5, r7)
            if (r8 != r0) goto L63
        L62:
            return r0
        L63:
            com.revolut.kompot.common.ExternalDestination$ByIntent r8 = new com.revolut.kompot.common.ExternalDestination$ByIntent
            jh8.a r0 = r3.f76945t
            r0.getClass()
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "revolut://app/youth/graduation/confirm-identity"
            android.net.Uri r1 = android.net.Uri.parse(r1)
            java.lang.String r4 = "android.intent.action.VIEW"
            r0.<init>(r4, r1)
            r8.<init>(r0, r2)
            aii.n r8 = r3.C1(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: gh8.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
