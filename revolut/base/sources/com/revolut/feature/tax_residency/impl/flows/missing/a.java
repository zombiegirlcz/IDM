package com.revolut.feature.tax_residency.impl.flows.missing;

import com.revolut.feature.tax_residency.impl.flows.missing.TaxMissingRationaleFlowContract$Step;
import gim.i;
import i26.l;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;
import zme.f;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends i implements Function1 {
    public final /* synthetic */ List u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ List f90044w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(List list, b bVar, List list2, Continuation continuation) {
        super(1, continuation);
        this.u = list;
        this.v = bVar;
        this.f90044w = list2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.u, this.v, this.f90044w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        List list = this.u;
        List<f> list2 = list;
        boolean z = list2 instanceof Collection;
        b bVar = this.v;
        if (z && list2.isEmpty()) {
            bVar.E2(TaxMissingRationaleFlowContract$Step.CollectTin.f90042a, true, null, false);
        } else {
            for (f fVar : list2) {
                wi0.b bVar2 = fVar.f323482a;
                List list3 = this.f90044w;
                if (!l.o(l.k(list3, bVar2)) || ((str = fVar.f323483b) != null && str.length() != 0)) {
                    bVar.O2(bVar.f90045t.f90038a, bVar.Q2(list), list3, new boe.l(bVar, null, 1));
                    break;
                }
            }
            bVar.E2(TaxMissingRationaleFlowContract$Step.CollectTin.f90042a, true, null, false);
        }
        return Unit.f186387a;
    }
}
