package com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.TravelHotelsFlowContract$Step;
import com.revolut.kompot.common.R$string;
import com.revolut.kompot.navigable.flow.FlowStep;
import eub.c;
import eub.d;
import eub.e;
import gim.i;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nii.y0;
import nii.z;
import nyb.f;
import oki.h;
import yhm.o;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objA;
        FlowStep flowStepI2;
        b bVar = this.v;
        TravelHotelsFlowContract$InputData travelHotelsFlowContract$InputData = bVar.o;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            e eVar = bVar.f93797p;
            this.u = 1;
            objA = ((f) eVar).a(this);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            objA = obj2;
        }
        d dVar = (d) objA;
        if (dVar instanceof d.a) {
            flowStepI2 = b.I2(travelHotelsFlowContract$InputData);
        } else {
            if (!(dVar instanceof c)) {
                if (!(dVar instanceof eub.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                Exception exc2 = ((eub.b) dVar).f129539a;
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, exc2, h0Var);
                l.a1(bVar, bVar.X1(new y0(null, new z(new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(R$string.common_error_state_description, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5)), null, null, new y5g.d(bVar, null, 11), 3);
                return Unit.f186387a;
            }
            flowStepI2 = ((c) dVar).f129540a ? b.I2(travelHotelsFlowContract$InputData) : TravelHotelsFlowContract$Step.OptIn.f93791a;
        }
        h.t2(bVar, bVar.f93798q, flowStepI2, false, null, false, 12);
        return Unit.f186387a;
    }
}
