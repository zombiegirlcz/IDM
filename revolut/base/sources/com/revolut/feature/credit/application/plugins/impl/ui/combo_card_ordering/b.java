package com.revolut.feature.credit.application.plugins.impl.ui.combo_card_ordering;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import u64.d;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        if (u64.d.P2(r0, r8) == r2) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            u64.d r0 = r8.v
            com.revolut.feature.credit.application.plugins.impl.ui.combo_card_ordering.ComboCardOrderingFlowContract$InputData r1 = r0.f277475p
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r8.u
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L28
            if (r3 == r6) goto L24
            if (r3 == r5) goto L20
            if (r3 != r4) goto L18
            yhm.o.b(r9)
            goto L72
        L18:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L20:
            yhm.o.b(r9)
            goto L59
        L24:
            yhm.o.b(r9)
            goto L38
        L28:
            yhm.o.b(r9)
            nw3.d r9 = r0.f277476q
            com.revolut.feature.credit.application.models.plugins.PluginPayload r3 = r1.f67240b
            r8.u = r6
            java.lang.Object r9 = r9.b(r3, r8)
            if (r9 != r2) goto L38
            goto L69
        L38:
            com.revolut.feature.credit.application.models.plugins.PluginPayload r9 = r1.f67240b
            it3.d r9 = r9.f66247a
            java.lang.String r9 = r9.f168330m
            if (r9 == 0) goto L75
            u24.a r1 = r0.f277477r
            r8.u = r5
            r1.getClass()
            tqh.j r3 = new tqh.j
            r5 = 27
            r3.<init>(r1, r9, r7, r5)
            skm.p0 r9 = skm.p0.f264001a
            elm.f r9 = elm.f.f127540b
            java.lang.Object r9 = skm.e0.J(r9, r3, r8)
            if (r9 != r2) goto L59
            goto L69
        L59:
            java.util.List r9 = (java.util.List) r9
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L6a
            r8.u = r4
            java.lang.Object r9 = u64.d.P2(r0, r8)
            if (r9 != r2) goto L72
        L69:
            return r2
        L6a:
            yki.i r9 = r0.f277479t
            com.revolut.feature.credit.application.plugins.impl.ui.combo_card_ordering.ComboCardOrderingFlowContract$Step$CreditAvailable r1 = com.revolut.feature.credit.application.plugins.impl.ui.combo_card_ordering.ComboCardOrderingFlowContract$Step.CreditAvailable.f67242a
            r2 = 6
            oki.h.u2(r0, r9, r1, r7, r2)
        L72:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L75:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Credit Id can't be null with Combo Card ordering plugin"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.combo_card_ordering.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
