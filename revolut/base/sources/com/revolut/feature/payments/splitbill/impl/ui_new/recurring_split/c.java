package com.revolut.feature.payments.splitbill.impl.ui_new.recurring_split;

import com.revolut.feature.payments.splitbill.impl.ui_new.recurring_split.RecurringSplitFlowContract$LaunchMode;
import com.revolut.feature.payments.splitbill.impl.ui_new.recurring_split.RecurringSplitFlowContract$Step;
import com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplit;
import gim.i;
import k1a.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qua.p;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
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
            g gVar = dVar.f79910q;
            p pVar = dVar.o.f79896a;
            this.u = 1;
            obj2 = gVar.g(pVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        a2a.d dVar2 = (a2a.d) obj2;
        if (dVar2 instanceof a2a.a) {
            a2a.a aVar2 = (a2a.a) dVar2;
            RecurringSplit recurringSplit = aVar2.f713a;
            h.u2(dVar, dVar.f79912s, new RecurringSplitFlowContract$Step.SelectContacts(new RecurringSplitFlowContract$LaunchMode.Update(recurringSplit.f79920a, aVar2.f714b, recurringSplit.d, recurringSplit.e)), null, 6);
        } else if (Intrinsics.f(dVar2, a2a.b.f715a)) {
            r6.b.r("Splitting recurring payment is not applicable");
            h.D2(dVar.f79912s);
        } else {
            if (!(dVar2 instanceof a2a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            h.u2(dVar, dVar.f79912s, new RecurringSplitFlowContract$Step.SelectContacts(RecurringSplitFlowContract$LaunchMode.Creation.f79898a), null, 6);
        }
        return Unit.f186387a;
    }
}
