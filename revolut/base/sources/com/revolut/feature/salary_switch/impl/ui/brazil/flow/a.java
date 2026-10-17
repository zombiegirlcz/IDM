package com.revolut.feature.salary_switch.impl.ui.brazil.flow;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends i implements Function1 {
    public SalarySwitchBrFlowContract$Step u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f85273w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.f85273w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.f85273w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062 A[RETURN] */
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
            com.revolut.feature.salary_switch.impl.ui.brazil.flow.b r2 = r5.f85273w
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L20
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            com.revolut.feature.salary_switch.impl.ui.brazil.flow.SalarySwitchBrFlowContract$Step r0 = r5.u
            yhm.o.b(r6)
            goto L54
        L14:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1c:
            yhm.o.b(r6)
            goto L2c
        L20:
            yhm.o.b(r6)
            r5.v = r4
            java.lang.Object r6 = com.revolut.feature.salary_switch.impl.ui.brazil.flow.b.I2(r2, r5)
            if (r6 != r0) goto L2c
            goto L51
        L2c:
            com.revolut.feature.salary_switch.impl.ui.brazil.flow.SalarySwitchBrFlowContract$Step r6 = (com.revolut.feature.salary_switch.impl.ui.brazil.flow.SalarySwitchBrFlowContract$Step) r6
            r5.u = r6
            r5.v = r3
            zja.a r1 = r2.f85275q
            qrc.a r2 = qrc.a.f248705a
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            com.revolut.feature.product_article.api.models.ProductArticleParams r2 = new com.revolut.feature.product_article.api.models.ProductArticleParams
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Id r3 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Id
            java.lang.String r4 = "br-salary-transfer-onboarding"
            r3.<init>(r4)
            r2.<init>(r3)
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasAlreadyShown r3 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a
            kka.h r1 = (kka.h) r1
            java.lang.Object r1 = r1.e(r2, r3, r5)
            if (r1 != r0) goto L52
        L51:
            return r0
        L52:
            r0 = r6
            r6 = r1
        L54:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L62
            com.revolut.feature.salary_switch.impl.ui.brazil.flow.SalarySwitchBrFlowContract$Step$Promo r6 = new com.revolut.feature.salary_switch.impl.ui.brazil.flow.SalarySwitchBrFlowContract$Step$Promo
            r6.<init>(r0)
            return r6
        L62:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.salary_switch.impl.ui.brazil.flow.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
