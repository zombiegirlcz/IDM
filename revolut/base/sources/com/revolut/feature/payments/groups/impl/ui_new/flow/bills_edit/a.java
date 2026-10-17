package com.revolut.feature.payments.groups.impl.ui_new.flow.bills_edit;

import com.revolut.feature.payments.groups.impl.ui_new.flow.bills_edit.PaymentsGroupsBillsEditFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ b u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.u = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        b bVar = this.u;
        bVar.E2(new PaymentsGroupsBillsEditFlowContract$Step.SplitSummary(((PaymentsGroupsBillsEditFlowContract$State) bVar.A2().f98429a).f79427a, ((PaymentsGroupsBillsEditFlowContract$State) bVar.A2().f98429a).f79428b, ((PaymentsGroupsBillsEditFlowContract$State) bVar.A2().f98429a).f79429c), true, null, false);
        return Unit.f186387a;
    }
}
