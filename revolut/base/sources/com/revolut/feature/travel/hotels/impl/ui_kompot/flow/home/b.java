package com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home;

import com.revolut.feature.product_article.api.models.ProductArticleParams;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import p9g.f;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends i implements Function2 {
    public c u;
    public ProductArticleParams v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f93731w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f93732x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c f93733y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(2, continuation);
        this.f93733y = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.f93733y, continuation);
        bVar.f93732x = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f93732x
            p9g.f r0 = (p9g.f) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r6.f93731w
            r3 = 1
            if (r2 == 0) goto L1d
            if (r2 != r3) goto L15
            com.revolut.feature.product_article.api.models.ProductArticleParams r0 = r6.v
            com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.c r1 = r6.u
            yhm.o.b(r7)
            goto L6e
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            yhm.o.b(r7)
            boolean r7 = r0 instanceof p9g.e
            r2 = 0
            if (r7 == 0) goto L3d
            com.revolut.feature.product_article.api.models.ProductArticleParams r7 = new com.revolut.feature.product_article.api.models.ProductArticleParams
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key r4 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key
            com.revolut.feature.travel.hotels.impl.articles.StaysArticles r5 = com.revolut.feature.travel.hotels.impl.articles.StaysArticles.INTRO_WITH_POINTS_MAX_REWARD
            r4.<init>(r5)
            p9g.e r0 = (p9g.e) r0
            java.lang.String r0 = r0.f234314a
            java.lang.String r5 = "plan_rate"
            java.util.Map r0 = a0.d.x(r5, r0)
            r7.<init>(r4, r0)
        L3b:
            r0 = r7
            goto L53
        L3d:
            boolean r7 = r0 instanceof p9g.c
            if (r7 == 0) goto L4e
            com.revolut.feature.product_article.api.models.ProductArticleParams r7 = new com.revolut.feature.product_article.api.models.ProductArticleParams
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key r0 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key
            com.revolut.feature.travel.hotels.impl.articles.StaysArticles r4 = com.revolut.feature.travel.hotels.impl.articles.StaysArticles.INTRO_WITH_CASHBACK
            r0.<init>(r4)
            r7.<init>(r0)
            goto L3b
        L4e:
            boolean r7 = r0 instanceof p9g.d
            if (r7 == 0) goto L8b
            r0 = r2
        L53:
            if (r0 == 0) goto L88
            com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.c r7 = r6.f93733y
            zja.a r4 = r7.f93736r
            r6.f93732x = r2
            r6.u = r7
            r6.v = r0
            r6.f93731w = r3
            kka.h r4 = (kka.h) r4
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasAlreadyShown r2 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a
            java.lang.Object r2 = r4.e(r0, r2, r6)
            if (r2 != r1) goto L6c
            return r1
        L6c:
            r1 = r7
            r7 = r2
        L6e:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L88
            com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.TravelHotelsHomeFlowContract$InputData r7 = r1.o
            boolean r7 = r7.f93722a
            if (r7 == 0) goto L88
            com.revolut.kompot.navigable.vc.modal.a r7 = r1.f93739w
            com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.TravelHotelsHomeFlowContract$ModalStep$Onboarding r1 = new com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.TravelHotelsHomeFlowContract$ModalStep$Onboarding
            r1.<init>(r0)
            com.revolut.kompot.common.ModalDestination$Style$FULLSCREEN_SLIDE_FROM_BOTTOM r0 = com.revolut.kompot.common.ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a
            oki.h.v2(r7, r1, r0)
        L88:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L8b:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
