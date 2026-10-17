package com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2;

import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.IncomeSorterFlowContract$Step;
import gim.i;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import yhm.m;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f87819w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Continuation continuation) {
        super(2, continuation);
        this.f87819w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.f87819w, continuation);
        dVar.v = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objA;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        e eVar = this.f87819w;
        try {
            if (i == 0) {
                o.b(obj2);
                m.Companion companion = m.INSTANCE;
                this.v = null;
                this.u = 1;
                obj2 = e.I2(eVar, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            objA = (IncomeSorterFlowContract$Step.SelectIncome) obj2;
            m.Companion companion2 = m.INSTANCE;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion3 = m.INSTANCE;
            objA = o.a(th10);
        }
        if (m.a(objA) != null) {
            objA = IncomeSorterFlowContract$Step.IncomeSortersList.f87803a;
        }
        h.t2(eVar, eVar.f87824t, (IncomeSorterFlowContract$Step) objA, false, null, false, 12);
        return Unit.f186387a;
    }
}
