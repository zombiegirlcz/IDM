package com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.contact_selection;

import com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.contact_selection.FamilyPlanContactSelectionFlowContract$Step;
import efm.d0;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends i implements Function1 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        d dVar = this.v;
        if (i == 0) {
            o.b(obj2);
            d0 d0VarE = dVar.f103003q.e();
            this.u = 1;
            obj2 = nim.a.b(d0VarE, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        hha.d dVar2 = (hha.d) obj2;
        yki.i iVar = dVar.f103006t;
        Intrinsics.h(dVar2);
        h.u2(dVar, iVar, new FamilyPlanContactSelectionFlowContract$Step.SelectContact(dVar2), null, 6);
        return Unit.f186387a;
    }
}
