package com.revolut.retail.feature.travel_status.impl.ui.flow;

import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.retail.feature.travel_status.impl.ui.flow.TravelStatusFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u1l.g;
import vfg.p;
import vkm.q;
import w4l.h;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
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
            p pVar = bVar.f104311p;
            pVar.getClass();
            h loadingStrategy = h.f294642c;
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            g gVar = (g) pVar.f288633b;
            gVar.getClass();
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            jhi.b bVarG = mo3.a.g(gVar.d.b(Unit.f186387a, loadingStrategy), null, null, 3);
            this.u = 1;
            obj2 = q.x(bVarG, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        oki.h.t2(bVar, bVar.f104313r, new TravelStatusFlowContract$Step.ProductArticle(new ProductArticleParams(new ProductArticleParams.ArticleReference.Id((String) obj2))), false, null, false, 12);
        return Unit.f186387a;
    }
}
