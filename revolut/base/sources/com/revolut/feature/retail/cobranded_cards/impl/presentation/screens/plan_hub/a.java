package com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub;

import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoBannerActionSuccess;
import g37.z;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CobrandedCardsPlanHubInfoBannerActionSuccess f82581w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, CobrandedCardsPlanHubInfoBannerActionSuccess cobrandedCardsPlanHubInfoBannerActionSuccess, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
        this.f82581w = cobrandedCardsPlanHubInfoBannerActionSuccess;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f82581w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
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
        e eVar = this.v;
        z zVar = new z(eVar, this.f82581w, null, 9);
        this.u = 1;
        Object objB = pu7.a.B(eVar.k, "task_cancel_termination", zVar, this);
        return objB == aVar ? aVar : objB;
    }
}
