package com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub;

import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.CobrandedCardsPlanHubScreenContract$ActionBannerPayload;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends i implements Function2 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CobrandedCardsPlanHubScreenContract$ActionBannerPayload.Subscribe f82584w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, CobrandedCardsPlanHubScreenContract$ActionBannerPayload.Subscribe subscribe, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
        this.f82584w = subscribe;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.v, this.f82584w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        CobrandedCardsPlanHubScreenContract$ActionBannerPayload.Subscribe subscribe = this.f82584w;
        e eVar = this.v;
        c cVar = new c(eVar, subscribe, null);
        this.u = 1;
        Object objB = pu7.a.B(eVar.k, "task_subscribe", cVar, this);
        return objB == aVar ? aVar : objB;
    }
}
