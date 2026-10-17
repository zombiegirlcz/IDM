package com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details;

import a26.q;
import aqb.s;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorter;
import com.revolut.retail.feature.api.income_sorter.models.IncomeSorterParams;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f87756w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, String str, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f87756w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, this.f87756w, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((od0.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        od0.i iVar = (od0.i) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        IncomeSorter incomeSorter = (IncomeSorter) iVar.c();
        d dVar = this.v;
        wzi.a aVar2 = dVar.d;
        return xam.a.h(new q(incomeSorter, dVar, (Continuation) null, 13), nim.a.A(((etj.o) aVar2).n(this.f87756w, new IncomeSorterParams.ForId(incomeSorter.f99160a), w4l.i.f294643c), new s(8)));
    }
}
