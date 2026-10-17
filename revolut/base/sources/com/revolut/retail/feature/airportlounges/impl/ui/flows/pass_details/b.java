package com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details;

import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.AirportLoungePassDetailsFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends i implements Function2 {
    public yki.i u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f99011w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, Continuation continuation) {
        super(2, continuation);
        this.f99011w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.f99011w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        yki.i iVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            e eVar = this.f99011w;
            h.r2(eVar.A);
            iVar = eVar.A;
            this.u = iVar;
            this.v = 1;
            obj2 = e.J2(eVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yki.i iVar2 = this.u;
            o.b(obj2);
            iVar = iVar2;
        }
        h.t2(this.f99011w, iVar, new AirportLoungePassDetailsFlowContract$Step.PassList((String) obj2, null, 2), false, TransitionAnimation.SLIDE_END_TO_START.f98395a, false, 8);
        return Unit.f186387a;
    }
}
