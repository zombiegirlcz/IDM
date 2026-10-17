package com.revolut.feature.security_hub.impl.ui.street_mode.flow;

import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.security_hub.impl.ui.street_mode.flow.StreetModeFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import r10.t;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends i implements Function1 {
    public b u;
    public yki.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f85666w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f85667x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.f85667x = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.f85667x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        b bVar;
        yki.a aVar;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.f85666w;
        if (i == 0) {
            o.b(obj2);
            b bVar2 = this.f85667x;
            yki.a aVar3 = bVar2.f85671s;
            t tVar = bVar2.f85670r;
            this.u = bVar2;
            this.v = aVar3;
            this.f85666w = 1;
            Object objG = tVar.g(this);
            if (objG == aVar2) {
                return aVar2;
            }
            bVar = bVar2;
            aVar = aVar3;
            obj2 = objG;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yki.a aVar4 = this.v;
            b bVar3 = this.u;
            o.b(obj2);
            aVar = aVar4;
            bVar = bVar3;
        }
        h.t2(bVar, aVar, new StreetModeFlowContract$Step.StreetModeProductArticle((ProductArticleParams) obj2), true, null, false, 12);
        return Unit.f186387a;
    }
}
