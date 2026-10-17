package com.revolut.feature.rev_points.giftcards.impl.ui.flow.home;

import bwb.p;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.rev_points.giftcards.impl.model.GiftCardsProductArticleKey;
import com.revolut.feature.rev_points.giftcards.impl.ui.flow.home.RevPointsGiftcardsHomePagerFlowContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends i implements Function1 {
    public ProductArticleParams u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f83678w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f83679x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(1, continuation);
        this.f83679x = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.f83679x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ProductArticleParams productArticleParams;
        boolean z;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.f83678w;
        c cVar = this.f83679x;
        if (i == 0) {
            o.b(obj2);
            ProductArticleParams productArticleParams2 = new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(GiftCardsProductArticleKey.ONBOARDING));
            jwb.a aVar2 = cVar.f83681q;
            this.u = productArticleParams2;
            this.f83678w = 1;
            ue0.c cVar2 = ((cwb.c) aVar2.f178946a).f109599a;
            p.Companion.getClass();
            Boolean boolValueOf = Boolean.valueOf(((List) cVar2.T2("REV_POINTS_GIFTCARDS_USER_VOUCHERS_STORAGE_KEY", p.f19302j)) != null ? !r1.isEmpty() : false);
            if (boolValueOf != aVar) {
                productArticleParams = productArticleParams2;
                obj2 = boolValueOf;
            }
            return aVar;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = this.v;
            productArticleParams = this.u;
            o.b(obj2);
            if (((Boolean) obj2).booleanValue() && !z) {
                h.v2(cVar.u, new RevPointsGiftcardsHomePagerFlowContract$ModalStep.Onboarding(productArticleParams), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
            }
            return Unit.f186387a;
        }
        productArticleParams = this.u;
        o.b(obj2);
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        zja.a aVar3 = cVar.f83682r;
        this.u = productArticleParams;
        this.v = zBooleanValue;
        this.f83678w = 2;
        Object objE = ((kka.h) aVar3).e(productArticleParams, SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a, this);
        if (objE != aVar) {
            z = zBooleanValue;
            obj2 = objE;
            if (((Boolean) obj2).booleanValue()) {
                h.v2(cVar.u, new RevPointsGiftcardsHomePagerFlowContract$ModalStep.Onboarding(productArticleParams), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
            }
            return Unit.f186387a;
        }
        return aVar;
    }
}
