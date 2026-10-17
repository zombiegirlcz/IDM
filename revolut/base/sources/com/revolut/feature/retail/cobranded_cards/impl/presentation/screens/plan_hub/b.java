package com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub;

import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubPlan;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.CobrandedCardsPlanHubScreenContract$ActionBannerPayload;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CobrandedCardsPlanHubScreenContract$ActionBannerPayload.Subscribe f82582w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, CobrandedCardsPlanHubScreenContract$ActionBannerPayload.Subscribe subscribe, Continuation continuation) {
        super(1, continuation);
        this.v = eVar;
        this.f82582w = subscribe;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, this.f82582w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        e eVar = this.v;
        if (i == 0) {
            o.b(obj2);
            q5b.b bVar = eVar.o;
            CobrandedCardsPlanHubPlan cobrandedCardsPlanHubPlan = this.f82582w.f82572a;
            String str = cobrandedCardsPlanHubPlan.f82415a;
            String str2 = cobrandedCardsPlanHubPlan.f82416b;
            this.u = 1;
            if (((c6b.i) bVar).b(str, str2, null, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        eVar.v.a();
        return Unit.f186387a;
    }
}
