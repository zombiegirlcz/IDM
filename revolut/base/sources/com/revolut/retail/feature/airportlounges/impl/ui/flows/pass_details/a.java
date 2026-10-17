package com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details;

import com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.AirportLoungePassDetailsFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import wli.x;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AirportLoungePassDetailsFlowContract$Step f99010w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, AirportLoungePassDetailsFlowContract$Step airportLoungePassDetailsFlowContract$Step, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
        this.f99010w = airportLoungePassDetailsFlowContract$Step;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f99010w, continuation);
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
        x xVar = this.v.f99021y;
        String str = ((AirportLoungePassDetailsFlowContract$Step.GetHelp) this.f99010w).f98995b;
        lg0.a aVar2 = lg0.a.OPEN_BROWSER;
        this.u = 1;
        Object objX1 = lg0.b.x1(xVar, str, aVar2, null, this, 4);
        return objX1 == aVar ? aVar : objX1;
    }
}
