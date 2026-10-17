package com.revolut.feature.topup_screen.impl.mcy;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends i implements Function1 {
    public boolean u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f91064w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.f91064w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.f91064w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r8.v
            r2 = 0
            r3 = 2
            r4 = 1
            com.revolut.feature.topup_screen.impl.mcy.b r5 = r8.f91064w
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L16
            boolean r0 = r8.u
            yhm.o.b(r9)
            goto L84
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            yhm.o.b(r9)
            goto L40
        L22:
            yhm.o.b(r9)
            zja.a r9 = r5.f91080t
            com.revolut.feature.product_article.api.models.ProductArticleParams r1 = new com.revolut.feature.product_article.api.models.ProductArticleParams
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key r6 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key
            com.revolut.feature.topup_screen.impl.mcy.McyBankProductArticleKey r7 = com.revolut.feature.topup_screen.impl.mcy.McyBankProductArticleKey.ONBOARDING
            r6.<init>(r7)
            r1.<init>(r6)
            r8.v = r4
            kka.h r9 = (kka.h) r9
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasAlreadyShown r4 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a
            java.lang.Object r9 = r9.e(r1, r4, r8)
            if (r9 != r0) goto L40
            goto L82
        L40:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            gte.a r1 = r5.f91079s
            com.revolut.feature.topup_screen.api.TopupApi$Toggles$McyPrepareTopUpReview r4 = com.revolut.feature.topup_screen.api.TopupApi$Toggles.McyPrepareTopUpReview.f90468c
            jte.d r1 = (jte.d) r1
            boolean r1 = r1.c(r4)
            if (r1 == 0) goto L85
            vte.a r1 = r5.f91076p
            com.revolut.feature.topup_screen.impl.mcy.McyTopupFlowContract$InputData r4 = r5.o
            dj0.d r4 = r4.getF91049b()
            r8.u = r9
            r8.v = r3
            e0f.v0 r1 = (e0f.v0) r1
            w71.b r1 = r1.f121695c
            e31.j r1 = (e31.j) r1
            r1.getClass()
            dz6.o r3 = new dz6.o
            r6 = 16
            r3.<init>(r1, r4, r2, r6)
            skm.p0 r1 = skm.p0.f264001a
            elm.f r1 = elm.f.f127540b
            java.lang.Object r1 = skm.e0.J(r1, r3, r8)
            if (r1 != r0) goto L79
            goto L7b
        L79:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L7b:
            if (r1 != r0) goto L7e
            goto L80
        L7e:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L80:
            if (r1 != r0) goto L83
        L82:
            return r0
        L83:
            r0 = r9
        L84:
            r9 = r0
        L85:
            if (r9 == 0) goto L91
            yki.i r9 = r5.f91081w
            com.revolut.feature.topup_screen.impl.mcy.McyTopupFlowContract$Step$McyProductArticle r0 = com.revolut.feature.topup_screen.impl.mcy.McyTopupFlowContract$Step.McyProductArticle.f91063a
            com.revolut.kompot.common.ModalDestination$Style$FULLSCREEN_FADE r1 = com.revolut.kompot.common.ModalDestination.Style.FULLSCREEN_FADE.f98307a
            oki.h.w2(r9, r0, r1)
            goto L9d
        L91:
            yki.i r9 = r5.f91081w
            com.revolut.feature.topup_screen.impl.mcy.McyTopupFlowContract$InputData r0 = r5.o
            com.revolut.feature.topup_screen.impl.mcy.McyTopupFlowContract$Step r0 = com.revolut.feature.topup_screen.impl.mcy.b.K2(r0)
            r1 = 6
            oki.h.u2(r5, r9, r0, r2, r1)
        L9d:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.mcy.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
