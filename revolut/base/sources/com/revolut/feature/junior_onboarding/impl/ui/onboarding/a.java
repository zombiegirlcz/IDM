package com.revolut.feature.junior_onboarding.impl.ui.onboarding;

import com.revolut.feature.junior_onboarding.impl.ui.onboarding.JuniorOnboardingFlowContract$Step;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import di8.d;
import di8.j;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import mh8.h;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            h hVar = bVar.o.f76996a;
            this.u = 1;
            obj2 = b.J2(bVar, hVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        ProductArticleParams productArticleParams = (ProductArticleParams) obj2;
        if (productArticleParams != null) {
            oki.h.u2(bVar, bVar.v, new JuniorOnboardingFlowContract$Step.OnboardingProductArticle(productArticleParams), null, 6);
        } else {
            bVar.n2(new j(bVar, null, 1), new d(bVar, 0));
        }
        return Unit.f186387a;
    }
}
