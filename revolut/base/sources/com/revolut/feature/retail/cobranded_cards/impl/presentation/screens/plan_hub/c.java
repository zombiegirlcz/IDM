package com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub;

import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.CobrandedCardsPlanHubScreenContract$ActionBannerPayload;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import n14.k;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends i implements Function1 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CobrandedCardsPlanHubScreenContract$ActionBannerPayload.Subscribe f82583w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, CobrandedCardsPlanHubScreenContract$ActionBannerPayload.Subscribe subscribe, Continuation continuation) {
        super(1, continuation);
        this.v = eVar;
        this.f82583w = subscribe;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.v, this.f82583w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
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
        CobrandedCardsPlanHubScreenContract$ActionBannerPayload.Subscribe subscribe = this.f82583w;
        an1.d dVar = new an1.d(subscribe, 23);
        e eVar = this.v;
        b bVar = new b(eVar, subscribe, null);
        this.u = 1;
        Object objV = k.V(eVar, null, null, dVar, bVar, this, 3);
        return objV == aVar ? aVar : objV;
    }
}
