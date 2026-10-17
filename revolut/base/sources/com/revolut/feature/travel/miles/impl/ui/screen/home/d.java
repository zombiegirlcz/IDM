package com.revolut.feature.travel.miles.impl.ui.screen.home;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.rev_points.api.navigation.RevPointsFlowDestination;
import com.revolut.feature.rev_points.models.RevPointsTransaction;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends i implements Function1 {
    public final /* synthetic */ RowDelegate.Model u;
    public final /* synthetic */ e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(RowDelegate.Model model, e eVar, Continuation continuation) {
        super(1, continuation);
        this.u = model;
        this.v = eVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        Object obj3 = this.u.u;
        boolean z = obj3 instanceof u2f.d;
        e eVar = this.v;
        if (z) {
            eVar.C2(new a((u2f.d) obj3));
        } else if (obj3 instanceof RevPointsTransaction) {
            eVar.C1(new RevPointsFlowDestination(new RevPointsFlowDestination.StartType.OpenRevPointsTransactionDetails((RevPointsTransaction) obj3, null, false, null, false, 30)));
        }
        return Unit.f186387a;
    }
}
