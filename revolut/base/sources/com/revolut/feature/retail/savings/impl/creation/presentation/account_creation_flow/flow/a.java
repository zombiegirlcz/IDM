package com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow;

import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.SavingsOnboardingFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;
import wli.x;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ SavingsOnboardingFlowContract$Step.Article v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f83266w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SavingsOnboardingFlowContract$Step.Article article, e eVar, Continuation continuation) {
        super(2, continuation);
        this.v = article;
        this.f83266w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f83266w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            SavingsOnboardingFlowContract$Step.Article article = this.v;
            String d = article.getD();
            SavingsOnboardingFlowContract$Step.Article.Type f83244a = article.getF83244a();
            e eVar = this.f83266w;
            if (d != null) {
                x xVar = eVar.f83277x;
                this.u = 1;
                if (lg0.b.x1(xVar, d, null, null, this, 6) == aVar) {
                    return aVar;
                }
            } else if (f83244a instanceof SavingsOnboardingFlowContract$Step.Article.Type.Challenge) {
                eVar.T2(SavingsOnboardingFlowContract$Step.ChallengeSetup.f83252a);
            } else if (f83244a instanceof SavingsOnboardingFlowContract$Step.Article.Type.Product) {
                eVar.T2(eVar.P2(((xlb.d) ((j2) eVar.B.f22677a).getValue()).c(((SavingsOnboardingFlowContract$Step.Article.Type.Product) f83244a).f83248a)));
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
