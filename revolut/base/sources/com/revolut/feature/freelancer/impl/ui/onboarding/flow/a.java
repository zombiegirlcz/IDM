package com.revolut.feature.freelancer.impl.ui.onboarding.flow;

import com.revolut.feature.freelancer.impl.ui.onboarding.flow.FreelancerOnboardingFlowContract$Step;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import et6.x2;
import gim.i;
import gr6.p;
import ir6.c;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import rd0.d;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements Function1 {
    public b u;
    public yki.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f73991w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f73992x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.f73992x = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.f73992x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        yki.i iVar;
        b bVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.f73991w;
        b bVar2 = this.f73992x;
        try {
            if (i == 0) {
                o.b(obj2);
                yki.i iVar2 = bVar2.D;
                p pVar = bVar2.f73996s;
                c cVar = c.ONBOARDING;
                this.u = bVar2;
                this.v = iVar2;
                this.f73991w = 1;
                Object objG = ((x2) pVar).g(cVar, this);
                if (objG == aVar) {
                    return aVar;
                }
                iVar = iVar2;
                obj2 = objG;
                bVar = bVar2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yki.i iVar3 = this.v;
                b bVar3 = this.u;
                o.b(obj2);
                iVar = iVar3;
                bVar = bVar3;
            }
            h.t2(bVar, iVar, new FreelancerOnboardingFlowContract$Step.StoryProductArticle((ProductArticleParams) obj2), false, null, false, 12);
        } catch (Throwable th10) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(rd0.c.ERROR, null, null, th10, h0Var);
            h.t2(bVar2, bVar2.D, bVar2.L2(), true, null, false, 12);
        }
        return Unit.f186387a;
    }
}
