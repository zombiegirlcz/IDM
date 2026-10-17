package com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review;

import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.IncomeSorterReviewContract$ModalStep;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestinationId;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.m;
import yhm.n;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ IncomeSorterReviewContract$ModalStep.ActiveSorterConflict f87859w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i iVar, IncomeSorterReviewContract$ModalStep.ActiveSorterConflict activeSorterConflict, Continuation continuation) {
        super(1, continuation);
        this.v = iVar;
        this.f87859w = activeSorterConflict;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.v, this.f87859w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objD;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        i iVar = this.v;
        if (i == 0) {
            o.b(obj2);
            wzi.a aVar2 = iVar.v;
            IncomeSorterReviewContract$ModalStep.ActiveSorterConflict activeSorterConflict = this.f87859w;
            String str = activeSorterConflict.f87838a;
            String str2 = activeSorterConflict.f87839b;
            hzi.c cVar = hzi.c.ONE_TIME;
            ArrayList arrayList = activeSorterConflict.f87840c;
            IncomeSorterDestinationId incomeSorterDestinationId = activeSorterConflict.d;
            this.u = 1;
            objD = ((etj.o) aVar2).d(str, str2, cVar, arrayList, incomeSorterDestinationId, null, true, this);
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            objD = ((m) obj2).f314193a;
        }
        m.Companion companion = m.INSTANCE;
        if (objD instanceof n) {
            return i.I2(iVar, m.a(objD));
        }
        i.J2(iVar);
        return Unit.f186387a;
    }
}
