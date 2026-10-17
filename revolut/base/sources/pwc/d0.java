package pwc;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d0(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007a, code lost:
    
        if (r11.f(r10) == r2) goto L17;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a r0 = r10.v
            com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.WealthProtectionLimitChangeScreenContract$InputData r1 = r0.o
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r10.u
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L20
            if (r3 == r5) goto L1c
            if (r3 != r4) goto L14
            yhm.o.b(r11)
            goto L7d
        L14:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1c:
            yhm.o.b(r11)
            goto L33
        L20:
            yhm.o.b(r11)
            pwc.c0 r11 = new pwc.c0
            r3 = 1
            r6 = 0
            r11.<init>(r0, r6, r3)
            r10.u = r5
            java.lang.Object r11 = r0.p2(r10, r11)
            if (r11 != r2) goto L33
            goto L7c
        L33:
            cli.y r11 = r0.D
            java.lang.Object r11 = r11.f22677a
            vkm.j2 r11 = (vkm.j2) r11
            java.lang.Object r11 = r11.getValue()
            pwc.g r11 = (pwc.g) r11
            com.revolut.feature.security_hub.api.models.WealthProtectionFeatureState$Visible r11 = r11.f240400a
            wtc.u0 r3 = r0.f85786s
            qtc.k r5 = r1.f85775a
            com.revolut.feature.security_hub.api.models.WealthProtectionFeatureDetails$Disabled r6 = new com.revolut.feature.security_hub.api.models.WealthProtectionFeatureDetails$Disabled
            java.lang.String r7 = r5.name()
            xi0.b r8 = r11.getF85444a()
            dj0.d r9 = r11.getD()
            com.revolut.feature.security_hub.api.models.WealthProtectionSuggestedAmount r11 = r11.getE()
            r6.<init>(r7, r8, r9, r11)
            r3.getClass()
            java.lang.String r11 = "feature"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r11)
            java.lang.String r11 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r11)
            java.util.HashMap r11 = r3.f299910a
            r11.put(r5, r6)
            qtc.k r11 = r1.f85775a
            qtc.k r1 = qtc.k.TRANSFERS
            if (r11 != r1) goto L7d
            wtc.g0 r11 = r0.v
            r10.u = r4
            java.lang.Object r11 = r11.f(r10)
            if (r11 != r2) goto L7d
        L7c:
            return r2
        L7d:
            pwc.j r11 = pwc.j.f240408a
            r0.C2(r11)
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: pwc.d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
