package com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.chagedayflow;

import com.revolut.feature.credit.loan.api.LoanApi$Toggles;
import com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.chagedayflow.LoanChangeRepaymentDayFlowContract$Step;
import gim.i;
import jte.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o65.b;
import o65.c;
import o65.e;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            e eVar = bVar.f70394p;
            String str = bVar.o.f70388a;
            this.u = 1;
            obj2 = ((o65.o) eVar).d3(str, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        o65.b bVar2 = (o65.b) obj2;
        if (bVar2 instanceof b.a) {
            h.D2(bVar.f70397s);
        } else if (bVar2 instanceof b.C1235b) {
            int i2 = jli.h.f175850a;
        } else {
            if (!(bVar2 instanceof c)) {
                throw new NoWhenBranchMatchedException();
            }
            if (((d) bVar.f70396r).c(LoanApi$Toggles.LoanSkipRepaymentDayConfirmation.f70068c)) {
                h.t2(bVar, bVar.f70397s, new LoanChangeRepaymentDayFlowContract$Step.SelectNewRepaymentDayV2(((c) bVar2).f222503a), false, null, false, 12);
            } else {
                h.t2(bVar, bVar.f70397s, new LoanChangeRepaymentDayFlowContract$Step.SelectNewRepaymentDay(((c) bVar2).f222503a), false, null, false, 12);
            }
        }
        return Unit.f186387a;
    }
}
