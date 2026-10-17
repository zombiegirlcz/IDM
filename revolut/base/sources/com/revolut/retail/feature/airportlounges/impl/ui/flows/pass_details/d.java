package com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details;

import com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.AirportLoungePassDetailsFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends i implements Function2 {
    public int u;
    public final /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f99013w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(boolean z, e eVar, Continuation continuation) {
        super(2, continuation);
        this.v = z;
        this.f99013w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.v, this.f99013w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        e eVar = this.f99013w;
        boolean z = this.v;
        if (i == 0) {
            o.b(obj2);
            if (z) {
                this.u = 1;
                if (e.L2(eVar, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        h.u2(eVar, eVar.A, new AirportLoungePassDetailsFlowContract$Step.Checkout(z), null, 6);
        return Unit.f186387a;
    }
}
