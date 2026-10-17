package com.revolut.feature.credit.application.plugins.impl.ui.autopay.card.flow;

import com.revolut.feature.credit.application.plugins.api.models.config.AutoPayPromptScreenConfig;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function1 {
    public AutoPayPromptScreenConfig u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f67132w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.f67132w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.f67132w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r9 == r2) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            com.revolut.feature.credit.application.plugins.impl.ui.autopay.card.flow.b r0 = r8.f67132w
            com.revolut.feature.credit.application.plugins.impl.ui.autopay.card.flow.CreditCardApplicationAutopayFlowContract$InputData r1 = r0.f67133p
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r8.v
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L22
            if (r3 == r5) goto L1e
            if (r3 != r4) goto L16
            com.revolut.feature.credit.application.plugins.api.models.config.AutoPayPromptScreenConfig r1 = r8.u
            yhm.o.b(r9)
            goto L62
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            yhm.o.b(r9)
            goto L3e
        L22:
            yhm.o.b(r9)
            com.revolut.feature.credit.application.plugins.api.models.config.AutoPayPromptScreenConfig r9 = r1.f67120b
            if (r9 != 0) goto L40
            hw3.e r9 = r0.f67136s
            ju3.a r3 = ju3.a.AUTO_PAY
            com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration r6 = r1.f67121c
            ft3.j1 r6 = r6.d
            ufm.i r9 = r9.b(r3, r6)
            r8.v = r5
            java.lang.Object r9 = nim.a.b(r9, r8)
            if (r9 != r2) goto L3e
            goto L5e
        L3e:
            com.revolut.feature.credit.application.plugins.api.models.config.AutoPayPromptScreenConfig r9 = (com.revolut.feature.credit.application.plugins.api.models.config.AutoPayPromptScreenConfig) r9
        L40:
            lb5.a r3 = r0.f67137t
            java.lang.String r1 = r1.f67119a
            qb5.b r3 = (qb5.b) r3
            efm.r r1 = r3.a(r1)
            r3 = 3
            r5 = 0
            efm.r r1 = m70.a.g(r1, r5, r5, r3)
            vkm.d r1 = rd0.e.b(r1)
            r8.u = r9
            r8.v = r4
            java.lang.Object r1 = vkm.q.x(r1, r8)
            if (r1 != r2) goto L5f
        L5e:
            return r2
        L5f:
            r7 = r1
            r1 = r9
            r9 = r7
        L62:
            mb5.b r9 = (mb5.b) r9
            qki.d r2 = r0.v
            kzc.a r3 = new kzc.a
            r4 = 16
            r3.<init>(r9, r1, r4)
            r0.H2(r2, r3)
            yki.a r1 = r0.f67138w
            r5 = 0
            r6 = 12
            com.revolut.feature.credit.application.plugins.impl.ui.autopay.card.flow.CreditCardApplicationAutopayFlowContract$Step$AutoPayPrompt r2 = com.revolut.feature.credit.application.plugins.impl.ui.autopay.card.flow.CreditCardApplicationAutopayFlowContract$Step.AutoPayPrompt.f67126a
            r3 = 0
            r4 = 0
            oki.h.t2(r0, r1, r2, r3, r4, r5, r6)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.autopay.card.flow.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
