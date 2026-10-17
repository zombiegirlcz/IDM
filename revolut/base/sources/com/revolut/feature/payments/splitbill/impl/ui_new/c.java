package com.revolut.feature.payments.splitbill.impl.ui_new;

import com.revolut.feature.payments.bills_chooser.api.splits.SplitMemberType;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.splitbill.impl.ui_new.SplitBillsFlowContract$Step;
import do3.n;
import efm.d0;
import gim.i;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PaymentGroup f79853w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ List f79854x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, PaymentGroup paymentGroup, List list, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
        this.f79853w = paymentGroup;
        this.f79854x = list;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, this.f79853w, this.f79854x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        e eVar = this.v;
        if (i == 0) {
            o.b(obj2);
            d0 d0VarF = eVar.z.f(false);
            this.u = 1;
            obj2 = nim.a.b(d0VarF, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        n nVar = (n) obj2;
        PaymentGroup paymentGroup = this.f79853w;
        for (oq9.o oVar : paymentGroup.d) {
            Intrinsics.h(nVar);
            if (oi0.d.G(oVar, nVar)) {
                eVar.E2(new SplitBillsFlowContract$Step.Group(this.f79854x, new SplitMemberType.GroupMember(oVar), paymentGroup), true, null, false);
                return Unit.f186387a;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
