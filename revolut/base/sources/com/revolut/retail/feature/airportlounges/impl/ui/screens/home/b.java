package com.revolut.retail.feature.airportlounges.impl.ui.screens.home;

import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.home.AirportLoungesHomeScreenContract$ModalStep;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import owi.g;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            g gVar = cVar.f99100y;
            this.u = 1;
            obj2 = gVar.b(this);
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
            h.v2(cVar.H, new AirportLoungesHomeScreenContract$ModalStep.ProductArticle(productArticleParams), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
        }
        return Unit.f186387a;
    }
}
