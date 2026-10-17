package com.revolut.feature.travel.miles.impl.ui.flow;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends i implements Function2 {
    public boolean u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f94194w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.f94194w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.f94194w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.v
            r2 = 2
            r3 = 1
            com.revolut.feature.travel.miles.impl.ui.flow.b r4 = r5.f94194w
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            boolean r0 = r5.u
            yhm.o.b(r6)
            goto L58
        L14:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1c:
            yhm.o.b(r6)
            goto L34
        L20:
            yhm.o.b(r6)
            zja.a r6 = r4.f94208r
            com.revolut.feature.product_article.api.models.ProductArticleParams r1 = r4.f94211w
            r5.v = r3
            kka.h r6 = (kka.h) r6
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasAlreadyShown r3 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a
            java.lang.Object r6 = r6.e(r1, r3, r5)
            if (r6 != r0) goto L34
            goto L55
        L34:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            com.revolut.feature.travel.miles.impl.ui.flow.TravelMilesFlowContract$InputData r1 = r4.o
            m1c.x0 r1 = r1.getF94173c()
            if (r1 != 0) goto L5d
            eub.i r1 = r4.f94206p
            r3 = 0
            nyb.o r1 = (nyb.o) r1
            efm.d0 r1 = r1.e(r3)
            r5.u = r6
            r5.v = r2
            java.lang.Object r1 = nim.a.b(r1, r5)
            if (r1 != r0) goto L56
        L55:
            return r0
        L56:
            r0 = r6
            r6 = r1
        L58:
            m1c.r0 r6 = (m1c.r0) r6
            m1c.x0 r1 = r6.f201447a
            r6 = r0
        L5d:
            m1c.x0 r0 = m1c.x0.OPTED_IN
            if (r1 != r0) goto L68
            if (r6 != 0) goto L68
            com.revolut.feature.travel.miles.impl.ui.flow.TravelMilesFlowContract$Step r6 = r4.J2()
            goto L6d
        L68:
            com.revolut.feature.travel.miles.impl.ui.flow.TravelMilesFlowContract$Step$Onboarding r6 = new com.revolut.feature.travel.miles.impl.ui.flow.TravelMilesFlowContract$Step$Onboarding
            r6.<init>(r1)
        L6d:
            yki.i r0 = r4.f94212x
            r1 = 0
            r2 = 6
            oki.h.u2(r4, r0, r6, r1, r2)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.travel.miles.impl.ui.flow.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
