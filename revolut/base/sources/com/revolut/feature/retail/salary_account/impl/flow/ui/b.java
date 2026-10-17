package com.revolut.feature.retail.salary_account.impl.flow.ui;

import a3i.q;
import com.revolut.feature.retail.salary_account.impl.flow.ui.SalaryAccountFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ bgb.c f82978w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, bgb.c cVar, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
        this.f82978w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, this.f82978w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        d dVar = this.v;
        if (i == 0) {
            o.b(obj2);
            q qVar = new q(dVar, null, 11);
            this.u = 1;
            obj2 = dVar.p2(this, qVar);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        mn2.a aVar2 = (mn2.a) obj2;
        bgb.c cVar = this.f82978w;
        if (aVar2 != null) {
            h.w2(dVar.u, new SalaryAccountFlowContract$Step.SalaryMoveBottomSheet(aVar2, cVar), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else if (dVar.f82980q.d()) {
            dVar.n2(new bgb.h(dVar, cVar, null, 0), new whi.b(6));
        } else {
            h.t2(dVar, dVar.u, SalaryAccountFlowContract$Step.SalaryAccountDetails.f82970a, cVar == bgb.c.SALARY_HUB, null, false, 12);
        }
        return Unit.f186387a;
    }
}
