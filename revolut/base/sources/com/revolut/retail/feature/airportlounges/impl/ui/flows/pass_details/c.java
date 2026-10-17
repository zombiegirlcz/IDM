package com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.airportlounges.api.model.AirportLoungesDisclaimer;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.AirportLoungePassDetailsFlowContract$Step;
import dwi.a0;
import elm.f;
import gim.i;
import hwi.c0;
import hwi.d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AirportLoungesDisclaimer f99012w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, AirportLoungesDisclaimer airportLoungesDisclaimer, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
        this.f99012w = airportLoungesDisclaimer;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, this.f99012w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        AirportLoungesDisclaimer airportLoungesDisclaimer = this.f99012w;
        e eVar = this.v;
        if (i == 0) {
            o.b(obj2);
            a0 a0Var = eVar.u;
            String str = airportLoungesDisclaimer.f98912a;
            this.u = 1;
            d0 d0Var = a0Var.f120406a;
            d0Var.getClass();
            c0 c0Var = new c0(d0Var, str, null, 0);
            p0 p0Var = p0.f264001a;
            Object objJ = e0.J(f.f127540b, c0Var, this);
            if (objJ != obj3) {
                objJ = Unit.f186387a;
            }
            if (objJ != obj3) {
                objJ = Unit.f186387a;
            }
            if (objJ == obj3) {
                return obj3;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        h.w2(eVar.A, new AirportLoungePassDetailsFlowContract$Step.DisclaimerAcceptance(airportLoungesDisclaimer), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}
