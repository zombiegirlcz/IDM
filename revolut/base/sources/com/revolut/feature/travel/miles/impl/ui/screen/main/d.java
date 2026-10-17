package com.revolut.feature.travel.miles.impl.ui.screen.main;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.rev_points.api.navigation.RevPointsFlowDestination;
import com.revolut.feature.rev_points.models.RevPointsTransaction;
import com.revolut.feature.travel.miles.api.model.TravelMilesAirline;
import eig.k;
import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import vkm.j2;
import yhm.o;
import zhm.f0;

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
        RowDelegate.Model model = this.u;
        String str = model.f53228a;
        Object obj3 = model.u;
        boolean zH = a0.H(str, "AIRLINE_ITEM_ID_", false);
        e eVar = this.v;
        if (zH) {
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.travel.miles.api.model.TravelMilesAirline");
            eVar.C2(new a((TravelMilesAirline) obj3));
        } else if (obj3 instanceof RevPointsTransaction) {
            RevPointsTransaction revPointsTransaction = (RevPointsTransaction) obj3;
            List list = (List) ((k) ((j2) eVar.D.f22677a).getValue()).f126632c.getContent();
            if (list == null) {
                list = f0.f322471a;
            }
            eVar.C1(new RevPointsFlowDestination(new RevPointsFlowDestination.StartType.OpenRevPointsTransactionDetails(revPointsTransaction, list, false, null, false, 28)));
        }
        return Unit.f186387a;
    }
}
