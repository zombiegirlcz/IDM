package com.revolut.feature.topup_screen.impl.flow.external_card_details;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import t61.g;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.u
            t61.g r0 = (t61.g) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r12)
            com.revolut.feature.topup_screen.impl.flow.external_card_details.e r2 = r11.v
            yki.a r3 = r2.f90618x
            com.revolut.feature.topup_screen.impl.flow.external_card_details.ExternalCardDetailsFlowContract$Step$ExternalCardDetails r4 = new com.revolut.feature.topup_screen.impl.flow.external_card_details.ExternalCardDetailsFlowContract$Step$ExternalCardDetails
            com.revolut.feature.topup_screen.impl.screens.external_card_details.ExternalCardDetailsScreenContract$InputData r5 = new com.revolut.feature.topup_screen.impl.screens.external_card_details.ExternalCardDetailsScreenContract$InputData
            java.lang.String r6 = r0.f268137a
            com.revolut.feature.topup_screen.impl.flow.external_card_details.ExternalCardDetailsFlowContract$InputData r12 = r2.o
            io3.l r7 = r12.f90602b
            boolean r8 = r12.f90603c
            com.revolut.feature.topup_screen.api.model.TopUpMethodsContext r12 = r12.d
            r0 = 1
            r1 = 0
            if (r12 != 0) goto L20
            goto L33
        L20:
            yte.n r12 = r12.f90551b
            int[] r9 = ewe.h.f130171a
            int r12 = r12.ordinal()
            r12 = r9[r12]
            switch(r12) {
                case 1: goto L35;
                case 2: goto L35;
                case 3: goto L35;
                case 4: goto L35;
                case 5: goto L35;
                case 6: goto L35;
                case 7: goto L35;
                case 8: goto L33;
                case 9: goto L33;
                case 10: goto L33;
                default: goto L2d;
            }
        L2d:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        L33:
            r9 = r1
            goto L36
        L35:
            r9 = r0
        L36:
            com.revolut.feature.topup_screen.impl.flow.external_card_details.ExternalCardDetailsFlowContract$InputData r12 = r2.o
            com.revolut.feature.topup_screen.api.model.TopUpMethodsContext r12 = r12.d
            if (r12 == 0) goto L3f
            yte.n r12 = r12.f90551b
            goto L40
        L3f:
            r12 = 0
        L40:
            yte.n r10 = yte.n.JOINT
            if (r12 == r10) goto L46
            r10 = r0
            goto L47
        L46:
            r10 = r1
        L47:
            r5.<init>(r6, r7, r8, r9, r10)
            r4.<init>(r5)
            r7 = 0
            r8 = 12
            r5 = 0
            r6 = 0
            oki.h.t2(r2, r3, r4, r5, r6, r7, r8)
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flow.external_card_details.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
