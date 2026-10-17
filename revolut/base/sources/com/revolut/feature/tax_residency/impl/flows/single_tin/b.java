package com.revolut.feature.tax_residency.impl.flows.single_tin;

import com.revolut.feature.tax_residency.impl.flows.single_tin.SingleTinCollectionFlowContract$Step;
import com.revolut.feature.tax_residency.impl.screens.prefetch.TaxResidencyPrefetchDataScreen;
import com.revolut.feature.tax_residency.impl.screens.prefetch.TaxResidencyPrefetchDataScreenContract$InputData;
import gim.i;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import yhm.o;
import zme.f;
import zme.l;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ noe.c u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TaxResidencyPrefetchDataScreen f90059w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(noe.c cVar, c cVar2, TaxResidencyPrefetchDataScreen taxResidencyPrefetchDataScreen, Continuation continuation) {
        super(2, continuation);
        this.u = cVar;
        this.v = cVar2;
        this.f90059w = taxResidencyPrefetchDataScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.u, this.v, this.f90059w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        c cVar;
        Object next;
        Object next2;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        noe.c cVar2 = this.u;
        List list = cVar2.d;
        List list2 = cVar2.f218006a;
        Iterator it8 = list2.iterator();
        while (true) {
            boolean zHasNext = it8.hasNext();
            cVar = this.v;
            if (!zHasNext) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((l) next).f323500a, cVar.o.f90048a)) {
                break;
            }
        }
        l lVar = (l) next;
        if (list == null || lVar == null) {
            cVar.K2();
            return Unit.f186387a;
        }
        Iterator it9 = list.iterator();
        while (true) {
            if (!it9.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it9.next();
            if (Intrinsics.f(((f) next2).f323482a, ((TaxResidencyPrefetchDataScreenContract$InputData) this.f90059w.G).f90099a)) {
                break;
            }
        }
        f fVar = (f) next2;
        if ((fVar != null ? fVar.f323483b : null) == null) {
            h.t2(cVar, cVar.f90060p, new SingleTinCollectionFlowContract$Step.TinInput(list2, list, cVar2.f218007b, lVar), false, null, false, 12);
        } else {
            cVar.I2();
        }
        return Unit.f186387a;
    }
}
