package com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review;

import aqd.i0;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.models.IncomeSorterDetailsDiff;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.models.RemainingBalanceDestination;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.IncomeSorterReviewContract$ReviewMode;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestinationId;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.m;
import yhm.n;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ IncomeSorterReviewContract$ReviewMode.Activate f87857w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(i iVar, IncomeSorterReviewContract$ReviewMode.Activate activate, Continuation continuation) {
        super(1, continuation);
        this.v = iVar;
        this.f87857w = activate;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f87857w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objP;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        i iVar = this.v;
        if (i == 0) {
            o.b(obj2);
            wzi.a aVar2 = iVar.v;
            IncomeSorterReviewContract$ReviewMode.Activate activate = this.f87857w;
            String str = activate.f87845a;
            IncomeSorterDetailsDiff incomeSorterDetailsDiff = activate.f87847c;
            String str2 = activate.f87846b;
            List list = incomeSorterDetailsDiff.f87768a;
            ArrayList arrayListH = list != null ? pyd.c.h(list) : null;
            RemainingBalanceDestination remainingBalanceDestination = incomeSorterDetailsDiff.f87769b;
            IncomeSorterDestinationId f87836b = remainingBalanceDestination != null ? remainingBalanceDestination.getF87836b() : null;
            i0 i0Var = incomeSorterDetailsDiff.f87770c;
            hzi.a aVarK2 = i0Var != null ? i.K2(iVar, i0Var) : null;
            Boolean bool = Boolean.TRUE;
            this.u = 1;
            objP = ((etj.o) aVar2).p(f87836b, this, aVarK2, bool, str, str2, arrayListH);
            if (objP == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            objP = ((m) obj2).f314193a;
        }
        m.Companion companion = m.INSTANCE;
        if (objP instanceof n) {
            return i.I2(iVar, m.a(objP));
        }
        iVar.C2(sqd.g.f265060a);
        return Unit.f186387a;
    }
}
