package com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset;

import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.AddEditAssetContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import gca.l;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        d dVar = this.v;
        if (i == 0) {
            o.b(obj2);
            l lVar = new l(dVar, null, 7);
            this.u = 1;
            obj2 = dVar.p2(this, lVar);
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
        if (productArticleParams == null) {
            dVar.H2(dVar.f87925x, new gqa.a(16));
            return Unit.f186387a;
        }
        h.v2(dVar.f87926y, new AddEditAssetContract$ModalStep.SmartEstimationProductArticle(productArticleParams), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
        return Unit.f186387a;
    }
}
