package com.revolut.feature.payments.groups.impl.ui_new.flow.bills_selection;

import ang.f;
import bs9.d0;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.groups.impl.ui_new.flow.bills_selection.PaymentsGroupsBillsSelectionFlowContract$Step;
import dki.g;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import xo8.u;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends i implements Function2 {
    public b u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f79445w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ bp9.b f79446x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, bp9.b bVar2, Continuation continuation) {
        super(2, continuation);
        this.f79445w = bVar;
        this.f79446x = bVar2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.f79445w, this.f79446x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        b bVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            b bVar2 = this.f79445w;
            ryc.a aVar2 = bVar2.f79447t;
            PaymentGroup group = ((PaymentsGroupsBillsSelectionFlowContract$State) bVar2.A2().f98429a).f79439a;
            aVar2.getClass();
            Intrinsics.checkNotNullParameter(group, "group");
            ufm.i iVar = new ufm.i(((f) aVar2.f258290b).f(false), new u(27, new d0(group, 10)), 1);
            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
            this.u = bVar2;
            this.v = 1;
            Object objB = nim.a.b(iVar, this);
            if (objB == aVar) {
                return aVar;
            }
            bVar = bVar2;
            obj2 = objB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = this.u;
            o.b(obj2);
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
        bp9.b bVar3 = this.f79446x;
        g.F2(bVar, new PaymentsGroupsBillsSelectionFlowContract$Step.SplitSummary((oq9.o) obj2, bVar3.f17563a, bVar3.f17564b), true, null, 12);
        return Unit.f186387a;
    }
}
